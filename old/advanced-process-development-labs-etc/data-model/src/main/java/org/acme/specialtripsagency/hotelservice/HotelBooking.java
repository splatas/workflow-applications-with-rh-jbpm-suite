
package org.acme.specialtripsagency.hotelservice;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hotelID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hotelCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checkInDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checkOutDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quotedRoomType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="quotedAmount" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="visitorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="booking" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelID",
    "hotelCity",
    "checkInDate",
    "checkOutDate",
    "quotedRoomType",
    "quotedAmount",
    "visitorName",
    "type",
    "booking"
})
@XmlRootElement(name = "HotelBooking")
public class HotelBooking
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String hotelID;
    @XmlElement(required = true)
    protected String hotelCity;
    @XmlElement(required = true)
    protected String checkInDate;
    @XmlElement(required = true)
    protected String checkOutDate;
    @XmlElement(required = true)
    protected String quotedRoomType;
    protected double quotedAmount;
    @XmlElement(required = true)
    protected String visitorName;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String booking;

    /**
     * Gets the value of the hotelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelID() {
        return hotelID;
    }

    /**
     * Sets the value of the hotelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelID(String value) {
        this.hotelID = value;
    }

    /**
     * Gets the value of the hotelCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCity() {
        return hotelCity;
    }

    /**
     * Sets the value of the hotelCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCity(String value) {
        this.hotelCity = value;
    }

    /**
     * Gets the value of the checkInDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInDate() {
        return checkInDate;
    }

    /**
     * Sets the value of the checkInDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInDate(String value) {
        this.checkInDate = value;
    }

    /**
     * Gets the value of the checkOutDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOutDate() {
        return checkOutDate;
    }

    /**
     * Sets the value of the checkOutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOutDate(String value) {
        this.checkOutDate = value;
    }

    /**
     * Gets the value of the quotedRoomType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotedRoomType() {
        return quotedRoomType;
    }

    /**
     * Sets the value of the quotedRoomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotedRoomType(String value) {
        this.quotedRoomType = value;
    }

    /**
     * Gets the value of the quotedAmount property.
     * 
     */
    public double getQuotedAmount() {
        return quotedAmount;
    }

    /**
     * Sets the value of the quotedAmount property.
     * 
     */
    public void setQuotedAmount(double value) {
        this.quotedAmount = value;
    }

    /**
     * Gets the value of the visitorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisitorName() {
        return visitorName;
    }

    /**
     * Sets the value of the visitorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisitorName(String value) {
        this.visitorName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the booking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooking() {
        return booking;
    }

    /**
     * Sets the value of the booking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooking(String value) {
        this.booking = value;
    }

}
