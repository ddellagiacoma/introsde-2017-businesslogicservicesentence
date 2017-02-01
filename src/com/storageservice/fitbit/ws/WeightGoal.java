
package com.storageservice.fitbit.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for weightGoal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="weightGoal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="goalWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startWeight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "weightGoal", propOrder = {
    "goalWeight",
    "startDate",
    "startWeight"
})
public class WeightGoal {

    protected double goalWeight;
    protected String startDate;
    protected double startWeight;

    /**
     * Gets the value of the goalWeight property.
     * 
     */
    public double getGoalWeight() {
        return goalWeight;
    }

    /**
     * Sets the value of the goalWeight property.
     * 
     */
    public void setGoalWeight(double value) {
        this.goalWeight = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the startWeight property.
     * 
     */
    public double getStartWeight() {
        return startWeight;
    }

    /**
     * Sets the value of the startWeight property.
     * 
     */
    public void setStartWeight(double value) {
        this.startWeight = value;
    }

}
