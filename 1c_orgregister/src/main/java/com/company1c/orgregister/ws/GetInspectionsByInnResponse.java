
package com.company1c.orgregister.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.company1c.orgregister.corporation.Inspections;


/**
 * <p>Java class for getInspectionsByInnResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getInspectionsByInnResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}Inspections" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getInspectionsByInnResponse", propOrder = {
    "inspections"
})
public class GetInspectionsByInnResponse {

    @XmlElement(name = "Inspections", namespace = "http://company1c.com/orgregister/corporation")
    protected Inspections inspections;

    /**
     * Gets the value of the inspections property.
     * 
     * @return
     *     possible object is
     *     {@link Inspections }
     *     
     */
    public Inspections getInspections() {
        return inspections;
    }

    /**
     * Sets the value of the inspections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Inspections }
     *     
     */
    public void setInspections(Inspections value) {
        this.inspections = value;
    }

}
