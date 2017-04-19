
package com.company1c.orgregister.corporation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип" minOccurs="0"/>
 *         &lt;element name="СвДискв" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *                 &lt;attribute name="СрокДискв">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаНачДискв" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ДатаОкончДискв" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="ВидДолжн">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимВидДолжн">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимДолжн">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННТип" />
 *       &lt;attribute name="ОГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="НомТел">
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
    "\u0444\u0438\u043e",
    "\u0441\u0432\u0414\u0438\u0441\u043a\u0432"
})
@XmlRootElement(name = "\u0421\u0432\u0435\u0434\u0414\u043e\u043b\u0436\u043d\u0424\u041b")
public class СведДолжнФЛ {

    @XmlElement(name = "\u0424\u0418\u041e")
    protected ФИОТип фио;
    @XmlElement(name = "\u0421\u0432\u0414\u0438\u0441\u043a\u0432")
    protected List<СведДолжнФЛ.СвДискв> свДискв;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u0412\u0438\u0434\u0414\u043e\u043b\u0436\u043d")
    protected String видДолжн;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0412\u0438\u0434\u0414\u043e\u043b\u0436\u043d")
    protected String наимВидДолжн;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0414\u043e\u043b\u0436\u043d")
    protected String наимДолжн;
    @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b")
    protected String иннфл;
    @XmlAttribute(name = "\u041e\u0413\u0420\u041d")
    protected String огрн;
    @XmlAttribute(name = "\u041d\u043e\u043c\u0422\u0435\u043b")
    protected String номТел;

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
     * Gets the value of the свДискв property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свДискв property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвДискв().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СведДолжнФЛ.СвДискв }
     * 
     * 
     */
    public List<СведДолжнФЛ.СвДискв> getСвДискв() {
        if (свДискв == null) {
            свДискв = new ArrayList<СведДолжнФЛ.СвДискв>();
        }
        return this.свДискв;
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
     * Gets the value of the видДолжн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВидДолжн() {
        return видДолжн;
    }

    /**
     * Sets the value of the видДолжн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВидДолжн(String value) {
        this.видДолжн = value;
    }

    /**
     * Gets the value of the наимВидДолжн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимВидДолжн() {
        return наимВидДолжн;
    }

    /**
     * Sets the value of the наимВидДолжн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимВидДолжн(String value) {
        this.наимВидДолжн = value;
    }

    /**
     * Gets the value of the наимДолжн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимДолжн() {
        return наимДолжн;
    }

    /**
     * Sets the value of the наимДолжн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимДолжн(String value) {
        this.наимДолжн = value;
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
     * Gets the value of the номТел property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНомТел() {
        return номТел;
    }

    /**
     * Sets the value of the номТел property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНомТел(String value) {
        this.номТел = value;
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
     *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
     *       &lt;attribute name="СрокДискв">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ДатаНачДискв" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ДатаОкончДискв" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class СвДискв {

        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d")
        protected String грн;
        @XmlAttribute(name = "\u0421\u0440\u043e\u043a\u0414\u0438\u0441\u043a\u0432")
        protected BigInteger срокДискв;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0438\u0441\u043a\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДискв;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041e\u043a\u043e\u043d\u0447\u0414\u0438\u0441\u043a\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаОкончДискв;

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
         * Gets the value of the срокДискв property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getСрокДискв() {
            return срокДискв;
        }

        /**
         * Sets the value of the срокДискв property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setСрокДискв(BigInteger value) {
            this.срокДискв = value;
        }

        /**
         * Gets the value of the датаНачДискв property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаНачДискв() {
            return датаНачДискв;
        }

        /**
         * Sets the value of the датаНачДискв property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаНачДискв(XMLGregorianCalendar value) {
            this.датаНачДискв = value;
        }

        /**
         * Gets the value of the датаОкончДискв property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаОкончДискв() {
            return датаОкончДискв;
        }

        /**
         * Sets the value of the датаОкончДискв property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаОкончДискв(XMLGregorianCalendar value) {
            this.датаОкончДискв = value;
        }

    }

}
