
package com.company1c.orgregister.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.company1c.orgregister.corporation.ФИОТип;


/**
 * <p>Java class for getEntrepreneursByName complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEntrepreneursByName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="фио" type="{http://company1c.com/orgregister/corporation}ФИОТип" form="qualified"/>
 *         &lt;element name="configurationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEntrepreneursByName", propOrder = {
    "\u0444\u0438\u043e",
    "configurationName"
})
public class GetEntrepreneursByName {

    @XmlElement(required = true)
    protected ФИОТип фио;
    protected String configurationName;

    /**
     * Gets the value of the фио property.
     * 
     * @return
     *     possible object is
     *     {@link ФИОТип }
     *     
     */
    public ФИОТип getФио() {
        return фио;
    }

    /**
     * Sets the value of the фио property.
     * 
     * @param value
     *     allowed object is
     *     {@link ФИОТип }
     *     
     */
    public void setФио(ФИОТип value) {
        this.фио = value;
    }

    /**
     * Gets the value of the configurationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationName() {
        return configurationName;
    }

    /**
     * Sets the value of the configurationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationName(String value) {
        this.configurationName = value;
    }

}
