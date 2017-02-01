
package com.storageservice.fitbit.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for goal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="goal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caloriesOut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="missingCalories" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="missingDistance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="missingSteps" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="steps" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "goal", propOrder = {
    "caloriesOut",
    "distance",
    "missingCalories",
    "missingDistance",
    "missingSteps",
    "steps"
})
public class Goal {

    protected int caloriesOut;
    protected double distance;
    protected int missingCalories;
    protected double missingDistance;
    protected int missingSteps;
    protected int steps;

    /**
     * Gets the value of the caloriesOut property.
     * 
     */
    public int getCaloriesOut() {
        return caloriesOut;
    }

    /**
     * Sets the value of the caloriesOut property.
     * 
     */
    public void setCaloriesOut(int value) {
        this.caloriesOut = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     */
    public double getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     */
    public void setDistance(double value) {
        this.distance = value;
    }

    /**
     * Gets the value of the missingCalories property.
     * 
     */
    public int getMissingCalories() {
        return missingCalories;
    }

    /**
     * Sets the value of the missingCalories property.
     * 
     */
    public void setMissingCalories(int value) {
        this.missingCalories = value;
    }

    /**
     * Gets the value of the missingDistance property.
     * 
     */
    public double getMissingDistance() {
        return missingDistance;
    }

    /**
     * Sets the value of the missingDistance property.
     * 
     */
    public void setMissingDistance(double value) {
        this.missingDistance = value;
    }

    /**
     * Gets the value of the missingSteps property.
     * 
     */
    public int getMissingSteps() {
        return missingSteps;
    }

    /**
     * Sets the value of the missingSteps property.
     * 
     */
    public void setMissingSteps(int value) {
        this.missingSteps = value;
    }

    /**
     * Gets the value of the steps property.
     * 
     */
    public int getSteps() {
        return steps;
    }

    /**
     * Sets the value of the steps property.
     * 
     */
    public void setSteps(int value) {
        this.steps = value;
    }

}
