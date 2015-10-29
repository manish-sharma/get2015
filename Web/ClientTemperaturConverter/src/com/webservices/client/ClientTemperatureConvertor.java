package com.webservices.client;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.webservices.TemperatureConverter;
import com.webservices.TemperatureConverterServiceLocator;

public class ClientTemperatureConvertor {
	
	public static void main(String[] args) {
		TemperatureConverterServiceLocator temperatureConverterServiceLocator = new TemperatureConverterServiceLocator();
		temperatureConverterServiceLocator.setTemperatureConverterEndpointAddress("http://localhost:8080/WebServiceAssignment1/services/TemperatureConverter");
		try {
			TemperatureConverter temperatureConverter = temperatureConverterServiceLocator.getTemperatureConverter();
			try {
				System.out.println(temperatureConverter.converter(14));
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
