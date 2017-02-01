
package com.storageservice.bmi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getPeriodBmiDifferenceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getPeriodBmiDifferenceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bmiDifference" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPeriodBmiDifferenceResponse", propOrder = {
    "bmiDifference"
})
public class GetPeriodBmiDifferenceResponse {

    protected double bmiDifference;

    /**
     * Gets the value of the bmiDifference property.
     * 
     */
    public double getBmiDifference() {
        return bmiDifference;
    }

    /**
     * Sets the value of the bmiDifference property.
     * 
     */
    public void setBmiDifference(double value) {
        this.bmiDifference = value;
    }

}
