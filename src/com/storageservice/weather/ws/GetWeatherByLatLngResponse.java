
package com.storageservice.weather.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getWeatherByLatLngResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getWeatherByLatLngResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weather" type="{http://ws.weather.storageservice.com/}weather" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWeatherByLatLngResponse", propOrder = {
    "weather"
})
public class GetWeatherByLatLngResponse {

    protected Weather weather;

    /**
     * Gets the value of the weather property.
     * 
     * @return
     *     possible object is
     *     {@link Weather }
     *     
     */
    public Weather getWeather() {
        return weather;
    }

    /**
     * Sets the value of the weather property.
     * 
     * @param value
     *     allowed object is
     *     {@link Weather }
     *     
     */
    public void setWeather(Weather value) {
        this.weather = value;
    }

}
