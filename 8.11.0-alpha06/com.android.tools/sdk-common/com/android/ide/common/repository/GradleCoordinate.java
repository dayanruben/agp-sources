/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.ide.common.repository;

import static com.android.ide.common.repository.KnownVersionStabilityKt.getStability;

import com.android.annotations.NonNull;
import com.android.annotations.Nullable;
import com.android.ide.common.gradle.Component;
import com.android.ide.common.gradle.RichVersion;
import com.android.ide.common.gradle.Version;
import com.android.ide.common.gradle.VersionRange;

import com.google.common.base.Joiner;
import com.google.common.collect.Range;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class represents a maven coordinate and allows for comparison at any level.
 *
 * <p>Maven coordinates take the following form: groupId:artifactId:packaging:classifier:version
 * where groupId is dot-notated alphanumeric artifactId is the name of the project packaging is
 * optional and is jar/war/pom/aar/etc classifier is optional and provides filtering context version
 * uniquely identifies a version.
 *
 * <p>We only care about coordinates of the following form: groupId:artifactId:revision where
 * revision is a series of '.' separated numbers optionally terminated by a '+' character.
 *
 * <p>This class does not directly implement {@link Comparable}; instead, you should use one of the
 * specific {@link Comparator} constants based on what type of ordering you need.
 */
@Deprecated
public final class GradleCoordinate {
    private static final String NONE = "NONE";

    /**
     * List taken from <a
     * href="http://maven.apache.org/pom.html#Maven_Coordinates">http://maven.apache.org/pom.html#Maven_Coordinates</a>
     */
    @Deprecated
    public enum ArtifactType {
        POM("pom"),
        JAR("jar"),
        MAVEN_PLUGIN("maven-plugin"),
        EJB("ejb"),
        WAR("war"),
        EAR("ear"),
        RAR("rar"),
        PAR("par"),
        AAR("aar");

        private final String mId;

        ArtifactType(String id) {
            mId = id;
        }

        @Nullable
        @Deprecated
        public static ArtifactType getArtifactType(@Nullable String name) {
            if (name != null) {
                for (ArtifactType type : ArtifactType.values()) {
                    if (type.mId.equalsIgnoreCase(name)) {
                        return type;
                    }
                }
            }
            return null;
        }

        @Override
        public String toString() {
            return mId;
        }
    }

    @Deprecated public static final String PREVIEW_ID = "rc";

    /**
     * A single component of a revision number: either a number, a string or a list of components
     * separated by dashes.
     */
    @Deprecated
    public abstract static class RevisionComponent implements Comparable<RevisionComponent> {
        public abstract int asInteger();

        public abstract boolean isPreview();
    }

    @Deprecated
    public static class NumberComponent extends RevisionComponent {
        private final int mNumber;

        public NumberComponent(int number) {
            mNumber = number;
        }

        @Override
        public String toString() {
            return Integer.toString(mNumber);
        }

        @Override
        public int asInteger() {
            return mNumber;
        }

        @Override
        public boolean isPreview() {
            return false;
        }

        @Override
        public boolean equals(Object o) {
            return o instanceof NumberComponent && ((NumberComponent) o).mNumber == mNumber;
        }

        @Override
        public int hashCode() {
            return mNumber;
        }

        @Override
        public int compareTo(RevisionComponent o) {
            if (o instanceof NumberComponent) {
                return mNumber - ((NumberComponent) o).mNumber;
            }
            if (o instanceof StringComponent) {
                return 1;
            }
            if (o instanceof ListComponent) {
                return 1; // 1.0.x > 1-1
            }
            return 0;
        }
    }

    /**
     * Like NumberComponent, but used for numeric strings that have leading zeroes which we must
     * preserve
     */
    @Deprecated
    public static class PaddedNumberComponent extends NumberComponent {
        private final String mString;

        public PaddedNumberComponent(int number, String string) {
            super(number);
            mString = string;
        }

