
package com.company1c.orgregister.corporation;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="кпп" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвНаимЮЛ_НаимЮЛПолн" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвНаимЮЛ_НаимЮЛСокр" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвНаимЮЛ_НаимЮЛФирм" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвАдрес_Индекс" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвАдрес_РегионТип" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвАдрес_РегионНаим" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвАдрес_ГородТип" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвАдрес_ГородНаим" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвАдрес_НаселпунктТип" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвАдрес_НаселпунктНаим" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвАдрес_РайонТип" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвАдрес_РайонНаим" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвАдрес_УлицаТип" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвАдрес_УлицаНаим" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвАдрес_Дом" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвАдрес_Корпус" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="СвАдрес_Кварт" type="{http://company1c.com/orgregister/corporation}StringPropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="РеквизитыДиректора" type="{http://company1c.com/orgregister/corporation}РеквизитыДиректора" maxOccurs="unbounded" minOccurs="0"/>
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
    "\u043a\u043f\u043f",
    "\u0441\u0432\u041d\u0430\u0438\u043c\u042e\u041b\u041d\u0430\u0438\u043c\u042e\u041b\u041f\u043e\u043b\u043d",
    "\u0441\u0432\u041d\u0430\u0438\u043c\u042e\u041b\u041d\u0430\u0438\u043c\u042e\u041b\u0421\u043e\u043a\u0440",
    "\u0441\u0432\u041d\u0430\u0438\u043c\u042e\u041b\u041d\u0430\u0438\u043c\u042e\u041b\u0424\u0438\u0440\u043c",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u0418\u043d\u0434\u0435\u043a\u0441",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u0420\u0435\u0433\u0438\u043e\u043d\u0422\u0438\u043f",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u0420\u0435\u0433\u0438\u043e\u043d\u041d\u0430\u0438\u043c",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u0413\u043e\u0440\u043e\u0434\u0422\u0438\u043f",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u0413\u043e\u0440\u043e\u0434\u041d\u0430\u0438\u043c",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u041d\u0430\u0441\u0435\u043b\u043f\u0443\u043d\u043a\u0442\u0422\u0438\u043f",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u041d\u0430\u0441\u0435\u043b\u043f\u0443\u043d\u043a\u0442\u041d\u0430\u0438\u043c",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u0420\u0430\u0439\u043e\u043d\u0422\u0438\u043f",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u0420\u0430\u0439\u043e\u043d\u041d\u0430\u0438\u043c",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u0423\u043b\u0438\u0446\u0430\u0422\u0438\u043f",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u0423\u043b\u0438\u0446\u0430\u041d\u0430\u0438\u043c",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u0414\u043e\u043c",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u041a\u043e\u0440\u043f\u0443\u0441",
    "\u0441\u0432\u0410\u0434\u0440\u0435\u0441\u041a\u0432\u0430\u0440\u0442",
    "\u0440\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u0414\u0438\u0440\u0435\u043a\u0442\u043e\u0440\u0430"
})
@XmlRootElement(name = "\u0418\u0441\u0442\u043e\u0440\u0438\u044f\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u043e\u0432\u042e\u041b")
public class ИсторияРеквизитовЮЛ {

