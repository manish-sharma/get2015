/**
 * TemperatureConverter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.meta.webservices;

public interface TemperatureConverter extends java.rmi.Remote {
    public float convertFahrenheitToCelcius(float fahr) throws java.rmi.RemoteException;
    public float convertCelciusToFahrenheit(float cel) throws java.rmi.RemoteException;
}
