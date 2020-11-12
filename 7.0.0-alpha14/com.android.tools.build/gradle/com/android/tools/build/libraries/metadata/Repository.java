// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: app_bundle_dependencies_metadata.proto

package com.android.tools.build.libraries.metadata;

/**
 * <pre>
 * A repository for resolving artifacts and metadata
 * </pre>
 *
 * Protobuf type {@code Repository}
 */
public  final class Repository extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Repository)
    RepositoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Repository.newBuilder() to construct.
  private Repository(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Repository() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Repository();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Repository(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.android.tools.build.libraries.metadata.MavenRepo.Builder subBuilder = null;
            if (repoOneofCase_ == 1) {
              subBuilder = ((com.android.tools.build.libraries.metadata.MavenRepo) repoOneof_).toBuilder();
            }
            repoOneof_ =
                input.readMessage(com.android.tools.build.libraries.metadata.MavenRepo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.android.tools.build.libraries.metadata.MavenRepo) repoOneof_);
              repoOneof_ = subBuilder.buildPartial();
            }
            repoOneofCase_ = 1;
            break;
          }
          case 18: {
            com.android.tools.build.libraries.metadata.IvyRepo.Builder subBuilder = null;
            if (repoOneofCase_ == 2) {
              subBuilder = ((com.android.tools.build.libraries.metadata.IvyRepo) repoOneof_).toBuilder();
            }
            repoOneof_ =
                input.readMessage(com.android.tools.build.libraries.metadata.IvyRepo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((com.android.tools.build.libraries.metadata.IvyRepo) repoOneof_);
              repoOneof_ = subBuilder.buildPartial();
            }
            repoOneofCase_ = 2;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.android.tools.build.libraries.metadata.AppBundleDependenciesMetadata.internal_static_Repository_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.android.tools.build.libraries.metadata.AppBundleDependenciesMetadata.internal_static_Repository_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.android.tools.build.libraries.metadata.Repository.class, com.android.tools.build.libraries.metadata.Repository.Builder.class);
  }

  private int repoOneofCase_ = 0;
  private java.lang.Object repoOneof_;
  public enum RepoOneofCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    MAVEN_REPO(1),
    IVY_REPO(2),
    REPOONEOF_NOT_SET(0);
    private final int value;
    private RepoOneofCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RepoOneofCase valueOf(int value) {
      return forNumber(value);
    }

    public static RepoOneofCase forNumber(int value) {
      switch (value) {
        case 1: return MAVEN_REPO;
        case 2: return IVY_REPO;
        case 0: return REPOONEOF_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public RepoOneofCase
  getRepoOneofCase() {
    return RepoOneofCase.forNumber(
        repoOneofCase_);
  }

  public static final int MAVEN_REPO_FIELD_NUMBER = 1;
  /**
   * <code>.MavenRepo maven_repo = 1;</code>
   * @return Whether the mavenRepo field is set.
   */
  public boolean hasMavenRepo() {
    return repoOneofCase_ == 1;
  }
  /**
   * <code>.MavenRepo maven_repo = 1;</code>
   * @return The mavenRepo.
   */
  public com.android.tools.build.libraries.metadata.MavenRepo getMavenRepo() {
    if (repoOneofCase_ == 1) {
       return (com.android.tools.build.libraries.metadata.MavenRepo) repoOneof_;
    }
    return com.android.tools.build.libraries.metadata.MavenRepo.getDefaultInstance();
  }
  /**
   * <code>.MavenRepo maven_repo = 1;</code>
   */
  public com.android.tools.build.libraries.metadata.MavenRepoOrBuilder getMavenRepoOrBuilder() {
    if (repoOneofCase_ == 1) {
       return (com.android.tools.build.libraries.metadata.MavenRepo) repoOneof_;
    }
    return com.android.tools.build.libraries.metadata.MavenRepo.getDefaultInstance();
  }

  public static final int IVY_REPO_FIELD_NUMBER = 2;
  /**
   * <code>.IvyRepo ivy_repo = 2;</code>
   * @return Whether the ivyRepo field is set.
   */
  public boolean hasIvyRepo() {
    return repoOneofCase_ == 2;
  }
  /**
   * <code>.IvyRepo ivy_repo = 2;</code>
   * @return The ivyRepo.
   */
  public com.android.tools.build.libraries.metadata.IvyRepo getIvyRepo() {
    if (repoOneofCase_ == 2) {
       return (com.android.tools.build.libraries.metadata.IvyRepo) repoOneof_;
    }
    return com.android.tools.build.libraries.metadata.IvyRepo.getDefaultInstance();
  }
  /**
   * <code>.IvyRepo ivy_repo = 2;</code>
   */
  public com.android.tools.build.libraries.metadata.IvyRepoOrBuilder getIvyRepoOrBuilder() {
    if (repoOneofCase_ == 2) {
       return (com.android.tools.build.libraries.metadata.IvyRepo) repoOneof_;
    }
    return com.android.tools.build.libraries.metadata.IvyRepo.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (repoOneofCase_ == 1) {
      output.writeMessage(1, (com.android.tools.build.libraries.metadata.MavenRepo) repoOneof_);
    }
    if (repoOneofCase_ == 2) {
      output.writeMessage(2, (com.android.tools.build.libraries.metadata.IvyRepo) repoOneof_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (repoOneofCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.android.tools.build.libraries.metadata.MavenRepo) repoOneof_);
    }
    if (repoOneofCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.android.tools.build.libraries.metadata.IvyRepo) repoOneof_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.android.tools.build.libraries.metadata.Repository)) {
      return super.equals(obj);
    }
    com.android.tools.build.libraries.metadata.Repository other = (com.android.tools.build.libraries.metadata.Repository) obj;

    if (!getRepoOneofCase().equals(other.getRepoOneofCase())) return false;
    switch (repoOneofCase_) {
      case 1:
        if (!getMavenRepo()
            .equals(other.getMavenRepo())) return false;
        break;
      case 2:
        if (!getIvyRepo()
            .equals(other.getIvyRepo())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (repoOneofCase_) {
      case 1:
        hash = (37 * hash) + MAVEN_REPO_FIELD_NUMBER;
        hash = (53 * hash) + getMavenRepo().hashCode();
        break;
      case 2:
        hash = (37 * hash) + IVY_REPO_FIELD_NUMBER;
        hash = (53 * hash) + getIvyRepo().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.android.tools.build.libraries.metadata.Repository parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.tools.build.libraries.metadata.Repository parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.tools.build.libraries.metadata.Repository parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.tools.build.libraries.metadata.Repository parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.tools.build.libraries.metadata.Repository parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.android.tools.build.libraries.metadata.Repository parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.android.tools.build.libraries.metadata.Repository parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.tools.build.libraries.metadata.Repository parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.tools.build.libraries.metadata.Repository parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.android.tools.build.libraries.metadata.Repository parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.android.tools.build.libraries.metadata.Repository parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.android.tools.build.libraries.metadata.Repository parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.android.tools.build.libraries.metadata.Repository prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * A repository for resolving artifacts and metadata
   * </pre>
   *
   * Protobuf type {@code Repository}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Repository)
      com.android.tools.build.libraries.metadata.RepositoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.android.tools.build.libraries.metadata.AppBundleDependenciesMetadata.internal_static_Repository_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.android.tools.build.libraries.metadata.AppBundleDependenciesMetadata.internal_static_Repository_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.android.tools.build.libraries.metadata.Repository.class, com.android.tools.build.libraries.metadata.Repository.Builder.class);
    }

    // Construct using com.android.tools.build.libraries.metadata.Repository.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      repoOneofCase_ = 0;
      repoOneof_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.android.tools.build.libraries.metadata.AppBundleDependenciesMetadata.internal_static_Repository_descriptor;
    }

    @java.lang.Override
    public com.android.tools.build.libraries.metadata.Repository getDefaultInstanceForType() {
      return com.android.tools.build.libraries.metadata.Repository.getDefaultInstance();
    }

    @java.lang.Override
    public com.android.tools.build.libraries.metadata.Repository build() {
      com.android.tools.build.libraries.metadata.Repository result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.android.tools.build.libraries.metadata.Repository buildPartial() {
      com.android.tools.build.libraries.metadata.Repository result = new com.android.tools.build.libraries.metadata.Repository(this);
      if (repoOneofCase_ == 1) {
        if (mavenRepoBuilder_ == null) {
          result.repoOneof_ = repoOneof_;
        } else {
          result.repoOneof_ = mavenRepoBuilder_.build();
        }
      }
      if (repoOneofCase_ == 2) {
        if (ivyRepoBuilder_ == null) {
          result.repoOneof_ = repoOneof_;
        } else {
          result.repoOneof_ = ivyRepoBuilder_.build();
        }
      }
      result.repoOneofCase_ = repoOneofCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.android.tools.build.libraries.metadata.Repository) {
        return mergeFrom((com.android.tools.build.libraries.metadata.Repository)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.android.tools.build.libraries.metadata.Repository other) {
      if (other == com.android.tools.build.libraries.metadata.Repository.getDefaultInstance()) return this;
      switch (other.getRepoOneofCase()) {
        case MAVEN_REPO: {
          mergeMavenRepo(other.getMavenRepo());
          break;
        }
        case IVY_REPO: {
          mergeIvyRepo(other.getIvyRepo());
          break;
        }
        case REPOONEOF_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.android.tools.build.libraries.metadata.Repository parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.android.tools.build.libraries.metadata.Repository) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int repoOneofCase_ = 0;
    private java.lang.Object repoOneof_;
    public RepoOneofCase
        getRepoOneofCase() {
      return RepoOneofCase.forNumber(
          repoOneofCase_);
    }

    public Builder clearRepoOneof() {
      repoOneofCase_ = 0;
      repoOneof_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.android.tools.build.libraries.metadata.MavenRepo, com.android.tools.build.libraries.metadata.MavenRepo.Builder, com.android.tools.build.libraries.metadata.MavenRepoOrBuilder> mavenRepoBuilder_;
    /**
     * <code>.MavenRepo maven_repo = 1;</code>
     * @return Whether the mavenRepo field is set.
     */
    public boolean hasMavenRepo() {
      return repoOneofCase_ == 1;
    }
    /**
     * <code>.MavenRepo maven_repo = 1;</code>
     * @return The mavenRepo.
     */
    public com.android.tools.build.libraries.metadata.MavenRepo getMavenRepo() {
      if (mavenRepoBuilder_ == null) {
        if (repoOneofCase_ == 1) {
          return (com.android.tools.build.libraries.metadata.MavenRepo) repoOneof_;
        }
        return com.android.tools.build.libraries.metadata.MavenRepo.getDefaultInstance();
      } else {
        if (repoOneofCase_ == 1) {
          return mavenRepoBuilder_.getMessage();
        }
        return com.android.tools.build.libraries.metadata.MavenRepo.getDefaultInstance();
      }
    }
    /**
     * <code>.MavenRepo maven_repo = 1;</code>
     */
    public Builder setMavenRepo(com.android.tools.build.libraries.metadata.MavenRepo value) {
      if (mavenRepoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        repoOneof_ = value;
        onChanged();
      } else {
        mavenRepoBuilder_.setMessage(value);
      }
      repoOneofCase_ = 1;
      return this;
    }
    /**
     * <code>.MavenRepo maven_repo = 1;</code>
     */
    public Builder setMavenRepo(
        com.android.tools.build.libraries.metadata.MavenRepo.Builder builderForValue) {
      if (mavenRepoBuilder_ == null) {
        repoOneof_ = builderForValue.build();
        onChanged();
      } else {
        mavenRepoBuilder_.setMessage(builderForValue.build());
      }
      repoOneofCase_ = 1;
      return this;
    }
    /**
     * <code>.MavenRepo maven_repo = 1;</code>
     */
    public Builder mergeMavenRepo(com.android.tools.build.libraries.metadata.MavenRepo value) {
      if (mavenRepoBuilder_ == null) {
        if (repoOneofCase_ == 1 &&
            repoOneof_ != com.android.tools.build.libraries.metadata.MavenRepo.getDefaultInstance()) {
          repoOneof_ = com.android.tools.build.libraries.metadata.MavenRepo.newBuilder((com.android.tools.build.libraries.metadata.MavenRepo) repoOneof_)
              .mergeFrom(value).buildPartial();
        } else {
          repoOneof_ = value;
        }
        onChanged();
      } else {
        if (repoOneofCase_ == 1) {
          mavenRepoBuilder_.mergeFrom(value);
        }
        mavenRepoBuilder_.setMessage(value);
      }
      repoOneofCase_ = 1;
      return this;
    }
    /**
     * <code>.MavenRepo maven_repo = 1;</code>
     */
    public Builder clearMavenRepo() {
      if (mavenRepoBuilder_ == null) {
        if (repoOneofCase_ == 1) {
          repoOneofCase_ = 0;
          repoOneof_ = null;
          onChanged();
        }
      } else {
        if (repoOneofCase_ == 1) {
          repoOneofCase_ = 0;
          repoOneof_ = null;
        }
        mavenRepoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.MavenRepo maven_repo = 1;</code>
     */
    public com.android.tools.build.libraries.metadata.MavenRepo.Builder getMavenRepoBuilder() {
      return getMavenRepoFieldBuilder().getBuilder();
    }
    /**
     * <code>.MavenRepo maven_repo = 1;</code>
     */
    public com.android.tools.build.libraries.metadata.MavenRepoOrBuilder getMavenRepoOrBuilder() {
      if ((repoOneofCase_ == 1) && (mavenRepoBuilder_ != null)) {
        return mavenRepoBuilder_.getMessageOrBuilder();
      } else {
        if (repoOneofCase_ == 1) {
          return (com.android.tools.build.libraries.metadata.MavenRepo) repoOneof_;
        }
        return com.android.tools.build.libraries.metadata.MavenRepo.getDefaultInstance();
      }
    }
    /**
     * <code>.MavenRepo maven_repo = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.android.tools.build.libraries.metadata.MavenRepo, com.android.tools.build.libraries.metadata.MavenRepo.Builder, com.android.tools.build.libraries.metadata.MavenRepoOrBuilder>
        getMavenRepoFieldBuilder() {
      if (mavenRepoBuilder_ == null) {
        if (!(repoOneofCase_ == 1)) {
          repoOneof_ = com.android.tools.build.libraries.metadata.MavenRepo.getDefaultInstance();
        }
        mavenRepoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.android.tools.build.libraries.metadata.MavenRepo, com.android.tools.build.libraries.metadata.MavenRepo.Builder, com.android.tools.build.libraries.metadata.MavenRepoOrBuilder>(
                (com.android.tools.build.libraries.metadata.MavenRepo) repoOneof_,
                getParentForChildren(),
                isClean());
        repoOneof_ = null;
      }
      repoOneofCase_ = 1;
      onChanged();;
      return mavenRepoBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.android.tools.build.libraries.metadata.IvyRepo, com.android.tools.build.libraries.metadata.IvyRepo.Builder, com.android.tools.build.libraries.metadata.IvyRepoOrBuilder> ivyRepoBuilder_;
    /**
     * <code>.IvyRepo ivy_repo = 2;</code>
     * @return Whether the ivyRepo field is set.
     */
    public boolean hasIvyRepo() {
      return repoOneofCase_ == 2;
    }
    /**
     * <code>.IvyRepo ivy_repo = 2;</code>
     * @return The ivyRepo.
     */
    public com.android.tools.build.libraries.metadata.IvyRepo getIvyRepo() {
      if (ivyRepoBuilder_ == null) {
        if (repoOneofCase_ == 2) {
          return (com.android.tools.build.libraries.metadata.IvyRepo) repoOneof_;
        }
        return com.android.tools.build.libraries.metadata.IvyRepo.getDefaultInstance();
      } else {
        if (repoOneofCase_ == 2) {
          return ivyRepoBuilder_.getMessage();
        }
        return com.android.tools.build.libraries.metadata.IvyRepo.getDefaultInstance();
      }
    }
    /**
     * <code>.IvyRepo ivy_repo = 2;</code>
     */
    public Builder setIvyRepo(com.android.tools.build.libraries.metadata.IvyRepo value) {
      if (ivyRepoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        repoOneof_ = value;
        onChanged();
      } else {
        ivyRepoBuilder_.setMessage(value);
      }
      repoOneofCase_ = 2;
      return this;
    }
    /**
     * <code>.IvyRepo ivy_repo = 2;</code>
     */
    public Builder setIvyRepo(
        com.android.tools.build.libraries.metadata.IvyRepo.Builder builderForValue) {
      if (ivyRepoBuilder_ == null) {
        repoOneof_ = builderForValue.build();
        onChanged();
      } else {
        ivyRepoBuilder_.setMessage(builderForValue.build());
      }
      repoOneofCase_ = 2;
      return this;
    }
    /**
     * <code>.IvyRepo ivy_repo = 2;</code>
     */
    public Builder mergeIvyRepo(com.android.tools.build.libraries.metadata.IvyRepo value) {
      if (ivyRepoBuilder_ == null) {
        if (repoOneofCase_ == 2 &&
            repoOneof_ != com.android.tools.build.libraries.metadata.IvyRepo.getDefaultInstance()) {
          repoOneof_ = com.android.tools.build.libraries.metadata.IvyRepo.newBuilder((com.android.tools.build.libraries.metadata.IvyRepo) repoOneof_)
              .mergeFrom(value).buildPartial();
        } else {
          repoOneof_ = value;
        }
        onChanged();
      } else {
        if (repoOneofCase_ == 2) {
          ivyRepoBuilder_.mergeFrom(value);
        }
        ivyRepoBuilder_.setMessage(value);
      }
      repoOneofCase_ = 2;
      return this;
    }
    /**
     * <code>.IvyRepo ivy_repo = 2;</code>
     */
    public Builder clearIvyRepo() {
      if (ivyRepoBuilder_ == null) {
        if (repoOneofCase_ == 2) {
          repoOneofCase_ = 0;
          repoOneof_ = null;
          onChanged();
        }
      } else {
        if (repoOneofCase_ == 2) {
          repoOneofCase_ = 0;
          repoOneof_ = null;
        }
        ivyRepoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.IvyRepo ivy_repo = 2;</code>
     */
    public com.android.tools.build.libraries.metadata.IvyRepo.Builder getIvyRepoBuilder() {
      return getIvyRepoFieldBuilder().getBuilder();
    }
    /**
     * <code>.IvyRepo ivy_repo = 2;</code>
     */
    public com.android.tools.build.libraries.metadata.IvyRepoOrBuilder getIvyRepoOrBuilder() {
      if ((repoOneofCase_ == 2) && (ivyRepoBuilder_ != null)) {
        return ivyRepoBuilder_.getMessageOrBuilder();
      } else {
        if (repoOneofCase_ == 2) {
          return (com.android.tools.build.libraries.metadata.IvyRepo) repoOneof_;
        }
        return com.android.tools.build.libraries.metadata.IvyRepo.getDefaultInstance();
      }
    }
    /**
     * <code>.IvyRepo ivy_repo = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.android.tools.build.libraries.metadata.IvyRepo, com.android.tools.build.libraries.metadata.IvyRepo.Builder, com.android.tools.build.libraries.metadata.IvyRepoOrBuilder>
        getIvyRepoFieldBuilder() {
      if (ivyRepoBuilder_ == null) {
        if (!(repoOneofCase_ == 2)) {
          repoOneof_ = com.android.tools.build.libraries.metadata.IvyRepo.getDefaultInstance();
        }
        ivyRepoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.android.tools.build.libraries.metadata.IvyRepo, com.android.tools.build.libraries.metadata.IvyRepo.Builder, com.android.tools.build.libraries.metadata.IvyRepoOrBuilder>(
                (com.android.tools.build.libraries.metadata.IvyRepo) repoOneof_,
                getParentForChildren(),
                isClean());
        repoOneof_ = null;
      }
      repoOneofCase_ = 2;
      onChanged();;
      return ivyRepoBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Repository)
  }

  // @@protoc_insertion_point(class_scope:Repository)
  private static final com.android.tools.build.libraries.metadata.Repository DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.android.tools.build.libraries.metadata.Repository();
  }

  public static com.android.tools.build.libraries.metadata.Repository getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Repository>
      PARSER = new com.google.protobuf.AbstractParser<Repository>() {
    @java.lang.Override
    public Repository parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Repository(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Repository> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Repository> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.android.tools.build.libraries.metadata.Repository getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
