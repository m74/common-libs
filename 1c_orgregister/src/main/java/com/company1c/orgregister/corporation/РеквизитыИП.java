
package com.company1c.orgregister.corporation;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвФЛ" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвГражд" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвРегПФ" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвРегФСС" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвОКВЭД" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвСтатус_РО" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвУчетНО" minOccurs="0"/>
 *         &lt;element name="СвЗапДейств" type="{http://company1c.com/orgregister/corporation}СвЗап" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвРегИП" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}ИсторияРеквизитовИП" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ОГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="ДатаОГРНИП" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННТип" />
 *       &lt;attribute name="КодВидИП">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимВидИП">
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
    "\u0441\u0432\u0424\u041b",
    "\u0441\u0432\u0413\u0440\u0430\u0436\u0434",
    "\u0441\u0432\u0420\u0435\u0433\u041f\u0424",
    "\u0441\u0432\u0420\u0435\u0433\u0424\u0421\u0421",
    "\u0441\u0432\u041e\u041a\u0412\u042d\u0414",
    "\u0441\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u0420\u041e",
    "\u0441\u0432\u0423\u0447\u0435\u0442\u041d\u041e",
    "\u0441\u0432\u0417\u0430\u043f\u0414\u0435\u0439\u0441\u0442\u0432",
    "\u0441\u0432\u0420\u0435\u0433\u0418\u041f",
    "\u0438\u0441\u0442\u043e\u0440\u0438\u044f\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u043e\u0432\u0418\u041f"
})
@XmlRootElement(name = "\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u0418\u041f")
public class РеквизитыИП {

