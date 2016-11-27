/**
 * TemperatureConvertor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com;

public interface TemperatureConvertor extends java.rmi.Remote {
    public float fahrenheitToCelsius(float value) throws java.rmi.RemoteException;
    public float celsiusTofahrenheit(float value) throws java.rmi.RemoteException;
}
