
package com.company1c.orgregister.corporation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                     Сведения об учредителе (участнике) - иностранном юридическом лице.
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
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}УчрЮЛИн"/>
 *         &lt;element name="связЮЛПоУчредителю" type="{http://company1c.com/orgregister/corporation}СвязЮЛSearchResult"/>
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
    "\u0443\u0447\u0440\u042e\u041b\u0418\u043d",
    "\u0441\u0432\u044f\u0437\u042e\u041b\u041f\u043e\u0423\u0447\u0440\u0435\u0434\u0438\u0442\u0435\u043b\u044e"
})
@XmlRootElement(name = "\u0423\u0447\u0440\u042e\u041b\u0418\u043d\u0421\u0432\u044f\u0437\u042e\u041b")
public class УчрЮЛИнСвязЮЛ {

    @XmlElement(name = "\u0423\u0447\u0440\u042e\u041b\u0418\u043d", required = true)
    protected УчрЮЛИн учрЮЛИн;
    @XmlElement(required = true)
    protected СвязЮЛSearchResult связЮЛПоУчредителю;

    /**
     * Gets the value of the учрЮЛИн property.
     * 
     * @return
     *     possible object is
     *     {@link УчрЮЛИн }
     *     
     */
    public УчрЮЛИн getУчрЮЛИн() {
        return учрЮЛИн;
    }

    /**
     * Sets the value of the учрЮЛИн property.
     * 
     * @param value
     *     allowed object is
     *     {@link УчрЮЛИн }
     *     
     */
    public void setУчрЮЛИн(УчрЮЛИн value) {
        this.учрЮЛИн = value;
    }

    /**
     * Gets the value of the связЮЛПоУчредителю property.
     * 
     * @return
     *     possible object is
     *     {@link СвязЮЛSearchResult }
     *     
     */
    public СвязЮЛSearchResult getСвязЮЛПоУчредителю() {
        return связЮЛПоУчредителю;
    }

    /**
     * Sets the value of the связЮЛПоУчредителю property.
     * 
     * @param value
     *     allowed object is
     *     {@link СвязЮЛSearchResult }
     *     
     */
    public void setСвязЮЛПоУчредителю(СвязЮЛSearchResult value) {
        this.связЮЛПоУчредителю = value;
    }

}
