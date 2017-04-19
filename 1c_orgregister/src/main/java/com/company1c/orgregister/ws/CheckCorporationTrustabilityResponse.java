
package com.company1c.orgregister.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.company1c.orgregister.corporation.CorporationTrustability;


/**
 * <p>Java class for checkCorporationTrustabilityResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkCorporationTrustabilityResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}CorporationTrustability" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkCorporationTrustabilityResponse", propOrder = {
    "corporationTrustability"
})
public class CheckCorporationTrustabilityResponse {

    @XmlElement(name = "CorporationTrustability", namespace = "http://company1c.com/orgregister/corporation")
    protected CorporationTrustability corporationTrustability;

    /**
     * Gets the value of the corporationTrustability property.
     * 
     * @return
     *     possible object is
     *     {@link CorporationTrustability }
     *     
     */
    public CorporationTrustability getCorporationTrustability() {
        return corporationTrustability;
    }

    /**
     * Sets the value of the corporationTrustability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporationTrustability }
     *     
     */
    public void setCorporationTrustability(CorporationTrustability value) {
        this.corporationTrustability = value;
    }

}
