
package com.company1c.orgregister.corporation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for РеквизитыДиректора complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="РеквизитыДиректора">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="фамилия" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="имя" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="отчество" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="наименованиеДолжности" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="видДолжности" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="датаПрекращения" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ИНН" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u0414\u0438\u0440\u0435\u043a\u0442\u043e\u0440\u0430", propOrder = {
    "\u0444\u0430\u043c\u0438\u043b\u0438\u044f",
    "\u0438\u043c\u044f",
    "\u043e\u0442\u0447\u0435\u0441\u0442\u0432\u043e",
    "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435\u0414\u043e\u043b\u0436\u043d\u043e\u0441\u0442\u0438",
    "\u0432\u0438\u0434\u0414\u043e\u043b\u0436\u043d\u043e\u0441\u0442\u0438",
    "\u0434\u0430\u0442\u0430\u041f\u0440\u0435\u043a\u0440\u0430\u0449\u0435\u043d\u0438\u044f"
})
public class РеквизитыДиректора {

    protected List<StringPropertyType> фамилия;
    protected List<StringPropertyType> имя;
    protected List<StringPropertyType> отчество;
    protected List<StringPropertyType> наименованиеДолжности;
    protected List<StringPropertyType> видДолжности;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаПрекращения;
    @XmlAttribute(name = "\u0418\u041d\u041d")
    protected String инн;

    /**
     * Gets the value of the фамилия property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the фамилия property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getФамилия().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getФамилия() {
        if (фамилия == null) {
            фамилия = new ArrayList<StringPropertyType>();
        }
        return this.фамилия;
    }

    /**
     * Gets the value of the имя property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the имя property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getИмя().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getИмя() {
        if (имя == null) {
            имя = new ArrayList<StringPropertyType>();
        }
        return this.имя;
    }

    /**
     * Gets the value of the отчество property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the отчество property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getОтчество().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getОтчество() {
        if (отчество == null) {
            отчество = new ArrayList<StringPropertyType>();
        }
        return this.отчество;
    }

    /**
     * Gets the value of the наименованиеДолжности property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the наименованиеДолжности property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getНаименованиеДолжности().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getНаименованиеДолжности() {
        if (наименованиеДолжности == null) {
            наименованиеДолжности = new ArrayList<StringPropertyType>();
        }
        return this.наименованиеДолжности;
    }

    /**
     * Gets the value of the видДолжности property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the видДолжности property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getВидДолжности().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getВидДолжности() {
        if (видДолжности == null) {
            видДолжности = new ArrayList<StringPropertyType>();
        }
        return this.видДолжности;
    }

    /**
     * Gets the value of the датаПрекращения property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаПрекращения() {
        return датаПрекращения;
    }

    /**
     * Sets the value of the датаПрекращения property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаПрекращения(XMLGregorianCalendar value) {
        this.датаПрекращения = value;
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

}
