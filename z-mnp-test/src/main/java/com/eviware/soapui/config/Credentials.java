//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.25 at 11:08:32 PM ICT 
//


package com.eviware.soapui.config;

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
 *         &lt;element ref="{http://eviware.com/soapui/config}selectedAuthProfile" minOccurs="0"/>
 *         &lt;element ref="{http://eviware.com/soapui/config}addedBasicAuthenticationTypes" minOccurs="0"/>
 *         &lt;element ref="{http://eviware.com/soapui/config}authType"/>
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
    "selectedAuthProfile",
    "addedBasicAuthenticationTypes",
    "authType"
})
@XmlRootElement(name = "credentials")
public class Credentials {

    protected String selectedAuthProfile;
    protected String addedBasicAuthenticationTypes;
    @XmlElement(required = true)
    protected String authType;

    /**
     * Gets the value of the selectedAuthProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedAuthProfile() {
        return selectedAuthProfile;
    }

    /**
     * Sets the value of the selectedAuthProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedAuthProfile(String value) {
        this.selectedAuthProfile = value;
    }

    /**
     * Gets the value of the addedBasicAuthenticationTypes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddedBasicAuthenticationTypes() {
        return addedBasicAuthenticationTypes;
    }

    /**
     * Sets the value of the addedBasicAuthenticationTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddedBasicAuthenticationTypes(String value) {
        this.addedBasicAuthenticationTypes = value;
    }

    /**
     * Gets the value of the authType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthType() {
        return authType;
    }

    /**
     * Sets the value of the authType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthType(String value) {
        this.authType = value;
    }

}