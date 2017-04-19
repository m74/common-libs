
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
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}InspectionsRegular294" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}InspectionsUnregular294" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
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
    "inspectionsRegular294",
    "inspectionsUnregular294"
})
@XmlRootElement(name = "Inspections")
public class Inspections {

    @XmlElement(name = "InspectionsRegular294")
    protected List<InspectionsRegular294> inspectionsRegular294;
    @XmlElement(name = "InspectionsUnregular294")
    protected List<InspectionsUnregular294> inspectionsUnregular294;
    @XmlAttribute(name = "awaitingResponse")
    protected Boolean awaitingResponse;

    /**
     * Gets the value of the inspectionsRegular294 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inspectionsRegular294 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInspectionsRegular294().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InspectionsRegular294 }
     * 
     * 
     */
    public List<InspectionsRegular294> getInspectionsRegular294() {
        if (inspectionsRegular294 == null) {
            inspectionsRegular294 = new ArrayList<InspectionsRegular294>();
        }
        return this.inspectionsRegular294;
    }

    /**
     * Gets the value of the inspectionsUnregular294 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inspectionsUnregular294 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInspectionsUnregular294().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InspectionsUnregular294 }
     * 
     * 
     */
    public List<InspectionsUnregular294> getInspectionsUnregular294() {
        if (inspectionsUnregular294 == null) {
            inspectionsUnregular294 = new ArrayList<InspectionsUnregular294>();
        }
        return this.inspectionsUnregular294;
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

}
