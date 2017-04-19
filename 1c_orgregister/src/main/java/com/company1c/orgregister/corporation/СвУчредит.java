
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
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}УчрЮЛРос" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}УчрЮЛИн" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}УчрФЛ" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}УчрРФСубМО" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}УчрВлПИФ" maxOccurs="unbounded" minOccurs="0"/>
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
    "\u0443\u0447\u0440\u042e\u041b\u0420\u043e\u0441",
    "\u0443\u0447\u0440\u042e\u041b\u0418\u043d",
    "\u0443\u0447\u0440\u0424\u041b",
    "\u0443\u0447\u0440\u0420\u0424\u0421\u0443\u0431\u041c\u041e",
    "\u0443\u0447\u0440\u0412\u043b\u041f\u0418\u0424"
})
@XmlRootElement(name = "\u0421\u0432\u0423\u0447\u0440\u0435\u0434\u0438\u0442")
public class СвУчредит {

    @XmlElement(name = "\u0423\u0447\u0440\u042e\u041b\u0420\u043e\u0441")
    protected List<УчрЮЛРос> учрЮЛРос;
    @XmlElement(name = "\u0423\u0447\u0440\u042e\u041b\u0418\u043d")
    protected List<УчрЮЛИн> учрЮЛИн;
    @XmlElement(name = "\u0423\u0447\u0440\u0424\u041b")
    protected List<УчрФЛ> учрФЛ;
    @XmlElement(name = "\u0423\u0447\u0440\u0420\u0424\u0421\u0443\u0431\u041c\u041e")
    protected List<УчрРФСубМО> учрРФСубМО;
    @XmlElement(name = "\u0423\u0447\u0440\u0412\u043b\u041f\u0418\u0424")
    protected List<УчрВлПИФ> учрВлПИФ;

    /**
     * Gets the value of the учрЮЛРос property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the учрЮЛРос property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getУчрЮЛРос().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link УчрЮЛРос }
     * 
     * 
     */
    public List<УчрЮЛРос> getУчрЮЛРос() {
        if (учрЮЛРос == null) {
            учрЮЛРос = new ArrayList<УчрЮЛРос>();
        }
        return this.учрЮЛРос;
    }

    /**
     * Gets the value of the учрЮЛИн property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the учрЮЛИн property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getУчрЮЛИн().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link УчрЮЛИн }
     * 
     * 
     */
    public List<УчрЮЛИн> getУчрЮЛИн() {
        if (учрЮЛИн == null) {
            учрЮЛИн = new ArrayList<УчрЮЛИн>();
        }
        return this.учрЮЛИн;
    }

    /**
     * Gets the value of the учрФЛ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the учрФЛ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getУчрФЛ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link УчрФЛ }
     * 
     * 
     */
    public List<УчрФЛ> getУчрФЛ() {
        if (учрФЛ == null) {
            учрФЛ = new ArrayList<УчрФЛ>();
        }
        return this.учрФЛ;
    }

    /**
     * Gets the value of the учрРФСубМО property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the учрРФСубМО property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getУчрРФСубМО().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link УчрРФСубМО }
     * 
     * 
     */
    public List<УчрРФСубМО> getУчрРФСубМО() {
        if (учрРФСубМО == null) {
            учрРФСубМО = new ArrayList<УчрРФСубМО>();
        }
        return this.учрРФСубМО;
    }

    /**
     * Gets the value of the учрВлПИФ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the учрВлПИФ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getУчрВлПИФ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link УчрВлПИФ }
     * 
     * 
     */
    public List<УчрВлПИФ> getУчрВлПИФ() {
        if (учрВлПИФ == null) {
            учрВлПИФ = new ArrayList<УчрВлПИФ>();
        }
        return this.учрВлПИФ;
    }

}
