
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Адрес за пределами территории Российской Федерации
 * 
 * <p>Java class for АдрИнТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="АдрИнТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ОКСМ">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://company1c.com/orgregister/corporation}ОКСМТип">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимСтран">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="АдрИн">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0410\u0434\u0440\u0418\u043d\u0422\u0438\u043f")
public class АдрИнТип {

    @XmlAttribute(name = "\u041e\u041a\u0421\u041c")
    protected String оксм;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0440\u0430\u043d")
    protected String наимСтран;
    @XmlAttribute(name = "\u0410\u0434\u0440\u0418\u043d")
    protected String адрИн;

    /**
     * Gets the value of the оксм property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОКСМ() {
        return оксм;
    }

    /**
     * Sets the value of the оксм property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОКСМ(String value) {
        this.оксм = value;
    }

    /**
     * Gets the value of the наимСтран property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимСтран() {
        return наимСтран;
    }

    /**
     * Sets the value of the наимСтран property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимСтран(String value) {
        this.наимСтран = value;
    }

    /**
     * Gets the value of the адрИн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getАдрИн() {
        return адрИн;
    }

    /**
     * Sets the value of the адрИн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setАдрИн(String value) {
        this.адрИн = value;
    }

}
