
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
 *         &lt;element name="СвОргФСС" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="КодФСС">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимФСС">
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
 *       &lt;attribute name="РегНомФСС">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ДатаРег" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u0441\u0432\u041e\u0440\u0433\u0424\u0421\u0421"
})
@XmlRootElement(name = "\u0421\u0432\u0420\u0435\u0433\u0424\u0421\u0421")
public class СвРегФСС {

    @XmlElement(name = "\u0421\u0432\u041e\u0440\u0433\u0424\u0421\u0421")
    protected СвРегФСС.СвОргФСС свОргФСС;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u0420\u0435\u0433\u041d\u043e\u043c\u0424\u0421\u0421")
    protected String регНомФСС;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0433")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаРег;

    /**
     * Gets the value of the свОргФСС property.
     * 
     * @return
     *     possible object is
     *     {@link СвРегФСС.СвОргФСС }
     *     
     */
    public СвРегФСС.СвОргФСС getСвОргФСС() {
        return свОргФСС;
    }

    /**
     * Sets the value of the свОргФСС property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвРегФСС.СвОргФСС }
     *     
     */
    public void setСвОргФСС(СвРегФСС.СвОргФСС value) {
        this.свОргФСС = value;
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
     * Gets the value of the регНомФСС property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getРегНомФСС() {
        return регНомФСС;
    }

    /**
     * Sets the value of the регНомФСС property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setРегНомФСС(String value) {
        this.регНомФСС = value;
    }

    /**
     * Gets the value of the датаРег property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаРег() {
        return датаРег;
    }

    /**
     * Sets the value of the датаРег property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаРег(XMLGregorianCalendar value) {
        this.датаРег = value;
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
     *       &lt;attribute name="КодФСС">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="НаимФСС">
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
    public static class СвОргФСС {

        @XmlAttribute(name = "\u041a\u043e\u0434\u0424\u0421\u0421")
        protected String кодФСС;
        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0424\u0421\u0421")
        protected String наимФСС;

        /**
         * Gets the value of the кодФСС property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getКодФСС() {
            return кодФСС;
        }

        /**
         * Sets the value of the кодФСС property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setКодФСС(String value) {
            this.кодФСС = value;
        }

        /**
         * Gets the value of the наимФСС property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getНаимФСС() {
            return наимФСС;
        }

        /**
         * Sets the value of the наимФСС property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setНаимФСС(String value) {
            this.наимФСС = value;
        }

    }

}
