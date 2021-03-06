
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Сведения о регистрации в стране происхождения
 * 
 * <p>Java class for СвРегИнТип complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвРегИнТип">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ОКСМ" type="{http://company1c.com/orgregister/corporation}ОКСМТип" />
 *       &lt;attribute name="НаимСтран">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ДатаРег" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="РегНомер">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимРегОрг">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="АдрСтр">
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
@XmlType(name = "\u0421\u0432\u0420\u0435\u0433\u0418\u043d\u0422\u0438\u043f")
public class СвРегИнТип {

    @XmlAttribute(name = "\u041e\u041a\u0421\u041c")
    protected String оксм;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0440\u0430\u043d")
    protected String наимСтран;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0433")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаРег;
    @XmlAttribute(name = "\u0420\u0435\u0433\u041d\u043e\u043c\u0435\u0440")
    protected String регНомер;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0420\u0435\u0433\u041e\u0440\u0433")
    protected String наимРегОрг;
    @XmlAttribute(name = "\u0410\u0434\u0440\u0421\u0442\u0440")
    protected String адрСтр;

    /**
     * Gets the value of the оксм property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОКСМ() {
        return оксм;
    }

    /**
     * Sets the value of the оксм property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОКСМ(String value) {
        this.оксм = value;
    }

    /**
     * Gets the value of the наимСтран property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимСтран() {
        return наимСтран;
    }

    /**
     * Sets the value of the наимСтран property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимСтран(String value) {
        this.наимСтран = value;
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
     * Gets the value of the регНомер property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getРегНомер() {
        return регНомер;
    }

    /**
     * Sets the value of the регНомер property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setРегНомер(String value) {
        this.регНомер = value;
    }

    /**
     * Gets the value of the наимРегОрг property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимРегОрг() {
        return наимРегОрг;
    }

    /**
     * Sets the value of the наимРегОрг property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимРегОрг(String value) {
        this.наимРегОрг = value;
    }

    /**
     * Gets the value of the адрСтр property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getАдрСтр() {
        return адрСтр;
    }

    /**
     * Sets the value of the адрСтр property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setАдрСтр(String value) {
        this.адрСтр = value;
    }

}
