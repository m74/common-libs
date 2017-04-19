
package com.company1c.orgregister.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.company1c.orgregister.corporation.CorporationSearchResult;


/**
 * <p>Java class for getCorporationRequisitesByNameAndAddressAndDirectorResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCorporationRequisitesByNameAndAddressAndDirectorResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}CorporationSearchResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCorporationRequisitesByNameAndAddressAndDirectorResponse", propOrder = {
    "corporationSearchResult"
})
public class GetCorporationRequisitesByNameAndAddressAndDirectorResponse {

    @XmlElement(name = "CorporationSearchResult", namespace = "http://company1c.com/orgregister/corporation")
    protected CorporationSearchResult corporationSearchResult;

    /**
     * Gets the value of the corporationSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link CorporationSearchResult }
     *     
     */
    public CorporationSearchResult getCorporationSearchResult() {
        return corporationSearchResult;
    }

    /**
     * Sets the value of the corporationSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporationSearchResult }
     *     
     */
    public void setCorporationSearchResult(CorporationSearchResult value) {
        this.corporationSearchResult = value;
    }

}
