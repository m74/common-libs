
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
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}УчрЮЛРосСвязЮЛ" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}УчрЮЛИнСвязЮЛ" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}УчрФЛСвязЮЛ" maxOccurs="unbounded" minOccurs="0"/>
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
    "\u0443\u0447\u0440\u042e\u041b\u0420\u043e\u0441\u0421\u0432\u044f\u0437\u042e\u041b",
    "\u0443\u0447\u0440\u042e\u041b\u0418\u043d\u0421\u0432\u044f\u0437\u042e\u041b",
    "\u0443\u0447\u0440\u0424\u041b\u0421\u0432\u044f\u0437\u042e\u041b",
    "\u0443\u0447\u0440\u0420\u0424\u0421\u0443\u0431\u041c\u041e",
    "\u0443\u0447\u0440\u0412\u043b\u041f\u0418\u0424"
})
@XmlRootElement(name = "\u0421\u0432\u0423\u0447\u0440\u0435\u0434\u0438\u0442\u0421\u0432\u044f\u0437\u042e\u041b")
public class СвУчредитСвязЮЛ {

    @XmlElement(name = "\u0423\u0447\u0440\u042e\u041b\u0420\u043e\u0441\u0421\u0432\u044f\u0437\u042e\u041b")
    protected List<УчрЮЛРосСвязЮЛ> учрЮЛРосСвязЮЛ;
    @XmlElement(name = "\u0423\u0447\u0440\u042e\u041b\u0418\u043d\u0421\u0432\u044f\u0437\u042e\u041b")
    protected List<УчрЮЛИнСвязЮЛ> учрЮЛИнСвязЮЛ;
    @XmlElement(name = "\u0423\u0447\u0440\u0424\u041b\u0421\u0432\u044f\u0437\u042e\u041b")
    protected List<УчрФЛСвязЮЛ> учрФЛСвязЮЛ;
    @XmlElement(name = "\u0423\u0447\u0440\u0420\u0424\u0421\u0443\u0431\u041c\u041e")
    protected List<УчрРФСубМО> учрРФСубМО;
    @XmlElement(name = "\u0423\u0447\u0440\u0412\u043b\u041f\u0418\u0424")
    protected List<УчрВлПИФ> учрВлПИФ;

    /**
     * Gets the value of the учрЮЛРосСвязЮЛ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the учрЮЛРосСвязЮЛ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getУчрЮЛРосСвязЮЛ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link УчрЮЛРосСвязЮЛ }
     * 
     * 
     */
    public List<УчрЮЛРосСвязЮЛ> getУчрЮЛРосСвязЮЛ() {
        if (учрЮЛРосСвязЮЛ == null) {
            учрЮЛРосСвязЮЛ = new ArrayList<УчрЮЛРосСвязЮЛ>();
        }
        return this.учрЮЛРосСвязЮЛ;
    }

    /**
     * Gets the value of the учрЮЛИнСвязЮЛ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the учрЮЛИнСвязЮЛ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getУчрЮЛИнСвязЮЛ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link УчрЮЛИнСвязЮЛ }
     * 
     * 
     */
    public List<УчрЮЛИнСвязЮЛ> getУчрЮЛИнСвязЮЛ() {
        if (учрЮЛИнСвязЮЛ == null) {
            учрЮЛИнСвязЮЛ = new ArrayList<УчрЮЛИнСвязЮЛ>();
        }
        return this.учрЮЛИнСвязЮЛ;
    }

    /**
     * Gets the value of the учрФЛСвязЮЛ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the учрФЛСвязЮЛ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getУчрФЛСвязЮЛ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link УчрФЛСвязЮЛ }
     * 
     * 
     */
    public List<УчрФЛСвязЮЛ> getУчрФЛСвязЮЛ() {
        if (учрФЛСвязЮЛ == null) {
            учрФЛСвязЮЛ = new ArrayList<УчрФЛСвязЮЛ>();
        }
        return this.учрФЛСвязЮЛ;
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
