/**
 * CreateStudentServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.schemas._class.CreateStudent;

public class CreateStudentServiceLocator extends org.apache.axis.client.Service implements com.sforce.soap.schemas._class.CreateStudent.CreateStudentService {

    public CreateStudentServiceLocator() {
    }


    public CreateStudentServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreateStudentServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreateStudent
    private java.lang.String CreateStudent_address = "https://ap2.salesforce.com/services/Soap/class/CreateStudent";

    public java.lang.String getCreateStudentAddress() {
        return CreateStudent_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreateStudentWSDDServiceName = "CreateStudent";

    public java.lang.String getCreateStudentWSDDServiceName() {
        return CreateStudentWSDDServiceName;
    }

    public void setCreateStudentWSDDServiceName(java.lang.String name) {
        CreateStudentWSDDServiceName = name;
    }

    public com.sforce.soap.schemas._class.CreateStudent.CreateStudentPortType getCreateStudent() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreateStudent_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreateStudent(endpoint);
    }

    public com.sforce.soap.schemas._class.CreateStudent.CreateStudentPortType getCreateStudent(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sforce.soap.schemas._class.CreateStudent.CreateStudentBindingStub _stub = new com.sforce.soap.schemas._class.CreateStudent.CreateStudentBindingStub(portAddress, this);
            _stub.setPortName(getCreateStudentWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreateStudentEndpointAddress(java.lang.String address) {
        CreateStudent_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sforce.soap.schemas._class.CreateStudent.CreateStudentPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sforce.soap.schemas._class.CreateStudent.CreateStudentBindingStub _stub = new com.sforce.soap.schemas._class.CreateStudent.CreateStudentBindingStub(new java.net.URL(CreateStudent_address), this);
                _stub.setPortName(getCreateStudentWSDDServiceName());
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
        if ("CreateStudent".equals(inputPortName)) {
            return getCreateStudent();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.sforce.com/schemas/class/CreateStudent", "CreateStudentService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.sforce.com/schemas/class/CreateStudent", "CreateStudent"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreateStudent".equals(portName)) {
            setCreateStudentEndpointAddress(address);
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
