
package com.storageservice.weather.ws;

import java.util.List;
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
@WebService(name = "WeatherApi", targetNamespace = "http://ws.weather.storageservice.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherApi {


    /**
     * 
     * @param lng
     * @param lat
     * @return
     *     returns com.storageservice.weather.ws.Weather
     */
    @WebMethod
    @WebResult(name = "weather", targetNamespace = "")
    @RequestWrapper(localName = "getWeatherByLatLng", targetNamespace = "http://ws.weather.storageservice.com/", className = "com.storageservice.weather.ws.GetWeatherByLatLng")
    @ResponseWrapper(localName = "getWeatherByLatLngResponse", targetNamespace = "http://ws.weather.storageservice.com/", className = "com.storageservice.weather.ws.GetWeatherByLatLngResponse")
    @Action(input = "http://ws.weather.storageservice.com/WeatherApi/getWeatherByLatLngRequest", output = "http://ws.weather.storageservice.com/WeatherApi/getWeatherByLatLngResponse")
    public Weather getWeatherByLatLng(
        @WebParam(name = "lat", targetNamespace = "")
        String lat,
        @WebParam(name = "lng", targetNamespace = "")
        String lng);

    /**
     * 
     * @param lng
     * @param lat
     * @return
     *     returns java.util.List<com.storageservice.weather.ws.Weather>
     */
    @WebMethod
    @WebResult(name = "forecast", targetNamespace = "")
    @RequestWrapper(localName = "getForecastByLatLng", targetNamespace = "http://ws.weather.storageservice.com/", className = "com.storageservice.weather.ws.GetForecastByLatLng")
    @ResponseWrapper(localName = "getForecastByLatLngResponse", targetNamespace = "http://ws.weather.storageservice.com/", className = "com.storageservice.weather.ws.GetForecastByLatLngResponse")
    @Action(input = "http://ws.weather.storageservice.com/WeatherApi/getForecastByLatLngRequest", output = "http://ws.weather.storageservice.com/WeatherApi/getForecastByLatLngResponse")
    public List<Weather> getForecastByLatLng(
        @WebParam(name = "lat", targetNamespace = "")
        String lat,
        @WebParam(name = "lng", targetNamespace = "")
        String lng);

}