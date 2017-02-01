
package com.storageservice.weather.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.storageservice.weather.ws package. 
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

    private final static QName _GetWeatherByLatLngResponse_QNAME = new QName("http://ws.weather.storageservice.com/", "getWeatherByLatLngResponse");
    private final static QName _GetForecastByLatLngResponse_QNAME = new QName("http://ws.weather.storageservice.com/", "getForecastByLatLngResponse");
    private final static QName _GetWeatherByLatLng_QNAME = new QName("http://ws.weather.storageservice.com/", "getWeatherByLatLng");
    private final static QName _GetForecastByLatLng_QNAME = new QName("http://ws.weather.storageservice.com/", "getForecastByLatLng");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.storageservice.weather.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetForecastByLatLng }
     * 
     */
    public GetForecastByLatLng createGetForecastByLatLng() {
        return new GetForecastByLatLng();
    }

    /**
     * Create an instance of {@link GetWeatherByLatLng }
     * 
     */
    public GetWeatherByLatLng createGetWeatherByLatLng() {
        return new GetWeatherByLatLng();
    }

    /**
     * Create an instance of {@link GetForecastByLatLngResponse }
     * 
     */
    public GetForecastByLatLngResponse createGetForecastByLatLngResponse() {
        return new GetForecastByLatLngResponse();
    }

    /**
     * Create an instance of {@link GetWeatherByLatLngResponse }
     * 
     */
    public GetWeatherByLatLngResponse createGetWeatherByLatLngResponse() {
        return new GetWeatherByLatLngResponse();
    }

    /**
     * Create an instance of {@link Weather }
     * 
     */
    public Weather createWeather() {
        return new Weather();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherByLatLngResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.weather.storageservice.com/", name = "getWeatherByLatLngResponse")
    public JAXBElement<GetWeatherByLatLngResponse> createGetWeatherByLatLngResponse(GetWeatherByLatLngResponse value) {
        return new JAXBElement<GetWeatherByLatLngResponse>(_GetWeatherByLatLngResponse_QNAME, GetWeatherByLatLngResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetForecastByLatLngResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.weather.storageservice.com/", name = "getForecastByLatLngResponse")
    public JAXBElement<GetForecastByLatLngResponse> createGetForecastByLatLngResponse(GetForecastByLatLngResponse value) {
        return new JAXBElement<GetForecastByLatLngResponse>(_GetForecastByLatLngResponse_QNAME, GetForecastByLatLngResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWeatherByLatLng }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.weather.storageservice.com/", name = "getWeatherByLatLng")
    public JAXBElement<GetWeatherByLatLng> createGetWeatherByLatLng(GetWeatherByLatLng value) {
        return new JAXBElement<GetWeatherByLatLng>(_GetWeatherByLatLng_QNAME, GetWeatherByLatLng.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetForecastByLatLng }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.weather.storageservice.com/", name = "getForecastByLatLng")
    public JAXBElement<GetForecastByLatLng> createGetForecastByLatLng(GetForecastByLatLng value) {
        return new JAXBElement<GetForecastByLatLng>(_GetForecastByLatLng_QNAME, GetForecastByLatLng.class, null, value);
    }

}
