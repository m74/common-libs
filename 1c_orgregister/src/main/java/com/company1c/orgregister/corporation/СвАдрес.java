
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
 *         &lt;element name="Адрес" type="{http://company1c.com/orgregister/corporation}Адрес" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="ПризнОтсутАдресЮЛ">
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
    "\u0430\u0434\u0440\u0435\u0441"
})
@XmlRootElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441")
public class СвАдрес {

    @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441")
    protected Адрес адрес;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u041f\u0440\u0438\u0437\u043d\u041e\u0442\u0441\u0443\u0442\u0410\u0434\u0440\u0435\u0441\u042e\u041b")
    protected String признОтсутАдресЮЛ;

    /**
     * Gets the value of the адрес property.
     * 
     * @return
     *     possible object is
     *     {@link Адрес }
     *     
     */
    public Адрес getАдрес() {
        return адрес;
    }

    /**
     * Sets the value of the адрес property.
     * 
     * @param value
     *     allowed object is
     *     {@link Адрес }
     *     
     */
    public void setАдрес(Адрес value) {
        this.адрес = value;
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
     * Gets the value of the признОтсутАдресЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПризнОтсутАдресЮЛ() {
        return признОтсутАдресЮЛ;
    }

    /**
     * Sets the value of the признОтсутАдресЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПризнОтсутАдресЮЛ(String value) {
        this.признОтсутАдресЮЛ = value;
    }

}
