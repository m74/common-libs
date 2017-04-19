
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
 *         &lt;element name="СвРегИн" type="{http://company1c.com/orgregister/corporation}СвРегИнТип" minOccurs="0"/>
 *         &lt;element name="АдрМНРФ" type="{http://company1c.com/orgregister/corporation}Адрес" minOccurs="0"/>
 *         &lt;element name="ПредИнЮЛ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННТип" />
 *                 &lt;attribute name="НомТел">
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
 *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="ИНН" type="{http://company1c.com/orgregister/corporation}ИННТип" />
 *       &lt;attribute name="НаимЮЛПолн">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимПредЮЛ">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
    "\u0441\u0432\u0420\u0435\u0433\u0418\u043d",
    "\u0430\u0434\u0440\u041c\u041d\u0420\u0424",
    "\u043f\u0440\u0435\u0434\u0418\u043d\u042e\u041b"
})
@XmlRootElement(name = "\u0423\u043f\u0440\u041e\u0440\u0433\u0418\u043d")
public class УпрОргИн {

    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0418\u043d")
    protected СвРегИнТип свРегИн;
    @XmlElement(name = "\u0410\u0434\u0440\u041c\u041d\u0420\u0424")
    protected Адрес адрМНРФ;
    @XmlElement(name = "\u041f\u0440\u0435\u0434\u0418\u043d\u042e\u041b")
    protected УпрОргИн.ПредИнЮЛ предИнЮЛ;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u0418\u041d\u041d")
    protected String инн;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u042e\u041b\u041f\u043e\u043b\u043d")
    protected String наимЮЛПолн;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041f\u0440\u0435\u0434\u042e\u041b")
    protected String наимПредЮЛ;
    @XmlAttribute(name = "\u041d\u043e\u043c\u0422\u0435\u043b")
    protected String номТел;

    /**
     * Gets the value of the свРегИн property.
     * 
     * @return
     *     possible object is
     *     {@link СвРегИнТип }
     *     
     */
    public СвРегИнТип getСвРегИн() {
        return свРегИн;
    }

    /**
     * Sets the value of the свРегИн property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвРегИнТип }
     *     
     */
    public void setСвРегИн(СвРегИнТип value) {
        this.свРегИн = value;
    }

    /**
     * Gets the value of the адрМНРФ property.
     * 
     * @return
     *     possible object is
     *     {@link Адрес }
     *     
     */
    public Адрес getАдрМНРФ() {
        return адрМНРФ;
    }

    /**
     * Sets the value of the адрМНРФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Адрес }
     *     
     */
    public void setАдрМНРФ(Адрес value) {
        this.адрМНРФ = value;
    }

    /**
     * Gets the value of the предИнЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link УпрОргИн.ПредИнЮЛ }
     *     
     */
    public УпрОргИн.ПредИнЮЛ getПредИнЮЛ() {
        return предИнЮЛ;
    }

    /**
     * Sets the value of the предИнЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link УпрОргИн.ПредИнЮЛ }
     *     
     */
    public void setПредИнЮЛ(УпрОргИн.ПредИнЮЛ value) {
        this.предИнЮЛ = value;
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
     * Gets the value of the инн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИНН() {
        return инн;
    }

    /**
     * Sets the value of the инн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИНН(String value) {
        this.инн = value;
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
     * Gets the value of the наимПредЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимПредЮЛ() {
        return наимПредЮЛ;
    }

    /**
     * Sets the value of the наимПредЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимПредЮЛ(String value) {
        this.наимПредЮЛ = value;
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
     *       &lt;sequence>
     *         &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННТип" />
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
        "\u0444\u0438\u043e"
    })
    public static class ПредИнЮЛ {

        @XmlElement(name = "\u0424\u0418\u041e")
        protected ФИОТип фио;
        @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b")
        protected String иннфл;
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

    }

}