    @XmlElement(name = "\u0421\u0432\u0424\u041b")
    protected СвФЛ свФЛ;
    @XmlElement(name = "\u0421\u0432\u0413\u0440\u0430\u0436\u0434")
    protected СвГражд свГражд;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041f\u0424")
    protected СвРегПФ свРегПФ;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0424\u0421\u0421")
    protected СвРегФСС свРегФСС;
    @XmlElement(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414")
    protected List<СвОКВЭД> свОКВЭД;
    @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441_\u0420\u041e")
    protected СвСтатусРО свСтатусРО;
    @XmlElement(name = "\u0421\u0432\u0423\u0447\u0435\u0442\u041d\u041e")
    protected СвУчетНО свУчетНО;
    @XmlElement(name = "\u0421\u0432\u0417\u0430\u043f\u0414\u0435\u0439\u0441\u0442\u0432")
    protected List<СвЗап> свЗапДейств;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0418\u041f")
    protected СвРегИП свРегИП;
    @XmlElement(name = "\u0418\u0441\u0442\u043e\u0440\u0438\u044f\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u043e\u0432\u0418\u041f")
    protected ИсторияРеквизитовИП историяРеквизитовИП;
    @XmlAttribute(name = "\u041e\u0413\u0420\u041d")
    protected String огрн;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041e\u0413\u0420\u041d\u0418\u041f")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаОГРНИП;
    @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b")
    protected String иннфл;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u0438\u0434\u0418\u041f")
    protected String кодВидИП;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0412\u0438\u0434\u0418\u041f")
    protected String наимВидИП;

    /**
     * Gets the value of the свФЛ property.
     * 
     * @return
     *     possible object is
     *     {@link СвФЛ }
     *     
     */
    public СвФЛ getСвФЛ() {
        return свФЛ;
    }

    /**
     * Sets the value of the свФЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвФЛ }
     *     
     */
    public void setСвФЛ(СвФЛ value) {
        this.свФЛ = value;
    }

    /**
     * Gets the value of the свГражд property.
     * 
     * @return
     *     possible object is
     *     {@link СвГражд }
     *     
     */
    public СвГражд getСвГражд() {
        return свГражд;
    }

    /**
     * Sets the value of the свГражд property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвГражд }
     *     
     */
    public void setСвГражд(СвГражд value) {
        this.свГражд = value;
    }

    /**
     * Gets the value of the свРегПФ property.
     * 
     * @return
     *     possible object is
     *     {@link СвРегПФ }
     *     
     */
    public СвРегПФ getСвРегПФ() {
        return свРегПФ;
    }

    /**
     * Sets the value of the свРегПФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвРегПФ }
     *     
     */
    public void setСвРегПФ(СвРегПФ value) {
        this.свРегПФ = value;
    }

    /**
     * Gets the value of the свРегФСС property.
     * 
     * @return
     *     possible object is
     *     {@link СвРегФСС }
     *     
     */
    public СвРегФСС getСвРегФСС() {
        return свРегФСС;
    }

    /**
     * Sets the value of the свРегФСС property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвРегФСС }
     *     
     */
    public void setСвРегФСС(СвРегФСС value) {
        this.свРегФСС = value;
    }

    /**
     * Gets the value of the свОКВЭД property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свОКВЭД property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвОКВЭД().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СвОКВЭД }
     * 
     * 
     */
    public List<СвОКВЭД> getСвОКВЭД() {
        if (свОКВЭД == null) {
            свОКВЭД = new ArrayList<СвОКВЭД>();
        }
        return this.свОКВЭД;
    }

    /**
     * Gets the value of the свСтатусРО property.
     * 
     * @return
     *     possible object is
     *     {@link СвСтатусРО }
     *     
     */
    public СвСтатусРО getСвСтатусРО() {
        return свСтатусРО;
    }

    /**
     * Sets the value of the свСтатусРО property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвСтатусРО }
     *     
     */
    public void setСвСтатусРО(СвСтатусРО value) {
        this.свСтатусРО = value;
    }

    /**
     * Gets the value of the свУчетНО property.
     * 
     * @return
     *     possible object is
     *     {@link СвУчетНО }
     *     
     */
    public СвУчетНО getСвУчетНО() {
        return свУчетНО;
    }

    /**
     * Sets the value of the свУчетНО property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвУчетНО }
     *     
     */
    public void setСвУчетНО(СвУчетНО value) {
        this.свУчетНО = value;
    }

    /**
     * Gets the value of the свЗапДейств property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свЗапДейств property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвЗапДейств().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СвЗап }
     * 
     * 
     */
    public List<СвЗап> getСвЗапДейств() {
        if (свЗапДейств == null) {
            свЗапДейств = new ArrayList<СвЗап>();
        }
        return this.свЗапДейств;
    }

    /**
     * Gets the value of the свРегИП property.
     * 
     * @return
     *     possible object is
     *     {@link СвРегИП }
     *     
     */
    public СвРегИП getСвРегИП() {
        return свРегИП;
    }

    /**
     * Sets the value of the свРегИП property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвРегИП }
     *     
     */
    public void setСвРегИП(СвРегИП value) {
        this.свРегИП = value;
    }

    /**
     * Gets the value of the историяРеквизитовИП property.
     * 
     * @return
     *     possible object is
     *     {@link ИсторияРеквизитовИП }
     *     
     */
    public ИсторияРеквизитовИП getИсторияРеквизитовИП() {
        return историяРеквизитовИП;
    }

    /**
     * Sets the value of the историяРеквизитовИП property.
     * 
     * @param value
     *     allowed object is
     *     {@link ИсторияРеквизитовИП }
     *     
     */
    public void setИсторияРеквизитовИП(ИсторияРеквизитовИП value) {
        this.историяРеквизитовИП = value;
    }

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
     * Gets the value of the датаОГРНИП property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаОГРНИП() {
        return датаОГРНИП;
    }

    /**
     * Sets the value of the датаОГРНИП property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаОГРНИП(XMLGregorianCalendar value) {
        this.датаОГРНИП = value;
    }

    /**
     * Gets the value of the иннфл property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИННФЛ() {
        return иннфл;
    }

    /**
     * Sets the value of the иннфл property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИННФЛ(String value) {
        this.иннфл = value;
    }

    /**
     * Gets the value of the кодВидИП property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодВидИП() {
        return кодВидИП;
    }

    /**
     * Sets the value of the кодВидИП property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодВидИП(String value) {
        this.кодВидИП = value;
    }

    /**
     * Gets the value of the наимВидИП property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимВидИП() {
        return наимВидИП;
    }

    /**
     * Sets the value of the наимВидИП property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимВидИП(String value) {
        this.наимВидИП = value;
    }

}
