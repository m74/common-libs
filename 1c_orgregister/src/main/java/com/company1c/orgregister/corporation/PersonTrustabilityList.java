
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
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}PersonTrustability" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="found" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "personTrustability"
})
@XmlRootElement(name = "PersonTrustabilityList")
public class PersonTrustabilityList {

    @XmlElement(name = "PersonTrustability")
    protected List<PersonTrustability> personTrustability;
    @XmlAttribute(name = "found")
    protected Integer found;

    /**
     * Gets the value of the personTrustability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personTrustability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonTrustability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonTrustability }
     * 
     * 
     */
    public List<PersonTrustability> getPersonTrustability() {
        if (personTrustability == null) {
            personTrustability = new ArrayList<PersonTrustability>();
        }
        return this.personTrustability;
    }

    /**
     * Gets the value of the found property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getFound() {
        if (found == null) {
            return  0;
        } else {
            return found;
        }
    }

    /**
     * Sets the value of the found property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFound(Integer value) {
        this.found = value;
    }

}
