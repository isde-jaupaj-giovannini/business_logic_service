
package com.unitn.local_database;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for measureData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="measureData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idTelegram" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="steps" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "measureData", propOrder = {
    "id",
    "idTelegram",
    "steps",
    "timestamp"
})
public class MeasureData {

    protected int id;
    protected int idTelegram;
    protected int steps;
    protected long timestamp;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
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

    /**
     * Gets the value of the timestamp property.
     * 
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     */
    public void setTimestamp(long value) {
        this.timestamp = value;
    }

}
