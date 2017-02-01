
package com.storageservice.fitbit.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.storageservice.fitbit.ws package. 
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

    private final static QName _GetWeightGoal_QNAME = new QName("http://ws.fitbit.storageservice.com/", "getWeightGoal");
    private final static QName _GetWeightGoalResponse_QNAME = new QName("http://ws.fitbit.storageservice.com/", "getWeightGoalResponse");
    private final static QName _GetPeriodWeightDifference_QNAME = new QName("http://ws.fitbit.storageservice.com/", "getPeriodWeightDifference");
    private final static QName _GetWeightHeight_QNAME = new QName("http://ws.fitbit.storageservice.com/", "getWeightHeight");
    private final static QName _GetPeriodWeightDifferenceResponse_QNAME = new QName("http://ws.fitbit.storageservice.com/", "getPeriodWeightDifferenceResponse");
    private final static QName _GetWeightHeightResponse_QNAME = new QName("http://ws.fitbit.storageservice.com/", "getWeightHeightResponse");
    private final static QName _GetDailyGoal_QNAME = new QName("http://ws.fitbit.storageservice.com/", "getDailyGoal");
    private final static QName _GetDailyGoalResponse_QNAME = new QName("http://ws.fitbit.storageservice.com/", "getDailyGoalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.storageservice.fitbit.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWeightGoal }
     * 
     */
    public GetWeightGoal createGetWeightGoal() {
        return new GetWeightGoal();
    }

    /**
     * Create an instance of {@link GetWeightHeight }
     * 
     */
    public GetWeightHeight createGetWeightHeight() {
        return new GetWeightHeight();
    }

    /**
     * Create an instance of {@link GetPeriodWeightDifference }
     * 
     */
    public GetPeriodWeightDifference createGetPeriodWeightDifference() {
        return new GetPeriodWeightDifference();
    }

    /**
     * Create an instance of {@link GetWeightGoalResponse }
     * 
     */
    public GetWeightGoalResponse createGetWeightGoalResponse() {
        return new GetWeightGoalResponse();
    }

    /**
     * Create an instance of {@link GetPeriodWeightDifferenceResponse }
     * 
     */
    public GetPeriodWeightDifferenceResponse createGetPeriodWeightDifferenceResponse() {
        return new GetPeriodWeightDifferenceResponse();
    }

    /**
     * Create an instance of {@link GetDailyGoalResponse }
     * 
     */
    public GetDailyGoalResponse createGetDailyGoalResponse() {
        return new GetDailyGoalResponse();
    }

    /**
     * Create an instance of {@link GetDailyGoal }
     * 
     */
    public GetDailyGoal createGetDailyGoal() {
        return new GetDailyGoal();
    }

    /**
     * Create an instance of {@link GetWeightHeightResponse }
     * 
     */
    public GetWeightHeightResponse createGetWeightHeightResponse() {
        return new GetWeightHeightResponse();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link WeightGoal }
     * 
     */
    public WeightGoal createWeightGoal() {
        return new WeightGoal();
    }

    /**
     * Create an instance of {@link Goal }
     * 
     */
    public Goal createGoal() {
        return new Goal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeightGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fitbit.storageservice.com/", name = "getWeightGoal")
    public JAXBElement<GetWeightGoal> createGetWeightGoal(GetWeightGoal value) {
        return new JAXBElement<GetWeightGoal>(_GetWeightGoal_QNAME, GetWeightGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeightGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fitbit.storageservice.com/", name = "getWeightGoalResponse")
    public JAXBElement<GetWeightGoalResponse> createGetWeightGoalResponse(GetWeightGoalResponse value) {
        return new JAXBElement<GetWeightGoalResponse>(_GetWeightGoalResponse_QNAME, GetWeightGoalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeriodWeightDifference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fitbit.storageservice.com/", name = "getPeriodWeightDifference")
    public JAXBElement<GetPeriodWeightDifference> createGetPeriodWeightDifference(GetPeriodWeightDifference value) {
        return new JAXBElement<GetPeriodWeightDifference>(_GetPeriodWeightDifference_QNAME, GetPeriodWeightDifference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeightHeight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fitbit.storageservice.com/", name = "getWeightHeight")
    public JAXBElement<GetWeightHeight> createGetWeightHeight(GetWeightHeight value) {
        return new JAXBElement<GetWeightHeight>(_GetWeightHeight_QNAME, GetWeightHeight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPeriodWeightDifferenceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fitbit.storageservice.com/", name = "getPeriodWeightDifferenceResponse")
    public JAXBElement<GetPeriodWeightDifferenceResponse> createGetPeriodWeightDifferenceResponse(GetPeriodWeightDifferenceResponse value) {
        return new JAXBElement<GetPeriodWeightDifferenceResponse>(_GetPeriodWeightDifferenceResponse_QNAME, GetPeriodWeightDifferenceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeightHeightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fitbit.storageservice.com/", name = "getWeightHeightResponse")
    public JAXBElement<GetWeightHeightResponse> createGetWeightHeightResponse(GetWeightHeightResponse value) {
        return new JAXBElement<GetWeightHeightResponse>(_GetWeightHeightResponse_QNAME, GetWeightHeightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDailyGoal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fitbit.storageservice.com/", name = "getDailyGoal")
    public JAXBElement<GetDailyGoal> createGetDailyGoal(GetDailyGoal value) {
        return new JAXBElement<GetDailyGoal>(_GetDailyGoal_QNAME, GetDailyGoal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDailyGoalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.fitbit.storageservice.com/", name = "getDailyGoalResponse")
    public JAXBElement<GetDailyGoalResponse> createGetDailyGoalResponse(GetDailyGoalResponse value) {
        return new JAXBElement<GetDailyGoalResponse>(_GetDailyGoalResponse_QNAME, GetDailyGoalResponse.class, null, value);
    }

}
