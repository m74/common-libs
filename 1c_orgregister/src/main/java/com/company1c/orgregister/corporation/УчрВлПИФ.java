
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
 *         &lt;element name="СвУпрКомпДовер" minOccurs="0">
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
 *         &lt;element name="ДоляУстКап" type="{http://company1c.com/orgregister/corporation}ДоляУстКапТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ДатаНачДейств">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}date">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="НаимПИФ">
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
    "\u0441\u0432\u0423\u043f\u0440\u041a\u043e\u043c\u043f\u0414\u043e\u0432\u0435\u0440",
    "\u0434\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f"
})
@XmlRootElement(name = "\u0423\u0447\u0440\u0412\u043b\u041f\u0418\u0424")
public class УчрВлПИФ {

    @XmlElement(name = "\u0421\u0432\u0423\u043f\u0440\u041a\u043e\u043c\u043f\u0414\u043e\u0432\u0435\u0440")
    protected УчрВлПИФ.СвУпрКомпДовер свУпрКомпДовер;
    @XmlElement(name = "\u0414\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f")
    protected ДоляУстКапТип доляУстКап;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041f\u0418\u0424")
    protected String наимПИФ;

    /**
     * Gets the value of the свУпрКомпДовер property.
     * 
     * @return
     *     possible object is
     *     {@link УчрВлПИФ.СвУпрКомпДовер }
     *     
     */
    public УчрВлПИФ.СвУпрКомпДовер getСвУпрКомпДовер() {
        return свУпрКомпДовер;
    }

    /**
     * Sets the value of the свУпрКомпДовер property.
     * 
     * @param value
     *     allowed object is
     *     {@link УчрВлПИФ.СвУпрКомпДовер }
     *     
     */
    public void setСвУпрКомпДовер(УчрВлПИФ.СвУпрКомпДовер value) {
        this.свУпрКомпДовер = value;
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
     * Gets the value of the наимПИФ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимПИФ() {
        return наимПИФ;
    }

    /**
     * Sets the value of the наимПИФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимПИФ(String value) {
        this.наимПИФ = value;
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
    public static class СвУпрКомпДовер {

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

}
