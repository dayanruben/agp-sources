
package com.android.repository.impl.generated.v1;

import com.android.repository.api.Repository;
import com.android.repository.impl.meta.CommonFactory;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * DO NOT EDIT
 * This file was generated by xjc from repo-common-01.xsd. Any changes will be lost upon recompilation of the schema.
 * See the schema file for instructions on running xjc.
 *
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.android.repository.impl.generated.v1 package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
@SuppressWarnings("override")
public class ObjectFactory
    extends CommonFactory
{

    private final static QName _Repository_QNAME = new QName("http://schemas.android.com/repository/android/common/01", "repository");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.android.repository.impl.generated.v1
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RepositoryType }
     *
     */
    public RepositoryType createRepositoryType() {
        return new RepositoryType();
    }

    /**
     * Create an instance of {@link RemotePackage }
     *
     */
    public RemotePackage createRemotePackage() {
        return new RemotePackage();
    }

    /**
     * Create an instance of {@link LocalPackage }
     *
     */
    public LocalPackage createLocalPackage() {
        return new LocalPackage();
    }

    /**
     * Create an instance of {@link DependenciesType }
     *
     */
    public DependenciesType createDependenciesType() {
        return new DependenciesType();
    }

    /**
     * Create an instance of {@link ArchivesType }
     *
     */
    public ArchivesType createArchivesType() {
        return new ArchivesType();
    }

    /**
     * Create an instance of {@link LicenseRefType }
     *
     */
    public LicenseRefType createLicenseRefType() {
        return new LicenseRefType();
    }

    /**
     * Create an instance of {@link DependencyType }
     *
     */
    public DependencyType createDependencyType() {
        return new DependencyType();
    }

    /**
     * Create an instance of {@link LicenseType }
     *
     */
    public LicenseType createLicenseType() {
        return new LicenseType();
    }

    /**
     * Create an instance of {@link ArchiveType }
     *
     */
    public ArchiveType createArchiveType() {
        return new ArchiveType();
    }

    /**
     * Create an instance of {@link PatchesType }
     *
     */
    public PatchesType createPatchesType() {
        return new PatchesType();
    }

    /**
     * Create an instance of {@link CompleteType }
     *
     */
    public CompleteType createCompleteType() {
        return new CompleteType();
    }

    /**
     * Create an instance of {@link PatchType }
     *
     */
    public PatchType createPatchType() {
        return new PatchType();
    }

    /**
     * Create an instance of {@link ChannelType }
     *
     */
    public ChannelType createChannelType() {
        return new ChannelType();
    }

    /**
     * Create an instance of {@link ChannelRefType }
     *
     */
    public ChannelRefType createChannelRefType() {
        return new ChannelRefType();
    }

    /**
     * Create an instance of {@link RevisionType }
     *
     */
    public RevisionType createRevisionType() {
        return new RevisionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryType }{@code >}
     *
     * @param value Java instance representing xml element's value.
     * @return the new instance of {@link JAXBElement }{@code <}{@link RepositoryType }{@code >}
     */
    @XmlElementDecl(
            namespace = "http://schemas.android.com/repository/android/common/01",
            name = "repository")
    public JAXBElement<RepositoryType> createRepositoryInternal(RepositoryType value) {
        return new JAXBElement<RepositoryType>(_Repository_QNAME, RepositoryType.class, null, value);
    }

    public JAXBElement<Repository> generateRepository(Repository value) {
        return ((JAXBElement) createRepositoryInternal(((RepositoryType) value)));
    }

}