        @Override
        public String toString() {
            return mString;
        }

        @Override
        public boolean equals(Object o) {
            return o instanceof PaddedNumberComponent
                    && ((PaddedNumberComponent) o).mString.equals(mString);
        }

        @Override
        public int hashCode() {
            return mString.hashCode();
        }
    }

    @Deprecated
    public static class StringComponent extends RevisionComponent {
        private final String mString;

        public StringComponent(String string) {
            this.mString = string;
        }

        @Override
        public String toString() {
            return mString;
        }

        @Override
        public int asInteger() {
            return 0;
        }

        @Override
        public boolean isPreview() {
            return mString.startsWith(PREVIEW_ID)
                    || mString.startsWith("alpha")
                    || mString.startsWith("beta")
                    || mString.equals("SNAPSHOT");
        }

        @Override
        public boolean equals(Object o) {
            return o instanceof StringComponent && ((StringComponent) o).mString.equals(mString);
        }

        @Override
        public int hashCode() {
            return mString.hashCode();
        }

        @Override
        public int compareTo(RevisionComponent o) {
            if (o instanceof NumberComponent) {
                return -1;
            }
            if (o instanceof StringComponent) {
                return mString.compareTo(((StringComponent) o).mString);
            }
            if (o instanceof ListComponent) {
                return -1; // 1-sp < 1-1
            }
            return 0;
        }
    }

    @Deprecated
    private static class PlusComponent extends RevisionComponent {
        @Override
        public String toString() {
            return "+";
        }

        @Override
        public int asInteger() {
            return PLUS_REV_VALUE;
        }

        @Override
        public boolean isPreview() {
            return false;
        }

        @Override
        public int compareTo(RevisionComponent o) {
            throw new UnsupportedOperationException(
                    "Please use a specific comparator that knows how to handle +");
        }
    }

    /** A list of components separated by dashes. */
    @Deprecated
    public static class ListComponent extends RevisionComponent {
        private final List<RevisionComponent> mItems = new ArrayList<>();
        private boolean mClosed = false;

        public static ListComponent of(RevisionComponent... components) {
            ListComponent result = new ListComponent();
            for (RevisionComponent component : components) {
                result.add(component);
            }
            return result;
        }

        public void add(RevisionComponent component) {
            mItems.add(component);
        }

        @Override
        public int asInteger() {
            return 0;
        }

        @Override
        public boolean isPreview() {
            return !mItems.isEmpty() && mItems.get(mItems.size() - 1).isPreview();
        }

        @Override
        public int compareTo(RevisionComponent o) {
            if (o instanceof NumberComponent) {
                return -1; // 1-1 < 1.0.x
            }
            if (o instanceof StringComponent) {
                return 1; // 1-1 > 1-sp
            }
            if (o instanceof ListComponent) {
                ListComponent rhs = (ListComponent) o;
                for (int i = 0; i < mItems.size() && i < rhs.mItems.size(); i++) {
                    int rc = mItems.get(i).compareTo(rhs.mItems.get(i));
                    if (rc != 0) return rc;
                }
                return mItems.size() - rhs.mItems.size();
            }
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            return o instanceof ListComponent && ((ListComponent) o).mItems.equals(mItems);
        }

        @Override
        public int hashCode() {
            return mItems.hashCode();
        }

        @Override
        public String toString() {
            return Joiner.on("-").join(mItems);
        }
    }

    @Deprecated public static final PlusComponent PLUS_REV = new PlusComponent();
    @Deprecated public static final int PLUS_REV_VALUE = -1;

    private final String mGroupId;

    private final String mArtifactId;

    private final ArtifactType mArtifactType;

    private final List<RevisionComponent> mRevisions = new ArrayList<>(3);

    private static final Pattern MAVEN_PATTERN =
            Pattern.compile("([\\w\\d\\.-]+):([\\w\\d\\.-]+):([^:@]+)(@[\\w-]+)?");

