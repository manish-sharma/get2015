/**
 * TempConvertServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.metacube.webservices;

public class TempConvertServiceLocator extends org.apache.axis.client.Service implements com.metacube.webservices.TempConvertService {

    public TempConvertServiceLocator() {
    }


    public TempConvertServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TempConvertServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TempConvert
    private java.lang.String TempConvert_address = "http://localhost:8080/TempConverter/services/TempConvert";

    public java.lang.String getTempConvertAddress() {
        return TempConvert_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TempConvertWSDDServiceName = "TempConvert";

    public java.lang.String getTempConvertWSDDServiceName() {
        return TempConvertWSDDServiceName;
    }

    public void setTempConvertWSDDServiceName(java.lang.String name) {
        TempConvertWSDDServiceName = name;
    }

    public com.metacube.webservices.TempConvert getTempConvert() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TempConvert_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTempConvert(endpoint);
    }

    public com.metacube.webservices.TempConvert getTempConvert(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.metacube.webservices.TempConvertSoapBindingStub _stub = new com.metacube.webservices.TempConvertSoapBindingStub(portAddress, this);
            _stub.setPortName(getTempConvertWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTempConvertEndpointAddress(java.lang.String address) {
        TempConvert_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.metacube.webservices.TempConvert.class.isAssignableFrom(serviceEndpointInterface)) {
                com.metacube.webservices.TempConvertSoapBindingStub _stub = new com.metacube.webservices.TempConvertSoapBindingStub(new java.net.URL(TempConvert_address), this);
                _stub.setPortName(getTempConvertWSDDServiceName());
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
        if ("TempConvert".equals(inputPortName)) {
            return getTempConvert();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.metacube.com", "TempConvertService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.metacube.com", "TempConvert"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TempConvert".equals(portName)) {
            setTempConvertEndpointAddress(address);
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
