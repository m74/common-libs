
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
 * Комплексный тип - Внеплановая проверка 294 ФЗ (Базовый тип)
 * 
 * <p>Java class for UplanUnregular294Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UplanUnregular294Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InspectionResult294" type="{http://company1c.com/orgregister/corporation}InspectionResult294Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ERPID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="KO_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ORG_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="INN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ADR_SEC_I" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ADR_SEC_II" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="REQUEST_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="REQUEST_DATE" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="START_DATE" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="END_DATE" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="DECISION_DATE" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ORDER_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ORDER_DATE" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="INSP_TARGET" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="REASON_SEC_I" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="KIND_OF_INSP" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SIGNER_TITLE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SIGNER_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="KO_ADDRESS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DECISION_PLACE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="YEAR" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="INSPECTORS" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FRGU_NUM" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NOTICE_DATE" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="NOTICE_WAY" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IS_NOTIFICATION" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UplanUnregular294Type", propOrder = {
    "inspectionResult294"
})
public class UplanUnregular294Type {

    @XmlElement(name = "InspectionResult294")
    protected InspectionResult294Type inspectionResult294;
    @XmlAttribute(name = "ERPID", required = true)
    protected BigInteger erpid;
    @XmlAttribute(name = "KO_NAME")
    protected String koname;
    @XmlAttribute(name = "ORG_NAME")
    protected String orgname;
    @XmlAttribute(name = "OGRN")
    protected String ogrn;
    @XmlAttribute(name = "INN")
    protected String inn;
    @XmlAttribute(name = "ADR_SEC_I")
    protected String adrseci;
    @XmlAttribute(name = "ADR_SEC_II")
    protected String adrsecii;
    @XmlAttribute(name = "REQUEST_NUM")
    protected String requestnum;
    @XmlAttribute(name = "REQUEST_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestdate;
    @XmlAttribute(name = "START_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startdate;
    @XmlAttribute(name = "END_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enddate;
    @XmlAttribute(name = "DECISION_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar decisiondate;
    @XmlAttribute(name = "ORDER_NUM")
    protected String ordernum;
    @XmlAttribute(name = "ORDER_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar orderdate;
    @XmlAttribute(name = "INSP_TARGET")
    protected String insptarget;
    @XmlAttribute(name = "REASON_SEC_I")
    protected String reasonseci;
    @XmlAttribute(name = "KIND_OF_INSP")
    protected String kindofinsp;
    @XmlAttribute(name = "SIGNER_TITLE")
    protected String signertitle;
    @XmlAttribute(name = "SIGNER_NAME")
    protected String signername;
    @XmlAttribute(name = "KO_ADDRESS")
    protected String koaddress;
    @XmlAttribute(name = "DECISION_PLACE")
    protected String decisionplace;
    @XmlAttribute(name = "YEAR")
    protected BigInteger year;
    @XmlAttribute(name = "INSPECTORS")
    protected String inspectors;
    @XmlAttribute(name = "FRGU_NUM")
    protected String frgunum;
    @XmlAttribute(name = "NOTICE_DATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar noticedate;
    @XmlAttribute(name = "NOTICE_WAY")
    protected String noticeway;
    @XmlAttribute(name = "IS_NOTIFICATION")
    protected Boolean isnotification;

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
     * Gets the value of the adrsecii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADRSECII() {
        return adrsecii;
    }

    /**
     * Sets the value of the adrsecii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADRSECII(String value) {
        this.adrsecii = value;
    }

    /**
     * Gets the value of the requestnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQUESTNUM() {
        return requestnum;
    }

    /**
     * Sets the value of the requestnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQUESTNUM(String value) {
        this.requestnum = value;
    }

    /**
     * Gets the value of the requestdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getREQUESTDATE() {
        return requestdate;
    }

    /**
     * Sets the value of the requestdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setREQUESTDATE(XMLGregorianCalendar value) {
        this.requestdate = value;
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
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getENDDATE() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setENDDATE(XMLGregorianCalendar value) {
        this.enddate = value;
    }

    /**
     * Gets the value of the decisiondate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDECISIONDATE() {
        return decisiondate;
    }

    /**
     * Sets the value of the decisiondate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDECISIONDATE(XMLGregorianCalendar value) {
        this.decisiondate = value;
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
     *     {@link String }
     *     
     */
    public String getREASONSECI() {
        return reasonseci;
    }

    /**
     * Sets the value of the reasonseci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREASONSECI(String value) {
        this.reasonseci = value;
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
     * Gets the value of the signertitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIGNERTITLE() {
        return signertitle;
    }

    /**
     * Sets the value of the signertitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIGNERTITLE(String value) {
        this.signertitle = value;
    }

    /**
     * Gets the value of the signername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIGNERNAME() {
        return signername;
    }

    /**
     * Sets the value of the signername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIGNERNAME(String value) {
        this.signername = value;
    }

    /**
     * Gets the value of the koaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOADDRESS() {
        return koaddress;
    }

    /**
     * Sets the value of the koaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOADDRESS(String value) {
        this.koaddress = value;
    }

    /**
     * Gets the value of the decisionplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDECISIONPLACE() {
        return decisionplace;
    }

    /**
     * Sets the value of the decisionplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDECISIONPLACE(String value) {
        this.decisionplace = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getYEAR() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setYEAR(BigInteger value) {
        this.year = value;
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
     * Gets the value of the isnotification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isISNOTIFICATION() {
        return isnotification;
    }

    /**
     * Sets the value of the isnotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setISNOTIFICATION(Boolean value) {
        this.isnotification = value;
    }

}
