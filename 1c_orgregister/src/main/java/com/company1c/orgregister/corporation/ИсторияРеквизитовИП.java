
package com.company1c.orgregister.corporation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="ОГРН" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="КодВидИП" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="НаимВидИП" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвФЛ_ФИОРус_Фамилия" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвФЛ_ФИОРус_Имя" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвФЛ_ФИОРус_Отчество" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвФЛ_ФИОЛат_Фамилия" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвФЛ_ФИОЛат_Имя" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвФЛ_ФИОЛат_Отчество" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвГражд_ВидГражд" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвГражд_ОКСМ" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвГражд_НаимСтран" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвСтатусРО_СвСтатус_КодСтатус" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвСтатусРО_СвСтатус_НаимСтатус" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u043e\u0433\u0440\u043d",
    "\u043a\u043e\u0434\u0412\u0438\u0434\u0418\u041f",
    "\u043d\u0430\u0438\u043c\u0412\u0438\u0434\u0418\u041f",
    "\u0441\u0432\u0424\u041b\u0424\u0418\u041e\u0420\u0443\u0441\u0424\u0430\u043c\u0438\u043b\u0438\u044f",
    "\u0441\u0432\u0424\u041b\u0424\u0418\u041e\u0420\u0443\u0441\u0418\u043c\u044f",
    "\u0441\u0432\u0424\u041b\u0424\u0418\u041e\u0420\u0443\u0441\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e",
    "\u0441\u0432\u0424\u041b\u0424\u0418\u041e\u041b\u0430\u0442\u0424\u0430\u043c\u0438\u043b\u0438\u044f",
    "\u0441\u0432\u0424\u041b\u0424\u0418\u041e\u041b\u0430\u0442\u0418\u043c\u044f",
    "\u0441\u0432\u0424\u041b\u0424\u0418\u041e\u041b\u0430\u0442\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e",
    "\u0441\u0432\u0413\u0440\u0430\u0436\u0434\u0412\u0438\u0434\u0413\u0440\u0430\u0436\u0434",
    "\u0441\u0432\u0413\u0440\u0430\u0436\u0434\u041e\u041a\u0421\u041c",
    "\u0441\u0432\u0413\u0440\u0430\u0436\u0434\u041d\u0430\u0438\u043c\u0421\u0442\u0440\u0430\u043d",
    "\u0441\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u0420\u041e\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u041a\u043e\u0434\u0421\u0442\u0430\u0442\u0443\u0441",
    "\u0441\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u0420\u041e\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u041d\u0430\u0438\u043c\u0421\u0442\u0430\u0442\u0443\u0441"
})
@XmlRootElement(name = "\u0418\u0441\u0442\u043e\u0440\u0438\u044f\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u043e\u0432\u0418\u041f")
public class ИсторияРеквизитовИП {

    @XmlElement(name = "\u041e\u0413\u0420\u041d")
    protected List<StringPropertyType> огрн;
    @XmlElement(name = "\u041a\u043e\u0434\u0412\u0438\u0434\u0418\u041f")
    protected List<StringPropertyType> кодВидИП;
    @XmlElement(name = "\u041d\u0430\u0438\u043c\u0412\u0438\u0434\u0418\u041f")
    protected List<StringPropertyType> наимВидИП;
    @XmlElement(name = "\u0421\u0432\u0424\u041b_\u0424\u0418\u041e\u0420\u0443\u0441_\u0424\u0430\u043c\u0438\u043b\u0438\u044f")
    protected List<StringPropertyType> свФЛФИОРусФамилия;
    @XmlElement(name = "\u0421\u0432\u0424\u041b_\u0424\u0418\u041e\u0420\u0443\u0441_\u0418\u043c\u044f")
    protected List<StringPropertyType> свФЛФИОРусИмя;
    @XmlElement(name = "\u0421\u0432\u0424\u041b_\u0424\u0418\u041e\u0420\u0443\u0441_\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e")
    protected List<StringPropertyType> свФЛФИОРусОтчество;
    @XmlElement(name = "\u0421\u0432\u0424\u041b_\u0424\u0418\u041e\u041b\u0430\u0442_\u0424\u0430\u043c\u0438\u043b\u0438\u044f")
    protected List<StringPropertyType> свФЛФИОЛатФамилия;
    @XmlElement(name = "\u0421\u0432\u0424\u041b_\u0424\u0418\u041e\u041b\u0430\u0442_\u0418\u043c\u044f")
    protected List<StringPropertyType> свФЛФИОЛатИмя;
    @XmlElement(name = "\u0421\u0432\u0424\u041b_\u0424\u0418\u041e\u041b\u0430\u0442_\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e")
    protected List<StringPropertyType> свФЛФИОЛатОтчество;
    @XmlElement(name = "\u0421\u0432\u0413\u0440\u0430\u0436\u0434_\u0412\u0438\u0434\u0413\u0440\u0430\u0436\u0434")
    protected List<StringPropertyType> свГраждВидГражд;
    @XmlElement(name = "\u0421\u0432\u0413\u0440\u0430\u0436\u0434_\u041e\u041a\u0421\u041c")
    protected List<StringPropertyType> свГраждОКСМ;
    @XmlElement(name = "\u0421\u0432\u0413\u0440\u0430\u0436\u0434_\u041d\u0430\u0438\u043c\u0421\u0442\u0440\u0430\u043d")
    protected List<StringPropertyType> свГраждНаимСтран;
    @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u0420\u041e_\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441_\u041a\u043e\u0434\u0421\u0442\u0430\u0442\u0443\u0441")
    protected List<StringPropertyType> свСтатусРОСвСтатусКодСтатус;
    @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u0420\u041e_\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441_\u041d\u0430\u0438\u043c\u0421\u0442\u0430\u0442\u0443\u0441")
    protected List<StringPropertyType> свСтатусРОСвСтатусНаимСтатус;

