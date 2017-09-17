//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.26 at 11:06:53 PM ICT 
//


package com.telcordia.inpac.ws.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NPCMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPCMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PortRequest" type="{}PortReqMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="PortRequestAck" type="{}PortReqAckMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="PortRequestFwd" type="{}PortReqFwdMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="PortResponse" type="{}PortRespMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="PortNotification" type="{}PortNotMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="PortNotificationException" type="{}PortNotExceptMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="PortDeact" type="{}PortDeactMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="PortDeactException" type="{}PortDeactMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="PortBroadcast" type="{}PortBroadcastMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="PortBroadcastException" type="{}PortBroadcastMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="PortCancel" type="{}PortCancelMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="PortReversalDonor" type="{}PortRvrsDonorMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="PortReversalRecipient" type="{}PortRvrsRecipientMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="PortReversalBroadcast" type="{}PortBroadcastMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="NumberReturn" type="{}NumReturnReqMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="NumberReturnAck" type="{}NumReturnAckMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="NumberReturnFwd" type="{}NumReturnFwdMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="NumberReturnBroadcast" type="{}PortBroadcastMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="SynchronisationRequest" type="{}SyncReqMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="SynchronisationResponse" type="{}SyncRespMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="PortTerminated" type="{}PortTerminatedMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="ErrorNotification" type="{}ErrorNotifMsgType" maxOccurs="unbounded"/>
 *         &lt;element name="TimerNotification" type="{}TimerNotifMsgType" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NPCMessageType", propOrder = {
    "portRequest",
    "portRequestAck",
    "portRequestFwd",
    "portResponse",
    "portNotification",
    "portNotificationException",
    "portDeact",
    "portDeactException",
    "portBroadcast",
    "portBroadcastException",
    "portCancel",
    "portReversalDonor",
    "portReversalRecipient",
    "portReversalBroadcast",
    "numberReturn",
    "numberReturnAck",
    "numberReturnFwd",
    "numberReturnBroadcast",
    "synchronisationRequest",
    "synchronisationResponse",
    "portTerminated",
    "errorNotification",
    "timerNotification"
})
public class NPCMessageType {

    @XmlElement(name = "PortRequest")
    protected List<PortReqMsgType> portRequest;
    @XmlElement(name = "PortRequestAck")
    protected List<PortReqAckMsgType> portRequestAck;
    @XmlElement(name = "PortRequestFwd")
    protected List<PortReqFwdMsgType> portRequestFwd;
    @XmlElement(name = "PortResponse")
    protected List<PortRespMsgType> portResponse;
    @XmlElement(name = "PortNotification")
    protected List<PortNotMsgType> portNotification;
    @XmlElement(name = "PortNotificationException")
    protected List<PortNotExceptMsgType> portNotificationException;
    @XmlElement(name = "PortDeact")
    protected List<PortDeactMsgType> portDeact;
    @XmlElement(name = "PortDeactException")
    protected List<PortDeactMsgType> portDeactException;
    @XmlElement(name = "PortBroadcast")
    protected List<PortBroadcastMsgType> portBroadcast;
    @XmlElement(name = "PortBroadcastException")
    protected List<PortBroadcastMsgType> portBroadcastException;
    @XmlElement(name = "PortCancel")
    protected List<PortCancelMsgType> portCancel;
    @XmlElement(name = "PortReversalDonor")
    protected List<PortRvrsDonorMsgType> portReversalDonor;
    @XmlElement(name = "PortReversalRecipient")
    protected List<PortRvrsRecipientMsgType> portReversalRecipient;
    @XmlElement(name = "PortReversalBroadcast")
    protected List<PortBroadcastMsgType> portReversalBroadcast;
    @XmlElement(name = "NumberReturn")
    protected List<NumReturnReqMsgType> numberReturn;
    @XmlElement(name = "NumberReturnAck")
    protected List<NumReturnAckMsgType> numberReturnAck;
    @XmlElement(name = "NumberReturnFwd")
    protected List<NumReturnFwdMsgType> numberReturnFwd;
    @XmlElement(name = "NumberReturnBroadcast")
    protected List<PortBroadcastMsgType> numberReturnBroadcast;
    @XmlElement(name = "SynchronisationRequest")
    protected List<SyncReqMsgType> synchronisationRequest;
    @XmlElement(name = "SynchronisationResponse")
    protected List<SyncRespMsgType> synchronisationResponse;
    @XmlElement(name = "PortTerminated")
    protected List<PortTerminatedMsgType> portTerminated;
    @XmlElement(name = "ErrorNotification")
    protected List<ErrorNotifMsgType> errorNotification;
    @XmlElement(name = "TimerNotification")
    protected List<TimerNotifMsgType> timerNotification;

