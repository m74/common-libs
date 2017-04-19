
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
 *         &lt;element name="СвНО" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="КодНО" type="{http://company1c.com/orgregister/corporation}СОНОТип" />
 *                 &lt;attribute name="НаимНО">
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
 *       &lt;attribute name="КПП" type="{http://company1c.com/orgregister/corporation}КППТип" />
 *       &lt;attribute name="ДатаПостУч" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u0441\u0432\u041d\u041e"
})
@XmlRootElement(name = "\u0421\u0432\u0423\u0447\u0435\u0442\u041d\u041e")
public class СвУчетНО {

    @XmlElement(name = "\u0421\u0432\u041d\u041e")
    protected СвУчетНО.СвНО свНО;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u0418\u041d\u041d")
    protected String инн;
    @XmlAttribute(name = "\u041a\u041f\u041f")
    protected String кпп;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u043e\u0441\u0442\u0423\u0447")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаПостУч;

    /**
     * Gets the value of the свНО property.
     * 
     * @return
     *     possible object is
     *     {@link СвУчетНО.СвНО }
     *     
     */
    public СвУчетНО.СвНО getСвНО() {
        return свНО;
    }

    /**
     * Sets the value of the свНО property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвУчетНО.СвНО }
     *     
     */
    public void setСвНО(СвУчетНО.СвНО value) {
        this.свНО = value;
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
     * Gets the value of the кпп property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКПП() {
        return кпп;
    }

    /**
     * Sets the value of the кпп property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКПП(String value) {
        this.кпп = value;
    }

    /**
     * Gets the value of the датаПостУч property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаПостУч() {
        return датаПостУч;
    }

    /**
     * Sets the value of the датаПостУч property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаПостУч(XMLGregorianCalendar value) {
        this.датаПостУч = value;
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
     *       &lt;attribute name="КодНО" type="{http://company1c.com/orgregister/corporation}СОНОТип" />
     *       &lt;attribute name="НаимНО">
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
    public static class СвНО {

        @XmlAttribute(name = "\u041a\u043e\u0434\u041d\u041e")
        protected String кодНО;
        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041d\u041e")
        protected String наимНО;

        /**
         * Gets the value of the кодНО property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getКодНО() {
            return кодНО;
        }

        /**
         * Sets the value of the кодНО property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setКодНО(String value) {
            this.кодНО = value;
        }

        /**
         * Gets the value of the наимНО property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getНаимНО() {
            return наимНО;
        }

        /**
         * Sets the value of the наимНО property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setНаимНО(String value) {
            this.наимНО = value;
        }

    }

}
