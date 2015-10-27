package com.metacube.webservices;

public class FahrenheitToCelsiusProxy implements com.metacube.webservices.FahrenheitToCelsius {
  private String _endpoint = null;
  private com.metacube.webservices.FahrenheitToCelsius fahrenheitToCelsius = null;
  
  public FahrenheitToCelsiusProxy() {
    _initFahrenheitToCelsiusProxy();
  }
  
  public FahrenheitToCelsiusProxy(String endpoint) {
    _endpoint = endpoint;
    _initFahrenheitToCelsiusProxy();
  }
  
  private void _initFahrenheitToCelsiusProxy() {
    try {
      fahrenheitToCelsius = (new com.metacube.webservices.FahrenheitToCelsiusServiceLocator()).getFahrenheitToCelsius();
      if (fahrenheitToCelsius != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)fahrenheitToCelsius)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)fahrenheitToCelsius)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (fahrenheitToCelsius != null)
      ((javax.xml.rpc.Stub)fahrenheitToCelsius)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.metacube.webservices.FahrenheitToCelsius getFahrenheitToCelsius() {
    if (fahrenheitToCelsius == null)
      _initFahrenheitToCelsiusProxy();
    return fahrenheitToCelsius;
  }
  
  public float fahrenheitToCelsiusConverter(float fahrenheit) throws java.rmi.RemoteException{
    if (fahrenheitToCelsius == null)
      _initFahrenheitToCelsiusProxy();
    return fahrenheitToCelsius.fahrenheitToCelsiusConverter(fahrenheit);
  }
  
  
}