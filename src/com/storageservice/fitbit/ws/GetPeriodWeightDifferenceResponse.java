
package com.storageservice.fitbit.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPeriodWeightDifferenceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPeriodWeightDifferenceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weightDifference" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPeriodWeightDifferenceResponse", propOrder = {
    "weightDifference"
})
public class GetPeriodWeightDifferenceResponse {

    protected double weightDifference;

    /**
     * Gets the value of the weightDifference property.
     * 
     */
    public double getWeightDifference() {
        return weightDifference;
    }

    /**
     * Sets the value of the weightDifference property.
     * 
     */
    public void setWeightDifference(double value) {
        this.weightDifference = value;
    }

}
