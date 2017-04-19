
package com.company1c.orgregister.corporation;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Доля в уставном капитале (складочном капитале, уставном фонде, паевом фонде)
 *             
 * 
 * <p>Java class for ДоляУстКапТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ДоляУстКапТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Процент" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ДробДесят" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ДробПрост" type="{http://company1c.com/orgregister/corporation}ДробьТип" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="НоминСтоим">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ПрЗалог">
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
@XmlType(name = "\u0414\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f\u0422\u0438\u043f", propOrder = {
    "\u043f\u0440\u043e\u0446\u0435\u043d\u0442",
    "\u0434\u0440\u043e\u0431\u0414\u0435\u0441\u044f\u0442",
    "\u0434\u0440\u043e\u0431\u041f\u0440\u043e\u0441\u0442"
})
public class ДоляУстКапТип {

    @XmlElement(name = "\u041f\u0440\u043e\u0446\u0435\u043d\u0442")
    protected BigDecimal процент;
    @XmlElement(name = "\u0414\u0440\u043e\u0431\u0414\u0435\u0441\u044f\u0442")
    protected BigDecimal дробДесят;
    @XmlElement(name = "\u0414\u0440\u043e\u0431\u041f\u0440\u043e\u0441\u0442")
    protected ДробьТип дробПрост;
    @XmlAttribute(name = "\u041d\u043e\u043c\u0438\u043d\u0421\u0442\u043e\u0438\u043c")
    protected BigDecimal номинСтоим;
    @XmlAttribute(name = "\u041f\u0440\u0417\u0430\u043b\u043e\u0433")
    protected String прЗалог;

    /**
     * Gets the value of the процент property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getПроцент() {
        return процент;
    }

    /**
     * Sets the value of the процент property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setПроцент(BigDecimal value) {
        this.процент = value;
    }

    /**
     * Gets the value of the дробДесят property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getДробДесят() {
        return дробДесят;
    }

    /**
     * Sets the value of the дробДесят property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setДробДесят(BigDecimal value) {
        this.дробДесят = value;
    }

    /**
     * Gets the value of the дробПрост property.
     * 
     * @return
     *     possible object is
     *     {@link ДробьТип }
     *     
     */
    public ДробьТип getДробПрост() {
        return дробПрост;
    }

    /**
     * Sets the value of the дробПрост property.
     * 
     * @param value
     *     allowed object is
     *     {@link ДробьТип }
     *     
     */
    public void setДробПрост(ДробьТип value) {
        this.дробПрост = value;
    }

    /**
     * Gets the value of the номинСтоим property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getНоминСтоим() {
        return номинСтоим;
    }

    /**
     * Sets the value of the номинСтоим property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setНоминСтоим(BigDecimal value) {
        this.номинСтоим = value;
    }

    /**
     * Gets the value of the прЗалог property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getПрЗалог() {
        return прЗалог;
    }

    /**
     * Sets the value of the прЗалог property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setПрЗалог(String value) {
        this.прЗалог = value;
    }

}
