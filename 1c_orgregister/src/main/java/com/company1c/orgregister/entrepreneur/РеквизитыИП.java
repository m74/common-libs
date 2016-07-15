
package com.company1c.orgregister.entrepreneur;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="СвФЛ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ФИОРус" type="{http://company1c.com/orgregister/entrepreneur}ФИОТип" minOccurs="0"/>
 *                   &lt;element name="ФИОЛат" type="{http://company1c.com/orgregister/entrepreneur}ФИОТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
 *                 &lt;attribute name="Пол">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="1"/>
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвГражд" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
 *                 &lt;attribute name="ВидГражд">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="1"/>
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                       &lt;enumeration value="3"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ОКСМ" type="{http://company1c.com/orgregister/entrepreneur}ОКСМТип" />
 *                 &lt;attribute name="НаимСтран">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="250"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвРегПФ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвОргПФ" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодПФ">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="3"/>
 *                                 &lt;maxLength value="6"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимПФ">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="10"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
 *                 &lt;attribute name="РегНомПФ">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="15"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаРег" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвРегФСС" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвОргФСС" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодФСС">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="4"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимФСС">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="10"/>
 *                                 &lt;maxLength value="255"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
 *                 &lt;attribute name="РегНомФСС">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="15"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ДатаРег" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвОКВЭД" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
 *                 &lt;attribute name="ПрОснДоп">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="1"/>
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="КодОКВЭД" type="{http://company1c.com/orgregister/entrepreneur}ОКВЭДТип" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвСтатус_РО" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвСтатус" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодСтатус">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="3"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимСтатус">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="5"/>
 *                                 &lt;maxLength value="500"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ДатаПрекрИП" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвРегОрг" type="{http://company1c.com/orgregister/entrepreneur}СвРегОргТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвРегИП" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
 *                 &lt;attribute name="ДатаРег" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="РегНом">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимРО">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="5"/>
 *                       &lt;maxLength value="255"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвУчетНО" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СвНО" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодНО" type="{http://company1c.com/orgregister/entrepreneur}СОНОТип" />
 *                           &lt;attribute name="НаимНО">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="10"/>
 *                                 &lt;maxLength value="250"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
 *                 &lt;attribute name="ДатаПостУч" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвЗапДейств" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ВидЗап" type="{http://company1c.com/orgregister/entrepreneur}ВидЗапТип" minOccurs="0"/>
 *                   &lt;element name="СвРегОрг" type="{http://company1c.com/orgregister/entrepreneur}СвРегОргТип" minOccurs="0"/>
 *                   &lt;element name="СвСвид" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ДатаЗап" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
 *                           &lt;attribute name="ИдЗап">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                 &lt;totalDigits value="17"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Серия">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Номер">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="9"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаЗап" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
 *                 &lt;attribute name="ИдЗап">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                       &lt;totalDigits value="17"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ОГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
 *       &lt;attribute name="ДатаОГРНИП" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/entrepreneur}ИННФЛТип" />
 *       &lt;attribute name="КодВидИП">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;length value="1"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="НаимВидИП">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="10"/>
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u0441\u0432\u0424\u041b",
    "\u0441\u0432\u0413\u0440\u0430\u0436\u0434",
    "\u0441\u0432\u0420\u0435\u0433\u041f\u0424",
    "\u0441\u0432\u0420\u0435\u0433\u0424\u0421\u0421",
    "\u0441\u0432\u041e\u041a\u0412\u042d\u0414",
    "\u0441\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u0420\u041e",
    "\u0441\u0432\u0420\u0435\u0433\u0418\u041f",
    "\u0441\u0432\u0423\u0447\u0435\u0442\u041d\u041e",
    "\u0441\u0432\u0417\u0430\u043f\u0414\u0435\u0439\u0441\u0442\u0432"
})
@XmlRootElement(name = "\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u0418\u041f")
public class РеквизитыИП {

