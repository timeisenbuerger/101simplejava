//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.09 at 05:49:12 PM CEST 
//


package org.softlang.company;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for department complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="department">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.softlang.org/company.xsd}subunit">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.softlang.org/company.xsd}name"/>
 *         &lt;element name="manager" type="{http://www.softlang.org/company.xsd}employee"/>
 *         &lt;element ref="{http://www.softlang.org/company.xsd}subunit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "department", propOrder = {
    "name",
    "manager",
    "subunit"
})
public class Department
    extends Subunit
{

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected Employee manager;
    @XmlElementRef(name = "subunit", namespace = "http://www.softlang.org/company.xsd", type = JAXBElement.class)
    protected List<JAXBElement<? extends Subunit>> subunit;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the manager property.
     * 
     * @return
     *     possible object is
     *     {@link Employee }
     *     
     */
    public Employee getManager() {
        return manager;
    }

    /**
     * Sets the value of the manager property.
     * 
     * @param value
     *     allowed object is
     *     {@link Employee }
     *     
     */
    public void setManager(Employee value) {
        this.manager = value;
    }

    /**
     * Gets the value of the subunit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subunit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubunit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Subunit }{@code >}
     * {@link JAXBElement }{@code <}{@link Employee }{@code >}
     * {@link JAXBElement }{@code <}{@link Department }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Subunit>> getSubunit() {
        if (subunit == null) {
            subunit = new ArrayList<JAXBElement<? extends Subunit>>();
        }
        return this.subunit;
    }

}