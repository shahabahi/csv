
package com.maskan.csv.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for messageStateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="messageStateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="states" type="{http://webservice.smsrelay.armaghan.net/}messageState" maxOccurs="unbounded"/>
 *         &lt;element name="error" type="{http://webservice.smsrelay.armaghan.net/}error"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageStateResult1", propOrder =  {
    "states",
    "error"
})
public class MessageStateResult {

    @XmlElement(required = true, nillable = true)
    protected List<MessageState> states;
    @XmlElement(required = true)
    protected Error error;

    /**
     * Gets the value of the states property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the states property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStates().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageState }
     *
     *
     */
    public List<MessageState> getStates() {
        if (states == null) {
            states = new ArrayList<MessageState>();
        }
        return this.states;
    }

    /**
     * Gets the value of the error property.
     *
     * @return
     *     possible object is
     *     {@link Error }
     *
     */
    public Error getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value
     *     allowed object is
     *     {@link Error }
     *
     */
    public void setError(Error value) {
        this.error = value;
    }

}
