
package com.company1c.orgregister.corporation;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Комплексный тип - Плановая проверка 294 ФЗ
 * 
 * <p>Java class for InspectionRegular294Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InspectionRegular294Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InspectionResult294" type="{http://company1c.com/orgregister/corporation}InspectionResult294Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ERPID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="KO_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ORG_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ADR_SEC_I" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ADR_SEC_III" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ADR_SEC_IV" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="INN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="INSP_TARGET" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="REASON_SEC_I" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="REASON_SEC_II" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="REASON_SEC_III" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="REASON_SEC_IV" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="DURATION_SEC_I" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="DURATION_SEC_II" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="KIND_OF_INSP" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="KO_JOINTLY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="USER_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FRGU_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NOTICE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="NOTICE_WAY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ORDER_DATE" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ORDER_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InspectionRegular294Type", propOrder = {
    "inspectionResult294"
})
public class InspectionRegular294Type {

    @XmlElement(name = "InspectionResult294")
    protected InspectionResult294Type inspectionResult294;
    @XmlAttribute(name = "ERPID", required = true)
    protected BigInteger erpid;
    @XmlAttribute(name = "KO_NAME")
    protected String koname;
    @XmlAttribute(name = "ORG_NAME")
    protected String orgname;
    @XmlAttribute(name = "ADR_SEC_I")
    protected String adrseci;
    @XmlAttribute(name = "ADR_SEC_III")
    protected String adrseciii;
    @XmlAttribute(name = "ADR_SEC_IV")
    protected String adrseciv;
    @XmlAttribute(name = "OGRN")
    protected String ogrn;
    @XmlAttribute(name = "INN")
    protected String inn;
    @XmlAttribute(name = "INSP_TARGET")
    protected String insptarget;
    @XmlAttribute(name = "REASON_SEC_I")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reasonseci;
    @XmlAttribute(name = "REASON_SEC_II")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reasonsecii;
    @XmlAttribute(name = "REASON_SEC_III")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reasonseciii;
    @XmlAttribute(name = "REASON_SEC_IV")
    protected String reasonseciv;
    @XmlAttribute(name = "START_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startdate;
    @XmlAttribute(name = "DURATION_SEC_I")
    protected BigInteger durationseci;
    @XmlAttribute(name = "DURATION_SEC_II")
    protected BigInteger durationsecii;
    @XmlAttribute(name = "KIND_OF_INSP")
    protected String kindofinsp;
    @XmlAttribute(name = "KO_JOINTLY")
    protected String kojointly;
    @XmlAttribute(name = "USER_NOTE")
    protected String usernote;
    @XmlAttribute(name = "FRGU_NUM")
    protected String frgunum;
    @XmlAttribute(name = "NOTICE_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar noticedate;
    @XmlAttribute(name = "NOTICE_WAY")
    protected String noticeway;
    @XmlAttribute(name = "ORDER_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderdate;
    @XmlAttribute(name = "ORDER_NUM")
    protected String ordernum;

    /**
     * Gets the value of the inspectionResult294 property.
     * 
     * @return
     *     possible object is
     *     {@link InspectionResult294Type }
     *     
     */
    public InspectionResult294Type getInspectionResult294() {
        return inspectionResult294;
    }

    /**
     * Sets the value of the inspectionResult294 property.
     * 
     * @param value
     *     allowed object is
     *     {@link InspectionResult294Type }
     *     
     */
    public void setInspectionResult294(InspectionResult294Type value) {
        this.inspectionResult294 = value;
    }

    /**
     * Gets the value of the erpid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getERPID() {
        return erpid;
    }

    /**
     * Sets the value of the erpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setERPID(BigInteger value) {
        this.erpid = value;
    }

    /**
     * Gets the value of the koname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKONAME() {
        return koname;
    }

    /**
     * Sets the value of the koname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKONAME(String value) {
        this.koname = value;
    }

    /**
     * Gets the value of the orgname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGNAME() {
        return orgname;
    }

    /**
     * Sets the value of the orgname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGNAME(String value) {
        this.orgname = value;
    }

    /**
     * Gets the value of the adrseci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRSECI() {
        return adrseci;
    }

    /**
     * Sets the value of the adrseci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRSECI(String value) {
        this.adrseci = value;
    }

    /**
     * Gets the value of the adrseciii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRSECIII() {
        return adrseciii;
    }

    /**
     * Sets the value of the adrseciii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRSECIII(String value) {
        this.adrseciii = value;
    }

    /**
     * Gets the value of the adrseciv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRSECIV() {
        return adrseciv;
    }

    /**
     * Sets the value of the adrseciv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRSECIV(String value) {
        this.adrseciv = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRN(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the insptarget property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSPTARGET() {
        return insptarget;
    }

    /**
     * Sets the value of the insptarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSPTARGET(String value) {
        this.insptarget = value;
    }

    /**
     * Gets the value of the reasonseci property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getREASONSECI() {
        return reasonseci;
    }

    /**
     * Sets the value of the reasonseci property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setREASONSECI(XMLGregorianCalendar value) {
        this.reasonseci = value;
    }

    /**
     * Gets the value of the reasonsecii property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getREASONSECII() {
        return reasonsecii;
    }

    /**
     * Sets the value of the reasonsecii property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setREASONSECII(XMLGregorianCalendar value) {
        this.reasonsecii = value;
    }

    /**
     * Gets the value of the reasonseciii property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getREASONSECIII() {
        return reasonseciii;
    }

    /**
     * Sets the value of the reasonseciii property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setREASONSECIII(XMLGregorianCalendar value) {
        this.reasonseciii = value;
    }

    /**
     * Gets the value of the reasonseciv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREASONSECIV() {
        return reasonseciv;
    }

    /**
     * Sets the value of the reasonseciv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASONSECIV(String value) {
        this.reasonseciv = value;
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
     * Gets the value of the durationseci property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDURATIONSECI() {
        return durationseci;
    }

    /**
     * Sets the value of the durationseci property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDURATIONSECI(BigInteger value) {
        this.durationseci = value;
    }

    /**
     * Gets the value of the durationsecii property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDURATIONSECII() {
        return durationsecii;
    }

    /**
     * Sets the value of the durationsecii property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDURATIONSECII(BigInteger value) {
        this.durationsecii = value;
    }

    /**
     * Gets the value of the kindofinsp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKINDOFINSP() {
        return kindofinsp;
    }

    /**
     * Sets the value of the kindofinsp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKINDOFINSP(String value) {
        this.kindofinsp = value;
    }

    /**
     * Gets the value of the kojointly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOJOINTLY() {
        return kojointly;
    }

    /**
     * Sets the value of the kojointly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOJOINTLY(String value) {
        this.kojointly = value;
    }

    /**
     * Gets the value of the usernote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSERNOTE() {
        return usernote;
    }

    /**
     * Sets the value of the usernote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSERNOTE(String value) {
        this.usernote = value;
    }

    /**
     * Gets the value of the frgunum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFRGUNUM() {
        return frgunum;
    }

    /**
     * Sets the value of the frgunum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFRGUNUM(String value) {
        this.frgunum = value;
    }

    /**
     * Gets the value of the noticedate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNOTICEDATE() {
        return noticedate;
    }

    /**
     * Sets the value of the noticedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNOTICEDATE(XMLGregorianCalendar value) {
        this.noticedate = value;
    }

    /**
     * Gets the value of the noticeway property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTICEWAY() {
        return noticeway;
    }

    /**
     * Sets the value of the noticeway property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTICEWAY(String value) {
        this.noticeway = value;
    }

    /**
     * Gets the value of the orderdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getORDERDATE() {
        return orderdate;
    }

    /**
     * Sets the value of the orderdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setORDERDATE(XMLGregorianCalendar value) {
        this.orderdate = value;
    }

    /**
     * Gets the value of the ordernum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERNUM() {
        return ordernum;
    }

    /**
     * Sets the value of the ordernum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERNUM(String value) {
        this.ordernum = value;
    }

}
