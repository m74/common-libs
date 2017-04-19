
package com.company1c.orgregister.corporation;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Комплексный тип - Выявленные нарушения по результатам проведения проверки 294 ФЗ (плановой
 *                 или внеплановой)
 *             
 * 
 * <p>Java class for InspectionViolation294Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InspectionViolation294Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="VIOLATION_ID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="VIOLATION_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VIOLATION_ACT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VIOLATION_ACTORS_NAME" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="INJUNCTION_CODES" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="INJUNCTION_NOTE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="INJUNCTION_DATE_CREATE" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="INJUNCTION_DEADLINE" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="INJUNCTION_IS_REFUSED" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="INJUNCTION_EXECUTION" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LAWSUIT_SEC_I" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LAWSUIT_SEC_II" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LAWSUIT_SEC_III" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LAWSUIT_SEC_IV" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LAWSUIT_SEC_V" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LAWSUIT_SEC_VI" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LAWSUIT_SEC_VII" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InspectionViolation294Type")
public class InspectionViolation294Type {

    @XmlAttribute(name = "VIOLATION_ID")
    protected BigInteger violationid;
    @XmlAttribute(name = "VIOLATION_NOTE")
    protected String violationnote;
    @XmlAttribute(name = "VIOLATION_ACT")
    protected String violationact;
    @XmlAttribute(name = "VIOLATION_ACTORS_NAME")
    protected String violationactorsname;
    @XmlAttribute(name = "INJUNCTION_CODES")
    protected String injunctioncodes;
    @XmlAttribute(name = "INJUNCTION_NOTE")
    protected String injunctionnote;
    @XmlAttribute(name = "INJUNCTION_DATE_CREATE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar injunctiondatecreate;
    @XmlAttribute(name = "INJUNCTION_DEADLINE")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar injunctiondeadline;
    @XmlAttribute(name = "INJUNCTION_IS_REFUSED")
    protected Boolean injunctionisrefused;
    @XmlAttribute(name = "INJUNCTION_EXECUTION")
    protected String injunctionexecution;
    @XmlAttribute(name = "LAWSUIT_SEC_I")
    protected String lawsuitseci;
    @XmlAttribute(name = "LAWSUIT_SEC_II")
    protected String lawsuitsecii;
    @XmlAttribute(name = "LAWSUIT_SEC_III")
    protected String lawsuitseciii;
    @XmlAttribute(name = "LAWSUIT_SEC_IV")
    protected String lawsuitseciv;
    @XmlAttribute(name = "LAWSUIT_SEC_V")
    protected String lawsuitsecv;
    @XmlAttribute(name = "LAWSUIT_SEC_VI")
    protected String lawsuitsecvi;
    @XmlAttribute(name = "LAWSUIT_SEC_VII")
    protected String lawsuitsecvii;

    /**
     * Gets the value of the violationid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVIOLATIONID() {
        return violationid;
    }

    /**
     * Sets the value of the violationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVIOLATIONID(BigInteger value) {
        this.violationid = value;
    }

    /**
     * Gets the value of the violationnote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIOLATIONNOTE() {
        return violationnote;
    }

    /**
     * Sets the value of the violationnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIOLATIONNOTE(String value) {
        this.violationnote = value;
    }

    /**
     * Gets the value of the violationact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIOLATIONACT() {
        return violationact;
    }

    /**
     * Sets the value of the violationact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIOLATIONACT(String value) {
        this.violationact = value;
    }

    /**
     * Gets the value of the violationactorsname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIOLATIONACTORSNAME() {
        return violationactorsname;
    }

    /**
     * Sets the value of the violationactorsname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIOLATIONACTORSNAME(String value) {
        this.violationactorsname = value;
    }

    /**
     * Gets the value of the injunctioncodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINJUNCTIONCODES() {
        return injunctioncodes;
    }

    /**
     * Sets the value of the injunctioncodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINJUNCTIONCODES(String value) {
        this.injunctioncodes = value;
    }

    /**
     * Gets the value of the injunctionnote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINJUNCTIONNOTE() {
        return injunctionnote;
    }

    /**
     * Sets the value of the injunctionnote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINJUNCTIONNOTE(String value) {
        this.injunctionnote = value;
    }

    /**
     * Gets the value of the injunctiondatecreate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getINJUNCTIONDATECREATE() {
        return injunctiondatecreate;
    }

    /**
     * Sets the value of the injunctiondatecreate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setINJUNCTIONDATECREATE(XMLGregorianCalendar value) {
        this.injunctiondatecreate = value;
    }

    /**
     * Gets the value of the injunctiondeadline property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getINJUNCTIONDEADLINE() {
        return injunctiondeadline;
    }

    /**
     * Sets the value of the injunctiondeadline property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setINJUNCTIONDEADLINE(XMLGregorianCalendar value) {
        this.injunctiondeadline = value;
    }

    /**
     * Gets the value of the injunctionisrefused property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isINJUNCTIONISREFUSED() {
        return injunctionisrefused;
    }

    /**
     * Sets the value of the injunctionisrefused property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setINJUNCTIONISREFUSED(Boolean value) {
        this.injunctionisrefused = value;
    }

    /**
     * Gets the value of the injunctionexecution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINJUNCTIONEXECUTION() {
        return injunctionexecution;
    }

    /**
     * Sets the value of the injunctionexecution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINJUNCTIONEXECUTION(String value) {
        this.injunctionexecution = value;
    }

    /**
     * Gets the value of the lawsuitseci property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAWSUITSECI() {
        return lawsuitseci;
    }

    /**
     * Sets the value of the lawsuitseci property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAWSUITSECI(String value) {
        this.lawsuitseci = value;
    }

    /**
     * Gets the value of the lawsuitsecii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAWSUITSECII() {
        return lawsuitsecii;
    }

    /**
     * Sets the value of the lawsuitsecii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAWSUITSECII(String value) {
        this.lawsuitsecii = value;
    }

    /**
     * Gets the value of the lawsuitseciii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAWSUITSECIII() {
        return lawsuitseciii;
    }

    /**
     * Sets the value of the lawsuitseciii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAWSUITSECIII(String value) {
        this.lawsuitseciii = value;
    }

    /**
     * Gets the value of the lawsuitseciv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAWSUITSECIV() {
        return lawsuitseciv;
    }

    /**
     * Sets the value of the lawsuitseciv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAWSUITSECIV(String value) {
        this.lawsuitseciv = value;
    }

    /**
     * Gets the value of the lawsuitsecv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAWSUITSECV() {
        return lawsuitsecv;
    }

    /**
     * Sets the value of the lawsuitsecv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAWSUITSECV(String value) {
        this.lawsuitsecv = value;
    }

    /**
     * Gets the value of the lawsuitsecvi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAWSUITSECVI() {
        return lawsuitsecvi;
    }

    /**
     * Sets the value of the lawsuitsecvi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAWSUITSECVI(String value) {
        this.lawsuitsecvi = value;
    }

    /**
     * Gets the value of the lawsuitsecvii property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAWSUITSECVII() {
        return lawsuitsecvii;
    }

    /**
     * Sets the value of the lawsuitsecvii property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAWSUITSECVII(String value) {
        this.lawsuitsecvii = value;
    }

}