    /**
     * Gets the value of the portRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortReqMsgType }
     * 
     * 
     */
    public List<PortReqMsgType> getPortRequest() {
        if (portRequest == null) {
            portRequest = new ArrayList<PortReqMsgType>();
        }
        return this.portRequest;
    }

    /**
     * Gets the value of the portRequestAck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portRequestAck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortRequestAck().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortReqAckMsgType }
     * 
     * 
     */
    public List<PortReqAckMsgType> getPortRequestAck() {
        if (portRequestAck == null) {
            portRequestAck = new ArrayList<PortReqAckMsgType>();
        }
        return this.portRequestAck;
    }

    /**
     * Gets the value of the portRequestFwd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portRequestFwd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
    getPortRequestFwd().add(newItem);
 </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortReqFwdMsgType }
     * 
     * 
     */
    public List<PortReqFwdMsgType> getPortRequestFwd() {
        if (portRequestFwd == null) {
            portRequestFwd = new ArrayList<PortReqFwdMsgType>();
        }
        return this.portRequestFwd;
    }

    /**
     * Gets the value of the portResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortRespMsgType }
     * 
     * 
     */
    public List<PortRespMsgType> getPortResponse() {
        if (portResponse == null) {
            portResponse = new ArrayList<PortRespMsgType>();
        }
        return this.portResponse;
    }

    /**
     * Gets the value of the portNotification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portNotification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortNotMsgType }
     * 
     * 
     */
    public List<PortNotMsgType> getPortNotification() {
        if (portNotification == null) {
            portNotification = new ArrayList<PortNotMsgType>();
        }
        return this.portNotification;
    }

    /**
     * Gets the value of the portNotificationException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portNotificationException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortNotificationException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortNotExceptMsgType }
     * 
     * 
     */
    public List<PortNotExceptMsgType> getPortNotificationException() {
        if (portNotificationException == null) {
            portNotificationException = new ArrayList<PortNotExceptMsgType>();
        }
        return this.portNotificationException;
    }

    /**
     * Gets the value of the portDeact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portDeact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortDeact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortDeactMsgType }
     * 
     * 
     */
    public List<PortDeactMsgType> getPortDeact() {
        if (portDeact == null) {
            portDeact = new ArrayList<PortDeactMsgType>();
        }
        return this.portDeact;
    }

    /**
     * Gets the value of the portDeactException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portDeactException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortDeactException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortDeactMsgType }
     * 
     * 
     */
    public List<PortDeactMsgType> getPortDeactException() {
        if (portDeactException == null) {
            portDeactException = new ArrayList<PortDeactMsgType>();
        }
        return this.portDeactException;
    }

    /**
     * Gets the value of the portBroadcast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portBroadcast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortBroadcast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortBroadcastMsgType }
     * 
     * 
     */
    public List<PortBroadcastMsgType> getPortBroadcast() {
        if (portBroadcast == null) {
            portBroadcast = new ArrayList<PortBroadcastMsgType>();
        }
        return this.portBroadcast;
    }

    /**
     * Gets the value of the portBroadcastException property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portBroadcastException property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortBroadcastException().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortBroadcastMsgType }
     * 
     * 
     */
    public List<PortBroadcastMsgType> getPortBroadcastException() {
        if (portBroadcastException == null) {
            portBroadcastException = new ArrayList<PortBroadcastMsgType>();
        }
        return this.portBroadcastException;
    }

