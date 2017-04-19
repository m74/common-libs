
package com.company1c.orgregister.corporation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвУчетНО" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвГражд" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвСтатус_РО" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвЛицензия" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвОКВЭД" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвРегИП" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвРегПФ" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвРегФСС" minOccurs="0"/>
 *         &lt;element name="СвЗапДейств" type="{http://company1c.com/orgregister/corporation}СвЗап" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвязЮЛПоПарам"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ОГРН" use="required" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННТип" />
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
    "\u0441\u0432\u0423\u0447\u0435\u0442\u041d\u041e",
    "\u0441\u0432\u0413\u0440\u0430\u0436\u0434",
    "\u0441\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u0420\u041e",
    "\u0441\u0432\u041b\u0438\u0446\u0435\u043d\u0437\u0438\u044f",
    "\u0441\u0432\u041e\u041a\u0412\u042d\u0414",
    "\u0441\u0432\u0420\u0435\u0433\u0418\u041f",
    "\u0441\u0432\u0420\u0435\u0433\u041f\u0424",
    "\u0441\u0432\u0420\u0435\u0433\u0424\u0421\u0421",
    "\u0441\u0432\u0417\u0430\u043f\u0414\u0435\u0439\u0441\u0442\u0432",
    "\u0441\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u041f\u0430\u0440\u0430\u043c"
})
@XmlRootElement(name = "PersonTrustability")
public class PersonTrustability {

    @XmlElement(name = "\u0421\u0432\u0424\u041b")
    protected СвФЛ свФЛ;
    @XmlElement(name = "\u0421\u0432\u0423\u0447\u0435\u0442\u041d\u041e")
    protected СвУчетНО свУчетНО;
    @XmlElement(name = "\u0421\u0432\u0413\u0440\u0430\u0436\u0434")
    protected СвГражд свГражд;
    @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441_\u0420\u041e")
    protected СвСтатусРО свСтатусРО;
    @XmlElement(name = "\u0421\u0432\u041b\u0438\u0446\u0435\u043d\u0437\u0438\u044f")
    protected List<СвЛицензия> свЛицензия;
    @XmlElement(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414")
    protected List<СвОКВЭД> свОКВЭД;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0418\u041f")
    protected СвРегИП свРегИП;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041f\u0424")
    protected СвРегПФ свРегПФ;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0424\u0421\u0421")
    protected СвРегФСС свРегФСС;
    @XmlElement(name = "\u0421\u0432\u0417\u0430\u043f\u0414\u0435\u0439\u0441\u0442\u0432")
    protected List<СвЗап> свЗапДейств;
    @XmlElement(name = "\u0421\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u041f\u0430\u0440\u0430\u043c", required = true)
    protected СвязЮЛПоПарам связЮЛПоПарам;
    @XmlAttribute(name = "\u041e\u0413\u0420\u041d", required = true)
    protected String огрн;
    @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b")
    protected String иннфл;

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
     * Gets the value of the свЛицензия property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свЛицензия property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвЛицензия().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СвЛицензия }
     * 
     * 
     */
    public List<СвЛицензия> getСвЛицензия() {
        if (свЛицензия == null) {
            свЛицензия = new ArrayList<СвЛицензия>();
        }
        return this.свЛицензия;
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
     * Gets the value of the связЮЛПоПарам property.
     * 
     * @return
     *     possible object is
     *     {@link СвязЮЛПоПарам }
     *     
     */
    public СвязЮЛПоПарам getСвязЮЛПоПарам() {
        return связЮЛПоПарам;
    }

    /**
     * Sets the value of the связЮЛПоПарам property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвязЮЛПоПарам }
     *     
     */
    public void setСвязЮЛПоПарам(СвязЮЛПоПарам value) {
        this.связЮЛПоПарам = value;
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

}
