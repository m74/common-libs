
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о рождении
 * 
 * <p>Java class for СведРождТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СведРождТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ДатаРожд" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="МестоРожд" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u0432\u0435\u0434\u0420\u043e\u0436\u0434\u0422\u0438\u043f")
public class СведРождТип {

    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаРожд;
    @XmlAttribute(name = "\u041c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434")
    protected String местоРожд;

    /**
     * Gets the value of the датаРожд property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаРожд() {
        return датаРожд;
    }

    /**
     * Sets the value of the датаРожд property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаРожд(XMLGregorianCalendar value) {
        this.датаРожд = value;
    }

    /**
     * Gets the value of the местоРожд property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getМестоРожд() {
        return местоРожд;
    }

    /**
     * Sets the value of the местоРожд property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setМестоРожд(String value) {
        this.местоРожд = value;
    }

}
