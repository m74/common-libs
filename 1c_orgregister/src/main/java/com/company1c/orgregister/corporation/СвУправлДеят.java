
package com.company1c.orgregister.corporation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о лице, имеющем право без доверенности действовать от имени юридического
 *                     лица
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
 *         &lt;element ref="{http://company1c.com/orgregister/corporation}СведДолжнФЛ" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://company1c.com/orgregister/corporation}УпрОргРос" minOccurs="0"/>
 *           &lt;element ref="{http://company1c.com/orgregister/corporation}УпрОргИн" minOccurs="0"/>
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
@XmlRootElement(name = "\u0421\u0432\u0423\u043f\u0440\u0430\u0432\u043b\u0414\u0435\u044f\u0442")
public class СвУправлДеят {

    @XmlElement(name = "\u0421\u0432\u0435\u0434\u0414\u043e\u043b\u0436\u043d\u0424\u041b")
    protected List<СведДолжнФЛ> сведДолжнФЛ;
    @XmlElement(name = "\u0423\u043f\u0440\u041e\u0440\u0433\u0420\u043e\u0441")
    protected УпрОргРос упрОргРос;
    @XmlElement(name = "\u0423\u043f\u0440\u041e\u0440\u0433\u0418\u043d")
    protected УпрОргИн упрОргИн;

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
     * {@link СведДолжнФЛ }
     * 
     * 
     */
    public List<СведДолжнФЛ> getСведДолжнФЛ() {
        if (сведДолжнФЛ == null) {
            сведДолжнФЛ = new ArrayList<СведДолжнФЛ>();
        }
        return this.сведДолжнФЛ;
    }

    /**
     * Gets the value of the упрОргРос property.
     * 
     * @return
     *     possible object is
     *     {@link УпрОргРос }
     *     
     */
    public УпрОргРос getУпрОргРос() {
        return упрОргРос;
    }

    /**
     * Sets the value of the упрОргРос property.
     * 
     * @param value
     *     allowed object is
     *     {@link УпрОргРос }
     *     
     */
    public void setУпрОргРос(УпрОргРос value) {
        this.упрОргРос = value;
    }

    /**
     * Gets the value of the упрОргИн property.
     * 
     * @return
     *     possible object is
     *     {@link УпрОргИн }
     *     
     */
    public УпрОргИн getУпрОргИн() {
        return упрОргИн;
    }

    /**
     * Sets the value of the упрОргИн property.
     * 
     * @param value
     *     allowed object is
     *     {@link УпрОргИн }
     *     
     */
    public void setУпрОргИн(УпрОргИн value) {
        this.упрОргИн = value;
    }

}