    @XmlElement(name = "\u0421\u0432\u0424\u041b")
    protected РеквизитыИП.СвФЛ свФЛ;
    @XmlElement(name = "\u0421\u0432\u0413\u0440\u0430\u0436\u0434")
    protected РеквизитыИП.СвГражд свГражд;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041f\u0424")
    protected РеквизитыИП.СвРегПФ свРегПФ;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0424\u0421\u0421")
    protected РеквизитыИП.СвРегФСС свРегФСС;
    @XmlElement(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414")
    protected List<РеквизитыИП.СвОКВЭД> свОКВЭД;
    @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441_\u0420\u041e")
    protected РеквизитыИП.СвСтатусРО свСтатусРО;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0418\u041f")
    protected РеквизитыИП.СвРегИП свРегИП;
    @XmlElement(name = "\u0421\u0432\u0423\u0447\u0435\u0442\u041d\u041e")
    protected РеквизитыИП.СвУчетНО свУчетНО;
    @XmlElement(name = "\u0421\u0432\u0417\u0430\u043f\u0414\u0435\u0439\u0441\u0442\u0432")
    protected List<РеквизитыИП.СвЗапДейств> свЗапДейств;
    @XmlAttribute(name = "\u041e\u0413\u0420\u041d\u0418\u041f")
    protected String огрнип;
    @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041e\u0413\u0420\u041d\u0418\u041f")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar датаОГРНИП;
    @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b")
    protected String иннфл;
    @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u0438\u0434\u0418\u041f")
    protected String кодВидИП;
    @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0412\u0438\u0434\u0418\u041f")
    protected String наимВидИП;

    /**
     * Gets the value of the свФЛ property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыИП.СвФЛ }
     *     
     */
    public РеквизитыИП.СвФЛ getСвФЛ() {
        return свФЛ;
    }

    /**
     * Sets the value of the свФЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыИП.СвФЛ }
     *     
     */
    public void setСвФЛ(РеквизитыИП.СвФЛ value) {
        this.свФЛ = value;
    }

    /**
     * Gets the value of the свГражд property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыИП.СвГражд }
     *     
     */
    public РеквизитыИП.СвГражд getСвГражд() {
        return свГражд;
    }

    /**
     * Sets the value of the свГражд property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыИП.СвГражд }
     *     
     */
    public void setСвГражд(РеквизитыИП.СвГражд value) {
        this.свГражд = value;
    }

    /**
     * Gets the value of the свРегПФ property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыИП.СвРегПФ }
     *     
     */
    public РеквизитыИП.СвРегПФ getСвРегПФ() {
        return свРегПФ;
    }

    /**
     * Sets the value of the свРегПФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыИП.СвРегПФ }
     *     
     */
    public void setСвРегПФ(РеквизитыИП.СвРегПФ value) {
        this.свРегПФ = value;
    }

    /**
     * Gets the value of the свРегФСС property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыИП.СвРегФСС }
     *     
     */
    public РеквизитыИП.СвРегФСС getСвРегФСС() {
        return свРегФСС;
    }

    /**
     * Sets the value of the свРегФСС property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыИП.СвРегФСС }
     *     
     */
    public void setСвРегФСС(РеквизитыИП.СвРегФСС value) {
        this.свРегФСС = value;
    }

    /**
     * Gets the value of the свОКВЭД property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свОКВЭД property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвОКВЭД().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link РеквизитыИП.СвОКВЭД }
     * 
     * 
     */
    public List<РеквизитыИП.СвОКВЭД> getСвОКВЭД() {
        if (свОКВЭД == null) {
            свОКВЭД = new ArrayList<РеквизитыИП.СвОКВЭД>();
        }
        return this.свОКВЭД;
    }

    /**
     * Gets the value of the свСтатусРО property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыИП.СвСтатусРО }
     *     
     */
    public РеквизитыИП.СвСтатусРО getСвСтатусРО() {
        return свСтатусРО;
    }

    /**
     * Sets the value of the свСтатусРО property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыИП.СвСтатусРО }
     *     
     */
    public void setСвСтатусРО(РеквизитыИП.СвСтатусРО value) {
        this.свСтатусРО = value;
    }

    /**
     * Gets the value of the свРегИП property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыИП.СвРегИП }
     *     
     */
    public РеквизитыИП.СвРегИП getСвРегИП() {
        return свРегИП;
    }

    /**
     * Sets the value of the свРегИП property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыИП.СвРегИП }
     *     
     */
    public void setСвРегИП(РеквизитыИП.СвРегИП value) {
        this.свРегИП = value;
    }

    /**
     * Gets the value of the свУчетНО property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыИП.СвУчетНО }
     *     
     */
    public РеквизитыИП.СвУчетНО getСвУчетНО() {
        return свУчетНО;
    }

    /**
     * Sets the value of the свУчетНО property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыИП.СвУчетНО }
     *     
     */
    public void setСвУчетНО(РеквизитыИП.СвУчетНО value) {
        this.свУчетНО = value;
    }

    /**
     * Gets the value of the свЗапДейств property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свЗапДейств property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвЗапДейств().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link РеквизитыИП.СвЗапДейств }
     * 
     * 
     */
    public List<РеквизитыИП.СвЗапДейств> getСвЗапДейств() {
        if (свЗапДейств == null) {
            свЗапДейств = new ArrayList<РеквизитыИП.СвЗапДейств>();
        }
        return this.свЗапДейств;
    }

    /**
     * Gets the value of the огрнип property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОГРНИП() {
        return огрнип;
    }

    /**
     * Sets the value of the огрнип property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОГРНИП(String value) {
        this.огрнип = value;
    }

    /**
     * Gets the value of the датаОГРНИП property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getДатаОГРНИП() {
        return датаОГРНИП;
    }

    /**
     * Sets the value of the датаОГРНИП property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setДатаОГРНИП(XMLGregorianCalendar value) {
        this.датаОГРНИП = value;
    }

    /**
     * Gets the value of the иннфл property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИННФЛ() {
        return иннфл;
    }

    /**
     * Sets the value of the иннфл property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИННФЛ(String value) {
        this.иннфл = value;
    }

    /**
     * Gets the value of the кодВидИП property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКодВидИП() {
        return кодВидИП;
    }

    /**
     * Sets the value of the кодВидИП property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКодВидИП(String value) {
        this.кодВидИП = value;
    }

    /**
     * Gets the value of the наимВидИП property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getНаимВидИП() {
        return наимВидИП;
    }

    /**
     * Sets the value of the наимВидИП property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setНаимВидИП(String value) {
        this.наимВидИП = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
     *       &lt;attribute name="ВидГражд">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;length value="1"/>
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *             &lt;enumeration value="3"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ОКСМ" type="{http://company1c.com/orgregister/entrepreneur}ОКСМТип" />
     *       &lt;attribute name="НаимСтран">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="250"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class СвГражд {

        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d\u0418\u041f")
        protected String грнип;
        @XmlAttribute(name = "\u0412\u0438\u0434\u0413\u0440\u0430\u0436\u0434")
        protected String видГражд;
        @XmlAttribute(name = "\u041e\u041a\u0421\u041c")
        protected String оксм;
        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0440\u0430\u043d")
        protected String наимСтран;

        /**
         * Gets the value of the датаНачДейств property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаНачДейств() {
            return датаНачДейств;
        }

        /**
         * Sets the value of the датаНачДейств property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаНачДейств(XMLGregorianCalendar value) {
            this.датаНачДейств = value;
        }

        /**
         * Gets the value of the грнип property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРНИП() {
            return грнип;
        }

        /**
         * Sets the value of the грнип property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРНИП(String value) {
            this.грнип = value;
        }

        /**
         * Gets the value of the видГражд property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getВидГражд() {
            return видГражд;
        }

        /**
         * Sets the value of the видГражд property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setВидГражд(String value) {
            this.видГражд = value;
        }

        /**
         * Gets the value of the оксм property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getОКСМ() {
            return оксм;
        }

        /**
         * Sets the value of the оксм property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setОКСМ(String value) {
            this.оксм = value;
        }

        /**
         * Gets the value of the наимСтран property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getНаимСтран() {
            return наимСтран;
        }

        /**
         * Sets the value of the наимСтран property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setНаимСтран(String value) {
            this.наимСтран = value;
        }

    }


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
     *         &lt;element name="ВидЗап" type="{http://company1c.com/orgregister/entrepreneur}ВидЗапТип" minOccurs="0"/>
     *         &lt;element name="СвРегОрг" type="{http://company1c.com/orgregister/entrepreneur}СвРегОргТип" minOccurs="0"/>
     *         &lt;element name="СвСвид" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ДатаЗап" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
     *                 &lt;attribute name="ИдЗап">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                       &lt;totalDigits value="17"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Серия">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Номер">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="9"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ДатаЗап" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
     *       &lt;attribute name="ИдЗап">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *             &lt;totalDigits value="17"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0432\u0438\u0434\u0417\u0430\u043f",
        "\u0441\u0432\u0420\u0435\u0433\u041e\u0440\u0433",
        "\u0441\u0432\u0421\u0432\u0438\u0434"
    })
    public static class СвЗапДейств {

        @XmlElement(name = "\u0412\u0438\u0434\u0417\u0430\u043f")
        protected ВидЗапТип видЗап;
        @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041e\u0440\u0433")
        protected СвРегОргТип свРегОрг;
        @XmlElement(name = "\u0421\u0432\u0421\u0432\u0438\u0434")
        protected List<РеквизитыИП.СвЗапДейств.СвСвид> свСвид;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0417\u0430\u043f")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаЗап;
        @XmlAttribute(name = "\u0413\u0420\u041d\u0418\u041f")
        protected String грнип;
        @XmlAttribute(name = "\u0418\u0434\u0417\u0430\u043f")
        protected BigInteger идЗап;

        /**
         * Gets the value of the видЗап property.
         * 
         * @return
         *     possible object is
         *     {@link ВидЗапТип }
         *     
         */
        public ВидЗапТип getВидЗап() {
            return видЗап;
        }

        /**
         * Sets the value of the видЗап property.
         * 
         * @param value
         *     allowed object is
         *     {@link ВидЗапТип }
         *     
         */
        public void setВидЗап(ВидЗапТип value) {
            this.видЗап = value;
        }

        /**
         * Gets the value of the свРегОрг property.
         * 
         * @return
         *     possible object is
         *     {@link СвРегОргТип }
         *     
         */
        public СвРегОргТип getСвРегОрг() {
            return свРегОрг;
        }

        /**
         * Sets the value of the свРегОрг property.
         * 
         * @param value
         *     allowed object is
         *     {@link СвРегОргТип }
         *     
         */
        public void setСвРегОрг(СвРегОргТип value) {
            this.свРегОрг = value;
        }

        /**
         * Gets the value of the свСвид property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the свСвид property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getСвСвид().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link РеквизитыИП.СвЗапДейств.СвСвид }
         * 
         * 
         */
        public List<РеквизитыИП.СвЗапДейств.СвСвид> getСвСвид() {
            if (свСвид == null) {
                свСвид = new ArrayList<РеквизитыИП.СвЗапДейств.СвСвид>();
            }
            return this.свСвид;
        }

        /**
         * Gets the value of the датаЗап property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаЗап() {
            return датаЗап;
        }

        /**
         * Sets the value of the датаЗап property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаЗап(XMLGregorianCalendar value) {
            this.датаЗап = value;
        }

        /**
         * Gets the value of the грнип property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРНИП() {
            return грнип;
        }

        /**
         * Sets the value of the грнип property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРНИП(String value) {
            this.грнип = value;
        }

        /**
         * Gets the value of the идЗап property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getИдЗап() {
            return идЗап;
        }

        /**
         * Sets the value of the идЗап property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setИдЗап(BigInteger value) {
            this.идЗап = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ДатаЗап" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
         *       &lt;attribute name="ИдЗап">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *             &lt;totalDigits value="17"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Серия">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="2"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Номер">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="9"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class СвСвид {

            @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0417\u0430\u043f")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаЗап;
            @XmlAttribute(name = "\u0413\u0420\u041d\u0418\u041f")
            protected String грнип;
            @XmlAttribute(name = "\u0418\u0434\u0417\u0430\u043f")
            protected BigInteger идЗап;
            @XmlAttribute(name = "\u0421\u0435\u0440\u0438\u044f")
            protected String серия;
            @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440")
            protected String номер;

            /**
             * Gets the value of the датаЗап property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getДатаЗап() {
                return датаЗап;
            }

            /**
             * Sets the value of the датаЗап property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setДатаЗап(XMLGregorianCalendar value) {
                this.датаЗап = value;
            }

            /**
             * Gets the value of the грнип property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getГРНИП() {
                return грнип;
            }

            /**
             * Sets the value of the грнип property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setГРНИП(String value) {
                this.грнип = value;
            }

            /**
             * Gets the value of the идЗап property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getИдЗап() {
                return идЗап;
            }

            /**
             * Sets the value of the идЗап property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setИдЗап(BigInteger value) {
                this.идЗап = value;
            }

            /**
             * Gets the value of the серия property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getСерия() {
                return серия;
            }

            /**
             * Sets the value of the серия property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setСерия(String value) {
                this.серия = value;
            }

            /**
             * Gets the value of the номер property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНомер() {
                return номер;
            }

            /**
             * Sets the value of the номер property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНомер(String value) {
                this.номер = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
     *       &lt;attribute name="ПрОснДоп">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;length value="1"/>
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="КодОКВЭД" type="{http://company1c.com/orgregister/entrepreneur}ОКВЭДТип" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class СвОКВЭД {

        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d\u0418\u041f")
        protected String грнип;
        @XmlAttribute(name = "\u041f\u0440\u041e\u0441\u043d\u0414\u043e\u043f")
        protected String прОснДоп;
        @XmlAttribute(name = "\u041a\u043e\u0434\u041e\u041a\u0412\u042d\u0414")
        protected String кодОКВЭД;

        /**
         * Gets the value of the датаНачДейств property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаНачДейств() {
            return датаНачДейств;
        }

        /**
         * Sets the value of the датаНачДейств property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаНачДейств(XMLGregorianCalendar value) {
            this.датаНачДейств = value;
        }

        /**
         * Gets the value of the грнип property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРНИП() {
            return грнип;
        }

        /**
         * Sets the value of the грнип property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРНИП(String value) {
            this.грнип = value;
        }

        /**
         * Gets the value of the прОснДоп property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getПрОснДоп() {
            return прОснДоп;
        }

        /**
         * Sets the value of the прОснДоп property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setПрОснДоп(String value) {
            this.прОснДоп = value;
        }

        /**
         * Gets the value of the кодОКВЭД property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getКодОКВЭД() {
            return кодОКВЭД;
        }

        /**
         * Sets the value of the кодОКВЭД property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setКодОКВЭД(String value) {
            this.кодОКВЭД = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
     *       &lt;attribute name="ДатаРег" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="РегНом">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="255"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="НаимРО">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="5"/>
     *             &lt;maxLength value="255"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class СвРегИП {

        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d\u0418\u041f")
        protected String грнип;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0433")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаРег;
        @XmlAttribute(name = "\u0420\u0435\u0433\u041d\u043e\u043c")
        protected String регНом;
        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0420\u041e")
        protected String наимРО;

        /**
         * Gets the value of the датаНачДейств property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаНачДейств() {
            return датаНачДейств;
        }

        /**
         * Sets the value of the датаНачДейств property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаНачДейств(XMLGregorianCalendar value) {
            this.датаНачДейств = value;
        }

        /**
         * Gets the value of the грнип property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРНИП() {
            return грнип;
        }

        /**
         * Sets the value of the грнип property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРНИП(String value) {
            this.грнип = value;
        }

        /**
         * Gets the value of the датаРег property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаРег() {
            return датаРег;
        }

        /**
         * Sets the value of the датаРег property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаРег(XMLGregorianCalendar value) {
            this.датаРег = value;
        }

        /**
         * Gets the value of the регНом property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getРегНом() {
            return регНом;
        }

        /**
         * Sets the value of the регНом property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setРегНом(String value) {
            this.регНом = value;
        }

        /**
         * Gets the value of the наимРО property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getНаимРО() {
            return наимРО;
        }

        /**
         * Sets the value of the наимРО property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setНаимРО(String value) {
            this.наимРО = value;
        }

    }


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
     *         &lt;element name="СвОргПФ" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="КодПФ">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="3"/>
     *                       &lt;maxLength value="6"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="НаимПФ">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="10"/>
     *                       &lt;maxLength value="255"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
     *       &lt;attribute name="РегНомПФ">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="15"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ДатаРег" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0441\u0432\u041e\u0440\u0433\u041f\u0424"
    })
    public static class СвРегПФ {

        @XmlElement(name = "\u0421\u0432\u041e\u0440\u0433\u041f\u0424")
        protected РеквизитыИП.СвРегПФ.СвОргПФ свОргПФ;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d\u0418\u041f")
        protected String грнип;
        @XmlAttribute(name = "\u0420\u0435\u0433\u041d\u043e\u043c\u041f\u0424")
        protected String регНомПФ;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0433")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаРег;

        /**
         * Gets the value of the свОргПФ property.
         * 
         * @return
         *     possible object is
         *     {@link РеквизитыИП.СвРегПФ.СвОргПФ }
         *     
         */
        public РеквизитыИП.СвРегПФ.СвОргПФ getСвОргПФ() {
            return свОргПФ;
        }

        /**
         * Sets the value of the свОргПФ property.
         * 
         * @param value
         *     allowed object is
         *     {@link РеквизитыИП.СвРегПФ.СвОргПФ }
         *     
         */
        public void setСвОргПФ(РеквизитыИП.СвРегПФ.СвОргПФ value) {
            this.свОргПФ = value;
        }

        /**
         * Gets the value of the датаНачДейств property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаНачДейств() {
            return датаНачДейств;
        }

        /**
         * Sets the value of the датаНачДейств property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаНачДейств(XMLGregorianCalendar value) {
            this.датаНачДейств = value;
        }

        /**
         * Gets the value of the грнип property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРНИП() {
            return грнип;
        }

        /**
         * Sets the value of the грнип property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРНИП(String value) {
            this.грнип = value;
        }

        /**
         * Gets the value of the регНомПФ property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getРегНомПФ() {
            return регНомПФ;
        }

        /**
         * Sets the value of the регНомПФ property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setРегНомПФ(String value) {
            this.регНомПФ = value;
        }

        /**
         * Gets the value of the датаРег property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаРег() {
            return датаРег;
        }

        /**
         * Sets the value of the датаРег property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаРег(XMLGregorianCalendar value) {
            this.датаРег = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="КодПФ">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="3"/>
         *             &lt;maxLength value="6"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НаимПФ">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="10"/>
         *             &lt;maxLength value="255"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class СвОргПФ {

            @XmlAttribute(name = "\u041a\u043e\u0434\u041f\u0424")
            protected String кодПФ;
            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041f\u0424")
            protected String наимПФ;

            /**
             * Gets the value of the кодПФ property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодПФ() {
                return кодПФ;
            }

            /**
             * Sets the value of the кодПФ property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодПФ(String value) {
                this.кодПФ = value;
            }

            /**
             * Gets the value of the наимПФ property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНаимПФ() {
                return наимПФ;
            }

            /**
             * Sets the value of the наимПФ property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНаимПФ(String value) {
                this.наимПФ = value;
            }

        }

    }


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
     *         &lt;element name="СвОргФСС" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="КодФСС">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="4"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="НаимФСС">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="10"/>
     *                       &lt;maxLength value="255"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
     *       &lt;attribute name="РегНомФСС">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="15"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ДатаРег" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0441\u0432\u041e\u0440\u0433\u0424\u0421\u0421"
    })
    public static class СвРегФСС {

        @XmlElement(name = "\u0421\u0432\u041e\u0440\u0433\u0424\u0421\u0421")
        protected РеквизитыИП.СвРегФСС.СвОргФСС свОргФСС;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d\u0418\u041f")
        protected String грнип;
        @XmlAttribute(name = "\u0420\u0435\u0433\u041d\u043e\u043c\u0424\u0421\u0421")
        protected String регНомФСС;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u0435\u0433")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаРег;

        /**
         * Gets the value of the свОргФСС property.
         * 
         * @return
         *     possible object is
         *     {@link РеквизитыИП.СвРегФСС.СвОргФСС }
         *     
         */
        public РеквизитыИП.СвРегФСС.СвОргФСС getСвОргФСС() {
            return свОргФСС;
        }

        /**
         * Sets the value of the свОргФСС property.
         * 
         * @param value
         *     allowed object is
         *     {@link РеквизитыИП.СвРегФСС.СвОргФСС }
         *     
         */
        public void setСвОргФСС(РеквизитыИП.СвРегФСС.СвОргФСС value) {
            this.свОргФСС = value;
        }

        /**
         * Gets the value of the датаНачДейств property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаНачДейств() {
            return датаНачДейств;
        }

        /**
         * Sets the value of the датаНачДейств property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаНачДейств(XMLGregorianCalendar value) {
            this.датаНачДейств = value;
        }

        /**
         * Gets the value of the грнип property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРНИП() {
            return грнип;
        }

        /**
         * Sets the value of the грнип property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРНИП(String value) {
            this.грнип = value;
        }

        /**
         * Gets the value of the регНомФСС property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getРегНомФСС() {
            return регНомФСС;
        }

        /**
         * Sets the value of the регНомФСС property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setРегНомФСС(String value) {
            this.регНомФСС = value;
        }

        /**
         * Gets the value of the датаРег property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаРег() {
            return датаРег;
        }

        /**
         * Sets the value of the датаРег property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаРег(XMLGregorianCalendar value) {
            this.датаРег = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="КодФСС">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="4"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НаимФСС">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="10"/>
         *             &lt;maxLength value="255"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class СвОргФСС {

            @XmlAttribute(name = "\u041a\u043e\u0434\u0424\u0421\u0421")
            protected String кодФСС;
            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0424\u0421\u0421")
            protected String наимФСС;

            /**
             * Gets the value of the кодФСС property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодФСС() {
                return кодФСС;
            }

            /**
             * Sets the value of the кодФСС property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодФСС(String value) {
                this.кодФСС = value;
            }

            /**
             * Gets the value of the наимФСС property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНаимФСС() {
                return наимФСС;
            }

            /**
             * Sets the value of the наимФСС property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНаимФСС(String value) {
                this.наимФСС = value;
            }

        }

    }


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
     *         &lt;element name="СвСтатус" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="КодСтатус">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="3"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="НаимСтатус">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="5"/>
     *                       &lt;maxLength value="500"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="ДатаПрекрИП" type="{http://www.w3.org/2001/XMLSchema}date" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="СвРегОрг" type="{http://company1c.com/orgregister/entrepreneur}СвРегОргТип" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0441\u0432\u0421\u0442\u0430\u0442\u0443\u0441",
        "\u0441\u0432\u0420\u0435\u0433\u041e\u0440\u0433"
    })
    public static class СвСтатусРО {

        @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441")
        protected РеквизитыИП.СвСтатусРО.СвСтатус свСтатус;
        @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041e\u0440\u0433")
        protected СвРегОргТип свРегОрг;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d\u0418\u041f")
        protected String грнип;

        /**
         * Gets the value of the свСтатус property.
         * 
         * @return
         *     possible object is
         *     {@link РеквизитыИП.СвСтатусРО.СвСтатус }
         *     
         */
        public РеквизитыИП.СвСтатусРО.СвСтатус getСвСтатус() {
            return свСтатус;
        }

        /**
         * Sets the value of the свСтатус property.
         * 
         * @param value
         *     allowed object is
         *     {@link РеквизитыИП.СвСтатусРО.СвСтатус }
         *     
         */
        public void setСвСтатус(РеквизитыИП.СвСтатусРО.СвСтатус value) {
            this.свСтатус = value;
        }

        /**
         * Gets the value of the свРегОрг property.
         * 
         * @return
         *     possible object is
         *     {@link СвРегОргТип }
         *     
         */
        public СвРегОргТип getСвРегОрг() {
            return свРегОрг;
        }

        /**
         * Sets the value of the свРегОрг property.
         * 
         * @param value
         *     allowed object is
         *     {@link СвРегОргТип }
         *     
         */
        public void setСвРегОрг(СвРегОргТип value) {
            this.свРегОрг = value;
        }

        /**
         * Gets the value of the датаНачДейств property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаНачДейств() {
            return датаНачДейств;
        }

        /**
         * Sets the value of the датаНачДейств property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаНачДейств(XMLGregorianCalendar value) {
            this.датаНачДейств = value;
        }

        /**
         * Gets the value of the грнип property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРНИП() {
            return грнип;
        }

        /**
         * Sets the value of the грнип property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРНИП(String value) {
            this.грнип = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="КодСтатус">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="3"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НаимСтатус">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="5"/>
         *             &lt;maxLength value="500"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="ДатаПрекрИП" type="{http://www.w3.org/2001/XMLSchema}date" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class СвСтатус {

            @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u0442\u0430\u0442\u0443\u0441")
            protected String кодСтатус;
            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0430\u0442\u0443\u0441")
            protected String наимСтатус;
            @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u0440\u0435\u043a\u0440\u0418\u041f")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаПрекрИП;

            /**
             * Gets the value of the кодСтатус property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодСтатус() {
                return кодСтатус;
            }

            /**
             * Sets the value of the кодСтатус property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодСтатус(String value) {
                this.кодСтатус = value;
            }

            /**
             * Gets the value of the наимСтатус property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНаимСтатус() {
                return наимСтатус;
            }

            /**
             * Sets the value of the наимСтатус property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНаимСтатус(String value) {
                this.наимСтатус = value;
            }

            /**
             * Gets the value of the датаПрекрИП property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getДатаПрекрИП() {
                return датаПрекрИП;
            }

            /**
             * Sets the value of the датаПрекрИП property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setДатаПрекрИП(XMLGregorianCalendar value) {
                this.датаПрекрИП = value;
            }

        }

    }


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
     *         &lt;element name="СвНО" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="КодНО" type="{http://company1c.com/orgregister/entrepreneur}СОНОТип" />
     *                 &lt;attribute name="НаимНО">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="10"/>
     *                       &lt;maxLength value="250"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
     *       &lt;attribute name="ДатаПостУч" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0441\u0432\u041d\u041e"
    })
    public static class СвУчетНО {

        @XmlElement(name = "\u0421\u0432\u041d\u041e")
        protected РеквизитыИП.СвУчетНО.СвНО свНО;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d\u0418\u041f")
        protected String грнип;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u043e\u0441\u0442\u0423\u0447")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаПостУч;

        /**
         * Gets the value of the свНО property.
         * 
         * @return
         *     possible object is
         *     {@link РеквизитыИП.СвУчетНО.СвНО }
         *     
         */
        public РеквизитыИП.СвУчетНО.СвНО getСвНО() {
            return свНО;
        }

        /**
         * Sets the value of the свНО property.
         * 
         * @param value
         *     allowed object is
         *     {@link РеквизитыИП.СвУчетНО.СвНО }
         *     
         */
        public void setСвНО(РеквизитыИП.СвУчетНО.СвНО value) {
            this.свНО = value;
        }

        /**
         * Gets the value of the датаНачДейств property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаНачДейств() {
            return датаНачДейств;
        }

        /**
         * Sets the value of the датаНачДейств property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаНачДейств(XMLGregorianCalendar value) {
            this.датаНачДейств = value;
        }

        /**
         * Gets the value of the грнип property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРНИП() {
            return грнип;
        }

        /**
         * Sets the value of the грнип property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРНИП(String value) {
            this.грнип = value;
        }

        /**
         * Gets the value of the датаПостУч property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаПостУч() {
            return датаПостУч;
        }

        /**
         * Sets the value of the датаПостУч property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаПостУч(XMLGregorianCalendar value) {
            this.датаПостУч = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="КодНО" type="{http://company1c.com/orgregister/entrepreneur}СОНОТип" />
         *       &lt;attribute name="НаимНО">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="10"/>
         *             &lt;maxLength value="250"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class СвНО {

            @XmlAttribute(name = "\u041a\u043e\u0434\u041d\u041e")
            protected String кодНО;
            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041d\u041e")
            protected String наимНО;

            /**
             * Gets the value of the кодНО property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодНО() {
                return кодНО;
            }

            /**
             * Sets the value of the кодНО property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодНО(String value) {
                this.кодНО = value;
            }

            /**
             * Gets the value of the наимНО property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНаимНО() {
                return наимНО;
            }

            /**
             * Sets the value of the наимНО property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНаимНО(String value) {
                this.наимНО = value;
            }

        }

    }


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
     *         &lt;element name="ФИОРус" type="{http://company1c.com/orgregister/entrepreneur}ФИОТип" minOccurs="0"/>
     *         &lt;element name="ФИОЛат" type="{http://company1c.com/orgregister/entrepreneur}ФИОТип" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ГРНИП" type="{http://company1c.com/orgregister/entrepreneur}ОГРНИПТип" />
     *       &lt;attribute name="Пол">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;length value="1"/>
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0444\u0438\u043e\u0420\u0443\u0441",
        "\u0444\u0438\u043e\u041b\u0430\u0442"
    })
    public static class СвФЛ {

        @XmlElement(name = "\u0424\u0418\u041e\u0420\u0443\u0441")
        protected ФИОТип фиоРус;
        @XmlElement(name = "\u0424\u0418\u041e\u041b\u0430\u0442")
        protected ФИОТип фиоЛат;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d\u0418\u041f")
        protected String грнип;
        @XmlAttribute(name = "\u041f\u043e\u043b")
        protected String пол;

        /**
         * Gets the value of the фиоРус property.
         * 
         * @return
         *     possible object is
         *     {@link ФИОТип }
         *     
         */
        public ФИОТип getФИОРус() {
            return фиоРус;
        }

        /**
         * Sets the value of the фиоРус property.
         * 
         * @param value
         *     allowed object is
         *     {@link ФИОТип }
         *     
         */
        public void setФИОРус(ФИОТип value) {
            this.фиоРус = value;
        }

        /**
         * Gets the value of the фиоЛат property.
         * 
         * @return
         *     possible object is
         *     {@link ФИОТип }
         *     
         */
        public ФИОТип getФИОЛат() {
            return фиоЛат;
        }

        /**
         * Sets the value of the фиоЛат property.
         * 
         * @param value
         *     allowed object is
         *     {@link ФИОТип }
         *     
         */
        public void setФИОЛат(ФИОТип value) {
            this.фиоЛат = value;
        }

        /**
         * Gets the value of the датаНачДейств property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаНачДейств() {
            return датаНачДейств;
        }

        /**
         * Sets the value of the датаНачДейств property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаНачДейств(XMLGregorianCalendar value) {
            this.датаНачДейств = value;
        }

        /**
         * Gets the value of the грнип property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРНИП() {
            return грнип;
        }

        /**
         * Sets the value of the грнип property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРНИП(String value) {
            this.грнип = value;
        }

        /**
         * Gets the value of the пол property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getПол() {
            return пол;
        }

        /**
         * Sets the value of the пол property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setПол(String value) {
            this.пол = value;
        }

    }

}
