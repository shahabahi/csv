
package com.maskan.csv.ws;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for user complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="credit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="deliveryUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="receiveUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expirationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IPs" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="numbers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user1", propOrder =  {
    "username",
    "credit",
    "deliveryUrl",
    "receiveUrl",
    "expirationDate",
    "iPs",
    "numbers"
})
public class User {

    @XmlElement(required = true)
    protected String username;
    protected double credit;
    @XmlElement(required = true, nillable = true)
    protected String deliveryUrl;
    @XmlElement(required = true, nillable = true)
    protected String receiveUrl;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "IPs", required = true)
    protected List<String> iPs;
    @XmlElement(required = true)
    protected List<String> numbers;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     */
    public double getCredit() {
        return credit;
    }

    /**
     * Sets the value of the credit property.
     * 
     */
    public void setCredit(double value) {
        this.credit = value;
    }

    /**
     * Gets the value of the deliveryUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryUrl() {
        return deliveryUrl;
    }

    /**
     * Sets the value of the deliveryUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryUrl(String value) {
        this.deliveryUrl = value;
    }

    /**
     * Gets the value of the receiveUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveUrl() {
        return receiveUrl;
    }

    /**
     * Sets the value of the receiveUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveUrl(String value) {
        this.receiveUrl = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the iPs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iPs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIPs() {
        if (iPs == null) {
            iPs = new ArrayList<String>();
        }
        return this.iPs;
    }

    /**
     * Gets the value of the numbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNumbers() {
        if (numbers == null) {
            numbers = new ArrayList<String>();
        }
        return this.numbers;
    }

}
