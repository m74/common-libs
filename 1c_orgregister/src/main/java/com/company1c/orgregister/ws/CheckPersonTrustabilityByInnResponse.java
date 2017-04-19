
package com.company1c.orgregister.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.company1c.orgregister.corporation.PersonTrustability;


/**
 * <p>Java class for checkPersonTrustabilityByInnResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkPersonTrustabilityByInnResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}PersonTrustability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkPersonTrustabilityByInnResponse", propOrder = {
    "personTrustability"
})
public class CheckPersonTrustabilityByInnResponse {

    @XmlElement(name = "PersonTrustability", namespace = "http://company1c.com/orgregister/corporation")
    protected PersonTrustability personTrustability;

    /**
     * Gets the value of the personTrustability property.
     * 
     * @return
     *     possible object is
     *     {@link PersonTrustability }
     *     
     */
    public PersonTrustability getPersonTrustability() {
        return personTrustability;
    }

    /**
     * Sets the value of the personTrustability property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonTrustability }
     *     
     */
    public void setPersonTrustability(PersonTrustability value) {
        this.personTrustability = value;
    }

}
