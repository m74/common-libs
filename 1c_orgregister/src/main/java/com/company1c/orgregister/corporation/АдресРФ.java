
package com.company1c.orgregister.corporation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for АдресРФ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="АдресРФ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="СубъектРФ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Округ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="СвРайМО" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Район" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="СвМО" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="МунОбр1" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="МунОбр2" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Город" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="НаселПункт" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ВнутригРайон" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Улица" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ОКТМО" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ОКАТО" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ДопАдрЭл" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Номер" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Тип" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Значение" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ТипАдрЭл" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Значение" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Адрес_по_документу" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Местоположение" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0410\u0434\u0440\u0435\u0441\u0420\u0424", propOrder = {
    "\u0441\u0443\u0431\u044a\u0435\u043a\u0442\u0420\u0424",
    "\u043e\u043a\u0440\u0443\u0433",
    "\u0441\u0432\u0420\u0430\u0439\u041c\u041e",
    "\u0433\u043e\u0440\u043e\u0434",
    "\u043d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442",
    "\u0432\u043d\u0443\u0442\u0440\u0438\u0433\u0420\u0430\u0439\u043e\u043d",
    "\u0443\u043b\u0438\u0446\u0430",
    "\u043e\u043a\u0442\u043c\u043e",
    "\u043e\u043a\u0430\u0442\u043e",
    "\u0434\u043e\u043f\u0410\u0434\u0440\u042d\u043b",
    "\u0430\u0434\u0440\u0435\u0441\u041f\u043e\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0443",
    "\u043c\u0435\u0441\u0442\u043e\u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u0435"
})
public class АдресРФ {