    protected List<StringPropertyType> кпп;
    @XmlElement(name = "\u0421\u0432\u041d\u0430\u0438\u043c\u042e\u041b_\u041d\u0430\u0438\u043c\u042e\u041b\u041f\u043e\u043b\u043d")
    protected List<StringPropertyType> свНаимЮЛНаимЮЛПолн;
    @XmlElement(name = "\u0421\u0432\u041d\u0430\u0438\u043c\u042e\u041b_\u041d\u0430\u0438\u043c\u042e\u041b\u0421\u043e\u043a\u0440")
    protected List<StringPropertyType> свНаимЮЛНаимЮЛСокр;
    @XmlElement(name = "\u0421\u0432\u041d\u0430\u0438\u043c\u042e\u041b_\u041d\u0430\u0438\u043c\u042e\u041b\u0424\u0438\u0440\u043c")
    protected List<StringPropertyType> свНаимЮЛНаимЮЛФирм;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441_\u0418\u043d\u0434\u0435\u043a\u0441")
    protected List<StringPropertyType> свАдресИндекс;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441_\u0420\u0435\u0433\u0438\u043e\u043d\u0422\u0438\u043f")
    protected List<StringPropertyType> свАдресРегионТип;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441_\u0420\u0435\u0433\u0438\u043e\u043d\u041d\u0430\u0438\u043c")
    protected List<StringPropertyType> свАдресРегионНаим;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441_\u0413\u043e\u0440\u043e\u0434\u0422\u0438\u043f")
    protected List<StringPropertyType> свАдресГородТип;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441_\u0413\u043e\u0440\u043e\u0434\u041d\u0430\u0438\u043c")
    protected List<StringPropertyType> свАдресГородНаим;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441_\u041d\u0430\u0441\u0435\u043b\u043f\u0443\u043d\u043a\u0442\u0422\u0438\u043f")
    protected List<StringPropertyType> свАдресНаселпунктТип;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441_\u041d\u0430\u0441\u0435\u043b\u043f\u0443\u043d\u043a\u0442\u041d\u0430\u0438\u043c")
    protected List<StringPropertyType> свАдресНаселпунктНаим;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441_\u0420\u0430\u0439\u043e\u043d\u0422\u0438\u043f")
    protected List<StringPropertyType> свАдресРайонТип;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441_\u0420\u0430\u0439\u043e\u043d\u041d\u0430\u0438\u043c")
    protected List<StringPropertyType> свАдресРайонНаим;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441_\u0423\u043b\u0438\u0446\u0430\u0422\u0438\u043f")
    protected List<StringPropertyType> свАдресУлицаТип;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441_\u0423\u043b\u0438\u0446\u0430\u041d\u0430\u0438\u043c")
    protected List<StringPropertyType> свАдресУлицаНаим;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441_\u0414\u043e\u043c")
    protected List<StringPropertyType> свАдресДом;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441_\u041a\u043e\u0440\u043f\u0443\u0441")
    protected List<StringPropertyType> свАдресКорпус;
    @XmlElement(name = "\u0421\u0432\u0410\u0434\u0440\u0435\u0441_\u041a\u0432\u0430\u0440\u0442")
    protected List<StringPropertyType> свАдресКварт;
    @XmlElement(name = "\u0420\u0435\u043a\u0432\u0438\u0437\u0438\u0442\u044b\u0414\u0438\u0440\u0435\u043a\u0442\u043e\u0440\u0430")
    protected List<РеквизитыДиректора> реквизитыДиректора;

