
package com.company1c.orgregister.corporation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for СвязЮЛSearchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвязЮЛSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="СвязЮЛ" type="{http://company1c.com/orgregister/corporation}СвязЮЛ" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "\u0421\u0432\u044f\u0437\u042e\u041bSearchResult", propOrder = {
    "\u0441\u0432\u044f\u0437\u042e\u041b"
})
public class СвязЮЛSearchResult {

    @XmlElement(name = "\u0421\u0432\u044f\u0437\u042e\u041b")
    protected List<СвязЮЛ> связЮЛ;
    @XmlAttribute(name = "corporationsFound")
    protected Integer corporationsFound;

    /**
     * Gets the value of the связЮЛ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the связЮЛ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвязЮЛ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link СвязЮЛ }
     * 
     * 
     */
    public List<СвязЮЛ> getСвязЮЛ() {
        if (связЮЛ == null) {
            связЮЛ = new ArrayList<СвязЮЛ>();
        }
        return this.связЮЛ;
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
