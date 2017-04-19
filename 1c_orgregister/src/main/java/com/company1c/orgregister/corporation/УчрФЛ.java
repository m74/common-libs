
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
 * Сведения об учредителе (участнике) - физическом лице
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип" minOccurs="0"/>
 *         &lt;element name="УдЛичнФЛ" type="{http://company1c.com/orgregister/corporation}УдЛичнТипР" minOccurs="0"/>
 *         &lt;element name="АдрМЖРФ" type="{http://company1c.com/orgregister/corporation}Адрес" minOccurs="0"/>
 *         &lt;element name="АдрМЖИн" type="{http://company1c.com/orgregister/corporation}АдрИнТип" minOccurs="0"/>
 *         &lt;element name="ДоляУстКап" type="{http://company1c.com/orgregister/corporation}ДоляУстКапТип" minOccurs="0"/>
 *         &lt;element name="ЛицоУпрНасл" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип" minOccurs="0"/>
 *                   &lt;element name="УдЛичнФЛ" type="{http://company1c.com/orgregister/corporation}УдЛичнТипР" minOccurs="0"/>
 *                   &lt;element name="АдресМЖРФ" type="{http://company1c.com/orgregister/corporation}Адрес" minOccurs="0"/>
 *                   &lt;element name="АдрМЖИн" type="{http://company1c.com/orgregister/corporation}АдрИнТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаНачДейств">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *                 &lt;attribute name="ДатаОткрНасл" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННТип" />
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
 *       &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННТип" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u0444\u0438\u043e",
    "\u0443\u0434\u041b\u0438\u0447\u043d\u0424\u041b",
    "\u0430\u0434\u0440\u041c\u0416\u0420\u0424",
    "\u0430\u0434\u0440\u041c\u0416\u0418\u043d",
    "\u0434\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f",
    "\u043b\u0438\u0446\u043e\u0423\u043f\u0440\u041d\u0430\u0441\u043b"
})
@XmlRootElement(name = "\u0423\u0447\u0440\u0424\u041b")
public class УчрФЛ {

    @XmlElement(name = "\u0424\u0418\u041e")
    protected ФИОТип фио;
    @XmlElement(name = "\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b")
    protected УдЛичнТипР удЛичнФЛ;
    @XmlElement(name = "\u0410\u0434\u0440\u041c\u0416\u0420\u0424")
    protected Адрес адрМЖРФ;
    @XmlElement(name = "\u0410\u0434\u0440\u041c\u0416\u0418\u043d")
    protected АдрИнТип адрМЖИн;
    @XmlElement(name = "\u0414\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f")
    protected ДоляУстКапТип доляУстКап;
    @XmlElement(name = "\u041b\u0438\u0446\u043e\u0423\u043f\u0440\u041d\u0430\u0441\u043b")
    protected УчрФЛ.ЛицоУпрНасл лицоУпрНасл;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b")
    protected String иннфл;

