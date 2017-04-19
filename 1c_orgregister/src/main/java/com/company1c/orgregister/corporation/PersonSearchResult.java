
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
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}РеквизитыИП" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="personsFound" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u0440\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u0418\u041f"
})
@XmlRootElement(name = "PersonSearchResult")
public class PersonSearchResult {

    @XmlElement(name = "\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u0418\u041f")
    protected List<РеквизитыИП> реквизитыИП;
    @XmlAttribute(name = "personsFound")
    protected Integer personsFound;

    /**
     * Gets the value of the реквизитыИП property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the реквизитыИП property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getРеквизитыИП().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link РеквизитыИП }
     * 
     * 
     */
    public List<РеквизитыИП> getРеквизитыИП() {
        if (реквизитыИП == null) {
            реквизитыИП = new ArrayList<РеквизитыИП>();
        }
        return this.реквизитыИП;
    }

    /**
     * Gets the value of the personsFound property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPersonsFound() {
        if (personsFound == null) {
            return  0;
        } else {
            return personsFound;
        }
    }

    /**
     * Sets the value of the personsFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersonsFound(Integer value) {
        this.personsFound = value;
    }

}
