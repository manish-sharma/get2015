package com.metacube.webservices;

public class TempConvertProxy implements com.metacube.webservices.TempConvert {
  private String _endpoint = null;
  private com.metacube.webservices.TempConvert tempConvert = null;
  
  public TempConvertProxy() {
    _initTempConvertProxy();
  }
  
  public TempConvertProxy(String endpoint) {
    _endpoint = endpoint;
    _initTempConvertProxy();
  }
  
  private void _initTempConvertProxy() {
    try {
      tempConvert = (new com.metacube.webservices.TempConvertServiceLocator()).getTempConvert();
      if (tempConvert != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)tempConvert)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)tempConvert)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (tempConvert != null)
      ((javax.xml.rpc.Stub)tempConvert)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.metacube.webservices.TempConvert getTempConvert() {
    if (tempConvert == null)
      _initTempConvertProxy();
    return tempConvert;
  }
  
  public double fahrenhiteToCelsius(double tempInFahrenhite) throws java.rmi.RemoteException{
    if (tempConvert == null)
      _initTempConvertProxy();
    return tempConvert.fahrenhiteToCelsius(tempInFahrenhite);
  }
  
  
}