
package com.storageservice.bmi.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "BmiApi", targetNamespace = "http://ws.bmi.storageservice.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BmiApi {


    /**
     * 
     * @param idBmi
     * @return
     *     returns com.storageservice.bmi.ws.Bmi
     */
    @WebMethod
    @WebResult(name = "bmi", targetNamespace = "")
    @RequestWrapper(localName = "getbmi", targetNamespace = "http://ws.bmi.storageservice.com/", className = "com.storageservice.bmi.ws.Getbmi")
    @ResponseWrapper(localName = "getbmiResponse", targetNamespace = "http://ws.bmi.storageservice.com/", className = "com.storageservice.bmi.ws.GetbmiResponse")
    @Action(input = "http://ws.bmi.storageservice.com/BmiApi/getbmiRequest", output = "http://ws.bmi.storageservice.com/BmiApi/getbmiResponse")
    public Bmi getbmi(
        @WebParam(name = "idBmi", targetNamespace = "")
        int idBmi);

    /**
     * 
     * @param startDate
     * @param idPerson
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(name = "bmiDifference", targetNamespace = "")
    @RequestWrapper(localName = "getPeriodBmiDifference", targetNamespace = "http://ws.bmi.storageservice.com/", className = "com.storageservice.bmi.ws.GetPeriodBmiDifference")
    @ResponseWrapper(localName = "getPeriodBmiDifferenceResponse", targetNamespace = "http://ws.bmi.storageservice.com/", className = "com.storageservice.bmi.ws.GetPeriodBmiDifferenceResponse")
    @Action(input = "http://ws.bmi.storageservice.com/BmiApi/getPeriodBmiDifferenceRequest", output = "http://ws.bmi.storageservice.com/BmiApi/getPeriodBmiDifferenceResponse")
    public double getPeriodBmiDifference(
        @WebParam(name = "startDate", targetNamespace = "")
        String startDate,
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson);

    /**
     * 
     * @param person
     * @param height
     * @param weight
     * @return
     *     returns com.storageservice.bmi.ws.Bmi
     */
    @WebMethod
    @WebResult(name = "bmi", targetNamespace = "")
    @RequestWrapper(localName = "calculateandSavebmi", targetNamespace = "http://ws.bmi.storageservice.com/", className = "com.storageservice.bmi.ws.CalculateandSavebmi")
    @ResponseWrapper(localName = "calculateandSavebmiResponse", targetNamespace = "http://ws.bmi.storageservice.com/", className = "com.storageservice.bmi.ws.CalculateandSavebmiResponse")
    @Action(input = "http://ws.bmi.storageservice.com/BmiApi/calculateandSavebmiRequest", output = "http://ws.bmi.storageservice.com/BmiApi/calculateandSavebmiResponse")
    public Bmi calculateandSavebmi(
        @WebParam(name = "person", targetNamespace = "")
        Person person,
        @WebParam(name = "weight", targetNamespace = "")
        double weight,
        @WebParam(name = "height", targetNamespace = "")
        double height);

    /**
     * 
     * @param idPerson
     * @return
     *     returns com.storageservice.bmi.ws.Bmi
     */
    @WebMethod
    @WebResult(name = "bmi", targetNamespace = "")
    @RequestWrapper(localName = "getBmiByIdPerson", targetNamespace = "http://ws.bmi.storageservice.com/", className = "com.storageservice.bmi.ws.GetBmiByIdPerson")
    @ResponseWrapper(localName = "getBmiByIdPersonResponse", targetNamespace = "http://ws.bmi.storageservice.com/", className = "com.storageservice.bmi.ws.GetBmiByIdPersonResponse")
    @Action(input = "http://ws.bmi.storageservice.com/BmiApi/getBmiByIdPersonRequest", output = "http://ws.bmi.storageservice.com/BmiApi/getBmiByIdPersonResponse")
    public Bmi getBmiByIdPerson(
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson);

    /**
     * 
     * @param startDate
     * @param idPerson
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "statusBmiDifference", targetNamespace = "")
    @RequestWrapper(localName = "getStatusBmiDifference", targetNamespace = "http://ws.bmi.storageservice.com/", className = "com.storageservice.bmi.ws.GetStatusBmiDifference")
    @ResponseWrapper(localName = "getStatusBmiDifferenceResponse", targetNamespace = "http://ws.bmi.storageservice.com/", className = "com.storageservice.bmi.ws.GetStatusBmiDifferenceResponse")
    @Action(input = "http://ws.bmi.storageservice.com/BmiApi/getStatusBmiDifferenceRequest", output = "http://ws.bmi.storageservice.com/BmiApi/getStatusBmiDifferenceResponse")
    public String getStatusBmiDifference(
        @WebParam(name = "startDate", targetNamespace = "")
        String startDate,
        @WebParam(name = "idPerson", targetNamespace = "")
        int idPerson);

}