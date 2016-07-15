
package com.company1c.orgregister.corporation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Адрес complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Адрес">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Состав" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Страна" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0410\u0434\u0440\u0435\u0441", propOrder = {
    "\u0441\u043e\u0441\u0442\u0430\u0432"
})
public class Адрес {

    @XmlElementRef(name = "\u0421\u043e\u0441\u0442\u0430\u0432", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> состав;
    @XmlAttribute(name = "\u0421\u0442\u0440\u0430\u043d\u0430")
    protected String страна;

    /**
     * Gets the value of the состав property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getСостав() {
        return состав;
    }

    /**
     * Sets the value of the состав property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setСостав(JAXBElement<Object> value) {
        this.состав = value;
    }

    /**
     * Gets the value of the страна property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getСтрана() {
        return страна;
    }

    /**
     * Sets the value of the страна property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setСтрана(String value) {
        this.страна = value;
    }

}