    /** Constructor */
    @Deprecated
    public GradleCoordinate(
            @NonNull String groupId,
            @NonNull String artifactId,
            @NonNull RevisionComponent... revisions) {
        this(groupId, artifactId, Arrays.asList(revisions), null);
    }

    @Deprecated
    public GradleCoordinate(
            @NonNull String groupId, @NonNull String artifactId, @NonNull String revision) {
        this(groupId, artifactId, parseRevisionNumber(revision), null);
    }

    /** Constructor */
    @Deprecated
    public GradleCoordinate(
            @NonNull String groupId, @NonNull String artifactId, @NonNull int... revisions) {
        this(groupId, artifactId, createComponents(revisions), null);
    }

    @Deprecated
    private static List<RevisionComponent> createComponents(int[] revisions) {
        List<RevisionComponent> result = new ArrayList<>(revisions.length);
        for (int revision : revisions) {
            if (revision == PLUS_REV_VALUE) {
                result.add(PLUS_REV);
            } else {
                result.add(new NumberComponent(revision));
            }
        }
        return result;
    }

    /** Constructor */
    @Deprecated
    public GradleCoordinate(
            @NonNull String groupId,
            @NonNull String artifactId,
            @NonNull List<RevisionComponent> revisions,
            @Nullable ArtifactType type) {
        mGroupId = groupId;
        mArtifactId = artifactId;
        mRevisions.addAll(revisions);

        mArtifactType = type;
    }

    /**
     * Create a GradleCoordinate from a string of the form
     * groupId:artifactId:MajorRevision.MinorRevision.(MicroRevision|+)
     *
     * @param coordinateString the string to parse
     * @return a coordinate object or null if the given string was malformed.
     */
    @Nullable
    @Deprecated
    public static GradleCoordinate parseCoordinateString(@NonNull String coordinateString) {
        Matcher matcher = MAVEN_PATTERN.matcher(coordinateString);
        if (!matcher.matches()) {
            return null;
        }

        String groupId = matcher.group(1);
        String artifactId = matcher.group(2);
        String revision = matcher.group(3);
        String typeString = matcher.group(4);
        ArtifactType type = null;

        if (typeString != null) {
            // Strip off the '@' symbol and try to convert
            type = ArtifactType.getArtifactType(typeString.substring(1));
        }

        List<RevisionComponent> revisions = parseRevisionNumber(revision);

        return new GradleCoordinate(groupId, artifactId, revisions, type);
    }

    /**
     * Parse a String into a GradleCoordinate with empty groupId and artifactId, null type, and the
     * revision denoted by the String.
     *
     * @param revision a String identifying a specific software revision
     * @deprecated use {@link Version.Companion#parse(String)} if dealing with single versions of
     *     software artifacts, or {@link RichVersion.Companion#parse(String)} when dealing with
     *     user-provided Gradle dependency specifiers.
     */
    @Deprecated
    public static GradleCoordinate parseVersionOnly(@NonNull String revision) {
        return new GradleCoordinate(NONE, NONE, parseRevisionNumber(revision), null);
    }

