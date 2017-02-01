
package com.storageservice.fitbit.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "storageServiceFitBit", targetNamespace = "http://ws.fitbit.storageservice.com/", wsdlLocation = "https://storageservicefitbit.herokuapp.com/ws/storageServiceFitBit?wsdl")
public class StorageServiceFitBit
    extends Service
{

    private final static URL STORAGESERVICEFITBIT_WSDL_LOCATION;
    private final static WebServiceException STORAGESERVICEFITBIT_EXCEPTION;
    private final static QName STORAGESERVICEFITBIT_QNAME = new QName("http://ws.fitbit.storageservice.com/", "storageServiceFitBit");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://storageservicefitbit.herokuapp.com/ws/storageServiceFitBit?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STORAGESERVICEFITBIT_WSDL_LOCATION = url;
        STORAGESERVICEFITBIT_EXCEPTION = e;
    }

    public StorageServiceFitBit() {
        super(__getWsdlLocation(), STORAGESERVICEFITBIT_QNAME);
    }

    public StorageServiceFitBit(WebServiceFeature... features) {
        super(__getWsdlLocation(), STORAGESERVICEFITBIT_QNAME, features);
    }

    public StorageServiceFitBit(URL wsdlLocation) {
        super(wsdlLocation, STORAGESERVICEFITBIT_QNAME);
    }

    public StorageServiceFitBit(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STORAGESERVICEFITBIT_QNAME, features);
    }

    public StorageServiceFitBit(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StorageServiceFitBit(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LocalApiFitBitModel
     */
    @WebEndpoint(name = "LocalApiFitBitImplPort")
    public LocalApiFitBitModel getLocalApiFitBitImplPort() {
        return super.getPort(new QName("http://ws.fitbit.storageservice.com/", "LocalApiFitBitImplPort"), LocalApiFitBitModel.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LocalApiFitBitModel
     */
    @WebEndpoint(name = "LocalApiFitBitImplPort")
    public LocalApiFitBitModel getLocalApiFitBitImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.fitbit.storageservice.com/", "LocalApiFitBitImplPort"), LocalApiFitBitModel.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STORAGESERVICEFITBIT_EXCEPTION!= null) {
            throw STORAGESERVICEFITBIT_EXCEPTION;
        }
        return STORAGESERVICEFITBIT_WSDL_LOCATION;
    }

}