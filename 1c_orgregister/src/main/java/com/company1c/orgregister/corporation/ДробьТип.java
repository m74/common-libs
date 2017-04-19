
package com.company1c.orgregister.corporation;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Представление простой дроби
 * 
 * <p>Java class for ДробьТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ДробьТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Числит">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Знаменат">
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
@XmlType(name = "\u0414\u0440\u043e\u0431\u044c\u0422\u0438\u043f")
public class ДробьТип {

    @XmlAttribute(name = "\u0427\u0438\u0441\u043b\u0438\u0442")
    protected BigInteger числит;
    @XmlAttribute(name = "\u0417\u043d\u0430\u043c\u0435\u043d\u0430\u0442")
    protected BigInteger знаменат;

    /**
     * Gets the value of the числит property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getЧислит() {
        return числит;
    }

    /**
     * Sets the value of the числит property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setЧислит(BigInteger value) {
        this.числит = value;
    }

    /**
     * Gets the value of the знаменат property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getЗнаменат() {
        return знаменат;
    }

    /**
     * Sets the value of the знаменат property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setЗнаменат(BigInteger value) {
        this.знаменат = value;
    }

}
