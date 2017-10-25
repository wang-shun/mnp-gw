//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.25 at 11:08:32 PM ICT 
//


package com.eviware.soapui.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
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
 *         &lt;element ref="{http://eviware.com/soapui/config}settings" minOccurs="0"/>
 *         &lt;element ref="{http://eviware.com/soapui/config}definitionCache" minOccurs="0"/>
 *         &lt;element ref="{http://eviware.com/soapui/config}endpoints" minOccurs="0"/>
 *         &lt;element ref="{http://eviware.com/soapui/config}operation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="wsaVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bindingName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="soapVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="anonymous" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="definition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "interface")
public class Interface {

    @XmlElementRefs({
        @XmlElementRef(name = "settings", namespace = "http://eviware.com/soapui/config", type = Settings.class, required = false),
        @XmlElementRef(name = "operation", namespace = "http://eviware.com/soapui/config", type = Operation.class, required = false),
        @XmlElementRef(name = "definitionCache", namespace = "http://eviware.com/soapui/config", type = DefinitionCache.class, required = false),
        @XmlElementRef(name = "endpoints", namespace = "http://eviware.com/soapui/config", type = Endpoints.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "wsaVersion")
    protected String wsaVersion;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "type")
    protected String type;
    @XmlAttribute(name = "bindingName")
    protected String bindingName;
    @XmlAttribute(name = "soapVersion")
    protected String soapVersion;
    @XmlAttribute(name = "anonymous")
    protected String anonymous;
    @XmlAttribute(name = "definition")
    protected String definition;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefinitionCache }
     * {@link Endpoints }
     * {@link String }
     * {@link Settings }
     * {@link Operation }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * Gets the value of the wsaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsaVersion() {
        return wsaVersion;
    }

    /**
     * Sets the value of the wsaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsaVersion(String value) {
        this.wsaVersion = value;
    }

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the bindingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBindingName() {
        return bindingName;
    }

    /**
     * Sets the value of the bindingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBindingName(String value) {
        this.bindingName = value;
    }

    /**
     * Gets the value of the soapVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoapVersion() {
        return soapVersion;
    }

    /**
     * Sets the value of the soapVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoapVersion(String value) {
        this.soapVersion = value;
    }

    /**
     * Gets the value of the anonymous property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnonymous() {
        return anonymous;
    }

    /**
     * Sets the value of the anonymous property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnonymous(String value) {
        this.anonymous = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
