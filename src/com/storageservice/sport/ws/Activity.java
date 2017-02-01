
package com.storageservice.sport.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for activity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="activity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hasSpeed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="idActivity" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mets" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sport" type="{http://ws.sport.storageservice.com/}sport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "activity", propOrder = {
    "accessLevel",
    "hasSpeed",
    "idActivity",
    "mets",
    "name",
    "sport"
})
public class Activity {

    protected String accessLevel;
    protected boolean hasSpeed;
    protected long idActivity;
    protected double mets;
    protected String name;
    protected Sport sport;

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessLevel(String value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the hasSpeed property.
     * 
     */
    public boolean isHasSpeed() {
        return hasSpeed;
    }

    /**
     * Sets the value of the hasSpeed property.
     * 
     */
    public void setHasSpeed(boolean value) {
        this.hasSpeed = value;
    }

    /**
     * Gets the value of the idActivity property.
     * 
     */
    public long getIdActivity() {
        return idActivity;
    }

    /**
     * Sets the value of the idActivity property.
     * 
     */
    public void setIdActivity(long value) {
        this.idActivity = value;
    }

    /**
     * Gets the value of the mets property.
     * 
     */
    public double getMets() {
        return mets;
    }

    /**
     * Sets the value of the mets property.
     * 
     */
    public void setMets(double value) {
        this.mets = value;
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
     * Gets the value of the sport property.
     * 
     * @return
     *     possible object is
     *     {@link Sport }
     *     
     */
    public Sport getSport() {
        return sport;
    }

    /**
     * Sets the value of the sport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sport }
     *     
     */
    public void setSport(Sport value) {
        this.sport = value;
    }

}