    /**
     * Gets the value of the фио property.
     * 
     * @return
     *     possible object is
     *     {@link ФИОТип }
     *     
     */
    public ФИОТип getФИО() {
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
    public void setФИО(ФИОТип value) {
        this.фио = value;
    }

    /**
     * Gets the value of the удЛичнФЛ property.
     * 
     * @return
     *     possible object is
     *     {@link УдЛичнТипР }
     *     
     */
    public УдЛичнТипР getУдЛичнФЛ() {
        return удЛичнФЛ;
    }

    /**
     * Sets the value of the удЛичнФЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link УдЛичнТипР }
     *     
     */
    public void setУдЛичнФЛ(УдЛичнТипР value) {
        this.удЛичнФЛ = value;
    }

    /**
     * Gets the value of the адрМЖРФ property.
     * 
     * @return
     *     possible object is
     *     {@link Адрес }
     *     
     */
    public Адрес getАдрМЖРФ() {
        return адрМЖРФ;
    }

    /**
     * Sets the value of the адрМЖРФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Адрес }
     *     
     */
    public void setАдрМЖРФ(Адрес value) {
        this.адрМЖРФ = value;
    }

    /**
     * Gets the value of the адрМЖИн property.
     * 
     * @return
     *     possible object is
     *     {@link АдрИнТип }
     *     
     */
    public АдрИнТип getАдрМЖИн() {
        return адрМЖИн;
    }

    /**
     * Sets the value of the адрМЖИн property.
     * 
     * @param value
     *     allowed object is
     *     {@link АдрИнТип }
     *     
     */
    public void setАдрМЖИн(АдрИнТип value) {
        this.адрМЖИн = value;
    }

    /**
     * Gets the value of the доляУстКап property.
     * 
     * @return
     *     possible object is
     *     {@link ДоляУстКапТип }
     *     
     */
    public ДоляУстКапТип getДоляУстКап() {
        return доляУстКап;
    }

    /**
     * Sets the value of the доляУстКап property.
     * 
     * @param value
     *     allowed object is
     *     {@link ДоляУстКапТип }
     *     
     */
    public void setДоляУстКап(ДоляУстКапТип value) {
        this.доляУстКап = value;
    }

    /**
     * Gets the value of the лицоУпрНасл property.
     * 
     * @return
     *     possible object is
     *     {@link УчрФЛ.ЛицоУпрНасл }
     *     
     */
    public УчрФЛ.ЛицоУпрНасл getЛицоУпрНасл() {
        return лицоУпрНасл;
    }

    /**
     * Sets the value of the лицоУпрНасл property.
     * 
     * @param value
     *     allowed object is
     *     {@link УчрФЛ.ЛицоУпрНасл }
     *     
     */
    public void setЛицоУпрНасл(УчрФЛ.ЛицоУпрНасл value) {
        this.лицоУпрНасл = value;
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
     * Gets the value of the иннфл property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИННФЛ() {
        return иннфл;
    }

    /**
     * Sets the value of the иннфл property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИННФЛ(String value) {
        this.иннфл = value;
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
     *       &lt;sequence>
     *         &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип" minOccurs="0"/>
     *         &lt;element name="УдЛичнФЛ" type="{http://company1c.com/orgregister/corporation}УдЛичнТипР" minOccurs="0"/>
     *         &lt;element name="АдресМЖРФ" type="{http://company1c.com/orgregister/corporation}Адрес" minOccurs="0"/>
     *         &lt;element name="АдрМЖИн" type="{http://company1c.com/orgregister/corporation}АдрИнТип" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ДатаНачДейств">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
     *       &lt;attribute name="ДатаОткрНасл" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННТип" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0444\u0438\u043e",
        "\u0443\u0434\u041b\u0438\u0447\u043d\u0424\u041b",
        "\u0430\u0434\u0440\u0435\u0441\u041c\u0416\u0420\u0424",
        "\u0430\u0434\u0440\u041c\u0416\u0418\u043d"
    })
    public static class ЛицоУпрНасл {

        @XmlElement(name = "\u0424\u0418\u041e")
        protected ФИОТип фио;
        @XmlElement(name = "\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b")
        protected УдЛичнТипР удЛичнФЛ;
        @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441\u041c\u0416\u0420\u0424")
        protected Адрес адресМЖРФ;
        @XmlElement(name = "\u0410\u0434\u0440\u041c\u0416\u0418\u043d")
        protected АдрИнТип адрМЖИн;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d")
        protected String грн;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041e\u0442\u043a\u0440\u041d\u0430\u0441\u043b")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаОткрНасл;
        @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b")
        protected String иннфл;

        /**
         * Gets the value of the фио property.
         * 
         * @return
         *     possible object is
         *     {@link ФИОТип }
         *     
         */
        public ФИОТип getФИО() {
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
        public void setФИО(ФИОТип value) {
            this.фио = value;
        }

        /**
         * Gets the value of the удЛичнФЛ property.
         * 
         * @return
         *     possible object is
         *     {@link УдЛичнТипР }
         *     
         */
        public УдЛичнТипР getУдЛичнФЛ() {
            return удЛичнФЛ;
        }

        /**
         * Sets the value of the удЛичнФЛ property.
         * 
         * @param value
         *     allowed object is
         *     {@link УдЛичнТипР }
         *     
         */
        public void setУдЛичнФЛ(УдЛичнТипР value) {
            this.удЛичнФЛ = value;
        }

        /**
         * Gets the value of the адресМЖРФ property.
         * 
         * @return
         *     possible object is
         *     {@link Адрес }
         *     
         */
        public Адрес getАдресМЖРФ() {
            return адресМЖРФ;
        }

        /**
         * Sets the value of the адресМЖРФ property.
         * 
         * @param value
         *     allowed object is
         *     {@link Адрес }
         *     
         */
        public void setАдресМЖРФ(Адрес value) {
            this.адресМЖРФ = value;
        }

        /**
         * Gets the value of the адрМЖИн property.
         * 
         * @return
         *     possible object is
         *     {@link АдрИнТип }
         *     
         */
        public АдрИнТип getАдрМЖИн() {
            return адрМЖИн;
        }

        /**
         * Sets the value of the адрМЖИн property.
         * 
         * @param value
         *     allowed object is
         *     {@link АдрИнТип }
         *     
         */
        public void setАдрМЖИн(АдрИнТип value) {
            this.адрМЖИн = value;
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
         * Gets the value of the датаОткрНасл property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаОткрНасл() {
            return датаОткрНасл;
        }

        /**
         * Sets the value of the датаОткрНасл property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаОткрНасл(XMLGregorianCalendar value) {
            this.датаОткрНасл = value;
        }

        /**
         * Gets the value of the иннфл property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getИННФЛ() {
            return иннфл;
        }

        /**
         * Sets the value of the иннфл property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setИННФЛ(String value) {
            this.иннфл = value;
        }

    }

}