    /**
     * Gets the value of the portCancel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portCancel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
    getPortCancel().add(newItem);
 </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortCancelMsgType }
     * 
     * 
     */
    public List<PortCancelMsgType> getPortCancel() {
        if (portCancel == null) {
            portCancel = new ArrayList<PortCancelMsgType>();
        }
        return this.portCancel;
    }

    /**
     * Gets the value of the portReversalDonor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portReversalDonor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
    getPortReversalDonor().add(newItem);
 </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortRvrsDonorMsgType }
     * 
     * 
     */
    public List<PortRvrsDonorMsgType> getPortReversalDonor() {
        if (portReversalDonor == null) {
            portReversalDonor = new ArrayList<PortRvrsDonorMsgType>();
        }
        return this.portReversalDonor;
    }

    /**
     * Gets the value of the portReversalRecipient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portReversalRecipient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
    getPortReversalRecipient().add(newItem);
 </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortRvrsRecipientMsgType }
     * 
     * 
     */
    public List<PortRvrsRecipientMsgType> getPortReversalRecipient() {
        if (portReversalRecipient == null) {
            portReversalRecipient = new ArrayList<PortRvrsRecipientMsgType>();
        }
        return this.portReversalRecipient;
    }

    /**
     * Gets the value of the portReversalBroadcast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portReversalBroadcast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortReversalBroadcast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortBroadcastMsgType }
     * 
     * 
     */
    public List<PortBroadcastMsgType> getPortReversalBroadcast() {
        if (portReversalBroadcast == null) {
            portReversalBroadcast = new ArrayList<PortBroadcastMsgType>();
        }
        return this.portReversalBroadcast;
    }

    /**
     * Gets the value of the numberReturn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberReturn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
    getNumberReturn().add(newItem);
 </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumReturnReqMsgType }
     * 
     * 
     */
    public List<NumReturnReqMsgType> getNumberReturn() {
        if (numberReturn == null) {
            numberReturn = new ArrayList<NumReturnReqMsgType>();
        }
        return this.numberReturn;
    }

    /**
     * Gets the value of the numberReturnAck property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberReturnAck property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
    getNumberReturnAck().add(newItem);
 </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumReturnAckMsgType }
     * 
     * 
     */
    public List<NumReturnAckMsgType> getNumberReturnAck() {
        if (numberReturnAck == null) {
            numberReturnAck = new ArrayList<NumReturnAckMsgType>();
        }
        return this.numberReturnAck;
    }

    /**
     * Gets the value of the numberReturnFwd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberReturnFwd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
    getNumberReturnFwd().add(newItem);
 </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumReturnFwdMsgType }
     * 
     * 
     */
    public List<NumReturnFwdMsgType> getNumberReturnFwd() {
        if (numberReturnFwd == null) {
            numberReturnFwd = new ArrayList<NumReturnFwdMsgType>();
        }
        return this.numberReturnFwd;
    }

    /**
     * Gets the value of the numberReturnBroadcast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberReturnBroadcast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
    getNumerReturnBroadcast().add(newItem);
 </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortBroadcastMsgType }
     * 
     * 
     */
    public List<PortBroadcastMsgType> getNumerReturnBroadcast() {
        if (numberReturnBroadcast == null) {
            numberReturnBroadcast = new ArrayList<PortBroadcastMsgType>();
        }
        return this.numberReturnBroadcast;
    }

    /**
     * Gets the value of the synchronisationRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synchronisationRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynchronisationRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SyncReqMsgType }
     * 
     * 
     */
    public List<SyncReqMsgType> getSynchronisationRequest() {
        if (synchronisationRequest == null) {
            synchronisationRequest = new ArrayList<SyncReqMsgType>();
        }
        return this.synchronisationRequest;
    }

    /**
     * Gets the value of the synchronisationResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synchronisationResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynchronisationResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SyncRespMsgType }
     * 
     * 
     */
    public List<SyncRespMsgType> getSynchronisationResponse() {
        if (synchronisationResponse == null) {
            synchronisationResponse = new ArrayList<SyncRespMsgType>();
        }
        return this.synchronisationResponse;
    }

