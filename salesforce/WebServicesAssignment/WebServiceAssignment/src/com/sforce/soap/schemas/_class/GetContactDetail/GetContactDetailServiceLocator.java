/**
 * GetContactDetailServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.schemas._class.GetContactDetail;

public class GetContactDetailServiceLocator extends org.apache.axis.client.Service implements com.sforce.soap.schemas._class.GetContactDetail.GetContactDetailService {

    public GetContactDetailServiceLocator() {
    }


    public GetContactDetailServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetContactDetailServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetContactDetail
    private java.lang.String GetContactDetail_address = "https://ap2.salesforce.com/services/Soap/class/GetContactDetail";

    public java.lang.String getGetContactDetailAddress() {
        return GetContactDetail_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetContactDetailWSDDServiceName = "GetContactDetail";

    public java.lang.String getGetContactDetailWSDDServiceName() {
        return GetContactDetailWSDDServiceName;
    }

    public void setGetContactDetailWSDDServiceName(java.lang.String name) {
        GetContactDetailWSDDServiceName = name;
    }

    public com.sforce.soap.schemas._class.GetContactDetail.GetContactDetailPortType getGetContactDetail() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetContactDetail_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetContactDetail(endpoint);
    }

    public com.sforce.soap.schemas._class.GetContactDetail.GetContactDetailPortType getGetContactDetail(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sforce.soap.schemas._class.GetContactDetail.GetContactDetailBindingStub _stub = new com.sforce.soap.schemas._class.GetContactDetail.GetContactDetailBindingStub(portAddress, this);
            _stub.setPortName(getGetContactDetailWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetContactDetailEndpointAddress(java.lang.String address) {
        GetContactDetail_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sforce.soap.schemas._class.GetContactDetail.GetContactDetailPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sforce.soap.schemas._class.GetContactDetail.GetContactDetailBindingStub _stub = new com.sforce.soap.schemas._class.GetContactDetail.GetContactDetailBindingStub(new java.net.URL(GetContactDetail_address), this);
                _stub.setPortName(getGetContactDetailWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GetContactDetail".equals(inputPortName)) {
            return getGetContactDetail();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.sforce.com/schemas/class/GetContactDetail", "GetContactDetailService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.sforce.com/schemas/class/GetContactDetail", "GetContactDetail"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetContactDetail".equals(portName)) {
            setGetContactDetailEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
