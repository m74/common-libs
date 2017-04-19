
package com.company1c.orgregister.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.company1c.orgregister.corporation.РеквизитыИП;


/**
 * <p>Java class for getEntrepreneurRequisitesByINNResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEntrepreneurRequisitesByINNResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}РеквизитыИП" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEntrepreneurRequisitesByINNResponse", propOrder = {
    "\u0440\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u0418\u041f"
})
public class GetEntrepreneurRequisitesByINNResponse {

    @XmlElement(name = "\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u0418\u041f", namespace = "http://company1c.com/orgregister/corporation")
    protected РеквизитыИП реквизитыИП;

    /**
     * Gets the value of the реквизитыИП property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыИП }
     *     
     */
    public РеквизитыИП getРеквизитыИП() {
        return реквизитыИП;
    }

    /**
     * Sets the value of the реквизитыИП property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыИП }
     *     
     */
    public void setРеквизитыИП(РеквизитыИП value) {
        this.реквизитыИП = value;
    }

}
