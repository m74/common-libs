
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
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвНаимЮЛ" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвАдрес" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвОбрЮЛ" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвСтатус_РО" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвУстКап" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвУчетНО" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвРегПФ" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвРегФСС" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвЛицензия" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвОКВЭД" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвПодразд" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвЗапДейств" type="{http://company1c.com/orgregister/corporation}СвЗап" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвЗапНеДейств" type="{http://company1c.com/orgregister/corporation}СвЗап" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвУправлДеятСвязЮЛ" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвУчредитСвязЮЛ" minOccurs="0"/>
 *         &lt;element name="СвязЮЛПоАдресу" type="{http://company1c.com/orgregister/corporation}СвязЮЛSearchResult" minOccurs="0"/>
 *         &lt;element name="СвязЮЛПоУчредителю" type="{http://company1c.com/orgregister/corporation}СвязЮЛSearchResult" minOccurs="0"/>
 *         &lt;element name="annualStatement" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="article" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}short" />
 *                 &lt;attribute name="measure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ОГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="ИНН" type="{http://company1c.com/orgregister/corporation}ИННТип" />
 *       &lt;attribute name="КПП" type="{http://company1c.com/orgregister/corporation}КППТип" />
 *       &lt;attribute name="awaitingResponse" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u0441\u0432\u041d\u0430\u0438\u043c\u042e\u041b",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441",
    "\u0441\u0432\u041e\u0431\u0440\u042e\u041b",
    "\u0441\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u0420\u041e",
    "\u0441\u0432\u0423\u0441\u0442\u041a\u0430\u043f",
    "\u0441\u0432\u0423\u0447\u0435\u0442\u041d\u041e",
    "\u0441\u0432\u0420\u0435\u0433\u041f\u0424",
    "\u0441\u0432\u0420\u0435\u0433\u0424\u0421\u0421",
    "\u0441\u0432\u041b\u0438\u0446\u0435\u043d\u0437\u0438\u044f",
    "\u0441\u0432\u041e\u041a\u0412\u042d\u0414",
    "\u0441\u0432\u041f\u043e\u0434\u0440\u0430\u0437\u0434",
    "\u0441\u0432\u0417\u0430\u043f\u0414\u0435\u0439\u0441\u0442\u0432",
    "\u0441\u0432\u0417\u0430\u043f\u041d\u0435\u0414\u0435\u0439\u0441\u0442\u0432",
    "\u0441\u0432\u0423\u043f\u0440\u0430\u0432\u043b\u0414\u0435\u044f\u0442\u0421\u0432\u044f\u0437\u042e\u041b",
    "\u0441\u0432\u0423\u0447\u0440\u0435\u0434\u0438\u0442\u0421\u0432\u044f\u0437\u042e\u041b",
    "\u0441\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u0410\u0434\u0440\u0435\u0441\u0443",
    "\u0441\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u0423\u0447\u0440\u0435\u0434\u0438\u0442\u0435\u043b\u044e",
    "annualStatement"
})
@XmlRootElement(name = "CorporationTrustability")
public class CorporationTrustability {

