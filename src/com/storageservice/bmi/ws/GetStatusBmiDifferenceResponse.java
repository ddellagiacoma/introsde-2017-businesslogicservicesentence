
package com.storageservice.bmi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStatusBmiDifferenceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStatusBmiDifferenceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusBmiDifference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStatusBmiDifferenceResponse", propOrder = {
    "statusBmiDifference"
})
public class GetStatusBmiDifferenceResponse {

    protected String statusBmiDifference;

    /**
     * Gets the value of the statusBmiDifference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusBmiDifference() {
        return statusBmiDifference;
    }

    /**
     * Sets the value of the statusBmiDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusBmiDifference(String value) {
        this.statusBmiDifference = value;
    }

}