    /**
     * Gets the value of the portTerminated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portTerminated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortTerminated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortTerminatedMsgType }
     * 
     * 
     */
    public List<PortTerminatedMsgType> getPortTerminated() {
        if (portTerminated == null) {
            portTerminated = new ArrayList<PortTerminatedMsgType>();
        }
        return this.portTerminated;
    }

    /**
     * Gets the value of the errorNotification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorNotification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorNotifMsgType }
     * 
     * 
     */
    public List<ErrorNotifMsgType> getErrorNotification() {
        if (errorNotification == null) {
            errorNotification = new ArrayList<ErrorNotifMsgType>();
        }
        return this.errorNotification;
    }

    /**
     * Gets the value of the timerNotification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timerNotification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimerNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimerNotifMsgType }
     * 
     * 
     */
    public List<TimerNotifMsgType> getTimerNotification() {
        if (timerNotification == null) {
            timerNotification = new ArrayList<TimerNotifMsgType>();
        }
        return this.timerNotification;
    }

    public void setPortRequest(List<PortReqMsgType> portRequest) {
        this.portRequest = portRequest;
    }

    public void setPortRequestAck(List<PortReqAckMsgType> portRequestAck) {
        this.portRequestAck = portRequestAck;
    }

    public void setPortRequestFwd(List<PortReqFwdMsgType> portRequestFwd) {
        this.portRequestFwd = portRequestFwd;
    }

    public void setPortResponse(List<PortRespMsgType> portResponse) {
        this.portResponse = portResponse;
    }

    public void setPortNotification(List<PortNotMsgType> portNotification) {
        this.portNotification = portNotification;
    }

    public void setPortNotificationException(List<PortNotExceptMsgType> portNotificationException) {
        this.portNotificationException = portNotificationException;
    }

    public void setPortDeact(List<PortDeactMsgType> portDeact) {
        this.portDeact = portDeact;
    }

    public void setPortDeactException(List<PortDeactMsgType> portDeactException) {
        this.portDeactException = portDeactException;
    }

    public void setPortBroadcast(List<PortBroadcastMsgType> portBroadcast) {
        this.portBroadcast = portBroadcast;
    }

    public void setPortBroadcastException(List<PortBroadcastMsgType> portBroadcastException) {
        this.portBroadcastException = portBroadcastException;
    }

    public void setPortCancel(List<PortCancelMsgType> portCancel) {
        this.portCancel = portCancel;
    }

    public void setPortReversalDonor(List<PortRvrsDonorMsgType> portReversalDonor) {
        this.portReversalDonor = portReversalDonor;
    }

    public void setPortReversalRecipient(List<PortRvrsRecipientMsgType> portReversalRecipient) {
        this.portReversalRecipient = portReversalRecipient;
    }

    public void setPortReversalBroadcast(List<PortBroadcastMsgType> portReversalBroadcast) {
        this.portReversalBroadcast = portReversalBroadcast;
    }

    public void setNumReturn(List<NumReturnReqMsgType> numberReturn) {
        this.numberReturn = numberReturn;
    }

    public void setNumberReturnAck(List<NumReturnAckMsgType> numberReturnAck) {
        this.numberReturnAck = numberReturnAck;
    }

    public void setNumberReturnFwd(List<NumReturnFwdMsgType> numberReturnFwd) {
        this.numberReturnFwd = numberReturnFwd;
    }

    public void setNumberReturnBroadcast(List<PortBroadcastMsgType> numberReturnBroadcast) {
        this.numberReturnBroadcast = numberReturnBroadcast;
    }

    public void setSynchronisationRequest(List<SyncReqMsgType> synchronisationRequest) {
        this.synchronisationRequest = synchronisationRequest;
    }

    public void setSynchronisationResponse(List<SyncRespMsgType> synchronisationResponse) {
        this.synchronisationResponse = synchronisationResponse;
    }

    public void setPortTerminated(List<PortTerminatedMsgType> portTerminated) {
        this.portTerminated = portTerminated;
    }

    public void setErrorNotification(List<ErrorNotifMsgType> errorNotification) {
        this.errorNotification = errorNotification;
    }

    public void setTimerNotification(List<TimerNotifMsgType> timerNotification) {
        this.timerNotification = timerNotification;
    }

}