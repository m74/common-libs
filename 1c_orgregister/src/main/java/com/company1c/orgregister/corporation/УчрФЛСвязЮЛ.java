
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     Сведения об учредителе (участнике) - физическом лице.
 *                     Содержит фирмы, в которых учредитель является директором.
 *                     Содержит фирмы, в которых учредитель является учредителем.
 *                 
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}УчрФЛ"/>
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
    "\u0443\u0447\u0440\u0424\u041b",
    "\u0441\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u041f\u0430\u0440\u0430\u043c"
})
@XmlRootElement(name = "\u0423\u0447\u0440\u0424\u041b\u0421\u0432\u044f\u0437\u042e\u041b")
public class УчрФЛСвязЮЛ {

    @XmlElement(name = "\u0423\u0447\u0440\u0424\u041b", required = true)
    protected УчрФЛ учрФЛ;
    @XmlElement(name = "\u0421\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u041f\u0430\u0440\u0430\u043c", required = true)
    protected СвязЮЛПоПарам связЮЛПоПарам;

    /**
     * Gets the value of the учрФЛ property.
     * 
     * @return
     *     possible object is
     *     {@link УчрФЛ }
     *     
     */
    public УчрФЛ getУчрФЛ() {
        return учрФЛ;
    }

    /**
     * Sets the value of the учрФЛ property.
     * 
     * @param value
     *     allowed object is
     *     {@link УчрФЛ }
     *     
     */
    public void setУчрФЛ(УчрФЛ value) {
        this.учрФЛ = value;
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
