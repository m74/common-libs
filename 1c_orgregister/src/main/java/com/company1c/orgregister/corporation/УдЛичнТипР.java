
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о документе, удостоверяющем личность
 * 
 * <p>Java class for УдЛичнТипР complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="УдЛичнТипР">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="КодВидДок" type="{http://company1c.com/orgregister/corporation}СПДУЛТип" />
 *       &lt;attribute name="НаимДок">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="СерНомДок">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ДатаДок" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ВыдДок">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="КодВыдДок">
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
@XmlType(name = "\u0423\u0434\u041b\u0438\u0447\u043d\u0422\u0438\u043f\u0420")
public class УдЛичнТипР {

    @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a")
    protected String кодВидДок;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0414\u043e\u043a")
    protected String наимДок;
    @XmlAttribute(name = "\u0421\u0435\u0440\u041d\u043e\u043c\u0414\u043e\u043a")
    protected String серНомДок;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0414\u043e\u043a")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаДок;
    @XmlAttribute(name = "\u0412\u044b\u0434\u0414\u043e\u043a")
    protected String выдДок;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u044b\u0434\u0414\u043e\u043a")
    protected String кодВыдДок;

    /**
     * Gets the value of the кодВидДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодВидДок() {
        return кодВидДок;
    }

    /**
     * Sets the value of the кодВидДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодВидДок(String value) {
        this.кодВидДок = value;
    }

    /**
     * Gets the value of the наимДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимДок() {
        return наимДок;
    }

    /**
     * Sets the value of the наимДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимДок(String value) {
        this.наимДок = value;
    }

    /**
     * Gets the value of the серНомДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getСерНомДок() {
        return серНомДок;
    }

    /**
     * Sets the value of the серНомДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setСерНомДок(String value) {
        this.серНомДок = value;
    }

    /**
     * Gets the value of the датаДок property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаДок() {
        return датаДок;
    }

    /**
     * Sets the value of the датаДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаДок(XMLGregorianCalendar value) {
        this.датаДок = value;
    }

    /**
     * Gets the value of the выдДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВыдДок() {
        return выдДок;
    }

    /**
     * Sets the value of the выдДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВыдДок(String value) {
        this.выдДок = value;
    }

    /**
     * Gets the value of the кодВыдДок property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодВыдДок() {
        return кодВыдДок;
    }

    /**
     * Sets the value of the кодВыдДок property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодВыдДок(String value) {
        this.кодВыдДок = value;
    }

}
