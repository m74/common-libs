
package com.company1c.orgregister.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.company1c.orgregister.corporation.FnsWebServiceStatus;


/**
 * <p>Java class for updateEntrepreneurByInnResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateEntrepreneurByInnResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}FnsWebServiceStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEntrepreneurByInnResponse", propOrder = {
    "fnsWebServiceStatus"
})
public class UpdateEntrepreneurByInnResponse {

    @XmlElement(name = "FnsWebServiceStatus", namespace = "http://company1c.com/orgregister/corporation")
    protected FnsWebServiceStatus fnsWebServiceStatus;

    /**
     * Gets the value of the fnsWebServiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FnsWebServiceStatus }
     *     
     */
    public FnsWebServiceStatus getFnsWebServiceStatus() {
        return fnsWebServiceStatus;
    }

    /**
     * Sets the value of the fnsWebServiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FnsWebServiceStatus }
     *     
     */
    public void setFnsWebServiceStatus(FnsWebServiceStatus value) {
        this.fnsWebServiceStatus = value;
    }

}
