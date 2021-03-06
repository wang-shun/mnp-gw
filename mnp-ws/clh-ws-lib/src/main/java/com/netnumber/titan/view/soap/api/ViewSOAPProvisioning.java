package com.netnumber.titan.view.soap.api;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-11-24T14:12:15.487+07:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://www.netnumber.com/titan/view/soap/api", name = "ViewSOAPProvisioning")
@XmlSeeAlso({com.netnumber.titan.view.soap.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ViewSOAPProvisioning {

    @WebMethod(action = "change")
    @WebResult(name = "ChangeResponse", targetNamespace = "http://www.netnumber.com/titan/view/soap/types", partName = "ChangeResponse")
    public com.netnumber.titan.view.soap.types.ChangeResponse change(
        @WebParam(partName = "ChangeRequest", name = "ChangeRequest", targetNamespace = "http://www.netnumber.com/titan/view/soap/types")
        com.netnumber.titan.view.soap.types.ChangeRequest changeRequest
    );

    @WebMethod(action = "get")
    @WebResult(name = "GetResponse", targetNamespace = "http://www.netnumber.com/titan/view/soap/types", partName = "GetResponse")
    public com.netnumber.titan.view.soap.types.GetResponse get(
        @WebParam(partName = "GetRequest", name = "GetRequest", targetNamespace = "http://www.netnumber.com/titan/view/soap/types")
        com.netnumber.titan.view.soap.types.GetRequest getRequest
    );

    @WebMethod(action = "status")
    @WebResult(name = "StatusResponse", targetNamespace = "http://www.netnumber.com/titan/view/soap/types", partName = "StatusResponse")
    public com.netnumber.titan.view.soap.types.StatusResponse status(
        @WebParam(partName = "StatusRequest", name = "StatusRequest", targetNamespace = "http://www.netnumber.com/titan/view/soap/types")
        java.lang.Object statusRequest
    );
}
