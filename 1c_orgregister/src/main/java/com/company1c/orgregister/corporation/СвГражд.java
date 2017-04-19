
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="ВидГражд">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ОКСМ" type="{http://company1c.com/orgregister/corporation}ОКСМТип" />
 *       &lt;attribute name="НаимСтран">
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
@XmlRootElement(name = "\u0421\u0432\u0413\u0440\u0430\u0436\u0434")
public class СвГражд {

    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаНачДейств;
    @XmlAttribute(name = "\u0413\u0420\u041d")
    protected String грн;
    @XmlAttribute(name = "\u0412\u0438\u0434\u0413\u0440\u0430\u0436\u0434")
    protected String видГражд;
    @XmlAttribute(name = "\u041e\u041a\u0421\u041c")
    protected String оксм;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0440\u0430\u043d")
    protected String наимСтран;

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
     * Gets the value of the видГражд property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getВидГражд() {
        return видГражд;
    }

    /**
     * Sets the value of the видГражд property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setВидГражд(String value) {
        this.видГражд = value;
    }

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

}
