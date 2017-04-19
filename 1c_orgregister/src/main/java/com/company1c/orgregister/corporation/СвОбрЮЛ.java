
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
 *       &lt;sequence>
 *         &lt;element name="СпОбрЮЛ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="КодСпОбрЮЛ">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимСпОбрЮЛ">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ДатаНачДейств">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="ДатаОбрЮЛ">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="РегНом">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимРО">
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
    "\u0441\u043f\u041e\u0431\u0440\u042e\u041b"
})
@XmlRootElement(name = "\u0421\u0432\u041e\u0431\u0440\u042e\u041b")
public class СвОбрЮЛ {

    @XmlElement(name = "\u0421\u043f\u041e\u0431\u0440\u042e\u041b")
    protected СвОбрЮЛ.СпОбрЮЛ спОбрЮЛ;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041e\u0431\u0440\u042e\u041b")
    protected XMLGregorianCalendar датаОбрЮЛ;
    @XmlAttribute(name = "\u0420\u0435\u0433\u041d\u043e\u043c")
    protected String регНом;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0420\u041e")
    protected String наимРО;

    /**
     * Gets the value of the спОбрЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link СвОбрЮЛ.СпОбрЮЛ }
     *     
     */
    public СвОбрЮЛ.СпОбрЮЛ getСпОбрЮЛ() {
        return спОбрЮЛ;
    }

    /**
     * Sets the value of the спОбрЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвОбрЮЛ.СпОбрЮЛ }
     *     
     */
    public void setСпОбрЮЛ(СвОбрЮЛ.СпОбрЮЛ value) {
        this.спОбрЮЛ = value;
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
     * Gets the value of the регНом property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getРегНом() {
        return регНом;
    }

    /**
     * Sets the value of the регНом property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setРегНом(String value) {
        this.регНом = value;
    }

    /**
     * Gets the value of the наимРО property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимРО() {
        return наимРО;
    }

    /**
     * Sets the value of the наимРО property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимРО(String value) {
        this.наимРО = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="КодСпОбрЮЛ">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="НаимСпОбрЮЛ">
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
    @XmlType(name = "")
    public static class СпОбрЮЛ {

        @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u043f\u041e\u0431\u0440\u042e\u041b")
        protected String кодСпОбрЮЛ;
        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u043f\u041e\u0431\u0440\u042e\u041b")
        protected String наимСпОбрЮЛ;

        /**
         * Gets the value of the кодСпОбрЮЛ property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getКодСпОбрЮЛ() {
            return кодСпОбрЮЛ;
        }

        /**
         * Sets the value of the кодСпОбрЮЛ property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setКодСпОбрЮЛ(String value) {
            this.кодСпОбрЮЛ = value;
        }

        /**
         * Gets the value of the наимСпОбрЮЛ property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getНаимСпОбрЮЛ() {
            return наимСпОбрЮЛ;
        }

        /**
         * Sets the value of the наимСпОбрЮЛ property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setНаимСпОбрЮЛ(String value) {
            this.наимСпОбрЮЛ = value;
        }

    }

}
