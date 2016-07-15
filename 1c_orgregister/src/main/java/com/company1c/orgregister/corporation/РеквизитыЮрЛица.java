
package com.company1c.orgregister.corporation;

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
 *         &lt;element name="СвНаимЮЛ" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ОПФ" type="{http://company1c.com/orgregister/corporation}ОПФВыпТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ДатаОбрЮЛ" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ДатаПрекрЮЛ" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *                 &lt;attribute name="НаимЮЛПолн">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="1000"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимЮЛСокр">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="500"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="НаимЮЛФирм">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;minLength value="1"/>
 *                       &lt;maxLength value="1000"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СвАдрес" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Адрес" type="{http://company1c.com/orgregister/corporation}Адрес" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *                 &lt;attribute name="ПризнОтсутАдресЮЛ">
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
 *         &lt;element name="СвУправлДеят" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="СведДолжнФЛ" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип"/>
 *                             &lt;element name="СвДискв" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *                                     &lt;attribute name="СрокДискв">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                           &lt;maxInclusive value="60"/>
 *                                           &lt;totalDigits value="2"/>
 *                                           &lt;minInclusive value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="ДатаНачДискв" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="ДатаОкончДискв" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *                           &lt;attribute name="ВидДолжн">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="2"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимВидДолжн">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="5"/>
 *                                 &lt;maxLength value="100"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимДолжн">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;maxLength value="255"/>
 *                                 &lt;minLength value="1"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННФЛТип" />
 *                           &lt;attribute name="ОГРНИП" type="{http://company1c.com/orgregister/corporation}ОГРНИПТип" />
 *                           &lt;attribute name="НомТел">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="1"/>
 *                                 &lt;maxLength value="20"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice>
 *                     &lt;element name="УпрОргРос" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                             &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *                             &lt;attribute name="ОГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *                             &lt;attribute name="ИНН" type="{http://company1c.com/orgregister/corporation}ИННЮЛТип" />
 *                             &lt;attribute name="НаимЮЛПолн">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="УпрОргИн" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="СвРегИн" type="{http://company1c.com/orgregister/corporation}СвРегИнТип" minOccurs="0"/>
 *                               &lt;element name="АдрМНРФ" type="{http://company1c.com/orgregister/corporation}Адрес" minOccurs="0"/>
 *                               &lt;element name="ПредИнЮЛ" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННФЛТип" />
 *                                       &lt;attribute name="НомТел">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="20"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                             &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *                             &lt;attribute name="ИНН" type="{http://company1c.com/orgregister/corporation}ИННЮЛТип" />
 *                             &lt;attribute name="НаимЮЛПолн">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="НаимПредЮЛ">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="НомТел">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
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
 *                           &lt;attribute name="КодНО" type="{http://company1c.com/orgregister/corporation}СОНОТип" />
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
 *                 &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *                 &lt;attribute name="ИНН" type="{http://company1c.com/orgregister/corporation}ИННЮЛТип" />
 *                 &lt;attribute name="КПП" type="{http://company1c.com/orgregister/corporation}КППТип" />
 *                 &lt;attribute name="ДатаПостУч" type="{http://www.w3.org/2001/XMLSchema}date" />
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
 *                           &lt;attribute name="КодСтатусЮЛ">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;length value="3"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="НаимСтатусЮЛ">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;minLength value="5"/>
 *                                 &lt;maxLength value="500"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="СвРегОрг" type="{http://company1c.com/orgregister/corporation}СвРегОргТип" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
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
 *                 &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
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
 *                                 &lt;length value="4"/>
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
 *                 &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
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
 *                 &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *                 &lt;attribute name="ПрОснДоп">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="1"/>
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="КодОКВЭД" type="{http://company1c.com/orgregister/corporation}ОКВЭДТип" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ОГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="ИНН" type="{http://company1c.com/orgregister/corporation}ИННЮЛТип" />
 *       &lt;attribute name="КПП" type="{http://company1c.com/orgregister/corporation}КППТип" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "\u0441\u0432\u041d\u0430\u0438\u043c\u042e\u041b",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441",
    "\u0441\u0432\u0423\u043f\u0440\u0430\u0432\u043b\u0414\u0435\u044f\u0442",
    "\u0441\u0432\u0423\u0447\u0435\u0442\u041d\u041e",
    "\u0441\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u0420\u041e",
    "\u0441\u0432\u0420\u0435\u0433\u041f\u0424",
    "\u0441\u0432\u0420\u0435\u0433\u0424\u0421\u0421",
    "\u0441\u0432\u041e\u041a\u0412\u042d\u0414"
})
@XmlRootElement(name = "\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u042e\u0440\u041b\u0438\u0446\u0430")
public class РеквизитыЮрЛица {

