
package com.company1c.orgregister.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.company1c.orgregister.corporation.PersonSearchResult;


/**
 * <p>Java class for getEntrepreneursByNameResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEntrepreneursByNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}PersonSearchResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEntrepreneursByNameResponse", propOrder = {
    "personSearchResult"
})
public class GetEntrepreneursByNameResponse {

    @XmlElement(name = "PersonSearchResult", namespace = "http://company1c.com/orgregister/corporation")
    protected PersonSearchResult personSearchResult;

    /**
     * Gets the value of the personSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link PersonSearchResult }
     *     
     */
    public PersonSearchResult getPersonSearchResult() {
        return personSearchResult;
    }

    /**
     * Sets the value of the personSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonSearchResult }
     *     
     */
    public void setPersonSearchResult(PersonSearchResult value) {
        this.personSearchResult = value;
    }

}
