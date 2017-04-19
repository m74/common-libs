
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
 *         &lt;element name="СвОсущПр" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="СвОргОсущПр" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ОГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *                           &lt;attribute name="ИННЮЛ" type="{http://company1c.com/orgregister/corporation}ИННТип" />
 *                           &lt;attribute name="НаимЮЛПолн">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвФЛОсущПр" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип" minOccurs="0"/>
 *                             &lt;element name="УдЛичнФЛ" type="{http://company1c.com/orgregister/corporation}УдЛичнТипР" minOccurs="0"/>
 *                             &lt;element name="АдресМЖРФ" type="{http://company1c.com/orgregister/corporation}Адрес" minOccurs="0"/>
 *                             &lt;element name="АдрМЖИн" type="{http://company1c.com/orgregister/corporation}АдрИнТип" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННТип" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ДоляУстКап" type="{http://company1c.com/orgregister/corporation}ДоляУстКапТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ДатаНачДейств">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="КодУчрРФСубМО">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="КодРегион" type="{http://company1c.com/orgregister/corporation}CCРФТип" />
 *       &lt;attribute name="НаимРегион">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимМО">
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
    "\u0441\u0432\u041e\u0441\u0443\u0449\u041f\u0440",
    "\u0434\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f"
})
@XmlRootElement(name = "\u0423\u0447\u0440\u0420\u0424\u0421\u0443\u0431\u041c\u041e")
public class УчрРФСубМО {

    @XmlElement(name = "\u0421\u0432\u041e\u0441\u0443\u0449\u041f\u0440")
    protected УчрРФСубМО.СвОсущПр свОсущПр;
    @XmlElement(name = "\u0414\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f")
    protected ДоляУстКапТип доляУстКап;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0423\u0447\u0440\u0420\u0424\u0421\u0443\u0431\u041c\u041e")
    protected String кодУчрРФСубМО;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0420\u0435\u0433\u0438\u043e\u043d")
    protected String кодРегион;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0420\u0435\u0433\u0438\u043e\u043d")
    protected String наимРегион;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041c\u041e")
    protected String наимМО;

    /**
     * Gets the value of the свОсущПр property.
     * 
     * @return
     *     possible object is
     *     {@link УчрРФСубМО.СвОсущПр }
     *     
     */
    public УчрРФСубМО.СвОсущПр getСвОсущПр() {
        return свОсущПр;
    }

