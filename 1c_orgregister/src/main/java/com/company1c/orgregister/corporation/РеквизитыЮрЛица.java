
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
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвНаимЮЛ" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвАдрес" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвУправлДеят" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвУчетНО" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвСтатус_РО" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвРегПФ" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвРегФСС" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвОКВЭД" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}ИсторияРеквизитовЮЛ" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {
    "\u0441\u0432\u041d\u0430\u0438\u043c\u042e\u041b",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441",
    "\u0441\u0432\u0423\u043f\u0440\u0430\u0432\u043b\u0414\u0435\u044f\u0442",
    "\u0441\u0432\u0423\u0447\u0435\u0442\u041d\u041e",
    "\u0441\u0432\u0421\u0442\u0430\u0442\u0443\u0441\u0420\u041e",
    "\u0441\u0432\u0420\u0435\u0433\u041f\u0424",
    "\u0441\u0432\u0420\u0435\u0433\u0424\u0421\u0421",
    "\u0441\u0432\u041e\u041a\u0412\u042d\u0414",
    "\u0438\u0441\u0442\u043e\u0440\u0438\u044f\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u043e\u0432\u042e\u041b"
})
@XmlRootElement(name = "\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u042e\u0440\u041b\u0438\u0446\u0430")
public class РеквизитыЮрЛица {

    @XmlElement(name = "\u0421\u0432\u041d\u0430\u0438\u043c\u042e\u041b")
    protected СвНаимЮЛ свНаимЮЛ;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441")
    protected СвАдрес свАдрес;
    @XmlElement(name = "\u0421\u0432\u0423\u043f\u0440\u0430\u0432\u043b\u0414\u0435\u044f\u0442")
    protected СвУправлДеят свУправлДеят;
    @XmlElement(name = "\u0421\u0432\u0423\u0447\u0435\u0442\u041d\u041e")
    protected СвУчетНО свУчетНО;
    @XmlElement(name = "\u0421\u0432\u0421\u0442\u0430\u0442\u0443\u0441_\u0420\u041e")
    protected СвСтатусРО свСтатусРО;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u041f\u0424")
    protected СвРегПФ свРегПФ;
    @XmlElement(name = "\u0421\u0432\u0420\u0435\u0433\u0424\u0421\u0421")
    protected СвРегФСС свРегФСС;
    @XmlElement(name = "\u0421\u0432\u041e\u041a\u0412\u042d\u0414")
    protected List<СвОКВЭД> свОКВЭД;
    @XmlElement(name = "\u0418\u0441\u0442\u043e\u0440\u0438\u044f\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u043e\u0432\u042e\u041b")
    protected ИсторияРеквизитовЮЛ историяРеквизитовЮЛ;
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
     * Gets the value of the свУчетНО property.
     * 
     * @return
     *     possible object is
     *     {@link СвУчетНО }
     *     
     */
    public СвУчетНО getСвУчетНО() {
        return свУчетНО;
    }

    /**
     * Sets the value of the свУчетНО property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвУчетНО }
     *     
     */
    public void setСвУчетНО(СвУчетНО value) {
        this.свУчетНО = value;
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
     * Gets the value of the свРегПФ property.
     * 
     * @return
     *     possible object is
     *     {@link СвРегПФ }
     *     
     */
    public СвРегПФ getСвРегПФ() {
        return свРегПФ;
    }

    /**
     * Sets the value of the свРегПФ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвРегПФ }
     *     
     */
    public void setСвРегПФ(СвРегПФ value) {
        this.свРегПФ = value;
    }

    /**
     * Gets the value of the свРегФСС property.
     * 
     * @return
     *     possible object is
     *     {@link СвРегФСС }
     *     
     */
    public СвРегФСС getСвРегФСС() {
        return свРегФСС;
    }

    /**
     * Sets the value of the свРегФСС property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвРегФСС }
     *     
     */
    public void setСвРегФСС(СвРегФСС value) {
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
     * {@link СвОКВЭД }
     * 
     * 
     */
    public List<СвОКВЭД> getСвОКВЭД() {
        if (свОКВЭД == null) {
            свОКВЭД = new ArrayList<СвОКВЭД>();
        }
        return this.свОКВЭД;
    }

    /**
     * Gets the value of the историяРеквизитовЮЛ property.
     * 
     * @return
     *     possible object is
     *     {@link ИсторияРеквизитовЮЛ }
     *     
     */
    public ИсторияРеквизитовЮЛ getИсторияРеквизитовЮЛ() {
        return историяРеквизитовЮЛ;
    }

    /**
     * Sets the value of the историяРеквизитовЮЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ИсторияРеквизитовЮЛ }
     *     
     */
    public void setИсторияРеквизитовЮЛ(ИсторияРеквизитовЮЛ value) {
        this.историяРеквизитовЮЛ = value;
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
