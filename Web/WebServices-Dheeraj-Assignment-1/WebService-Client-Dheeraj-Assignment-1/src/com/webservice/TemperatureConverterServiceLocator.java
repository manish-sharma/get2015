/**
 * TemperatureConverterServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.webservice;

public class TemperatureConverterServiceLocator extends org.apache.axis.client.Service implements com.webservice.TemperatureConverterService {

    public TemperatureConverterServiceLocator() {
    }


    public TemperatureConverterServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TemperatureConverterServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TemperatureConverter
    private java.lang.String TemperatureConverter_address = "http://localhost:8080/WebService-Dheeraj-Assignment-1/services/TemperatureConverter";

    public java.lang.String getTemperatureConverterAddress() {
        return TemperatureConverter_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TemperatureConverterWSDDServiceName = "TemperatureConverter";

    public java.lang.String getTemperatureConverterWSDDServiceName() {
        return TemperatureConverterWSDDServiceName;
    }

    public void setTemperatureConverterWSDDServiceName(java.lang.String name) {
        TemperatureConverterWSDDServiceName = name;
    }

    public com.webservice.TemperatureConverter getTemperatureConverter() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TemperatureConverter_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTemperatureConverter(endpoint);
    }

    public com.webservice.TemperatureConverter getTemperatureConverter(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.webservice.TemperatureConverterSoapBindingStub _stub = new com.webservice.TemperatureConverterSoapBindingStub(portAddress, this);
            _stub.setPortName(getTemperatureConverterWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTemperatureConverterEndpointAddress(java.lang.String address) {
        TemperatureConverter_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.webservice.TemperatureConverter.class.isAssignableFrom(serviceEndpointInterface)) {
                com.webservice.TemperatureConverterSoapBindingStub _stub = new com.webservice.TemperatureConverterSoapBindingStub(new java.net.URL(TemperatureConverter_address), this);
                _stub.setPortName(getTemperatureConverterWSDDServiceName());
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
        if ("TemperatureConverter".equals(inputPortName)) {
            return getTemperatureConverter();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.com", "TemperatureConverterService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.com", "TemperatureConverter"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TemperatureConverter".equals(portName)) {
            setTemperatureConverterEndpointAddress(address);
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
