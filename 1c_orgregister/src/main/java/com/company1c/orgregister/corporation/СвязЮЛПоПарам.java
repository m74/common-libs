
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="связЮЛПоДиректоруПоИНН" type="{http://company1c.com/orgregister/corporation}СвязЮЛSearchResult" minOccurs="0"/>
 *         &lt;element name="связЮЛПоДиректоруПоФИО" type="{http://company1c.com/orgregister/corporation}СвязЮЛSearchResult" minOccurs="0"/>
 *         &lt;element name="связЮЛПоУчредителюПоИНН" type="{http://company1c.com/orgregister/corporation}СвязЮЛSearchResult" minOccurs="0"/>
 *         &lt;element name="связЮЛПоУчредителюПоФИО" type="{http://company1c.com/orgregister/corporation}СвязЮЛSearchResult" minOccurs="0"/>
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
    "\u0441\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u0414\u0438\u0440\u0435\u043a\u0442\u043e\u0440\u0443\u041f\u043e\u0418\u041d\u041d",
    "\u0441\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u0414\u0438\u0440\u0435\u043a\u0442\u043e\u0440\u0443\u041f\u043e\u0424\u0418\u041e",
    "\u0441\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u0423\u0447\u0440\u0435\u0434\u0438\u0442\u0435\u043b\u044e\u041f\u043e\u0418\u041d\u041d",
    "\u0441\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u0423\u0447\u0440\u0435\u0434\u0438\u0442\u0435\u043b\u044e\u041f\u043e\u0424\u0418\u041e"
})
@XmlRootElement(name = "\u0421\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u041f\u0430\u0440\u0430\u043c")
public class СвязЮЛПоПарам {

    protected СвязЮЛSearchResult связЮЛПоДиректоруПоИНН;
    protected СвязЮЛSearchResult связЮЛПоДиректоруПоФИО;
    protected СвязЮЛSearchResult связЮЛПоУчредителюПоИНН;
    protected СвязЮЛSearchResult связЮЛПоУчредителюПоФИО;

    /**
     * Gets the value of the связЮЛПоДиректоруПоИНН property.
     * 
     * @return
     *     possible object is
     *     {@link СвязЮЛSearchResult }
     *     
     */
    public СвязЮЛSearchResult getСвязЮЛПоДиректоруПоИНН() {
        return связЮЛПоДиректоруПоИНН;
    }

    /**
     * Sets the value of the связЮЛПоДиректоруПоИНН property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвязЮЛSearchResult }
     *     
     */
    public void setСвязЮЛПоДиректоруПоИНН(СвязЮЛSearchResult value) {
        this.связЮЛПоДиректоруПоИНН = value;
    }

    /**
     * Gets the value of the связЮЛПоДиректоруПоФИО property.
     * 
     * @return
     *     possible object is
     *     {@link СвязЮЛSearchResult }
     *     
     */
    public СвязЮЛSearchResult getСвязЮЛПоДиректоруПоФИО() {
        return связЮЛПоДиректоруПоФИО;
    }

    /**
     * Sets the value of the связЮЛПоДиректоруПоФИО property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвязЮЛSearchResult }
     *     
     */
    public void setСвязЮЛПоДиректоруПоФИО(СвязЮЛSearchResult value) {
        this.связЮЛПоДиректоруПоФИО = value;
    }

    /**
     * Gets the value of the связЮЛПоУчредителюПоИНН property.
     * 
     * @return
     *     possible object is
     *     {@link СвязЮЛSearchResult }
     *     
     */
    public СвязЮЛSearchResult getСвязЮЛПоУчредителюПоИНН() {
        return связЮЛПоУчредителюПоИНН;
    }

    /**
     * Sets the value of the связЮЛПоУчредителюПоИНН property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвязЮЛSearchResult }
     *     
     */
    public void setСвязЮЛПоУчредителюПоИНН(СвязЮЛSearchResult value) {
        this.связЮЛПоУчредителюПоИНН = value;
    }

    /**
     * Gets the value of the связЮЛПоУчредителюПоФИО property.
     * 
     * @return
     *     possible object is
     *     {@link СвязЮЛSearchResult }
     *     
     */
    public СвязЮЛSearchResult getСвязЮЛПоУчредителюПоФИО() {
        return связЮЛПоУчредителюПоФИО;
    }

    /**
     * Sets the value of the связЮЛПоУчредителюПоФИО property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвязЮЛSearchResult }
     *     
     */
    public void setСвязЮЛПоУчредителюПоФИО(СвязЮЛSearchResult value) {
        this.связЮЛПоУчредителюПоФИО = value;
    }

}
