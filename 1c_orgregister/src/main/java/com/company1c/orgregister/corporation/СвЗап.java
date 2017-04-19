
package com.company1c.orgregister.corporation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о действующих записях, внесенных в ЕГРИП или ЕГРЮЛ
 * 
 * <p>Java class for СвЗап complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвЗап">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ВидЗап" type="{http://company1c.com/orgregister/corporation}ВидЗапТип" minOccurs="0"/>
 *         &lt;element name="СвРегОрг" type="{http://company1c.com/orgregister/corporation}СвРегОргТип" minOccurs="0"/>
 *         &lt;element name="СвСвид" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ДатаЗап" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *                 &lt;attribute name="ИдЗап">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Серия">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Номер">
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
 *       &lt;attribute name="ДатаЗап" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="ИдЗап">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
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
@XmlType(name = "\u0421\u0432\u0417\u0430\u043f", propOrder = {
    "\u0432\u0438\u0434\u0417\u0430\u043f",
    "\u0441\u0432\u0420\u0435\u0433\u041e\u0440\u0433",
    "\u0441\u0432\u0421\u0432\u0438\u0434"
})
public class СвЗап {

    @XmlElement(name = "\u0412\u0438\u0434\u0417\u0430\u043f")
    protected ВидЗапТип видЗап;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041e\u0440\u0433")
    protected СвРегОргТип свРегОрг;
    @XmlElement(name = "\u0421\u0432\u0421\u0432\u0438\u0434")
    protected List<СвЗап.СвСвид> свСвид;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0417\u0430\u043f")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаЗап;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u0418\u0434\u0417\u0430\u043f")
    protected BigInteger идЗап;

    /**
     * Gets the value of the видЗап property.
     * 
     * @return
     *     possible object is
     *     {@link ВидЗапТип }
     *     
     */
    public ВидЗапТип getВидЗап() {
        return видЗап;
    }

    /**
     * Sets the value of the видЗап property.
     * 
     * @param value
     *     allowed object is
     *     {@link ВидЗапТип }
     *     
     */
    public void setВидЗап(ВидЗапТип value) {
        this.видЗап = value;
    }

    /**
     * Gets the value of the свРегОрг property.
     * 
     * @return
     *     possible object is
     *     {@link СвРегОргТип }
     *     
     */
    public СвРегОргТип getСвРегОрг() {
        return свРегОрг;
    }

    /**
     * Sets the value of the свРегОрг property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвРегОргТип }
     *     
     */
    public void setСвРегОрг(СвРегОргТип value) {
        this.свРегОрг = value;
    }

    /**
     * Gets the value of the свСвид property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свСвид property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвСвид().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СвЗап.СвСвид }
     * 
     * 
     */
    public List<СвЗап.СвСвид> getСвСвид() {
        if (свСвид == null) {
            свСвид = new ArrayList<СвЗап.СвСвид>();
        }
        return this.свСвид;
    }

    /**
     * Gets the value of the датаЗап property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаЗап() {
        return датаЗап;
    }

    /**
     * Sets the value of the датаЗап property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаЗап(XMLGregorianCalendar value) {
        this.датаЗап = value;
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
     * Gets the value of the идЗап property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getИдЗап() {
        return идЗап;
    }

    /**
     * Sets the value of the идЗап property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setИдЗап(BigInteger value) {
        this.идЗап = value;
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
     *       &lt;attribute name="ДатаЗап" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
     *       &lt;attribute name="ИдЗап">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Серия">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Номер">
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
    public static class СвСвид {

        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0417\u0430\u043f")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаЗап;
        @XmlAttribute(name = "\u0413\u0420\u041d")
        protected String грн;
        @XmlAttribute(name = "\u0418\u0434\u0417\u0430\u043f")
        protected BigInteger идЗап;
        @XmlAttribute(name = "\u0421\u0435\u0440\u0438\u044f")
        protected String серия;
        @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440")
        protected String номер;

        /**
         * Gets the value of the датаЗап property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаЗап() {
            return датаЗап;
        }

        /**
         * Sets the value of the датаЗап property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаЗап(XMLGregorianCalendar value) {
            this.датаЗап = value;
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
         * Gets the value of the идЗап property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getИдЗап() {
            return идЗап;
        }

        /**
         * Sets the value of the идЗап property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setИдЗап(BigInteger value) {
            this.идЗап = value;
        }

        /**
         * Gets the value of the серия property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getСерия() {
            return серия;
        }

        /**
         * Sets the value of the серия property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setСерия(String value) {
            this.серия = value;
        }

        /**
         * Gets the value of the номер property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getНомер() {
            return номер;
        }

        /**
         * Sets the value of the номер property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setНомер(String value) {
            this.номер = value;
        }

    }

}
