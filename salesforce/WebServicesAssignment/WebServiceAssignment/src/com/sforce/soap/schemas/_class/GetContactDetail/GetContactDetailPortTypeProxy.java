package com.sforce.soap.schemas._class.GetContactDetail;

public class GetContactDetailPortTypeProxy implements com.sforce.soap.schemas._class.GetContactDetail.GetContactDetailPortType {
  private String _endpoint = null;
  private com.sforce.soap.schemas._class.GetContactDetail.GetContactDetailPortType getContactDetailPortType = null;
  
  public GetContactDetailPortTypeProxy() {
    _initGetContactDetailPortTypeProxy();
  }
  
  public GetContactDetailPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetContactDetailPortTypeProxy();
  }
  
  private void _initGetContactDetailPortTypeProxy() {
    try {
      getContactDetailPortType = (new com.sforce.soap.schemas._class.GetContactDetail.GetContactDetailServiceLocator()).getGetContactDetail();
      if (getContactDetailPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getContactDetailPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getContactDetailPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getContactDetailPortType != null)
      ((javax.xml.rpc.Stub)getContactDetailPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sforce.soap.schemas._class.GetContactDetail.GetContactDetailPortType getGetContactDetailPortType() {
    if (getContactDetailPortType == null)
      _initGetContactDetailPortTypeProxy();
    return getContactDetailPortType;
  }
  
  public java.lang.String getAllContact() throws java.rmi.RemoteException{
    if (getContactDetailPortType == null)
      _initGetContactDetailPortTypeProxy();
    return getContactDetailPortType.getAllContact();
  }
  
  public java.lang.String searchContactByEmail(java.lang.String contactEmail) throws java.rmi.RemoteException{
    if (getContactDetailPortType == null)
      _initGetContactDetailPortTypeProxy();
    return getContactDetailPortType.searchContactByEmail(contactEmail);
  }
  
  public java.lang.String searchContactById(java.lang.String contactId) throws java.rmi.RemoteException{
    if (getContactDetailPortType == null)
      _initGetContactDetailPortTypeProxy();
    return getContactDetailPortType.searchContactById(contactId);
  }
  
  public java.lang.String searchContactByName(java.lang.String contactName) throws java.rmi.RemoteException{
    if (getContactDetailPortType == null)
      _initGetContactDetailPortTypeProxy();
    return getContactDetailPortType.searchContactByName(contactName);
  }
  
  
}