    @NonNull
    @Deprecated
    public static List<RevisionComponent> parseRevisionNumber(@NonNull String revision) {
        List<RevisionComponent> components = new ArrayList<>();
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < revision.length(); i++) {
            char c = revision.charAt(i);
            if (c == '.') {
                flushBuffer(components, buffer, true);
            } else if (c == '+') {
                if (buffer.length() > 0) {
                    flushBuffer(components, buffer, true);
                }
                components.add(PLUS_REV);
                break;
            } else if (c == '-') {
                flushBuffer(components, buffer, false);
                int last = components.size() - 1;
                if (last == -1) {
                    components.add(ListComponent.of(new NumberComponent(0)));
                } else if (!(components.get(last) instanceof ListComponent)) {
                    components.set(last, ListComponent.of(components.get(last)));
                }
            } else {
                buffer.append(c);
            }
        }
        if (buffer.length() > 0 || components.isEmpty()) {
            flushBuffer(components, buffer, true);
        }
        return components;
    }

    private static void flushBuffer(
            List<RevisionComponent> components, StringBuilder buffer, boolean closeList) {
        RevisionComponent newComponent;
        if (buffer.length() == 0) {
            newComponent = new NumberComponent(0);
        } else {
            String string = buffer.toString();
            try {
                int number = Integer.parseInt(string);
                if (string.length() > 1 && string.charAt(0) == '0') {
                    newComponent = new PaddedNumberComponent(number, string);
                } else {
                    newComponent = new NumberComponent(number);
                }
            } catch (NumberFormatException e) {
                newComponent = new StringComponent(string);
            }
        }
        buffer.setLength(0);
        if (!components.isEmpty()
                && components.get(components.size() - 1) instanceof ListComponent) {
            ListComponent component = (ListComponent) components.get(components.size() - 1);
            if (!component.mClosed) {
                component.add(newComponent);
                if (closeList) {
                    component.mClosed = true;
                }
                return;
            }
        }
        components.add(newComponent);
    }

    @Override
    public String toString() {
        String s = String.format(Locale.US, "%s:%s:%s", mGroupId, mArtifactId, getRevision());
        if (mArtifactType != null) {
            s += "@" + mArtifactType.toString();
        }
        return s;
    }

    @NonNull
    public String getGroupId() {
        return mGroupId;
    }

    @NonNull
    public String getArtifactId() {
        return mArtifactId;
    }

    @Nullable
    @Deprecated
    public ArtifactType getArtifactType() {
        return mArtifactType;
    }

    @Nullable
    @Deprecated
    public String getId() {
        if (mGroupId == null || mArtifactId == null) {
            return null;
        }

        return String.format("%s:%s", mGroupId, mArtifactId);
    }

    @Nullable
    @Deprecated
    public ArtifactType getType() {
        return mArtifactType;
    }

    @Deprecated
    public boolean acceptsGreaterRevisions() {
        return !mRevisions.isEmpty() && mRevisions.get(mRevisions.size() - 1) == PLUS_REV;
    }

    @NonNull
    @Deprecated
    public String getRevision() {
        StringBuilder revision = new StringBuilder();
        for (RevisionComponent component : mRevisions) {
            if (revision.length() > 0) {
                revision.append('.');
            }
            revision.append(component.toString());
        }

        return revision.toString();
    }

    @NonNull
    private String getPrefix() {
        StringBuilder prefix = new StringBuilder();
        for (RevisionComponent component : mRevisions) {
            if (component == PLUS_REV) break;
            if (prefix.length() > 0) {
                prefix.append('.');
            }
            prefix.append(component.toString());
        }
        if (prefix.length() == 0) {
            // a bare coordinate of "+" means "any version", distinct from ".+" but equivalent
            // to "dev.+"
            prefix.append("dev");
        }
        return prefix.toString();
    }

    /**
     * Returns the lower-bound version of this coordinate. If this coordinate indicates a prefix
     * range (by ending with a +), the lower-bound is the infimum of the prefix; otherwise, the
     * lower-bound is the version itself.
     *
     * <p>Note that using this on a user-supplied coordinate is almost certainly a mistake, as the
     * syntax for user-supplied coordinates is richer than single versions (see for a start the
     * contortions here around {@link GradleCoordinate#acceptsGreaterRevisions()}, and the
     * contradictions within this file about whether we support rich versions or not (mostly not but
     * apparently we do support prefix matching). Compromise for now by returning a {@link Version}
     * representing the earliest possible matching version.
     */
    @NonNull
    public Version getLowerBoundVersion() {
        if (acceptsGreaterRevisions()) {
            return Version.prefixInfimum(getPrefix());
        }
        return Version.parse(getRevision());
    }

    /**
     * Returns the upper-bound version of this coordinate. If this coordinate indicates a prefix
     * range (by ending with a +), the upper-bound is the infimum of the next prefix; otherwise, the
     * upper-bound is the version itself.
     *
     * <p>Note that using this on a user-supplied coordinate is almost certainly a mistake, as the
     * syntax for user-supplied coordinates is richer than single versions (see for a start the
     * contortions here around {@link GradleCoordinate#acceptsGreaterRevisions()}, and the
     * contradictions within this file about whether we support rich versions or not (mostly not but
     * apparently we do support prefix matching). Compromise for now by returning a {@link Version}
     * representing the latest possible matching version.
     */
    @NonNull
    public Version getUpperBoundVersion() {
        if (acceptsGreaterRevisions()) {
            return Version.prefixInfimum(getPrefix()).nextPrefix();
        }
        return Version.parse(getRevision());
    }

    /**
     * Returns the version of this coordinate
     *
     * @return the version
     * @deprecated prefer {@link GradleCoordinate#getLowerBoundVersion()} if possible. See the
     *     deprecation note on {@link GradleVersion} for alternatives.
     */
    @Deprecated
    @Nullable
    public GradleVersion getVersion() {
        return GradleVersion.tryParse(getRevision());
    }

    /** Returns the dependency version range of this coordinate */
    @NonNull
    public VersionRange getVersionRange() {
        String revision = getRevision();
        if (acceptsGreaterRevisions()) {
            return VersionRange.parse(revision);
        } else {
            Version version = Version.parse(getRevision());
            Component component = new Component(mGroupId, mArtifactId, version);
            KnownVersionStability stability = getStability(component);
            // this is [version,expiration), where stability.expiration(...) has computed the
            // appropriate prefixInfimum for the maven-style upper bound.
            return new VersionRange(Range.closedOpen(version, stability.expiration(version)));
        }
    }

    @Deprecated
    public boolean isPreview() {
        return !mRevisions.isEmpty() && mRevisions.get(mRevisions.size() - 1).isPreview();
    }

    /**
     * Returns the major version (X in X.2.3), which can be {@link #PLUS_REV}, or Integer.MIN_VALUE
     * if it is not available
     */
    @Deprecated
    public int getMajorVersion() {
        return mRevisions.isEmpty() ? Integer.MIN_VALUE : mRevisions.get(0).asInteger();
    }

    /**
     * Returns the minor version (X in 1.X.3), which can be {@link #PLUS_REV}, or Integer.MIN_VALUE
     * if it is not available
     */
    @Deprecated
    public int getMinorVersion() {
        return mRevisions.size() < 2 ? Integer.MIN_VALUE : mRevisions.get(1).asInteger();
    }

    /**
     * Returns the major version (X in 1.2.X), which can be {@link #PLUS_REV}, or Integer.MIN_VALUE
     * if it is not available
     */
    @Deprecated
    public int getMicroVersion() {
        return mRevisions.size() < 3 ? Integer.MIN_VALUE : mRevisions.get(2).asInteger();
    }

    /**
     * Returns true if and only if the given coordinate refers to the same group and artifact.
     *
     * @param o the coordinate to compare with
     * @return true iff the other group and artifact match the group and artifact of this
     *     coordinate.
     */
    @Deprecated
    public boolean isSameArtifact(@NonNull GradleCoordinate o) {
        return o.mGroupId.equals(mGroupId) && o.mArtifactId.equals(mArtifactId);
    }

    /**
     * Returns true if this fully-specified coordinate matches the given (optionally including +)
     * coordinate.
     *
     * @deprecated compare entities using specialized classes and operators from the {@link
     *     com.android.ide.common.gradle} package.
     */
    @Deprecated
    public boolean matches(@NonNull GradleCoordinate pattern) {
        if (!isSameArtifact(pattern)) {
            return false;
        }
        Iterator<RevisionComponent> thisRev = mRevisions.iterator();
        for (RevisionComponent thatRev : pattern.mRevisions) {
            if (thatRev instanceof PlusComponent) {
                return true;
            }
            if (!thisRev.hasNext() && thatRev.asInteger() != 0) {
                return false;
            }
            if (thisRev.hasNext() && !thatRev.equals(thisRev.next())) {
                return false;
            }
        }
        while (thisRev.hasNext()) {
            if (thisRev.next().asInteger() != 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(@Nullable Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        GradleCoordinate that = (GradleCoordinate) o;

        if (!mRevisions.equals(that.mRevisions)) {
            return false;
        }
        if (!mArtifactId.equals(that.mArtifactId)) {
            return false;
        }
        if (!mGroupId.equals(that.mGroupId)) {
            return false;
        }
        return Objects.equals(mArtifactType, that.mArtifactType);
    }

    @Override
    public int hashCode() {
        int result = mGroupId.hashCode();
        result = 31 * result + mArtifactId.hashCode();
        for (RevisionComponent component : mRevisions) {
            result = 31 * result + component.hashCode();
        }
        if (mArtifactType != null) {
            result = 31 * result + mArtifactType.hashCode();
        }
        return result;
    }

    /**
     * Comparator which compares Gradle versions - and treats a + version as lower than a specific
     * number in the same place. This is typically useful when trying to for example order
     * coordinates by "most specific".
     */
    @Deprecated
    public static final Comparator<GradleCoordinate> COMPARE_PLUS_LOWER =
            new GradleCoordinateComparator(-1);

    /**
     * Comparator which compares Gradle versions - and treats a + version as higher than a specific
     * number. This is typically useful when seeing if a dependency is met, e.g. if you require
     * version 0.7.3, comparing it with 0.7.+ would consider 0.7.+ higher and therefore satisfying
     * the version requirement.
     */
    @Deprecated
    public static final Comparator<GradleCoordinate> COMPARE_PLUS_HIGHER =
            new GradleCoordinateComparator(1);

    private static class GradleCoordinateComparator implements Comparator<GradleCoordinate> {
        private final int mPlusResult;

        private GradleCoordinateComparator(int plusResult) {
            mPlusResult = plusResult;
        }

        @Override
        public int compare(@NonNull GradleCoordinate a, @NonNull GradleCoordinate b) {
            // Make sure we're comparing apples to apples. If not, compare artifactIds
            if (!a.isSameArtifact(b)) {
                return a.mArtifactId.compareTo(b.mArtifactId);
            }

            int sizeA = a.mRevisions.size();
            int sizeB = b.mRevisions.size();
            int common = Math.min(sizeA, sizeB);
            for (int i = 0; i < common; ++i) {
                RevisionComponent revision1 = a.mRevisions.get(i);
                RevisionComponent revision2 = b.mRevisions.get(i);
                if (revision1 instanceof PlusComponent && revision2 instanceof PlusComponent)
                    return 0;
                if (revision1 instanceof PlusComponent) return mPlusResult;
                if (revision2 instanceof PlusComponent) return -mPlusResult;
                int delta = revision1.compareTo(revision2);
                if (delta != 0) {
                    return delta;
                }
            }
            if (sizeA != sizeB) {
                // Treat X.0 and X.0.0 as equal
                List<RevisionComponent> revisionList;
                int returnValueIfNonZero;
                int from;
                int to;
                if (sizeA < sizeB) {
                    revisionList = b.mRevisions;
                    from = sizeA;
                    to = sizeB;
                    returnValueIfNonZero = -1;
                } else {
                    revisionList = a.mRevisions;
                    from = sizeB;
                    to = sizeA;
                    returnValueIfNonZero = 1;
                }
                for (int i = from; i < to; ++i) {
                    RevisionComponent revision = revisionList.get(i);
                    if (revision instanceof NumberComponent) {
                        if (revision.asInteger() != 0) {
                            return returnValueIfNonZero;
                        }
                    } else {
                        return returnValueIfNonZero;
                    }
                }
            }
            return 0;
        }
    }
}