    /**
     * Sets the value of the свОсущПр property.
     * 
     * @param value
     *     allowed object is
     *     {@link УчрРФСубМО.СвОсущПр }
     *     
     */
    public void setСвОсущПр(УчрРФСубМО.СвОсущПр value) {
        this.свОсущПр = value;
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
     * Gets the value of the кодУчрРФСубМО property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодУчрРФСубМО() {
        return кодУчрРФСубМО;
    }

    /**
     * Sets the value of the кодУчрРФСубМО property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодУчрРФСубМО(String value) {
        this.кодУчрРФСубМО = value;
    }

    /**
     * Gets the value of the кодРегион property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодРегион() {
        return кодРегион;
    }

    /**
     * Sets the value of the кодРегион property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодРегион(String value) {
        this.кодРегион = value;
    }

    /**
     * Gets the value of the наимРегион property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимРегион() {
        return наимРегион;
    }

    /**
     * Sets the value of the наимРегион property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимРегион(String value) {
        this.наимРегион = value;
    }

    /**
     * Gets the value of the наимМО property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимМО() {
        return наимМО;
    }

    /**
     * Sets the value of the наимМО property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимМО(String value) {
        this.наимМО = value;
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
     *       &lt;choice>
     *         &lt;element name="СвОргОсущПр" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ОГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
     *                 &lt;attribute name="ИННЮЛ" type="{http://company1c.com/orgregister/corporation}ИННТип" />
     *                 &lt;attribute name="НаимЮЛПолн">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="СвФЛОсущПр" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип" minOccurs="0"/>
     *                   &lt;element name="УдЛичнФЛ" type="{http://company1c.com/orgregister/corporation}УдЛичнТипР" minOccurs="0"/>
     *                   &lt;element name="АдресМЖРФ" type="{http://company1c.com/orgregister/corporation}Адрес" minOccurs="0"/>
     *                   &lt;element name="АдрМЖИн" type="{http://company1c.com/orgregister/corporation}АдрИнТип" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННТип" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0441\u0432\u041e\u0440\u0433\u041e\u0441\u0443\u0449\u041f\u0440",
        "\u0441\u0432\u0424\u041b\u041e\u0441\u0443\u0449\u041f\u0440"
    })
    public static class СвОсущПр {

        @XmlElement(name = "\u0421\u0432\u041e\u0440\u0433\u041e\u0441\u0443\u0449\u041f\u0440")
        protected УчрРФСубМО.СвОсущПр.СвОргОсущПр свОргОсущПр;
        @XmlElement(name = "\u0421\u0432\u0424\u041b\u041e\u0441\u0443\u0449\u041f\u0440")
        protected УчрРФСубМО.СвОсущПр.СвФЛОсущПр свФЛОсущПр;

        /**
         * Gets the value of the свОргОсущПр property.
         * 
         * @return
         *     possible object is
         *     {@link УчрРФСубМО.СвОсущПр.СвОргОсущПр }
         *     
         */
        public УчрРФСубМО.СвОсущПр.СвОргОсущПр getСвОргОсущПр() {
            return свОргОсущПр;
        }

        /**
         * Sets the value of the свОргОсущПр property.
         * 
         * @param value
         *     allowed object is
         *     {@link УчрРФСубМО.СвОсущПр.СвОргОсущПр }
         *     
         */
        public void setСвОргОсущПр(УчрРФСубМО.СвОсущПр.СвОргОсущПр value) {
            this.свОргОсущПр = value;
        }

        /**
         * Gets the value of the свФЛОсущПр property.
         * 
         * @return
         *     possible object is
         *     {@link УчрРФСубМО.СвОсущПр.СвФЛОсущПр }
         *     
         */
        public УчрРФСубМО.СвОсущПр.СвФЛОсущПр getСвФЛОсущПр() {
            return свФЛОсущПр;
        }

        /**
         * Sets the value of the свФЛОсущПр property.
         * 
         * @param value
         *     allowed object is
         *     {@link УчрРФСубМО.СвОсущПр.СвФЛОсущПр }
         *     
         */
        public void setСвФЛОсущПр(УчрРФСубМО.СвОсущПр.СвФЛОсущПр value) {
            this.свФЛОсущПр = value;
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
         *       &lt;attribute name="ОГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
         *       &lt;attribute name="ИННЮЛ" type="{http://company1c.com/orgregister/corporation}ИННТип" />
         *       &lt;attribute name="НаимЮЛПолн">
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
        public static class СвОргОсущПр {

            @XmlAttribute(name = "\u041e\u0413\u0420\u041d")
            protected String огрн;
            @XmlAttribute(name = "\u0418\u041d\u041d\u042e\u041b")
            protected String иннюл;
            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u042e\u041b\u041f\u043e\u043b\u043d")
            protected String наимЮЛПолн;

            /**
             * Gets the value of the огрн property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getОГРН() {
                return огрн;
            }

            /**
             * Sets the value of the огрн property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setОГРН(String value) {
                this.огрн = value;
            }

            /**
             * Gets the value of the иннюл property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getИННЮЛ() {
                return иннюл;
            }

            /**
             * Sets the value of the иннюл property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setИННЮЛ(String value) {
                this.иннюл = value;
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
        public static class СвФЛОсущПр {

            @XmlElement(name = "\u0424\u0418\u041e")
            protected ФИОТип фио;
            @XmlElement(name = "\u0423\u0434\u041b\u0438\u0447\u043d\u0424\u041b")
            protected УдЛичнТипР удЛичнФЛ;
            @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441\u041c\u0416\u0420\u0424")
            protected Адрес адресМЖРФ;
            @XmlElement(name = "\u0410\u0434\u0440\u041c\u0416\u0418\u043d")
            protected АдрИнТип адрМЖИн;
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

}