    @XmlElementRef(name = "\u0421\u0443\u0431\u044a\u0435\u043a\u0442\u0420\u0424", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> субъектРФ;
    @XmlElementRef(name = "\u041e\u043a\u0440\u0443\u0433", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> округ;
    @XmlElementRef(name = "\u0421\u0432\u0420\u0430\u0439\u041c\u041e", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
    protected JAXBElement<АдресРФ.СвРайМО> свРайМО;
    @XmlElementRef(name = "\u0413\u043e\u0440\u043e\u0434", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> город;
    @XmlElementRef(name = "\u041d\u0430\u0441\u0435\u043b\u041f\u0443\u043d\u043a\u0442", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> населПункт;
    @XmlElementRef(name = "\u0412\u043d\u0443\u0442\u0440\u0438\u0433\u0420\u0430\u0439\u043e\u043d", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> внутригРайон;
    @XmlElementRef(name = "\u0423\u043b\u0438\u0446\u0430", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> улица;
    @XmlElementRef(name = "\u041e\u041a\u0422\u041c\u041e", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> октмо;
    @XmlElementRef(name = "\u041e\u041a\u0410\u0422\u041e", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> окато;
    @XmlElement(name = "\u0414\u043e\u043f\u0410\u0434\u0440\u042d\u043b", nillable = true)
    protected List<АдресРФ.ДопАдрЭл> допАдрЭл;
    @XmlElementRef(name = "\u0410\u0434\u0440\u0435\u0441_\u043f\u043e_\u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442\u0443", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> адресПоДокументу;
    @XmlElementRef(name = "\u041c\u0435\u0441\u0442\u043e\u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u0435", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
    protected JAXBElement<String> местоположение;

    /**
     * Gets the value of the субъектРФ property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getСубъектРФ() {
        return субъектРФ;
    }

    /**
     * Sets the value of the субъектРФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setСубъектРФ(JAXBElement<String> value) {
        this.субъектРФ = value;
    }

    /**
     * Gets the value of the округ property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getОкруг() {
        return округ;
    }

    /**
     * Sets the value of the округ property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setОкруг(JAXBElement<String> value) {
        this.округ = value;
    }

    /**
     * Gets the value of the свРайМО property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link АдресРФ.СвРайМО }{@code >}
     *     
     */
    public JAXBElement<АдресРФ.СвРайМО> getСвРайМО() {
        return свРайМО;
    }

    /**
     * Sets the value of the свРайМО property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link АдресРФ.СвРайМО }{@code >}
     *     
     */
    public void setСвРайМО(JAXBElement<АдресРФ.СвРайМО> value) {
        this.свРайМО = value;
    }

    /**
     * Gets the value of the город property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getГород() {
        return город;
    }

    /**
     * Sets the value of the город property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setГород(JAXBElement<String> value) {
        this.город = value;
    }

    /**
     * Gets the value of the населПункт property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getНаселПункт() {
        return населПункт;
    }

    /**
     * Sets the value of the населПункт property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setНаселПункт(JAXBElement<String> value) {
        this.населПункт = value;
    }

    /**
     * Gets the value of the внутригРайон property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getВнутригРайон() {
        return внутригРайон;
    }

    /**
     * Sets the value of the внутригРайон property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setВнутригРайон(JAXBElement<String> value) {
        this.внутригРайон = value;
    }

    /**
     * Gets the value of the улица property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getУлица() {
        return улица;
    }

    /**
     * Sets the value of the улица property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setУлица(JAXBElement<String> value) {
        this.улица = value;
    }

    /**
     * Gets the value of the октмо property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getОКТМО() {
        return октмо;
    }

    /**
     * Sets the value of the октмо property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setОКТМО(JAXBElement<BigInteger> value) {
        this.октмо = value;
    }

    /**
     * Gets the value of the окато property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getОКАТО() {
        return окато;
    }

    /**
     * Sets the value of the окато property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setОКАТО(JAXBElement<BigInteger> value) {
        this.окато = value;
    }

    /**
     * Gets the value of the допАдрЭл property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the допАдрЭл property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getДопАдрЭл().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link АдресРФ.ДопАдрЭл }
     * 
     * 
     */
    public List<АдресРФ.ДопАдрЭл> getДопАдрЭл() {
        if (допАдрЭл == null) {
            допАдрЭл = new ArrayList<АдресРФ.ДопАдрЭл>();
        }
        return this.допАдрЭл;
    }

    /**
     * Gets the value of the адресПоДокументу property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getАдресПоДокументу() {
        return адресПоДокументу;
    }

    /**
     * Sets the value of the адресПоДокументу property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setАдресПоДокументу(JAXBElement<String> value) {
        this.адресПоДокументу = value;
    }

    /**
     * Gets the value of the местоположение property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getМестоположение() {
        return местоположение;
    }

    /**
     * Sets the value of the местоположение property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setМестоположение(JAXBElement<String> value) {
        this.местоположение = value;
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
     *         &lt;element name="Номер" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Тип" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Значение" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ТипАдрЭл" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Значение" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u043d\u043e\u043c\u0435\u0440"
    })
    public static class ДопАдрЭл {

        @XmlElementRef(name = "\u041d\u043e\u043c\u0435\u0440", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
        protected JAXBElement<АдресРФ.ДопАдрЭл.Номер> номер;
        @XmlAttribute(name = "\u0422\u0438\u043f\u0410\u0434\u0440\u042d\u043b")
        protected String типАдрЭл;
        @XmlAttribute(name = "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435")
        protected String значение;

        /**
         * Gets the value of the номер property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link АдресРФ.ДопАдрЭл.Номер }{@code >}
         *     
         */
        public JAXBElement<АдресРФ.ДопАдрЭл.Номер> getНомер() {
            return номер;
        }

        /**
         * Sets the value of the номер property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link АдресРФ.ДопАдрЭл.Номер }{@code >}
         *     
         */
        public void setНомер(JAXBElement<АдресРФ.ДопАдрЭл.Номер> value) {
            this.номер = value;
        }

        /**
         * Gets the value of the типАдрЭл property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getТипАдрЭл() {
            return типАдрЭл;
        }

        /**
         * Sets the value of the типАдрЭл property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setТипАдрЭл(String value) {
            this.типАдрЭл = value;
        }

        /**
         * Gets the value of the значение property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getЗначение() {
            return значение;
        }

        /**
         * Sets the value of the значение property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setЗначение(String value) {
            this.значение = value;
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
         *       &lt;attribute name="Тип" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Значение" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Номер {

            @XmlAttribute(name = "\u0422\u0438\u043f")
            protected String тип;
            @XmlAttribute(name = "\u0417\u043d\u0430\u0447\u0435\u043d\u0438\u0435")
            protected String значение;

            /**
             * Gets the value of the тип property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getТип() {
                return тип;
            }

            /**
             * Sets the value of the тип property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setТип(String value) {
                this.тип = value;
            }

            /**
             * Gets the value of the значение property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getЗначение() {
                return значение;
            }

            /**
             * Sets the value of the значение property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setЗначение(String value) {
                this.значение = value;
            }

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
     *         &lt;element name="Район" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="СвМО" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="МунОбр1" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="МунОбр2" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0440\u0430\u0439\u043e\u043d",
        "\u0441\u0432\u041c\u041e"
    })
    public static class СвРайМО {

        @XmlElementRef(name = "\u0420\u0430\u0439\u043e\u043d", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
        protected JAXBElement<String> район;
        @XmlElementRef(name = "\u0421\u0432\u041c\u041e", namespace = "http://company1c.com/orgregister/corporation", type = JAXBElement.class, required = false)
        protected JAXBElement<АдресРФ.СвРайМО.СвМО> свМО;

        /**
         * Gets the value of the район property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getРайон() {
            return район;
        }

        /**
         * Sets the value of the район property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setРайон(JAXBElement<String> value) {
            this.район = value;
        }

        /**
         * Gets the value of the свМО property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link АдресРФ.СвРайМО.СвМО }{@code >}
         *     
         */
        public JAXBElement<АдресРФ.СвРайМО.СвМО> getСвМО() {
            return свМО;
        }

        /**
         * Sets the value of the свМО property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link АдресРФ.СвРайМО.СвМО }{@code >}
         *     
         */
        public void setСвМО(JAXBElement<АдресРФ.СвРайМО.СвМО> value) {
            this.свМО = value;
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
         *       &lt;attribute name="МунОбр1" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="МунОбр2" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class СвМО {

            @XmlAttribute(name = "\u041c\u0443\u043d\u041e\u0431\u04401")
            protected String мунОбр1;
            @XmlAttribute(name = "\u041c\u0443\u043d\u041e\u0431\u04402")
            protected String мунОбр2;

            /**
             * Gets the value of the мунОбр1 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getМунОбр1() {
                return мунОбр1;
            }

            /**
             * Sets the value of the мунОбр1 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setМунОбр1(String value) {
                this.мунОбр1 = value;
            }

            /**
             * Gets the value of the мунОбр2 property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getМунОбр2() {
                return мунОбр2;
            }

            /**
             * Sets the value of the мунОбр2 property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setМунОбр2(String value) {
                this.мунОбр2 = value;
            }

        }

    }

}
