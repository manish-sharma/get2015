/**
 * TemperatureConvertorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.metacube;

public class TemperatureConvertorServiceLocator extends org.apache.axis.client.Service implements com.metacube.TemperatureConvertorService {

    public TemperatureConvertorServiceLocator() {
    }


    public TemperatureConvertorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TemperatureConvertorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TemperatureConvertor
    private java.lang.String TemperatureConvertor_address = "http://localhost:8080/ServiceProvider/services/TemperatureConvertor";

    public java.lang.String getTemperatureConvertorAddress() {
        return TemperatureConvertor_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TemperatureConvertorWSDDServiceName = "TemperatureConvertor";

    public java.lang.String getTemperatureConvertorWSDDServiceName() {
        return TemperatureConvertorWSDDServiceName;
    }

    public void setTemperatureConvertorWSDDServiceName(java.lang.String name) {
        TemperatureConvertorWSDDServiceName = name;
    }

    public com.metacube.TemperatureConvertor getTemperatureConvertor() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TemperatureConvertor_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTemperatureConvertor(endpoint);
    }

    public com.metacube.TemperatureConvertor getTemperatureConvertor(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.metacube.TemperatureConvertorSoapBindingStub _stub = new com.metacube.TemperatureConvertorSoapBindingStub(portAddress, this);
            _stub.setPortName(getTemperatureConvertorWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTemperatureConvertorEndpointAddress(java.lang.String address) {
        TemperatureConvertor_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.metacube.TemperatureConvertor.class.isAssignableFrom(serviceEndpointInterface)) {
                com.metacube.TemperatureConvertorSoapBindingStub _stub = new com.metacube.TemperatureConvertorSoapBindingStub(new java.net.URL(TemperatureConvertor_address), this);
                _stub.setPortName(getTemperatureConvertorWSDDServiceName());
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
        if ("TemperatureConvertor".equals(inputPortName)) {
            return getTemperatureConvertor();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://metacube.com", "TemperatureConvertorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://metacube.com", "TemperatureConvertor"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TemperatureConvertor".equals(portName)) {
            setTemperatureConvertorEndpointAddress(address);
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
