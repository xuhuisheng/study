package com.succez.custom.sms;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.7
 * 2015-07-21T09:49:56.811+08:00
 * Generated source version: 2.7.7
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "SMSWebServiceSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface SMSWebServiceSoap {

    @WebResult(name = "SendTimeMessageResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SendTimeMessage", targetNamespace = "http://tempuri.org/", className = "com.succez.custom.sms.SendTimeMessage")
    @WebMethod(operationName = "SendTimeMessage", action = "http://tempuri.org/SendTimeMessage")
    @ResponseWrapper(localName = "SendTimeMessageResponse", targetNamespace = "http://tempuri.org/", className = "com.succez.custom.sms.SendTimeMessageResponse")
    public java.lang.String sendTimeMessage(
        @WebParam(name = "SmsTime", targetNamespace = "http://tempuri.org/")
        java.lang.String smsTime,
        @WebParam(name = "SmsContent", targetNamespace = "http://tempuri.org/")
        java.lang.String smsContent,
        @WebParam(name = "PhoneNumber", targetNamespace = "http://tempuri.org/")
        java.lang.String phoneNumber
    );

    @WebResult(name = "SendMessageResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "SendMessage", targetNamespace = "http://tempuri.org/", className = "com.succez.custom.sms.SendMessage")
    @WebMethod(operationName = "SendMessage", action = "http://tempuri.org/SendMessage")
    @ResponseWrapper(localName = "SendMessageResponse", targetNamespace = "http://tempuri.org/", className = "com.succez.custom.sms.SendMessageResponse")
    public java.lang.String sendMessage(
        @WebParam(name = "SmsContent", targetNamespace = "http://tempuri.org/")
        java.lang.String smsContent,
        @WebParam(name = "PhoneNumber", targetNamespace = "http://tempuri.org/")
        java.lang.String phoneNumber,
        @WebParam(name = "PhoneNumberType", targetNamespace = "http://tempuri.org/")
        int phoneNumberType
    );
}