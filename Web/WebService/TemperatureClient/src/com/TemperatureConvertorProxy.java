package com;

public class TemperatureConvertorProxy implements com.TemperatureConvertor {
  private String _endpoint = null;
  private com.TemperatureConvertor temperatureConvertor = null;
  
  public TemperatureConvertorProxy() {
    _initTemperatureConvertorProxy();
  }
  
  public TemperatureConvertorProxy(String endpoint) {
    _endpoint = endpoint;
    _initTemperatureConvertorProxy();
  }
  
  private void _initTemperatureConvertorProxy() {
    try {
      temperatureConvertor = (new com.TemperatureConvertorServiceLocator()).getTemperatureConvertor();
      if (temperatureConvertor != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)temperatureConvertor)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)temperatureConvertor)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (temperatureConvertor != null)
      ((javax.xml.rpc.Stub)temperatureConvertor)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.TemperatureConvertor getTemperatureConvertor() {
    if (temperatureConvertor == null)
      _initTemperatureConvertorProxy();
    return temperatureConvertor;
  }
  
  public float fahrenheitToCelsius(float value) throws java.rmi.RemoteException{
    if (temperatureConvertor == null)
      _initTemperatureConvertorProxy();
    return temperatureConvertor.fahrenheitToCelsius(value);
  }
  
  public float celsiusTofahrenheit(float value) throws java.rmi.RemoteException{
    if (temperatureConvertor == null)
      _initTemperatureConvertorProxy();
    return temperatureConvertor.celsiusTofahrenheit(value);
  }
  
  
}