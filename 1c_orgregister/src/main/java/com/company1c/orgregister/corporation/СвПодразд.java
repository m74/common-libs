
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="АдрМНРФ" type="{http://company1c.com/orgregister/corporation}Адрес" minOccurs="0"/>
 *         &lt;element name="АдрМНИн" type="{http://company1c.com/orgregister/corporation}АдрИнТип" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="ДатаНачДейств">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="ВидПодр" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимПолн">
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
@XmlType(name = "", propOrder = {
    "\u0430\u0434\u0440\u041c\u041d\u0420\u0424",
    "\u0430\u0434\u0440\u041c\u041d\u0418\u043d"
})
@XmlRootElement(name = "\u0421\u0432\u041f\u043e\u0434\u0440\u0430\u0437\u0434")
public class СвПодразд {

    @XmlElement(name = "\u0410\u0434\u0440\u041c\u041d\u0420\u0424")
    protected Адрес адрМНРФ;
    @XmlElement(name = "\u0410\u0434\u0440\u041c\u041d\u0418\u043d")
    protected АдрИнТип адрМНИн;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u0412\u0438\u0434\u041f\u043e\u0434\u0440", required = true)
    protected String видПодр;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041f\u043e\u043b\u043d")
    protected String наимПолн;

    /**
     * Gets the value of the адрМНРФ property.
     * 
     * @return
     *     possible object is
     *     {@link Адрес }
     *     
     */
    public Адрес getАдрМНРФ() {
        return адрМНРФ;
    }

    /**
     * Sets the value of the адрМНРФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Адрес }
     *     
     */
    public void setАдрМНРФ(Адрес value) {
        this.адрМНРФ = value;
    }

    /**
     * Gets the value of the адрМНИн property.
     * 
     * @return
     *     possible object is
     *     {@link АдрИнТип }
     *     
     */
    public АдрИнТип getАдрМНИн() {
        return адрМНИн;
    }

    /**
     * Sets the value of the адрМНИн property.
     * 
     * @param value
     *     allowed object is
     *     {@link АдрИнТип }
     *     
     */
    public void setАдрМНИн(АдрИнТип value) {
        this.адрМНИн = value;
    }

    /**
     * Gets the value of the датаНачДейств property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаНачДейств() {
        return датаНачДейств;
    }

    /**
     * Sets the value of the датаНачДейств property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаНачДейств(XMLGregorianCalendar value) {
        this.датаНачДейств = value;
    }

    /**
     * Gets the value of the грн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getГРН() {
        return грн;
    }

    /**
     * Sets the value of the грн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setГРН(String value) {
        this.грн = value;
    }

    /**
     * Gets the value of the видПодр property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВидПодр() {
        return видПодр;
    }

    /**
     * Sets the value of the видПодр property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВидПодр(String value) {
        this.видПодр = value;
    }

    /**
     * Gets the value of the наимПолн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимПолн() {
        return наимПолн;
    }

    /**
     * Sets the value of the наимПолн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимПолн(String value) {
        this.наимПолн = value;
    }

}
