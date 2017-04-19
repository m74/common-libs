
package com.company1c.orgregister.corporation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Комплексный тип - Результат проведения проверки 294 ФЗ (плановой или внеплановой)
 *             
 * 
 * <p>Java class for InspectionResult294Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InspectionResult294Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InspectionViolations294" type="{http://company1c.com/orgregister/corporation}InspectionViolation294Type" maxOccurs="30" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ACT_DATE_CREATE" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ACT_TIME_CREATE" type="{http://www.w3.org/2001/XMLSchema}time" />
 *       &lt;attribute name="ACT_PLACE_CREATE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ACT_WAS_READ" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WRONG_DATA_REASON_SEC_I" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WRONG_DATA_ANOTHER" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NAME_OF_OWNER" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UNIMPOSSIBLE_REASON_I" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="DURATION" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ADR_INSPECTION" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="INSPECTORS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UNDOING_SEC_I" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InspectionResult294Type", propOrder = {
    "inspectionViolations294"
})
public class InspectionResult294Type {

    @XmlElement(name = "InspectionViolations294")
    protected List<InspectionViolation294Type> inspectionViolations294;
    @XmlAttribute(name = "ACT_DATE_CREATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actdatecreate;
    @XmlAttribute(name = "ACT_TIME_CREATE")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar acttimecreate;
    @XmlAttribute(name = "ACT_PLACE_CREATE")
    protected String actplacecreate;
    @XmlAttribute(name = "ACT_WAS_READ")
    protected Boolean actwasread;
    @XmlAttribute(name = "WRONG_DATA_REASON_SEC_I")
    protected String wrongdatareasonseci;
    @XmlAttribute(name = "WRONG_DATA_ANOTHER")
    protected String wrongdataanother;
    @XmlAttribute(name = "NAME_OF_OWNER")
    protected String nameofowner;
    @XmlAttribute(name = "UNIMPOSSIBLE_REASON_I")
    protected String unimpossiblereasoni;
    @XmlAttribute(name = "START_DATE")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startdate;
    @XmlAttribute(name = "DURATION")
    protected BigInteger duration;
    @XmlAttribute(name = "ADR_INSPECTION")
    protected String adrinspection;
    @XmlAttribute(name = "INSPECTORS")
    protected String inspectors;
    @XmlAttribute(name = "UNDOING_SEC_I")
    protected String undoingseci;

    /**
     * Gets the value of the inspectionViolations294 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inspectionViolations294 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInspectionViolations294().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InspectionViolation294Type }
     * 
     * 
     */
    public List<InspectionViolation294Type> getInspectionViolations294() {
        if (inspectionViolations294 == null) {
            inspectionViolations294 = new ArrayList<InspectionViolation294Type>();
        }
        return this.inspectionViolations294;
    }

    /**
     * Gets the value of the actdatecreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getACTDATECREATE() {
        return actdatecreate;
    }

    /**
     * Sets the value of the actdatecreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setACTDATECREATE(XMLGregorianCalendar value) {
        this.actdatecreate = value;
    }

    /**
     * Gets the value of the acttimecreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getACTTIMECREATE() {
        return acttimecreate;
    }

    /**
     * Sets the value of the acttimecreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setACTTIMECREATE(XMLGregorianCalendar value) {
        this.acttimecreate = value;
    }

    /**
     * Gets the value of the actplacecreate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACTPLACECREATE() {
        return actplacecreate;
    }

    /**
     * Sets the value of the actplacecreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACTPLACECREATE(String value) {
        this.actplacecreate = value;
    }

    /**
     * Gets the value of the actwasread property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isACTWASREAD() {
        return actwasread;
    }

    /**
     * Sets the value of the actwasread property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setACTWASREAD(Boolean value) {
        this.actwasread = value;
    }

    /**
     * Gets the value of the wrongdatareasonseci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWRONGDATAREASONSECI() {
        return wrongdatareasonseci;
    }

    /**
     * Sets the value of the wrongdatareasonseci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWRONGDATAREASONSECI(String value) {
        this.wrongdatareasonseci = value;
    }

    /**
     * Gets the value of the wrongdataanother property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWRONGDATAANOTHER() {
        return wrongdataanother;
    }

    /**
     * Sets the value of the wrongdataanother property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWRONGDATAANOTHER(String value) {
        this.wrongdataanother = value;
    }

    /**
     * Gets the value of the nameofowner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAMEOFOWNER() {
        return nameofowner;
    }

    /**
     * Sets the value of the nameofowner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAMEOFOWNER(String value) {
        this.nameofowner = value;
    }

    /**
     * Gets the value of the unimpossiblereasoni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIMPOSSIBLEREASONI() {
        return unimpossiblereasoni;
    }

    /**
     * Sets the value of the unimpossiblereasoni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIMPOSSIBLEREASONI(String value) {
        this.unimpossiblereasoni = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTARTDATE() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTARTDATE(XMLGregorianCalendar value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDURATION() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDURATION(BigInteger value) {
        this.duration = value;
    }

    /**
     * Gets the value of the adrinspection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRINSPECTION() {
        return adrinspection;
    }

    /**
     * Sets the value of the adrinspection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRINSPECTION(String value) {
        this.adrinspection = value;
    }

    /**
     * Gets the value of the inspectors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPECTORS() {
        return inspectors;
    }

    /**
     * Sets the value of the inspectors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPECTORS(String value) {
        this.inspectors = value;
    }

    /**
     * Gets the value of the undoingseci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNDOINGSECI() {
        return undoingseci;
    }

    /**
     * Sets the value of the undoingseci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNDOINGSECI(String value) {
        this.undoingseci = value;
    }

}
