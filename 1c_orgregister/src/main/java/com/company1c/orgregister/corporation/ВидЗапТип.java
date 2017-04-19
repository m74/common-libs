
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о виде записи, внесенной в ЕГРИП
 * 
 * <p>Java class for ВидЗапТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ВидЗапТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="КодСПВЗ">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимВидЗап">
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
@XmlType(name = "\u0412\u0438\u0434\u0417\u0430\u043f\u0422\u0438\u043f")
public class ВидЗапТип {

    @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u041f\u0412\u0417")
    protected String кодСПВЗ;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0412\u0438\u0434\u0417\u0430\u043f")
    protected String наимВидЗап;

    /**
     * Gets the value of the кодСПВЗ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодСПВЗ() {
        return кодСПВЗ;
    }

    /**
     * Sets the value of the кодСПВЗ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодСПВЗ(String value) {
        this.кодСПВЗ = value;
    }

    /**
     * Gets the value of the наимВидЗап property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимВидЗап() {
        return наимВидЗап;
    }

    /**
     * Sets the value of the наимВидЗап property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимВидЗап(String value) {
        this.наимВидЗап = value;
    }

}
