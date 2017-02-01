
package com.storageservice.bmi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getbmi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getbmi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idBmi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getbmi", propOrder = {
    "idBmi"
})
public class Getbmi {

    protected int idBmi;

    /**
     * Gets the value of the idBmi property.
     * 
     */
    public int getIdBmi() {
        return idBmi;
    }

    /**
     * Sets the value of the idBmi property.
     * 
     */
    public void setIdBmi(int value) {
        this.idBmi = value;
    }

}
