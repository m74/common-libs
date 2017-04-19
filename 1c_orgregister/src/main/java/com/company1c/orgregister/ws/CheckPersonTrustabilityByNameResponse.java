
package com.company1c.orgregister.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.company1c.orgregister.corporation.PersonTrustabilityList;


/**
 * <p>Java class for checkPersonTrustabilityByNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkPersonTrustabilityByNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}PersonTrustabilityList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkPersonTrustabilityByNameResponse", propOrder = {
    "personTrustabilityList"
})
public class CheckPersonTrustabilityByNameResponse {

    @XmlElement(name = "PersonTrustabilityList", namespace = "http://company1c.com/orgregister/corporation")
    protected PersonTrustabilityList personTrustabilityList;

    /**
     * Gets the value of the personTrustabilityList property.
     * 
     * @return
     *     possible object is
     *     {@link PersonTrustabilityList }
     *     
     */
    public PersonTrustabilityList getPersonTrustabilityList() {
        return personTrustabilityList;
    }

    /**
     * Sets the value of the personTrustabilityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonTrustabilityList }
     *     
     */
    public void setPersonTrustabilityList(PersonTrustabilityList value) {
        this.personTrustabilityList = value;
    }

}
