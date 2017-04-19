
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
 *         &lt;element name="СвСтатус" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="КодСтатус">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимСтатус">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаПрекр" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвРегОрг" type="{http://company1c.com/orgregister/corporation}СвРегОргТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u0441\u0432\u0421\u0442\u0430\u0442\u0443\u0441",
    "\u0441\u0432\u0420\u0435\u0433\u041e\u0440\u0433"
})
@XmlRootElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441_\u0420\u041e")
public class СвСтатусРО {

    @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441")
    protected СвСтатусРО.СвСтатус свСтатус;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041e\u0440\u0433")
    protected СвРегОргТип свРегОрг;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;

    /**
     * Gets the value of the свСтатус property.
     * 
     * @return
     *     possible object is
     *     {@link СвСтатусРО.СвСтатус }
     *     
     */
    public СвСтатусРО.СвСтатус getСвСтатус() {
        return свСтатус;
    }

    /**
     * Sets the value of the свСтатус property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвСтатусРО.СвСтатус }
     *     
     */
    public void setСвСтатус(СвСтатусРО.СвСтатус value) {
        this.свСтатус = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="КодСтатус">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="НаимСтатус">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ДатаПрекр" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class СвСтатус {

        @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u0442\u0430\u0442\u0443\u0441")
        protected String кодСтатус;
        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0430\u0442\u0443\u0441")
        protected String наимСтатус;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u0440\u0435\u043a\u0440")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаПрекр;

        /**
         * Gets the value of the кодСтатус property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getКодСтатус() {
            return кодСтатус;
        }

        /**
         * Sets the value of the кодСтатус property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setКодСтатус(String value) {
            this.кодСтатус = value;
        }

        /**
         * Gets the value of the наимСтатус property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getНаимСтатус() {
            return наимСтатус;
        }

        /**
         * Sets the value of the наимСтатус property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setНаимСтатус(String value) {
            this.наимСтатус = value;
        }

        /**
         * Gets the value of the датаПрекр property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаПрекр() {
            return датаПрекр;
        }

        /**
         * Sets the value of the датаПрекр property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаПрекр(XMLGregorianCalendar value) {
            this.датаПрекр = value;
        }

    }

}
