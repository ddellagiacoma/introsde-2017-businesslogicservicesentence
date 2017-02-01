
package com.storageservice.fitbit.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getWeightGoalResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getWeightGoalResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weightGoal" type="{http://ws.fitbit.storageservice.com/}weightGoal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getWeightGoalResponse", propOrder = {
    "weightGoal"
})
public class GetWeightGoalResponse {

    protected WeightGoal weightGoal;

    /**
     * Gets the value of the weightGoal property.
     * 
     * @return
     *     possible object is
     *     {@link WeightGoal }
     *     
     */
    public WeightGoal getWeightGoal() {
        return weightGoal;
    }

    /**
     * Sets the value of the weightGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightGoal }
     *     
     */
    public void setWeightGoal(WeightGoal value) {
        this.weightGoal = value;
    }

}
