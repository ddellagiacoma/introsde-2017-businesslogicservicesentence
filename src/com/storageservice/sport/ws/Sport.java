
package com.storageservice.sport.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSport" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perfectWeather" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sport", propOrder = {
    "idSport",
    "name",
    "perfectWeather"
})
public class Sport {

    protected int idSport;
    protected String name;
    protected String perfectWeather;

    /**
     * Gets the value of the idSport property.
     * 
     */
    public int getIdSport() {
        return idSport;
    }

    /**
     * Sets the value of the idSport property.
     * 
     */
    public void setIdSport(int value) {
        this.idSport = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the perfectWeather property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerfectWeather() {
        return perfectWeather;
    }

    /**
     * Sets the value of the perfectWeather property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerfectWeather(String value) {
        this.perfectWeather = value;
    }

}
