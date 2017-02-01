
package com.storageservice.bmi.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bmi" type="{http://ws.bmi.storageservice.com/}bmi" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="genre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="idLevel" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idLifeStyle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idPerson" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lifeStyle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NGoalAchieved" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NTotalGoal" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
    "birthdate",
    "bmi",
    "description",
    "email",
    "genre",
    "height",
    "idLevel",
    "idLifeStyle",
    "idPerson",
    "lastname",
    "level",
    "lifeStyle",
    "nGoalAchieved",
    "nTotalGoal",
    "password",
    "weight",
    "firstname"
})
public class Person {

    protected String birthdate;
    protected Bmi bmi;
    protected String description;
    protected String email;
    protected String genre;
    protected double height;
    protected int idLevel;
    protected int idLifeStyle;
    protected int idPerson;
    protected String lastname;
    protected String level;
    protected String lifeStyle;
    @XmlElement(name = "NGoalAchieved")
    protected int nGoalAchieved;
    @XmlElement(name = "NTotalGoal")
    protected int nTotalGoal;
    protected String password;
    protected double weight;
    protected String firstname;

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthdate(String value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the bmi property.
     * 
     * @return
     *     possible object is
     *     {@link Bmi }
     *     
     */
    public Bmi getBmi() {
        return bmi;
    }

    /**
     * Sets the value of the bmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bmi }
     *     
     */
    public void setBmi(Bmi value) {
        this.bmi = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the genre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets the value of the genre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenre(String value) {
        this.genre = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }

    /**
     * Gets the value of the idLevel property.
     * 
     */
    public int getIdLevel() {
        return idLevel;
    }

    /**
     * Sets the value of the idLevel property.
     * 
     */
    public void setIdLevel(int value) {
        this.idLevel = value;
    }

    /**
     * Gets the value of the idLifeStyle property.
     * 
     */
    public int getIdLifeStyle() {
        return idLifeStyle;
    }

    /**
     * Sets the value of the idLifeStyle property.
     * 
     */
    public void setIdLifeStyle(int value) {
        this.idLifeStyle = value;
    }

    /**
     * Gets the value of the idPerson property.
     * 
     */
    public int getIdPerson() {
        return idPerson;
    }

    /**
     * Sets the value of the idPerson property.
     * 
     */
    public void setIdPerson(int value) {
        this.idPerson = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the lifeStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeStyle() {
        return lifeStyle;
    }

    /**
     * Sets the value of the lifeStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeStyle(String value) {
        this.lifeStyle = value;
    }

    /**
     * Gets the value of the nGoalAchieved property.
     * 
     */
    public int getNGoalAchieved() {
        return nGoalAchieved;
    }

    /**
     * Sets the value of the nGoalAchieved property.
     * 
     */
    public void setNGoalAchieved(int value) {
        this.nGoalAchieved = value;
    }

    /**
     * Gets the value of the nTotalGoal property.
     * 
     */
    public int getNTotalGoal() {
        return nTotalGoal;
    }

    /**
     * Sets the value of the nTotalGoal property.
     * 
     */
    public void setNTotalGoal(int value) {
        this.nTotalGoal = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(double value) {
        this.weight = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

}
