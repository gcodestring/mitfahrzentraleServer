//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.20 at 10:43:40 AM CEST 
//


package de.mfz.jaxb;

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
 *         &lt;element ref="{}contact" minOccurs="0"/>
 *         &lt;element ref="{}route"/>
 *         &lt;element ref="{}fahrer"/>
 *         &lt;element ref="{}mitfahrer" minOccurs="0"/>
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
    "contact",
    "route",
    "fahrer",
    "mitfahrer"
})
@XmlRootElement(name = "fahrten")
public class Fahrten {

    protected Contact contact;
    @XmlElement(required = true)
    protected Route route;
    @XmlElement(required = true)
    protected Fahrer fahrer;
    protected Mitfahrer mitfahrer;

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link Route }
     *     
     */
    public Route getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link Route }
     *     
     */
    public void setRoute(Route value) {
        this.route = value;
    }

    /**
     * Gets the value of the fahrer property.
     * 
     * @return
     *     possible object is
     *     {@link Fahrer }
     *     
     */
    public Fahrer getFahrer() {
        return fahrer;
    }

    /**
     * Sets the value of the fahrer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fahrer }
     *     
     */
    public void setFahrer(Fahrer value) {
        this.fahrer = value;
    }

    /**
     * Gets the value of the mitfahrer property.
     * 
     * @return
     *     possible object is
     *     {@link Mitfahrer }
     *     
     */
    public Mitfahrer getMitfahrer() {
        return mitfahrer;
    }

    /**
     * Sets the value of the mitfahrer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mitfahrer }
     *     
     */
    public void setMitfahrer(Mitfahrer value) {
        this.mitfahrer = value;
    }

}
