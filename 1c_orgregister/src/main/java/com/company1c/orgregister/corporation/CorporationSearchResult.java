
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
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}РеквизитыЮрЛица" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="corporationsFound" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u0440\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u042e\u0440\u041b\u0438\u0446\u0430"
})
@XmlRootElement(name = "CorporationSearchResult")
public class CorporationSearchResult {

    @XmlElement(name = "\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u042e\u0440\u041b\u0438\u0446\u0430")
    protected List<РеквизитыЮрЛица> реквизитыЮрЛица;
    @XmlAttribute(name = "corporationsFound")
    protected Integer corporationsFound;

    /**
     * Gets the value of the реквизитыЮрЛица property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the реквизитыЮрЛица property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getРеквизитыЮрЛица().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link РеквизитыЮрЛица }
     * 
     * 
     */
    public List<РеквизитыЮрЛица> getРеквизитыЮрЛица() {
        if (реквизитыЮрЛица == null) {
            реквизитыЮрЛица = new ArrayList<РеквизитыЮрЛица>();
        }
        return this.реквизитыЮрЛица;
    }

    /**
     * Gets the value of the corporationsFound property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCorporationsFound() {
        if (corporationsFound == null) {
            return  0;
        } else {
            return corporationsFound;
        }
    }

    /**
     * Sets the value of the corporationsFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCorporationsFound(Integer value) {
        this.corporationsFound = value;
    }

}
