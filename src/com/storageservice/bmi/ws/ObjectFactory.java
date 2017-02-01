
package com.storageservice.bmi.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.storageservice.bmi.ws package. 
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

    private final static QName _GetPeriodBmiDifference_QNAME = new QName("http://ws.bmi.storageservice.com/", "getPeriodBmiDifference");
    private final static QName _CalculateandSavebmi_QNAME = new QName("http://ws.bmi.storageservice.com/", "calculateandSavebmi");
    private final static QName _GetBmiByIdPersonResponse_QNAME = new QName("http://ws.bmi.storageservice.com/", "getBmiByIdPersonResponse");
    private final static QName _CalculateandSavebmiResponse_QNAME = new QName("http://ws.bmi.storageservice.com/", "calculateandSavebmiResponse");
    private final static QName _Getbmi_QNAME = new QName("http://ws.bmi.storageservice.com/", "getbmi");
    private final static QName _GetPeriodBmiDifferenceResponse_QNAME = new QName("http://ws.bmi.storageservice.com/", "getPeriodBmiDifferenceResponse");
    private final static QName _GetbmiResponse_QNAME = new QName("http://ws.bmi.storageservice.com/", "getbmiResponse");
    private final static QName _Bmi_QNAME = new QName("http://ws.bmi.storageservice.com/", "bmi");
    private final static QName _GetBmiByIdPerson_QNAME = new QName("http://ws.bmi.storageservice.com/", "getBmiByIdPerson");
    private final static QName _GetStatusBmiDifference_QNAME = new QName("http://ws.bmi.storageservice.com/", "getStatusBmiDifference");
    private final static QName _GetStatusBmiDifferenceResponse_QNAME = new QName("http://ws.bmi.storageservice.com/", "getStatusBmiDifferenceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.storageservice.bmi.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatusBmiDifferenceResponse }
     * 
     */
    public GetStatusBmiDifferenceResponse createGetStatusBmiDifferenceResponse() {
        return new GetStatusBmiDifferenceResponse();
    }

    /**
     * Create an instance of {@link GetStatusBmiDifference }
     * 
     */
    public GetStatusBmiDifference createGetStatusBmiDifference() {
        return new GetStatusBmiDifference();
    }

    /**
     * Create an instance of {@link GetBmiByIdPerson }
     * 
     */
    public GetBmiByIdPerson createGetBmiByIdPerson() {
        return new GetBmiByIdPerson();
    }

    /**
     * Create an instance of {@link Bmi }
     * 
     */
    public Bmi createBmi() {
        return new Bmi();
    }

    /**
     * Create an instance of {@link GetbmiResponse }
     * 
     */
    public GetbmiResponse createGetbmiResponse() {
        return new GetbmiResponse();
    }

    /**
     * Create an instance of {@link GetPeriodBmiDifferenceResponse }
     * 
     */
    public GetPeriodBmiDifferenceResponse createGetPeriodBmiDifferenceResponse() {
        return new GetPeriodBmiDifferenceResponse();
    }

    /**
     * Create an instance of {@link Getbmi }
     * 
     */
    public Getbmi createGetbmi() {
        return new Getbmi();
    }

    /**
     * Create an instance of {@link CalculateandSavebmiResponse }
     * 
     */
    public CalculateandSavebmiResponse createCalculateandSavebmiResponse() {
        return new CalculateandSavebmiResponse();
    }

    /**
     * Create an instance of {@link GetBmiByIdPersonResponse }
     * 
     */
    public GetBmiByIdPersonResponse createGetBmiByIdPersonResponse() {
        return new GetBmiByIdPersonResponse();
    }

    /**
     * Create an instance of {@link CalculateandSavebmi }
     * 
     */
    public CalculateandSavebmi createCalculateandSavebmi() {
        return new CalculateandSavebmi();
    }

    /**
     * Create an instance of {@link GetPeriodBmiDifference }
     * 
     */
    public GetPeriodBmiDifference createGetPeriodBmiDifference() {
        return new GetPeriodBmiDifference();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeriodBmiDifference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bmi.storageservice.com/", name = "getPeriodBmiDifference")
    public JAXBElement<GetPeriodBmiDifference> createGetPeriodBmiDifference(GetPeriodBmiDifference value) {
        return new JAXBElement<GetPeriodBmiDifference>(_GetPeriodBmiDifference_QNAME, GetPeriodBmiDifference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateandSavebmi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bmi.storageservice.com/", name = "calculateandSavebmi")
    public JAXBElement<CalculateandSavebmi> createCalculateandSavebmi(CalculateandSavebmi value) {
        return new JAXBElement<CalculateandSavebmi>(_CalculateandSavebmi_QNAME, CalculateandSavebmi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBmiByIdPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bmi.storageservice.com/", name = "getBmiByIdPersonResponse")
    public JAXBElement<GetBmiByIdPersonResponse> createGetBmiByIdPersonResponse(GetBmiByIdPersonResponse value) {
        return new JAXBElement<GetBmiByIdPersonResponse>(_GetBmiByIdPersonResponse_QNAME, GetBmiByIdPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculateandSavebmiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bmi.storageservice.com/", name = "calculateandSavebmiResponse")
    public JAXBElement<CalculateandSavebmiResponse> createCalculateandSavebmiResponse(CalculateandSavebmiResponse value) {
        return new JAXBElement<CalculateandSavebmiResponse>(_CalculateandSavebmiResponse_QNAME, CalculateandSavebmiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getbmi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bmi.storageservice.com/", name = "getbmi")
    public JAXBElement<Getbmi> createGetbmi(Getbmi value) {
        return new JAXBElement<Getbmi>(_Getbmi_QNAME, Getbmi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeriodBmiDifferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bmi.storageservice.com/", name = "getPeriodBmiDifferenceResponse")
    public JAXBElement<GetPeriodBmiDifferenceResponse> createGetPeriodBmiDifferenceResponse(GetPeriodBmiDifferenceResponse value) {
        return new JAXBElement<GetPeriodBmiDifferenceResponse>(_GetPeriodBmiDifferenceResponse_QNAME, GetPeriodBmiDifferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetbmiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bmi.storageservice.com/", name = "getbmiResponse")
    public JAXBElement<GetbmiResponse> createGetbmiResponse(GetbmiResponse value) {
        return new JAXBElement<GetbmiResponse>(_GetbmiResponse_QNAME, GetbmiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bmi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bmi.storageservice.com/", name = "bmi")
    public JAXBElement<Bmi> createBmi(Bmi value) {
        return new JAXBElement<Bmi>(_Bmi_QNAME, Bmi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBmiByIdPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bmi.storageservice.com/", name = "getBmiByIdPerson")
    public JAXBElement<GetBmiByIdPerson> createGetBmiByIdPerson(GetBmiByIdPerson value) {
        return new JAXBElement<GetBmiByIdPerson>(_GetBmiByIdPerson_QNAME, GetBmiByIdPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusBmiDifference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bmi.storageservice.com/", name = "getStatusBmiDifference")
    public JAXBElement<GetStatusBmiDifference> createGetStatusBmiDifference(GetStatusBmiDifference value) {
        return new JAXBElement<GetStatusBmiDifference>(_GetStatusBmiDifference_QNAME, GetStatusBmiDifference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStatusBmiDifferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.bmi.storageservice.com/", name = "getStatusBmiDifferenceResponse")
    public JAXBElement<GetStatusBmiDifferenceResponse> createGetStatusBmiDifferenceResponse(GetStatusBmiDifferenceResponse value) {
        return new JAXBElement<GetStatusBmiDifferenceResponse>(_GetStatusBmiDifferenceResponse_QNAME, GetStatusBmiDifferenceResponse.class, null, value);
    }

}
