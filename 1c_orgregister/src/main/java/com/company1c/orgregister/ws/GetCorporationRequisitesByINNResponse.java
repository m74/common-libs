
package com.company1c.orgregister.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.company1c.orgregister.corporation.РеквизитыЮрЛица;


/**
 * <p>Java class for getCorporationRequisitesByINNResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCorporationRequisitesByINNResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}РеквизитыЮрЛица" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCorporationRequisitesByINNResponse", propOrder = {
    "\u0440\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u042e\u0440\u041b\u0438\u0446\u0430"
})
public class GetCorporationRequisitesByINNResponse {

    @XmlElement(name = "\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u042e\u0440\u041b\u0438\u0446\u0430", namespace = "http://company1c.com/orgregister/corporation")
    protected РеквизитыЮрЛица реквизитыЮрЛица;

    /**
     * Gets the value of the реквизитыЮрЛица property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыЮрЛица }
     *     
     */
    public РеквизитыЮрЛица getРеквизитыЮрЛица() {
        return реквизитыЮрЛица;
    }

    /**
     * Sets the value of the реквизитыЮрЛица property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыЮрЛица }
     *     
     */
    public void setРеквизитыЮрЛица(РеквизитыЮрЛица value) {
        this.реквизитыЮрЛица = value;
    }

}
