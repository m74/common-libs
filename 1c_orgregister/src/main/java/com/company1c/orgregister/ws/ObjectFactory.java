
package com.company1c.orgregister.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.company1c.orgregister.ws package. 
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
public class ObjectFactory {

    private final static QName _GetCorporationRequisitesByNameAndAddress_QNAME = new QName("http://ws.orgregister.company1c.com/", "getCorporationRequisitesByNameAndAddress");
    private final static QName _GetCorporationRequisitesByINN_QNAME = new QName("http://ws.orgregister.company1c.com/", "getCorporationRequisitesByINN");
    private final static QName _GetEntrepreneurRequisitesByINNResponse_QNAME = new QName("http://ws.orgregister.company1c.com/", "getEntrepreneurRequisitesByINNResponse");
    private final static QName _GetCorporationRequisitesByNameAndAddressResponse_QNAME = new QName("http://ws.orgregister.company1c.com/", "getCorporationRequisitesByNameAndAddressResponse");
    private final static QName _GetCorporationRequisitesByINNResponse_QNAME = new QName("http://ws.orgregister.company1c.com/", "getCorporationRequisitesByINNResponse");
    private final static QName _GetEntrepreneurRequisitesByINN_QNAME = new QName("http://ws.orgregister.company1c.com/", "getEntrepreneurRequisitesByINN");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.company1c.orgregister.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetEntrepreneurRequisitesByINN }
     * 
     */
    public GetEntrepreneurRequisitesByINN createGetEntrepreneurRequisitesByINN() {
        return new GetEntrepreneurRequisitesByINN();
    }

    /**
     * Create an instance of {@link GetCorporationRequisitesByINNResponse }
     * 
     */
    public GetCorporationRequisitesByINNResponse createGetCorporationRequisitesByINNResponse() {
        return new GetCorporationRequisitesByINNResponse();
    }

    /**
     * Create an instance of {@link GetCorporationRequisitesByNameAndAddressResponse }
     * 
     */
    public GetCorporationRequisitesByNameAndAddressResponse createGetCorporationRequisitesByNameAndAddressResponse() {
        return new GetCorporationRequisitesByNameAndAddressResponse();
    }

    /**
     * Create an instance of {@link GetEntrepreneurRequisitesByINNResponse }
     * 
     */
    public GetEntrepreneurRequisitesByINNResponse createGetEntrepreneurRequisitesByINNResponse() {
        return new GetEntrepreneurRequisitesByINNResponse();
    }

    /**
     * Create an instance of {@link GetCorporationRequisitesByINN }
     * 
     */
    public GetCorporationRequisitesByINN createGetCorporationRequisitesByINN() {
        return new GetCorporationRequisitesByINN();
    }

    /**
     * Create an instance of {@link GetCorporationRequisitesByNameAndAddress }
     * 
     */
    public GetCorporationRequisitesByNameAndAddress createGetCorporationRequisitesByNameAndAddress() {
        return new GetCorporationRequisitesByNameAndAddress();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCorporationRequisitesByNameAndAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.orgregister.company1c.com/", name = "getCorporationRequisitesByNameAndAddress")
    public JAXBElement<GetCorporationRequisitesByNameAndAddress> createGetCorporationRequisitesByNameAndAddress(GetCorporationRequisitesByNameAndAddress value) {
        return new JAXBElement<GetCorporationRequisitesByNameAndAddress>(_GetCorporationRequisitesByNameAndAddress_QNAME, GetCorporationRequisitesByNameAndAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCorporationRequisitesByINN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.orgregister.company1c.com/", name = "getCorporationRequisitesByINN")
    public JAXBElement<GetCorporationRequisitesByINN> createGetCorporationRequisitesByINN(GetCorporationRequisitesByINN value) {
        return new JAXBElement<GetCorporationRequisitesByINN>(_GetCorporationRequisitesByINN_QNAME, GetCorporationRequisitesByINN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntrepreneurRequisitesByINNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.orgregister.company1c.com/", name = "getEntrepreneurRequisitesByINNResponse")
    public JAXBElement<GetEntrepreneurRequisitesByINNResponse> createGetEntrepreneurRequisitesByINNResponse(GetEntrepreneurRequisitesByINNResponse value) {
        return new JAXBElement<GetEntrepreneurRequisitesByINNResponse>(_GetEntrepreneurRequisitesByINNResponse_QNAME, GetEntrepreneurRequisitesByINNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCorporationRequisitesByNameAndAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.orgregister.company1c.com/", name = "getCorporationRequisitesByNameAndAddressResponse")
    public JAXBElement<GetCorporationRequisitesByNameAndAddressResponse> createGetCorporationRequisitesByNameAndAddressResponse(GetCorporationRequisitesByNameAndAddressResponse value) {
        return new JAXBElement<GetCorporationRequisitesByNameAndAddressResponse>(_GetCorporationRequisitesByNameAndAddressResponse_QNAME, GetCorporationRequisitesByNameAndAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCorporationRequisitesByINNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.orgregister.company1c.com/", name = "getCorporationRequisitesByINNResponse")
    public JAXBElement<GetCorporationRequisitesByINNResponse> createGetCorporationRequisitesByINNResponse(GetCorporationRequisitesByINNResponse value) {
        return new JAXBElement<GetCorporationRequisitesByINNResponse>(_GetCorporationRequisitesByINNResponse_QNAME, GetCorporationRequisitesByINNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntrepreneurRequisitesByINN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.orgregister.company1c.com/", name = "getEntrepreneurRequisitesByINN")
    public JAXBElement<GetEntrepreneurRequisitesByINN> createGetEntrepreneurRequisitesByINN(GetEntrepreneurRequisitesByINN value) {
        return new JAXBElement<GetEntrepreneurRequisitesByINN>(_GetEntrepreneurRequisitesByINN_QNAME, GetEntrepreneurRequisitesByINN.class, null, value);
    }

}