    /**
     * Gets the value of the огрн property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the огрн property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getОГРН().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getОГРН() {
        if (огрн == null) {
            огрн = new ArrayList<StringPropertyType>();
        }
        return this.огрн;
    }

    /**
     * Gets the value of the кодВидИП property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the кодВидИП property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getКодВидИП().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getКодВидИП() {
        if (кодВидИП == null) {
            кодВидИП = new ArrayList<StringPropertyType>();
        }
        return this.кодВидИП;
    }

    /**
     * Gets the value of the наимВидИП property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the наимВидИП property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getНаимВидИП().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getНаимВидИП() {
        if (наимВидИП == null) {
            наимВидИП = new ArrayList<StringPropertyType>();
        }
        return this.наимВидИП;
    }

    /**
     * Gets the value of the свФЛФИОРусФамилия property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свФЛФИОРусФамилия property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвФЛФИОРусФамилия().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвФЛФИОРусФамилия() {
        if (свФЛФИОРусФамилия == null) {
            свФЛФИОРусФамилия = new ArrayList<StringPropertyType>();
        }
        return this.свФЛФИОРусФамилия;
    }

    /**
     * Gets the value of the свФЛФИОРусИмя property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свФЛФИОРусИмя property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвФЛФИОРусИмя().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвФЛФИОРусИмя() {
        if (свФЛФИОРусИмя == null) {
            свФЛФИОРусИмя = new ArrayList<StringPropertyType>();
        }
        return this.свФЛФИОРусИмя;
    }

    /**
     * Gets the value of the свФЛФИОРусОтчество property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свФЛФИОРусОтчество property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвФЛФИОРусОтчество().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвФЛФИОРусОтчество() {
        if (свФЛФИОРусОтчество == null) {
            свФЛФИОРусОтчество = new ArrayList<StringPropertyType>();
        }
        return this.свФЛФИОРусОтчество;
    }

    /**
     * Gets the value of the свФЛФИОЛатФамилия property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свФЛФИОЛатФамилия property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвФЛФИОЛатФамилия().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвФЛФИОЛатФамилия() {
        if (свФЛФИОЛатФамилия == null) {
            свФЛФИОЛатФамилия = new ArrayList<StringPropertyType>();
        }
        return this.свФЛФИОЛатФамилия;
    }

    /**
     * Gets the value of the свФЛФИОЛатИмя property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свФЛФИОЛатИмя property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвФЛФИОЛатИмя().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвФЛФИОЛатИмя() {
        if (свФЛФИОЛатИмя == null) {
            свФЛФИОЛатИмя = new ArrayList<StringPropertyType>();
        }
        return this.свФЛФИОЛатИмя;
    }

    /**
     * Gets the value of the свФЛФИОЛатОтчество property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свФЛФИОЛатОтчество property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвФЛФИОЛатОтчество().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвФЛФИОЛатОтчество() {
        if (свФЛФИОЛатОтчество == null) {
            свФЛФИОЛатОтчество = new ArrayList<StringPropertyType>();
        }
        return this.свФЛФИОЛатОтчество;
    }

    /**
     * Gets the value of the свГраждВидГражд property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свГраждВидГражд property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвГраждВидГражд().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвГраждВидГражд() {
        if (свГраждВидГражд == null) {
            свГраждВидГражд = new ArrayList<StringPropertyType>();
        }
        return this.свГраждВидГражд;
    }

    /**
     * Gets the value of the свГраждОКСМ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свГраждОКСМ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвГраждОКСМ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвГраждОКСМ() {
        if (свГраждОКСМ == null) {
            свГраждОКСМ = new ArrayList<StringPropertyType>();
        }
        return this.свГраждОКСМ;
    }

    /**
     * Gets the value of the свГраждНаимСтран property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свГраждНаимСтран property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвГраждНаимСтран().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвГраждНаимСтран() {
        if (свГраждНаимСтран == null) {
            свГраждНаимСтран = new ArrayList<StringPropertyType>();
        }
        return this.свГраждНаимСтран;
    }

    /**
     * Gets the value of the свСтатусРОСвСтатусКодСтатус property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свСтатусРОСвСтатусКодСтатус property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвСтатусРОСвСтатусКодСтатус().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвСтатусРОСвСтатусКодСтатус() {
        if (свСтатусРОСвСтатусКодСтатус == null) {
            свСтатусРОСвСтатусКодСтатус = new ArrayList<StringPropertyType>();
        }
        return this.свСтатусРОСвСтатусКодСтатус;
    }

    /**
     * Gets the value of the свСтатусРОСвСтатусНаимСтатус property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свСтатусРОСвСтатусНаимСтатус property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвСтатусРОСвСтатусНаимСтатус().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвСтатусРОСвСтатусНаимСтатус() {
        if (свСтатусРОСвСтатусНаимСтатус == null) {
            свСтатусРОСвСтатусНаимСтатус = new ArrayList<StringPropertyType>();
        }
        return this.свСтатусРОСвСтатусНаимСтатус;
    }

}
