package com.meta.webservices;

public class TemperatureConverterProxy implements com.meta.webservices.TemperatureConverter {
  private String _endpoint = null;
  private com.meta.webservices.TemperatureConverter temperatureConverter = null;
  
  public TemperatureConverterProxy() {
    _initTemperatureConverterProxy();
  }
  
  public TemperatureConverterProxy(String endpoint) {
    _endpoint = endpoint;
    _initTemperatureConverterProxy();
  }
  
  private void _initTemperatureConverterProxy() {
    try {
      temperatureConverter = (new com.meta.webservices.TemperatureConverterServiceLocator()).getTemperatureConverter();
      if (temperatureConverter != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)temperatureConverter)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)temperatureConverter)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (temperatureConverter != null)
      ((javax.xml.rpc.Stub)temperatureConverter)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.meta.webservices.TemperatureConverter getTemperatureConverter() {
    if (temperatureConverter == null)
      _initTemperatureConverterProxy();
    return temperatureConverter;
  }
  
  public float convertFahrenheitToCelcius(float fahr) throws java.rmi.RemoteException{
    if (temperatureConverter == null)
      _initTemperatureConverterProxy();
    return temperatureConverter.convertFahrenheitToCelcius(fahr);
  }
  
  public float convertCelciusToFahrenheit(float cel) throws java.rmi.RemoteException{
    if (temperatureConverter == null)
      _initTemperatureConverterProxy();
    return temperatureConverter.convertCelciusToFahrenheit(cel);
  }
  
  
}