    @XmlElement(name = "\u0421\u0432\u041d\u0430\u0438\u043c\u042e\u041b")
    protected СвНаимЮЛ свНаимЮЛ;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441")
    protected СвАдрес свАдрес;
    @XmlElement(name = "\u0421\u0432\u041e\u0431\u0440\u042e\u041b")
    protected СвОбрЮЛ свОбрЮЛ;
    @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441_\u0420\u041e")
    protected СвСтатусРО свСтатусРО;
    @XmlElement(name = "\u0421\u0432\u0423\u0441\u0442\u041a\u0430\u043f")
    protected СвУстКап свУстКап;
    @XmlElement(name = "\u0421\u0432\u0423\u0447\u0435\u0442\u041d\u041e")
    protected СвУчетНО свУчетНО;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041f\u0424")
    protected СвРегПФ свРегПФ;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0424\u0421\u0421")
    protected СвРегФСС свРегФСС;
    @XmlElement(name = "\u0421\u0432\u041b\u0438\u0446\u0435\u043d\u0437\u0438\u044f")
    protected List<СвЛицензия> свЛицензия;
    @XmlElement(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414")
    protected List<СвОКВЭД> свОКВЭД;
    @XmlElement(name = "\u0421\u0432\u041f\u043e\u0434\u0440\u0430\u0437\u0434")
    protected List<СвПодразд> свПодразд;
    @XmlElement(name = "\u0421\u0432\u0417\u0430\u043f\u0414\u0435\u0439\u0441\u0442\u0432")
    protected List<СвЗап> свЗапДейств;
    @XmlElement(name = "\u0421\u0432\u0417\u0430\u043f\u041d\u0435\u0414\u0435\u0439\u0441\u0442\u0432")
    protected List<СвЗап> свЗапНеДейств;
    @XmlElement(name = "\u0421\u0432\u0423\u043f\u0440\u0430\u0432\u043b\u0414\u0435\u044f\u0442\u0421\u0432\u044f\u0437\u042e\u041b")
    protected СвУправлДеятСвязЮЛ свУправлДеятСвязЮЛ;
    @XmlElement(name = "\u0421\u0432\u0423\u0447\u0440\u0435\u0434\u0438\u0442\u0421\u0432\u044f\u0437\u042e\u041b")
    protected СвУчредитСвязЮЛ свУчредитСвязЮЛ;
    @XmlElement(name = "\u0421\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u0410\u0434\u0440\u0435\u0441\u0443")
    protected СвязЮЛSearchResult связЮЛПоАдресу;
    @XmlElement(name = "\u0421\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u0423\u0447\u0440\u0435\u0434\u0438\u0442\u0435\u043b\u044e")
    protected СвязЮЛSearchResult связЮЛПоУчредителю;
    protected List<CorporationTrustability.AnnualStatement> annualStatement;
    @XmlAttribute(name = "\u041e\u0413\u0420\u041d")
    protected String огрн;
    @XmlAttribute(name = "\u0418\u041d\u041d")
    protected String инн;
    @XmlAttribute(name = "\u041a\u041f\u041f")
    protected String кпп;
    @XmlAttribute(name = "awaitingResponse")
    protected Boolean awaitingResponse;

    /**
     * Gets the value of the свНаимЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link СвНаимЮЛ }
     *     
     */
    public СвНаимЮЛ getСвНаимЮЛ() {
        return свНаимЮЛ;
    }

    /**
     * Sets the value of the свНаимЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвНаимЮЛ }
     *     
     */
    public void setСвНаимЮЛ(СвНаимЮЛ value) {
        this.свНаимЮЛ = value;
    }

    /**
     * Gets the value of the свАдрес property.
     * 
     * @return
     *     possible object is
     *     {@link СвАдрес }
     *     
     */
    public СвАдрес getСвАдрес() {
        return свАдрес;
    }

    /**
     * Sets the value of the свАдрес property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвАдрес }
     *     
     */
    public void setСвАдрес(СвАдрес value) {
        this.свАдрес = value;
    }

    /**
     * Gets the value of the свОбрЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link СвОбрЮЛ }
     *     
     */
    public СвОбрЮЛ getСвОбрЮЛ() {
        return свОбрЮЛ;
    }

    /**
     * Sets the value of the свОбрЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвОбрЮЛ }
     *     
     */
    public void setСвОбрЮЛ(СвОбрЮЛ value) {
        this.свОбрЮЛ = value;
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
     * Gets the value of the свУстКап property.
     * 
     * @return
     *     possible object is
     *     {@link СвУстКап }
     *     
     */
    public СвУстКап getСвУстКап() {
        return свУстКап;
    }

    /**
     * Sets the value of the свУстКап property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвУстКап }
     *     
     */
    public void setСвУстКап(СвУстКап value) {
        this.свУстКап = value;
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
     * Gets the value of the свПодразд property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свПодразд property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвПодразд().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СвПодразд }
     * 
     * 
     */
    public List<СвПодразд> getСвПодразд() {
        if (свПодразд == null) {
            свПодразд = new ArrayList<СвПодразд>();
        }
        return this.свПодразд;
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
     * Gets the value of the свЗапНеДейств property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свЗапНеДейств property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвЗапНеДейств().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СвЗап }
     * 
     * 
     */
    public List<СвЗап> getСвЗапНеДейств() {
        if (свЗапНеДейств == null) {
            свЗапНеДейств = new ArrayList<СвЗап>();
        }
        return this.свЗапНеДейств;
    }

    /**
     * Gets the value of the свУправлДеятСвязЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link СвУправлДеятСвязЮЛ }
     *     
     */
    public СвУправлДеятСвязЮЛ getСвУправлДеятСвязЮЛ() {
        return свУправлДеятСвязЮЛ;
    }

    /**
     * Sets the value of the свУправлДеятСвязЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвУправлДеятСвязЮЛ }
     *     
     */
    public void setСвУправлДеятСвязЮЛ(СвУправлДеятСвязЮЛ value) {
        this.свУправлДеятСвязЮЛ = value;
    }

    /**
     * Gets the value of the свУчредитСвязЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link СвУчредитСвязЮЛ }
     *     
     */
    public СвУчредитСвязЮЛ getСвУчредитСвязЮЛ() {
        return свУчредитСвязЮЛ;
    }

    /**
     * Sets the value of the свУчредитСвязЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвУчредитСвязЮЛ }
     *     
     */
    public void setСвУчредитСвязЮЛ(СвУчредитСвязЮЛ value) {
        this.свУчредитСвязЮЛ = value;
    }

    /**
     * Gets the value of the связЮЛПоАдресу property.
     * 
     * @return
     *     possible object is
     *     {@link СвязЮЛSearchResult }
     *     
     */
    public СвязЮЛSearchResult getСвязЮЛПоАдресу() {
        return связЮЛПоАдресу;
    }

    /**
     * Sets the value of the связЮЛПоАдресу property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвязЮЛSearchResult }
     *     
     */
    public void setСвязЮЛПоАдресу(СвязЮЛSearchResult value) {
        this.связЮЛПоАдресу = value;
    }

    /**
     * Gets the value of the связЮЛПоУчредителю property.
     * 
     * @return
     *     possible object is
     *     {@link СвязЮЛSearchResult }
     *     
     */
    public СвязЮЛSearchResult getСвязЮЛПоУчредителю() {
        return связЮЛПоУчредителю;
    }

    /**
     * Sets the value of the связЮЛПоУчредителю property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвязЮЛSearchResult }
     *     
     */
    public void setСвязЮЛПоУчредителю(СвязЮЛSearchResult value) {
        this.связЮЛПоУчредителю = value;
    }

    /**
     * Gets the value of the annualStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annualStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnualStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporationTrustability.AnnualStatement }
     * 
     * 
     */
    public List<CorporationTrustability.AnnualStatement> getAnnualStatement() {
        if (annualStatement == null) {
            annualStatement = new ArrayList<CorporationTrustability.AnnualStatement>();
        }
        return this.annualStatement;
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

    /**
     * Gets the value of the кпп property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКПП() {
        return кпп;
    }

    /**
     * Sets the value of the кпп property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКПП(String value) {
        this.кпп = value;
    }

    /**
     * Gets the value of the awaitingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAwaitingResponse() {
        if (awaitingResponse == null) {
            return false;
        } else {
            return awaitingResponse;
        }
    }

    /**
     * Sets the value of the awaitingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAwaitingResponse(Boolean value) {
        this.awaitingResponse = value;
    }


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
     *         &lt;element name="article" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}short" />
     *       &lt;attribute name="measure" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "article"
    })
    public static class AnnualStatement {

        protected List<CorporationTrustability.AnnualStatement.Article> article;
        @XmlAttribute(name = "year")
        protected Short year;
        @XmlAttribute(name = "measure")
        protected String measure;
        @XmlAttribute(name = "type")
        protected String type;

        /**
         * Gets the value of the article property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the article property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArticle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CorporationTrustability.AnnualStatement.Article }
         * 
         * 
         */
        public List<CorporationTrustability.AnnualStatement.Article> getArticle() {
            if (article == null) {
                article = new ArrayList<CorporationTrustability.AnnualStatement.Article>();
            }
            return this.article;
        }

        /**
         * Gets the value of the year property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getYear() {
            return year;
        }

        /**
         * Sets the value of the year property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setYear(Short value) {
            this.year = value;
        }

        /**
         * Gets the value of the measure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeasure() {
            return measure;
        }

        /**
         * Sets the value of the measure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeasure(String value) {
            this.measure = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="code" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Article {

            @XmlAttribute(name = "code")
            protected String code;
            @XmlAttribute(name = "value")
            protected Integer value;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setValue(Integer value) {
                this.value = value;
            }

        }

    }

}
