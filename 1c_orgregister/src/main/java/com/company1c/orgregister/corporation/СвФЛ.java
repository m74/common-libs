
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;sequence>
 *         &lt;element name="ФИОРус" type="{http://company1c.com/orgregister/corporation}ФИОТип" minOccurs="0"/>
 *         &lt;element name="ФИОЛат" type="{http://company1c.com/orgregister/corporation}ФИОТип" minOccurs="0"/>
 *         &lt;element name="СвРожд" type="{http://company1c.com/orgregister/corporation}СведРождТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="Пол">
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
    "\u0444\u0438\u043e\u0420\u0443\u0441",
    "\u0444\u0438\u043e\u041b\u0430\u0442",
    "\u0441\u0432\u0420\u043e\u0436\u0434"
})
@XmlRootElement(name = "\u0421\u0432\u0424\u041b")
public class СвФЛ {

    @XmlElement(name = "\u0424\u0418\u041e\u0420\u0443\u0441")
    protected ФИОТип фиоРус;
    @XmlElement(name = "\u0424\u0418\u041e\u041b\u0430\u0442")
    protected ФИОТип фиоЛат;
    @XmlElement(name = "\u0421\u0432\u0420\u043e\u0436\u0434")
    protected СведРождТип свРожд;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u041f\u043e\u043b")
    protected String пол;

    /**
     * Gets the value of the фиоРус property.
     * 
     * @return
     *     possible object is
     *     {@link ФИОТип }
     *     
     */
    public ФИОТип getФИОРус() {
        return фиоРус;
    }

    /**
     * Sets the value of the фиоРус property.
     * 
     * @param value
     *     allowed object is
     *     {@link ФИОТип }
     *     
     */
    public void setФИОРус(ФИОТип value) {
        this.фиоРус = value;
    }

    /**
     * Gets the value of the фиоЛат property.
     * 
     * @return
     *     possible object is
     *     {@link ФИОТип }
     *     
     */
    public ФИОТип getФИОЛат() {
        return фиоЛат;
    }

    /**
     * Sets the value of the фиоЛат property.
     * 
     * @param value
     *     allowed object is
     *     {@link ФИОТип }
     *     
     */
    public void setФИОЛат(ФИОТип value) {
        this.фиоЛат = value;
    }

    /**
     * Gets the value of the свРожд property.
     * 
     * @return
     *     possible object is
     *     {@link СведРождТип }
     *     
     */
    public СведРождТип getСвРожд() {
        return свРожд;
    }

    /**
     * Sets the value of the свРожд property.
     * 
     * @param value
     *     allowed object is
     *     {@link СведРождТип }
     *     
     */
    public void setСвРожд(СведРождТип value) {
        this.свРожд = value;
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
     * Gets the value of the пол property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПол() {
        return пол;
    }

    /**
     * Sets the value of the пол property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПол(String value) {
        this.пол = value;
    }

}
