
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
 *         &lt;element name="ОПФ" type="{http://company1c.com/orgregister/corporation}ОПФВыпТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ДатаОбрЮЛ" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ДатаПрекрЮЛ" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="НаимЮЛПолн">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимЮЛСокр">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимЮЛФирм">
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
    "\u043e\u043f\u0444"
})
@XmlRootElement(name = "\u0421\u0432\u041d\u0430\u0438\u043c\u042e\u041b")
public class СвНаимЮЛ {

    @XmlElement(name = "\u041e\u041f\u0424")
    protected ОПФВыпТип опф;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041e\u0431\u0440\u042e\u041b")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаОбрЮЛ;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u0440\u0435\u043a\u0440\u042e\u041b")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаПрекрЮЛ;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u042e\u041b\u041f\u043e\u043b\u043d")
    protected String наимЮЛПолн;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u042e\u041b\u0421\u043e\u043a\u0440")
    protected String наимЮЛСокр;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u042e\u041b\u0424\u0438\u0440\u043c")
    protected String наимЮЛФирм;

    /**
     * Gets the value of the опф property.
     * 
     * @return
     *     possible object is
     *     {@link ОПФВыпТип }
     *     
     */
    public ОПФВыпТип getОПФ() {
        return опф;
    }

    /**
     * Sets the value of the опф property.
     * 
     * @param value
     *     allowed object is
     *     {@link ОПФВыпТип }
     *     
     */
    public void setОПФ(ОПФВыпТип value) {
        this.опф = value;
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
     * Gets the value of the датаОбрЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаОбрЮЛ() {
        return датаОбрЮЛ;
    }

    /**
     * Sets the value of the датаОбрЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаОбрЮЛ(XMLGregorianCalendar value) {
        this.датаОбрЮЛ = value;
    }

    /**
     * Gets the value of the датаПрекрЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаПрекрЮЛ() {
        return датаПрекрЮЛ;
    }

    /**
     * Sets the value of the датаПрекрЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаПрекрЮЛ(XMLGregorianCalendar value) {
        this.датаПрекрЮЛ = value;
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
     * Gets the value of the наимЮЛПолн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимЮЛПолн() {
        return наимЮЛПолн;
    }

    /**
     * Sets the value of the наимЮЛПолн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимЮЛПолн(String value) {
        this.наимЮЛПолн = value;
    }

    /**
     * Gets the value of the наимЮЛСокр property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимЮЛСокр() {
        return наимЮЛСокр;
    }

    /**
     * Sets the value of the наимЮЛСокр property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимЮЛСокр(String value) {
        this.наимЮЛСокр = value;
    }

    /**
     * Gets the value of the наимЮЛФирм property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимЮЛФирм() {
        return наимЮЛФирм;
    }

    /**
     * Sets the value of the наимЮЛФирм property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимЮЛФирм(String value) {
        this.наимЮЛФирм = value;
    }

}
