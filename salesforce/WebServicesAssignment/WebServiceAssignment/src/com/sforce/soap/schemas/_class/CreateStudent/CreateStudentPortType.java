/**
 * CreateStudentPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.schemas._class.CreateStudent;

public interface CreateStudentPortType extends java.rmi.Remote {
    public java.lang.String createStudentWithClassid(java.lang.String firstName, java.lang.String lastName, java.lang.String classId) throws java.rmi.RemoteException;
    public java.lang.String createStudentWithRequiredField(java.lang.String firstName, java.lang.String lastName, java.lang.String className) throws java.rmi.RemoteException;
}
