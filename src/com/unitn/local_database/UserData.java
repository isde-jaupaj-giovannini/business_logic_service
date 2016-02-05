
package com.unitn.local_database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="height" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="idTelegram" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userData", propOrder = {
    "birthTimestamp",
    "height",
    "idTelegram",
    "name",
    "projectId",
    "weight"
})
public class UserData {

    protected long birthTimestamp;
    protected float height;
    protected int idTelegram;
    protected String name;
    protected long projectId;
    protected int weight;

    /**
     * Gets the value of the birthTimestamp property.
     * 
     */
    public long getBirthTimestamp() {
        return birthTimestamp;
    }

    /**
     * Sets the value of the birthTimestamp property.
     * 
     */
    public void setBirthTimestamp(long value) {
        this.birthTimestamp = value;
    }

    /**
     * Gets the value of the height property.
     * 
     */
    public float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     */
    public void setHeight(float value) {
        this.height = value;
    }

    /**
     * Gets the value of the idTelegram property.
     * 
     */
    public int getIdTelegram() {
        return idTelegram;
    }

    /**
     * Sets the value of the idTelegram property.
     * 
     */
    public void setIdTelegram(int value) {
        this.idTelegram = value;
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
     * Gets the value of the projectId property.
     * 
     */
    public long getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     */
    public void setProjectId(long value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     */
    public void setWeight(int value) {
        this.weight = value;
    }

}
