//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2554.06.30 at 12:25:48 หลังเที่ยง ICT 
//


package com.telcordia.inpac.ws.jaxb;

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
 *         &lt;element name="NPCData" type="{}NPCDataType"/>
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
    "npcData"
})
@XmlRootElement(name = "NPCMessageData")
public class NPCMessageData {

    @XmlElement(name = "NPCData", required = true)
    protected NPCDataType npcData;

    /**
     * Gets the value of the npcData property.
     * 
     * @return
     *     possible object is
     *     {@link NPCDataType }
     *     
     */
    public NPCDataType getNPCData() {
        return npcData;
    }

    /**
     * Sets the value of the npcData property.
     * 
     * @param value
     *     allowed object is
     *     {@link NPCDataType }
     *     
     */
    public void setNPCData(NPCDataType value) {
        this.npcData = value;
    }

}