    @XmlElement(name = "\u0421\u0432\u041d\u0430\u0438\u043c\u042e\u041b")
    protected РеквизитыЮрЛица.СвНаимЮЛ свНаимЮЛ;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441")
    protected РеквизитыЮрЛица.СвАдрес свАдрес;
    @XmlElement(name = "\u0421\u0432\u0423\u043f\u0440\u0430\u0432\u043b\u0414\u0435\u044f\u0442")
    protected РеквизитыЮрЛица.СвУправлДеят свУправлДеят;
    @XmlElement(name = "\u0421\u0432\u0423\u0447\u0435\u0442\u041d\u041e")
    protected РеквизитыЮрЛица.СвУчетНО свУчетНО;
    @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441_\u0420\u041e")
    protected РеквизитыЮрЛица.СвСтатусРО свСтатусРО;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041f\u0424")
    protected РеквизитыЮрЛица.СвРегПФ свРегПФ;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0424\u0421\u0421")
    protected РеквизитыЮрЛица.СвРегФСС свРегФСС;
    @XmlElement(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414")
    protected List<РеквизитыЮрЛица.СвОКВЭД> свОКВЭД;
    @XmlAttribute(name = "\u041e\u0413\u0420\u041d")
    protected String огрн;
    @XmlAttribute(name = "\u0418\u041d\u041d")
    protected String инн;
    @XmlAttribute(name = "\u041a\u041f\u041f")
    protected String кпп;

    /**
     * Gets the value of the свНаимЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыЮрЛица.СвНаимЮЛ }
     *     
     */
    public РеквизитыЮрЛица.СвНаимЮЛ getСвНаимЮЛ() {
        return свНаимЮЛ;
    }

    /**
     * Sets the value of the свНаимЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыЮрЛица.СвНаимЮЛ }
     *     
     */
    public void setСвНаимЮЛ(РеквизитыЮрЛица.СвНаимЮЛ value) {
        this.свНаимЮЛ = value;
    }

    /**
     * Gets the value of the свАдрес property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыЮрЛица.СвАдрес }
     *     
     */
    public РеквизитыЮрЛица.СвАдрес getСвАдрес() {
        return свАдрес;
    }

    /**
     * Sets the value of the свАдрес property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыЮрЛица.СвАдрес }
     *     
     */
    public void setСвАдрес(РеквизитыЮрЛица.СвАдрес value) {
        this.свАдрес = value;
    }

    /**
     * Gets the value of the свУправлДеят property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыЮрЛица.СвУправлДеят }
     *     
     */
    public РеквизитыЮрЛица.СвУправлДеят getСвУправлДеят() {
        return свУправлДеят;
    }

    /**
     * Sets the value of the свУправлДеят property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыЮрЛица.СвУправлДеят }
     *     
     */
    public void setСвУправлДеят(РеквизитыЮрЛица.СвУправлДеят value) {
        this.свУправлДеят = value;
    }

    /**
     * Gets the value of the свУчетНО property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыЮрЛица.СвУчетНО }
     *     
     */
    public РеквизитыЮрЛица.СвУчетНО getСвУчетНО() {
        return свУчетНО;
    }

    /**
     * Sets the value of the свУчетНО property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыЮрЛица.СвУчетНО }
     *     
     */
    public void setСвУчетНО(РеквизитыЮрЛица.СвУчетНО value) {
        this.свУчетНО = value;
    }

    /**
     * Gets the value of the свСтатусРО property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыЮрЛица.СвСтатусРО }
     *     
     */
    public РеквизитыЮрЛица.СвСтатусРО getСвСтатусРО() {
        return свСтатусРО;
    }

    /**
     * Sets the value of the свСтатусРО property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыЮрЛица.СвСтатусРО }
     *     
     */
    public void setСвСтатусРО(РеквизитыЮрЛица.СвСтатусРО value) {
        this.свСтатусРО = value;
    }

    /**
     * Gets the value of the свРегПФ property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыЮрЛица.СвРегПФ }
     *     
     */
    public РеквизитыЮрЛица.СвРегПФ getСвРегПФ() {
        return свРегПФ;
    }

    /**
     * Sets the value of the свРегПФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыЮрЛица.СвРегПФ }
     *     
     */
    public void setСвРегПФ(РеквизитыЮрЛица.СвРегПФ value) {
        this.свРегПФ = value;
    }

    /**
     * Gets the value of the свРегФСС property.
     * 
     * @return
     *     possible object is
     *     {@link РеквизитыЮрЛица.СвРегФСС }
     *     
     */
    public РеквизитыЮрЛица.СвРегФСС getСвРегФСС() {
        return свРегФСС;
    }

    /**
     * Sets the value of the свРегФСС property.
     * 
     * @param value
     *     allowed object is
     *     {@link РеквизитыЮрЛица.СвРегФСС }
     *     
     */
    public void setСвРегФСС(РеквизитыЮрЛица.СвРегФСС value) {
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
     * {@link РеквизитыЮрЛица.СвОКВЭД }
     * 
     * 
     */
    public List<РеквизитыЮрЛица.СвОКВЭД> getСвОКВЭД() {
        if (свОКВЭД == null) {
            свОКВЭД = new ArrayList<РеквизитыЮрЛица.СвОКВЭД>();
        }
        return this.свОКВЭД;
    }

    /**
     * Gets the value of the огрн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getОГРН() {
        return огрн;
    }

    /**
     * Sets the value of the огрн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setОГРН(String value) {
        this.огрн = value;
    }

    /**
     * Gets the value of the инн property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИНН() {
        return инн;
    }

    /**
     * Sets the value of the инн property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИНН(String value) {
        this.инн = value;
    }

    /**
     * Gets the value of the кпп property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getКПП() {
        return кпп;
    }

    /**
     * Sets the value of the кпп property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setКПП(String value) {
        this.кпп = value;
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
     *         &lt;element name="Адрес" type="{http://company1c.com/orgregister/corporation}Адрес" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
     *       &lt;attribute name="ПризнОтсутАдресЮЛ">
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
        "\u0430\u0434\u0440\u0435\u0441"
    })
    public static class СвАдрес {

        @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441")
        protected Адрес адрес;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d")
        protected String грн;
        @XmlAttribute(name = "\u041f\u0440\u0438\u0437\u043d\u041e\u0442\u0441\u0443\u0442\u0410\u0434\u0440\u0435\u0441\u042e\u041b")
        protected String признОтсутАдресЮЛ;

        /**
         * Gets the value of the адрес property.
         * 
         * @return
         *     possible object is
         *     {@link Адрес }
         *     
         */
        public Адрес getАдрес() {
            return адрес;
        }

        /**
         * Sets the value of the адрес property.
         * 
         * @param value
         *     allowed object is
         *     {@link Адрес }
         *     
         */
        public void setАдрес(Адрес value) {
            this.адрес = value;
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
         * Gets the value of the грн property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРН() {
            return грн;
        }

        /**
         * Sets the value of the грн property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРН(String value) {
            this.грн = value;
        }

        /**
         * Gets the value of the признОтсутАдресЮЛ property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getПризнОтсутАдресЮЛ() {
            return признОтсутАдресЮЛ;
        }

        /**
         * Sets the value of the признОтсутАдресЮЛ property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setПризнОтсутАдресЮЛ(String value) {
            this.признОтсутАдресЮЛ = value;
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
     *         &lt;element name="ОПФ" type="{http://company1c.com/orgregister/corporation}ОПФВыпТип" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ДатаОбрЮЛ" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ДатаПрекрЮЛ" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
     *       &lt;attribute name="НаимЮЛПолн">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="1000"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="НаимЮЛСокр">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="500"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="НаимЮЛФирм">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;minLength value="1"/>
     *             &lt;maxLength value="1000"/>
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
        "\u043e\u043f\u0444"
    })
    public static class СвНаимЮЛ {

        @XmlElement(name = "\u041e\u041f\u0424")
        protected ОПФВыпТип опф;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041e\u0431\u0440\u042e\u041b")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаОбрЮЛ;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u0440\u0435\u043a\u0440\u042e\u041b")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаПрекрЮЛ;
        @XmlAttribute(name = "\u0413\u0420\u041d")
        protected String грн;
        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u042e\u041b\u041f\u043e\u043b\u043d")
        protected String наимЮЛПолн;
        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u042e\u041b\u0421\u043e\u043a\u0440")
        protected String наимЮЛСокр;
        @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u042e\u041b\u0424\u0438\u0440\u043c")
        protected String наимЮЛФирм;

        /**
         * Gets the value of the опф property.
         * 
         * @return
         *     possible object is
         *     {@link ОПФВыпТип }
         *     
         */
        public ОПФВыпТип getОПФ() {
            return опф;
        }

        /**
         * Sets the value of the опф property.
         * 
         * @param value
         *     allowed object is
         *     {@link ОПФВыпТип }
         *     
         */
        public void setОПФ(ОПФВыпТип value) {
            this.опф = value;
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
         * Gets the value of the датаОбрЮЛ property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаОбрЮЛ() {
            return датаОбрЮЛ;
        }

        /**
         * Sets the value of the датаОбрЮЛ property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаОбрЮЛ(XMLGregorianCalendar value) {
            this.датаОбрЮЛ = value;
        }

        /**
         * Gets the value of the датаПрекрЮЛ property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getДатаПрекрЮЛ() {
            return датаПрекрЮЛ;
        }

        /**
         * Sets the value of the датаПрекрЮЛ property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setДатаПрекрЮЛ(XMLGregorianCalendar value) {
            this.датаПрекрЮЛ = value;
        }

        /**
         * Gets the value of the грн property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРН() {
            return грн;
        }

        /**
         * Sets the value of the грн property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРН(String value) {
            this.грн = value;
        }

        /**
         * Gets the value of the наимЮЛПолн property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getНаимЮЛПолн() {
            return наимЮЛПолн;
        }

        /**
         * Sets the value of the наимЮЛПолн property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setНаимЮЛПолн(String value) {
            this.наимЮЛПолн = value;
        }

        /**
         * Gets the value of the наимЮЛСокр property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getНаимЮЛСокр() {
            return наимЮЛСокр;
        }

        /**
         * Sets the value of the наимЮЛСокр property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setНаимЮЛСокр(String value) {
            this.наимЮЛСокр = value;
        }

        /**
         * Gets the value of the наимЮЛФирм property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getНаимЮЛФирм() {
            return наимЮЛФирм;
        }

        /**
         * Sets the value of the наимЮЛФирм property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setНаимЮЛФирм(String value) {
            this.наимЮЛФирм = value;
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
     *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
     *       &lt;attribute name="ПрОснДоп">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;length value="1"/>
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="КодОКВЭД" type="{http://company1c.com/orgregister/corporation}ОКВЭДТип" />
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
        @XmlAttribute(name = "\u0413\u0420\u041d")
        protected String грн;
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
         * Gets the value of the грн property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРН() {
            return грн;
        }

        /**
         * Sets the value of the грн property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРН(String value) {
            this.грн = value;
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
     *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
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
        protected РеквизитыЮрЛица.СвРегПФ.СвОргПФ свОргПФ;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d")
        protected String грн;
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
         *     {@link РеквизитыЮрЛица.СвРегПФ.СвОргПФ }
         *     
         */
        public РеквизитыЮрЛица.СвРегПФ.СвОргПФ getСвОргПФ() {
            return свОргПФ;
        }

        /**
         * Sets the value of the свОргПФ property.
         * 
         * @param value
         *     allowed object is
         *     {@link РеквизитыЮрЛица.СвРегПФ.СвОргПФ }
         *     
         */
        public void setСвОргПФ(РеквизитыЮрЛица.СвРегПФ.СвОргПФ value) {
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
         * Gets the value of the грн property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРН() {
            return грн;
        }

        /**
         * Sets the value of the грн property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРН(String value) {
            this.грн = value;
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
     *                       &lt;length value="4"/>
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
     *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
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
        protected РеквизитыЮрЛица.СвРегФСС.СвОргФСС свОргФСС;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d")
        protected String грн;
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
         *     {@link РеквизитыЮрЛица.СвРегФСС.СвОргФСС }
         *     
         */
        public РеквизитыЮрЛица.СвРегФСС.СвОргФСС getСвОргФСС() {
            return свОргФСС;
        }

        /**
         * Sets the value of the свОргФСС property.
         * 
         * @param value
         *     allowed object is
         *     {@link РеквизитыЮрЛица.СвРегФСС.СвОргФСС }
         *     
         */
        public void setСвОргФСС(РеквизитыЮрЛица.СвРегФСС.СвОргФСС value) {
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
         * Gets the value of the грн property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРН() {
            return грн;
        }

        /**
         * Sets the value of the грн property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРН(String value) {
            this.грн = value;
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
         *             &lt;length value="4"/>
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
     *                 &lt;attribute name="КодСтатусЮЛ">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="3"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="НаимСтатусЮЛ">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="5"/>
     *                       &lt;maxLength value="500"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="СвРегОрг" type="{http://company1c.com/orgregister/corporation}СвРегОргТип" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
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
        protected РеквизитыЮрЛица.СвСтатусРО.СвСтатус свСтатус;
        @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041e\u0440\u0433")
        protected СвРегОргТип свРегОрг;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d")
        protected String грн;

        /**
         * Gets the value of the свСтатус property.
         * 
         * @return
         *     possible object is
         *     {@link РеквизитыЮрЛица.СвСтатусРО.СвСтатус }
         *     
         */
        public РеквизитыЮрЛица.СвСтатусРО.СвСтатус getСвСтатус() {
            return свСтатус;
        }

        /**
         * Sets the value of the свСтатус property.
         * 
         * @param value
         *     allowed object is
         *     {@link РеквизитыЮрЛица.СвСтатусРО.СвСтатус }
         *     
         */
        public void setСвСтатус(РеквизитыЮрЛица.СвСтатусРО.СвСтатус value) {
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
         * Gets the value of the грн property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРН() {
            return грн;
        }

        /**
         * Sets the value of the грн property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРН(String value) {
            this.грн = value;
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
         *       &lt;attribute name="КодСтатусЮЛ">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="3"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НаимСтатусЮЛ">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="5"/>
         *             &lt;maxLength value="500"/>
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
        public static class СвСтатус {

            @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u0442\u0430\u0442\u0443\u0441\u042e\u041b")
            protected String кодСтатусЮЛ;
            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0421\u0442\u0430\u0442\u0443\u0441\u042e\u041b")
            protected String наимСтатусЮЛ;

            /**
             * Gets the value of the кодСтатусЮЛ property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодСтатусЮЛ() {
                return кодСтатусЮЛ;
            }

            /**
             * Sets the value of the кодСтатусЮЛ property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодСтатусЮЛ(String value) {
                this.кодСтатусЮЛ = value;
            }

            /**
             * Gets the value of the наимСтатусЮЛ property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНаимСтатусЮЛ() {
                return наимСтатусЮЛ;
            }

            /**
             * Sets the value of the наимСтатусЮЛ property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНаимСтатусЮЛ(String value) {
                this.наимСтатусЮЛ = value;
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
     *         &lt;element name="СведДолжнФЛ" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип"/>
     *                   &lt;element name="СвДискв" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                           &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
     *                           &lt;attribute name="СрокДискв">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                 &lt;maxInclusive value="60"/>
     *                                 &lt;totalDigits value="2"/>
     *                                 &lt;minInclusive value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="ДатаНачДискв" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                           &lt;attribute name="ДатаОкончДискв" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
     *                 &lt;attribute name="ВидДолжн">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;length value="2"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="НаимВидДолжн">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="5"/>
     *                       &lt;maxLength value="100"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="НаимДолжн">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;maxLength value="255"/>
     *                       &lt;minLength value="1"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННФЛТип" />
     *                 &lt;attribute name="ОГРНИП" type="{http://company1c.com/orgregister/corporation}ОГРНИПТип" />
     *                 &lt;attribute name="НомТел">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;minLength value="1"/>
     *                       &lt;maxLength value="20"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice>
     *           &lt;element name="УпрОргРос" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                   &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
     *                   &lt;attribute name="ОГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
     *                   &lt;attribute name="ИНН" type="{http://company1c.com/orgregister/corporation}ИННЮЛТип" />
     *                   &lt;attribute name="НаимЮЛПолн">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="УпрОргИн" minOccurs="0">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="СвРегИн" type="{http://company1c.com/orgregister/corporation}СвРегИнТип" minOccurs="0"/>
     *                     &lt;element name="АдрМНРФ" type="{http://company1c.com/orgregister/corporation}Адрес" minOccurs="0"/>
     *                     &lt;element name="ПредИнЮЛ" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип"/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННФЛТип" />
     *                             &lt;attribute name="НомТел">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="20"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/attribute>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                   &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                   &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
     *                   &lt;attribute name="ИНН" type="{http://company1c.com/orgregister/corporation}ИННЮЛТип" />
     *                   &lt;attribute name="НаимЮЛПолн">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="НаимПредЮЛ">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                   &lt;attribute name="НомТел">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0441\u0432\u0435\u0434\u0414\u043e\u043b\u0436\u043d\u0424\u041b",
        "\u0443\u043f\u0440\u041e\u0440\u0433\u0420\u043e\u0441",
        "\u0443\u043f\u0440\u041e\u0440\u0433\u0418\u043d"
    })
    public static class СвУправлДеят {

        @XmlElement(name = "\u0421\u0432\u0435\u0434\u0414\u043e\u043b\u0436\u043d\u0424\u041b")
        protected List<РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ> сведДолжнФЛ;
        @XmlElement(name = "\u0423\u043f\u0440\u041e\u0440\u0433\u0420\u043e\u0441")
        protected РеквизитыЮрЛица.СвУправлДеят.УпрОргРос упрОргРос;
        @XmlElement(name = "\u0423\u043f\u0440\u041e\u0440\u0433\u0418\u043d")
        protected РеквизитыЮрЛица.СвУправлДеят.УпрОргИн упрОргИн;

        /**
         * Gets the value of the сведДолжнФЛ property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the сведДолжнФЛ property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getСведДолжнФЛ().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ }
         * 
         * 
         */
        public List<РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ> getСведДолжнФЛ() {
            if (сведДолжнФЛ == null) {
                сведДолжнФЛ = new ArrayList<РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ>();
            }
            return this.сведДолжнФЛ;
        }

        /**
         * Gets the value of the упрОргРос property.
         * 
         * @return
         *     possible object is
         *     {@link РеквизитыЮрЛица.СвУправлДеят.УпрОргРос }
         *     
         */
        public РеквизитыЮрЛица.СвУправлДеят.УпрОргРос getУпрОргРос() {
            return упрОргРос;
        }

        /**
         * Sets the value of the упрОргРос property.
         * 
         * @param value
         *     allowed object is
         *     {@link РеквизитыЮрЛица.СвУправлДеят.УпрОргРос }
         *     
         */
        public void setУпрОргРос(РеквизитыЮрЛица.СвУправлДеят.УпрОргРос value) {
            this.упрОргРос = value;
        }

        /**
         * Gets the value of the упрОргИн property.
         * 
         * @return
         *     possible object is
         *     {@link РеквизитыЮрЛица.СвУправлДеят.УпрОргИн }
         *     
         */
        public РеквизитыЮрЛица.СвУправлДеят.УпрОргИн getУпрОргИн() {
            return упрОргИн;
        }

        /**
         * Sets the value of the упрОргИн property.
         * 
         * @param value
         *     allowed object is
         *     {@link РеквизитыЮрЛица.СвУправлДеят.УпрОргИн }
         *     
         */
        public void setУпрОргИн(РеквизитыЮрЛица.СвУправлДеят.УпрОргИн value) {
            this.упрОргИн = value;
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
         *         &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип"/>
         *         &lt;element name="СвДискв" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                 &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
         *                 &lt;attribute name="СрокДискв">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                       &lt;maxInclusive value="60"/>
         *                       &lt;totalDigits value="2"/>
         *                       &lt;minInclusive value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="ДатаНачДискв" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                 &lt;attribute name="ДатаОкончДискв" type="{http://www.w3.org/2001/XMLSchema}date" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
         *       &lt;attribute name="ВидДолжн">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;length value="2"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НаимВидДолжн">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="5"/>
         *             &lt;maxLength value="100"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НаимДолжн">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;maxLength value="255"/>
         *             &lt;minLength value="1"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННФЛТип" />
         *       &lt;attribute name="ОГРНИП" type="{http://company1c.com/orgregister/corporation}ОГРНИПТип" />
         *       &lt;attribute name="НомТел">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="20"/>
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
            "\u0444\u0438\u043e",
            "\u0441\u0432\u0414\u0438\u0441\u043a\u0432"
        })
        public static class СведДолжнФЛ {

            @XmlElement(name = "\u0424\u0418\u041e", required = true)
            protected ФИОТип фио;
            @XmlElement(name = "\u0421\u0432\u0414\u0438\u0441\u043a\u0432")
            protected List<РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ.СвДискв> свДискв;
            @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаНачДейств;
            @XmlAttribute(name = "\u0413\u0420\u041d")
            protected String грн;
            @XmlAttribute(name = "\u0412\u0438\u0434\u0414\u043e\u043b\u0436\u043d")
            protected String видДолжн;
            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0412\u0438\u0434\u0414\u043e\u043b\u0436\u043d")
            protected String наимВидДолжн;
            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u0414\u043e\u043b\u0436\u043d")
            protected String наимДолжн;
            @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b")
            protected String иннфл;
            @XmlAttribute(name = "\u041e\u0413\u0420\u041d\u0418\u041f")
            protected String огрнип;
            @XmlAttribute(name = "\u041d\u043e\u043c\u0422\u0435\u043b")
            protected String номТел;

            /**
             * Gets the value of the фио property.
             * 
             * @return
             *     possible object is
             *     {@link ФИОТип }
             *     
             */
            public ФИОТип getФИО() {
                return фио;
            }

            /**
             * Sets the value of the фио property.
             * 
             * @param value
             *     allowed object is
             *     {@link ФИОТип }
             *     
             */
            public void setФИО(ФИОТип value) {
                this.фио = value;
            }

            /**
             * Gets the value of the свДискв property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the свДискв property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getСвДискв().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ.СвДискв }
             * 
             * 
             */
            public List<РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ.СвДискв> getСвДискв() {
                if (свДискв == null) {
                    свДискв = new ArrayList<РеквизитыЮрЛица.СвУправлДеят.СведДолжнФЛ.СвДискв>();
                }
                return this.свДискв;
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
             * Gets the value of the грн property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getГРН() {
                return грн;
            }

            /**
             * Sets the value of the грн property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setГРН(String value) {
                this.грн = value;
            }

            /**
             * Gets the value of the видДолжн property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getВидДолжн() {
                return видДолжн;
            }

            /**
             * Sets the value of the видДолжн property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setВидДолжн(String value) {
                this.видДолжн = value;
            }

            /**
             * Gets the value of the наимВидДолжн property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНаимВидДолжн() {
                return наимВидДолжн;
            }

            /**
             * Sets the value of the наимВидДолжн property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНаимВидДолжн(String value) {
                this.наимВидДолжн = value;
            }

            /**
             * Gets the value of the наимДолжн property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНаимДолжн() {
                return наимДолжн;
            }

            /**
             * Sets the value of the наимДолжн property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНаимДолжн(String value) {
                this.наимДолжн = value;
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
             * Gets the value of the номТел property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНомТел() {
                return номТел;
            }

            /**
             * Sets the value of the номТел property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНомТел(String value) {
                this.номТел = value;
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
             *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
             *       &lt;attribute name="СрокДискв">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *             &lt;maxInclusive value="60"/>
             *             &lt;totalDigits value="2"/>
             *             &lt;minInclusive value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="ДатаНачДискв" type="{http://www.w3.org/2001/XMLSchema}date" />
             *       &lt;attribute name="ДатаОкончДискв" type="{http://www.w3.org/2001/XMLSchema}date" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class СвДискв {

                @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar датаНачДейств;
                @XmlAttribute(name = "\u0413\u0420\u041d")
                protected String грн;
                @XmlAttribute(name = "\u0421\u0440\u043e\u043a\u0414\u0438\u0441\u043a\u0432")
                protected Integer срокДискв;
                @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0438\u0441\u043a\u0432")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar датаНачДискв;
                @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041e\u043a\u043e\u043d\u0447\u0414\u0438\u0441\u043a\u0432")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar датаОкончДискв;

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
                 * Gets the value of the грн property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getГРН() {
                    return грн;
                }

                /**
                 * Sets the value of the грн property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setГРН(String value) {
                    this.грн = value;
                }

                /**
                 * Gets the value of the срокДискв property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getСрокДискв() {
                    return срокДискв;
                }

                /**
                 * Sets the value of the срокДискв property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setСрокДискв(Integer value) {
                    this.срокДискв = value;
                }

                /**
                 * Gets the value of the датаНачДискв property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getДатаНачДискв() {
                    return датаНачДискв;
                }

                /**
                 * Sets the value of the датаНачДискв property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setДатаНачДискв(XMLGregorianCalendar value) {
                    this.датаНачДискв = value;
                }

                /**
                 * Gets the value of the датаОкончДискв property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getДатаОкончДискв() {
                    return датаОкончДискв;
                }

                /**
                 * Sets the value of the датаОкончДискв property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setДатаОкончДискв(XMLGregorianCalendar value) {
                    this.датаОкончДискв = value;
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
         *         &lt;element name="СвРегИн" type="{http://company1c.com/orgregister/corporation}СвРегИнТип" minOccurs="0"/>
         *         &lt;element name="АдрМНРФ" type="{http://company1c.com/orgregister/corporation}Адрес" minOccurs="0"/>
         *         &lt;element name="ПредИнЮЛ" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННФЛТип" />
         *                 &lt;attribute name="НомТел">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="20"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ДатаНачДейств" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
         *       &lt;attribute name="ИНН" type="{http://company1c.com/orgregister/corporation}ИННЮЛТип" />
         *       &lt;attribute name="НаимЮЛПолн">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="1000"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НаимПредЮЛ">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="1000"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="НомТел">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="20"/>
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
            "\u0441\u0432\u0420\u0435\u0433\u0418\u043d",
            "\u0430\u0434\u0440\u041c\u041d\u0420\u0424",
            "\u043f\u0440\u0435\u0434\u0418\u043d\u042e\u041b"
        })
        public static class УпрОргИн {

            @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0418\u043d")
            protected СвРегИнТип свРегИн;
            @XmlElement(name = "\u0410\u0434\u0440\u041c\u041d\u0420\u0424")
            protected Адрес адрМНРФ;
            @XmlElement(name = "\u041f\u0440\u0435\u0434\u0418\u043d\u042e\u041b")
            protected РеквизитыЮрЛица.СвУправлДеят.УпрОргИн.ПредИнЮЛ предИнЮЛ;
            @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаНачДейств;
            @XmlAttribute(name = "\u0413\u0420\u041d")
            protected String грн;
            @XmlAttribute(name = "\u0418\u041d\u041d")
            protected String инн;
            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u042e\u041b\u041f\u043e\u043b\u043d")
            protected String наимЮЛПолн;
            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041f\u0440\u0435\u0434\u042e\u041b")
            protected String наимПредЮЛ;
            @XmlAttribute(name = "\u041d\u043e\u043c\u0422\u0435\u043b")
            protected String номТел;

            /**
             * Gets the value of the свРегИн property.
             * 
             * @return
             *     possible object is
             *     {@link СвРегИнТип }
             *     
             */
            public СвРегИнТип getСвРегИн() {
                return свРегИн;
            }

            /**
             * Sets the value of the свРегИн property.
             * 
             * @param value
             *     allowed object is
             *     {@link СвРегИнТип }
             *     
             */
            public void setСвРегИн(СвРегИнТип value) {
                this.свРегИн = value;
            }

            /**
             * Gets the value of the адрМНРФ property.
             * 
             * @return
             *     possible object is
             *     {@link Адрес }
             *     
             */
            public Адрес getАдрМНРФ() {
                return адрМНРФ;
            }

            /**
             * Sets the value of the адрМНРФ property.
             * 
             * @param value
             *     allowed object is
             *     {@link Адрес }
             *     
             */
            public void setАдрМНРФ(Адрес value) {
                this.адрМНРФ = value;
            }

            /**
             * Gets the value of the предИнЮЛ property.
             * 
             * @return
             *     possible object is
             *     {@link РеквизитыЮрЛица.СвУправлДеят.УпрОргИн.ПредИнЮЛ }
             *     
             */
            public РеквизитыЮрЛица.СвУправлДеят.УпрОргИн.ПредИнЮЛ getПредИнЮЛ() {
                return предИнЮЛ;
            }

            /**
             * Sets the value of the предИнЮЛ property.
             * 
             * @param value
             *     allowed object is
             *     {@link РеквизитыЮрЛица.СвУправлДеят.УпрОргИн.ПредИнЮЛ }
             *     
             */
            public void setПредИнЮЛ(РеквизитыЮрЛица.СвУправлДеят.УпрОргИн.ПредИнЮЛ value) {
                this.предИнЮЛ = value;
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
             * Gets the value of the грн property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getГРН() {
                return грн;
            }

            /**
             * Sets the value of the грн property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setГРН(String value) {
                this.грн = value;
            }

            /**
             * Gets the value of the инн property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getИНН() {
                return инн;
            }

            /**
             * Sets the value of the инн property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setИНН(String value) {
                this.инн = value;
            }

            /**
             * Gets the value of the наимЮЛПолн property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНаимЮЛПолн() {
                return наимЮЛПолн;
            }

            /**
             * Sets the value of the наимЮЛПолн property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНаимЮЛПолн(String value) {
                this.наимЮЛПолн = value;
            }

            /**
             * Gets the value of the наимПредЮЛ property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНаимПредЮЛ() {
                return наимПредЮЛ;
            }

            /**
             * Sets the value of the наимПредЮЛ property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНаимПредЮЛ(String value) {
                this.наимПредЮЛ = value;
            }

            /**
             * Gets the value of the номТел property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНомТел() {
                return номТел;
            }

            /**
             * Sets the value of the номТел property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНомТел(String value) {
                this.номТел = value;
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
             *         &lt;element name="ФИО" type="{http://company1c.com/orgregister/corporation}ФИОТип"/>
             *       &lt;/sequence>
             *       &lt;attribute name="ИННФЛ" type="{http://company1c.com/orgregister/corporation}ИННФЛТип" />
             *       &lt;attribute name="НомТел">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="20"/>
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
                "\u0444\u0438\u043e"
            })
            public static class ПредИнЮЛ {

                @XmlElement(name = "\u0424\u0418\u041e", required = true)
                protected ФИОТип фио;
                @XmlAttribute(name = "\u0418\u041d\u041d\u0424\u041b")
                protected String иннфл;
                @XmlAttribute(name = "\u041d\u043e\u043c\u0422\u0435\u043b")
                protected String номТел;

                /**
                 * Gets the value of the фио property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ФИОТип }
                 *     
                 */
                public ФИОТип getФИО() {
                    return фио;
                }

                /**
                 * Sets the value of the фио property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ФИОТип }
                 *     
                 */
                public void setФИО(ФИОТип value) {
                    this.фио = value;
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
                 * Gets the value of the номТел property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getНомТел() {
                    return номТел;
                }

                /**
                 * Sets the value of the номТел property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setНомТел(String value) {
                    this.номТел = value;
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
         *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
         *       &lt;attribute name="ОГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
         *       &lt;attribute name="ИНН" type="{http://company1c.com/orgregister/corporation}ИННЮЛТип" />
         *       &lt;attribute name="НаимЮЛПолн">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;minLength value="1"/>
         *             &lt;maxLength value="1000"/>
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
        public static class УпрОргРос {

            @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar датаНачДейств;
            @XmlAttribute(name = "\u0413\u0420\u041d")
            protected String грн;
            @XmlAttribute(name = "\u041e\u0413\u0420\u041d")
            protected String огрн;
            @XmlAttribute(name = "\u0418\u041d\u041d")
            protected String инн;
            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u042e\u041b\u041f\u043e\u043b\u043d")
            protected String наимЮЛПолн;

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
             * Gets the value of the грн property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getГРН() {
                return грн;
            }

            /**
             * Sets the value of the грн property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setГРН(String value) {
                this.грн = value;
            }

            /**
             * Gets the value of the огрн property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getОГРН() {
                return огрн;
            }

            /**
             * Sets the value of the огрн property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setОГРН(String value) {
                this.огрн = value;
            }

            /**
             * Gets the value of the инн property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getИНН() {
                return инн;
            }

            /**
             * Sets the value of the инн property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setИНН(String value) {
                this.инн = value;
            }

            /**
             * Gets the value of the наимЮЛПолн property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНаимЮЛПолн() {
                return наимЮЛПолн;
            }

            /**
             * Sets the value of the наимЮЛПолн property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНаимЮЛПолн(String value) {
                this.наимЮЛПолн = value;
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
     *                 &lt;attribute name="КодНО" type="{http://company1c.com/orgregister/corporation}СОНОТип" />
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
     *       &lt;attribute name="ГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
     *       &lt;attribute name="ИНН" type="{http://company1c.com/orgregister/corporation}ИННЮЛТип" />
     *       &lt;attribute name="КПП" type="{http://company1c.com/orgregister/corporation}КППТип" />
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
        protected РеквизитыЮрЛица.СвУчетНО.СвНО свНО;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041d\u0430\u0447\u0414\u0435\u0439\u0441\u0442\u0432")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаНачДейств;
        @XmlAttribute(name = "\u0413\u0420\u041d")
        protected String грн;
        @XmlAttribute(name = "\u0418\u041d\u041d")
        protected String инн;
        @XmlAttribute(name = "\u041a\u041f\u041f")
        protected String кпп;
        @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u041f\u043e\u0441\u0442\u0423\u0447")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar датаПостУч;

        /**
         * Gets the value of the свНО property.
         * 
         * @return
         *     possible object is
         *     {@link РеквизитыЮрЛица.СвУчетНО.СвНО }
         *     
         */
        public РеквизитыЮрЛица.СвУчетНО.СвНО getСвНО() {
            return свНО;
        }

        /**
         * Sets the value of the свНО property.
         * 
         * @param value
         *     allowed object is
         *     {@link РеквизитыЮрЛица.СвУчетНО.СвНО }
         *     
         */
        public void setСвНО(РеквизитыЮрЛица.СвУчетНО.СвНО value) {
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
         * Gets the value of the грн property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getГРН() {
            return грн;
        }

        /**
         * Sets the value of the грн property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setГРН(String value) {
            this.грн = value;
        }

        /**
         * Gets the value of the инн property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getИНН() {
            return инн;
        }

        /**
         * Sets the value of the инн property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setИНН(String value) {
            this.инн = value;
        }

        /**
         * Gets the value of the кпп property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getКПП() {
            return кпп;
        }

        /**
         * Sets the value of the кпп property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setКПП(String value) {
            this.кпп = value;
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
         *       &lt;attribute name="КодНО" type="{http://company1c.com/orgregister/corporation}СОНОТип" />
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

}
