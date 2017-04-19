
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="ПрОснДоп">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="КодОКВЭД" type="{http://company1c.com/orgregister/corporation}ОКВЭДТип" />
 *       &lt;attribute name="ПрВерсОКВЭД">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="4"/>
 *             &lt;enumeration value="2001"/>
 *             &lt;enumeration value="2014"/>
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
@XmlType(name = "")
@XmlRootElement(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414")
public class СвОКВЭД {

    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u041f\u0440\u041e\u0441\u043d\u0414\u043e\u043f")
    protected String прОснДоп;
    @XmlAttribute(name = "\u041a\u043e\u0434\u041e\u041a\u0412\u042d\u0414")
    protected String кодОКВЭД;
    @XmlAttribute(name = "\u041f\u0440\u0412\u0435\u0440\u0441\u041e\u041a\u0412\u042d\u0414")
    protected String прВерсОКВЭД;

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
     * Gets the value of the прОснДоп property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПрОснДоп() {
        return прОснДоп;
    }

    /**
     * Sets the value of the прОснДоп property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПрОснДоп(String value) {
        this.прОснДоп = value;
    }

    /**
     * Gets the value of the кодОКВЭД property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодОКВЭД() {
        return кодОКВЭД;
    }

    /**
     * Sets the value of the кодОКВЭД property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодОКВЭД(String value) {
        this.кодОКВЭД = value;
    }

    /**
     * Gets the value of the прВерсОКВЭД property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПрВерсОКВЭД() {
        return прВерсОКВЭД;
    }

    /**
     * Sets the value of the прВерсОКВЭД property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПрВерсОКВЭД(String value) {
        this.прВерсОКВЭД = value;
    }

}