    /**
     * Gets the value of the кпп property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the кпп property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getКпп().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getКпп() {
        if (кпп == null) {
            кпп = new ArrayList<StringPropertyType>();
        }
        return this.кпп;
    }

    /**
     * Gets the value of the свНаимЮЛНаимЮЛПолн property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свНаимЮЛНаимЮЛПолн property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвНаимЮЛНаимЮЛПолн().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвНаимЮЛНаимЮЛПолн() {
        if (свНаимЮЛНаимЮЛПолн == null) {
            свНаимЮЛНаимЮЛПолн = new ArrayList<StringPropertyType>();
        }
        return this.свНаимЮЛНаимЮЛПолн;
    }

    /**
     * Gets the value of the свНаимЮЛНаимЮЛСокр property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свНаимЮЛНаимЮЛСокр property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвНаимЮЛНаимЮЛСокр().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвНаимЮЛНаимЮЛСокр() {
        if (свНаимЮЛНаимЮЛСокр == null) {
            свНаимЮЛНаимЮЛСокр = new ArrayList<StringPropertyType>();
        }
        return this.свНаимЮЛНаимЮЛСокр;
    }

    /**
     * Gets the value of the свНаимЮЛНаимЮЛФирм property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свНаимЮЛНаимЮЛФирм property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвНаимЮЛНаимЮЛФирм().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвНаимЮЛНаимЮЛФирм() {
        if (свНаимЮЛНаимЮЛФирм == null) {
            свНаимЮЛНаимЮЛФирм = new ArrayList<StringPropertyType>();
        }
        return this.свНаимЮЛНаимЮЛФирм;
    }

    /**
     * Gets the value of the свАдресИндекс property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свАдресИндекс property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвАдресИндекс().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвАдресИндекс() {
        if (свАдресИндекс == null) {
            свАдресИндекс = new ArrayList<StringPropertyType>();
        }
        return this.свАдресИндекс;
    }

    /**
     * Gets the value of the свАдресРегионТип property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свАдресРегионТип property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвАдресРегионТип().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвАдресРегионТип() {
        if (свАдресРегионТип == null) {
            свАдресРегионТип = new ArrayList<StringPropertyType>();
        }
        return this.свАдресРегионТип;
    }

    /**
     * Gets the value of the свАдресРегионНаим property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свАдресРегионНаим property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвАдресРегионНаим().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвАдресРегионНаим() {
        if (свАдресРегионНаим == null) {
            свАдресРегионНаим = new ArrayList<StringPropertyType>();
        }
        return this.свАдресРегионНаим;
    }

    /**
     * Gets the value of the свАдресГородТип property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свАдресГородТип property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвАдресГородТип().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвАдресГородТип() {
        if (свАдресГородТип == null) {
            свАдресГородТип = new ArrayList<StringPropertyType>();
        }
        return this.свАдресГородТип;
    }

    /**
     * Gets the value of the свАдресГородНаим property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свАдресГородНаим property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвАдресГородНаим().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвАдресГородНаим() {
        if (свАдресГородНаим == null) {
            свАдресГородНаим = new ArrayList<StringPropertyType>();
        }
        return this.свАдресГородНаим;
    }

    /**
     * Gets the value of the свАдресНаселпунктТип property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свАдресНаселпунктТип property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвАдресНаселпунктТип().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвАдресНаселпунктТип() {
        if (свАдресНаселпунктТип == null) {
            свАдресНаселпунктТип = new ArrayList<StringPropertyType>();
        }
        return this.свАдресНаселпунктТип;
    }

    /**
     * Gets the value of the свАдресНаселпунктНаим property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свАдресНаселпунктНаим property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвАдресНаселпунктНаим().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвАдресНаселпунктНаим() {
        if (свАдресНаселпунктНаим == null) {
            свАдресНаселпунктНаим = new ArrayList<StringPropertyType>();
        }
        return this.свАдресНаселпунктНаим;
    }

    /**
     * Gets the value of the свАдресРайонТип property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свАдресРайонТип property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвАдресРайонТип().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвАдресРайонТип() {
        if (свАдресРайонТип == null) {
            свАдресРайонТип = new ArrayList<StringPropertyType>();
        }
        return this.свАдресРайонТип;
    }

    /**
     * Gets the value of the свАдресРайонНаим property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свАдресРайонНаим property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвАдресРайонНаим().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвАдресРайонНаим() {
        if (свАдресРайонНаим == null) {
            свАдресРайонНаим = new ArrayList<StringPropertyType>();
        }
        return this.свАдресРайонНаим;
    }

    /**
     * Gets the value of the свАдресУлицаТип property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свАдресУлицаТип property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвАдресУлицаТип().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвАдресУлицаТип() {
        if (свАдресУлицаТип == null) {
            свАдресУлицаТип = new ArrayList<StringPropertyType>();
        }
        return this.свАдресУлицаТип;
    }

    /**
     * Gets the value of the свАдресУлицаНаим property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свАдресУлицаНаим property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвАдресУлицаНаим().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвАдресУлицаНаим() {
        if (свАдресУлицаНаим == null) {
            свАдресУлицаНаим = new ArrayList<StringPropertyType>();
        }
        return this.свАдресУлицаНаим;
    }

    /**
     * Gets the value of the свАдресДом property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свАдресДом property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвАдресДом().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвАдресДом() {
        if (свАдресДом == null) {
            свАдресДом = new ArrayList<StringPropertyType>();
        }
        return this.свАдресДом;
    }

    /**
     * Gets the value of the свАдресКорпус property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свАдресКорпус property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвАдресКорпус().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвАдресКорпус() {
        if (свАдресКорпус == null) {
            свАдресКорпус = new ArrayList<StringPropertyType>();
        }
        return this.свАдресКорпус;
    }

    /**
     * Gets the value of the свАдресКварт property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the свАдресКварт property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСвАдресКварт().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPropertyType }
     * 
     * 
     */
    public List<StringPropertyType> getСвАдресКварт() {
        if (свАдресКварт == null) {
            свАдресКварт = new ArrayList<StringPropertyType>();
        }
        return this.свАдресКварт;
    }

    /**
     * Gets the value of the реквизитыДиректора property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the реквизитыДиректора property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getРеквизитыДиректора().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link РеквизитыДиректора }
     * 
     * 
     */
    public List<РеквизитыДиректора> getРеквизитыДиректора() {
        if (реквизитыДиректора == null) {
            реквизитыДиректора = new ArrayList<РеквизитыДиректора>();
        }
        return this.реквизитыДиректора;
    }

}
