package com.sforce.soap.schemas._class.CreateStudent;

public class CreateStudentPortTypeProxy implements com.sforce.soap.schemas._class.CreateStudent.CreateStudentPortType {
  private String _endpoint = null;
  private com.sforce.soap.schemas._class.CreateStudent.CreateStudentPortType createStudentPortType = null;
  
  public CreateStudentPortTypeProxy() {
    _initCreateStudentPortTypeProxy();
  }
  
  public CreateStudentPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initCreateStudentPortTypeProxy();
  }
  
  private void _initCreateStudentPortTypeProxy() {
    try {
      createStudentPortType = (new com.sforce.soap.schemas._class.CreateStudent.CreateStudentServiceLocator()).getCreateStudent();
      if (createStudentPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)createStudentPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)createStudentPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (createStudentPortType != null)
      ((javax.xml.rpc.Stub)createStudentPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sforce.soap.schemas._class.CreateStudent.CreateStudentPortType getCreateStudentPortType() {
    if (createStudentPortType == null)
      _initCreateStudentPortTypeProxy();
    return createStudentPortType;
  }
  
  public java.lang.String createStudentWithClassid(java.lang.String firstName, java.lang.String lastName, java.lang.String classId) throws java.rmi.RemoteException{
    if (createStudentPortType == null)
      _initCreateStudentPortTypeProxy();
    return createStudentPortType.createStudentWithClassid(firstName, lastName, classId);
  }
  
  public java.lang.String createStudentWithRequiredField(java.lang.String firstName, java.lang.String lastName, java.lang.String className) throws java.rmi.RemoteException{
    if (createStudentPortType == null)
      _initCreateStudentPortTypeProxy();
    return createStudentPortType.createStudentWithRequiredField(firstName, lastName, className);
  }
  
  
}