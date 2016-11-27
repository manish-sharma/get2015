/**
 * GetContactDetailPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sforce.soap.schemas._class.GetContactDetail;

public interface GetContactDetailPortType extends java.rmi.Remote {
    public java.lang.String getAllContact() throws java.rmi.RemoteException;
    public java.lang.String searchContactByEmail(java.lang.String contactEmail) throws java.rmi.RemoteException;
    public java.lang.String searchContactById(java.lang.String contactId) throws java.rmi.RemoteException;
    public java.lang.String searchContactByName(java.lang.String contactName) throws java.rmi.RemoteException;
}
