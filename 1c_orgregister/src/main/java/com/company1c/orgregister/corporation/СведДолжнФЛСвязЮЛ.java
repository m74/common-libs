
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СведДолжнФЛ"/>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СвязЮЛПоПарам"/>
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
    "\u0441\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u041f\u0430\u0440\u0430\u043c"
})
@XmlRootElement(name = "\u0421\u0432\u0435\u0434\u0414\u043e\u043b\u0436\u043d\u0424\u041b\u0421\u0432\u044f\u0437\u042e\u041b")
public class СведДолжнФЛСвязЮЛ {

    @XmlElement(name = "\u0421\u0432\u0435\u0434\u0414\u043e\u043b\u0436\u043d\u0424\u041b", required = true)
    protected СведДолжнФЛ сведДолжнФЛ;
    @XmlElement(name = "\u0421\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u041f\u0430\u0440\u0430\u043c", required = true)
    protected СвязЮЛПоПарам связЮЛПоПарам;

    /**
     * Gets the value of the сведДолжнФЛ property.
     * 
     * @return
     *     possible object is
     *     {@link СведДолжнФЛ }
     *     
     */
    public СведДолжнФЛ getСведДолжнФЛ() {
        return сведДолжнФЛ;
    }

    /**
     * Sets the value of the сведДолжнФЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link СведДолжнФЛ }
     *     
     */
    public void setСведДолжнФЛ(СведДолжнФЛ value) {
        this.сведДолжнФЛ = value;
    }

    /**
     * Gets the value of the связЮЛПоПарам property.
     * 
     * @return
     *     possible object is
     *     {@link СвязЮЛПоПарам }
     *     
     */
    public СвязЮЛПоПарам getСвязЮЛПоПарам() {
        return связЮЛПоПарам;
    }

    /**
     * Sets the value of the связЮЛПоПарам property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвязЮЛПоПарам }
     *     
     */
    public void setСвязЮЛПоПарам(СвязЮЛПоПарам value) {
        this.связЮЛПоПарам = value;
    }

}
