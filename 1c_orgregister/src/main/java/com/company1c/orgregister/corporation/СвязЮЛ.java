
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Юридические лица связанные с другими объектами
 *                 (например связанные по адресу, директору и т.д.)
 *             
 * 
 * <p>Java class for СвязЮЛ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="СвязЮЛ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвНаимЮЛ" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвАдрес" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвСтатус_РО" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвУправлДеят" minOccurs="0"/>
 *         &lt;element name="ДоляУстКап" type="{http://company1c.com/orgregister/corporation}ДоляУстКапТип" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ОГРН" type="{http://company1c.com/orgregister/corporation}ОГРНТип" />
 *       &lt;attribute name="ИНН" type="{http://company1c.com/orgregister/corporation}ИННТип" />
 *       &lt;attribute name="КПП" type="{http://company1c.com/orgregister/corporation}КППТип" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u0421\u0432\u044f\u0437\u042e\u041b", propOrder = {
    "\u0441\u0432\u041d\u0430\u0438\u043c\u042e\u041b",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441",
    "\u0441\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u0420\u041e",
    "\u0441\u0432\u0423\u043f\u0440\u0430\u0432\u043b\u0414\u0435\u044f\u0442",
    "\u0434\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f"
})
public class СвязЮЛ {

    @XmlElement(name = "\u0421\u0432\u041d\u0430\u0438\u043c\u042e\u041b")
    protected СвНаимЮЛ свНаимЮЛ;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441")
    protected СвАдрес свАдрес;
    @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441_\u0420\u041e")
    protected СвСтатусРО свСтатусРО;
    @XmlElement(name = "\u0421\u0432\u0423\u043f\u0440\u0430\u0432\u043b\u0414\u0435\u044f\u0442")
    protected СвУправлДеят свУправлДеят;
    @XmlElement(name = "\u0414\u043e\u043b\u044f\u0423\u0441\u0442\u041a\u0430\u043f")
    protected ДоляУстКапТип доляУстКап;
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
     *     {@link СвНаимЮЛ }
     *     
     */
    public СвНаимЮЛ getСвНаимЮЛ() {
        return свНаимЮЛ;
    }

    /**
     * Sets the value of the свНаимЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвНаимЮЛ }
     *     
     */
    public void setСвНаимЮЛ(СвНаимЮЛ value) {
        this.свНаимЮЛ = value;
    }

    /**
     * Gets the value of the свАдрес property.
     * 
     * @return
     *     possible object is
     *     {@link СвАдрес }
     *     
     */
    public СвАдрес getСвАдрес() {
        return свАдрес;
    }

    /**
     * Sets the value of the свАдрес property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвАдрес }
     *     
     */
    public void setСвАдрес(СвАдрес value) {
        this.свАдрес = value;
    }

    /**
     * Gets the value of the свСтатусРО property.
     * 
     * @return
     *     possible object is
     *     {@link СвСтатусРО }
     *     
     */
    public СвСтатусРО getСвСтатусРО() {
        return свСтатусРО;
    }

    /**
     * Sets the value of the свСтатусРО property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвСтатусРО }
     *     
     */
    public void setСвСтатусРО(СвСтатусРО value) {
        this.свСтатусРО = value;
    }

    /**
     * Gets the value of the свУправлДеят property.
     * 
     * @return
     *     possible object is
     *     {@link СвУправлДеят }
     *     
     */
    public СвУправлДеят getСвУправлДеят() {
        return свУправлДеят;
    }

    /**
     * Sets the value of the свУправлДеят property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвУправлДеят }
     *     
     */
    public void setСвУправлДеят(СвУправлДеят value) {
        this.свУправлДеят = value;
    }

    /**
     * Gets the value of the доляУстКап property.
     * 
     * @return
     *     possible object is
     *     {@link ДоляУстКапТип }
     *     
     */
    public ДоляУстКапТип getДоляУстКап() {
        return доляУстКап;
    }

    /**
     * Sets the value of the доляУстКап property.
     * 
     * @param value
     *     allowed object is
     *     {@link ДоляУстКапТип }
     *     
     */
    public void setДоляУстКап(ДоляУстКапТип value) {
        this.доляУстКап = value;
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

}
