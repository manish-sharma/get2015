package com.metacube;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;


public class RunService {

	public static void main(String[] args) throws RemoteException {
		
		TemperatureConvertorServiceLocator temperatureConvertorServiceLocator = new TemperatureConvertorServiceLocator();
		temperatureConvertorServiceLocator.setTemperatureConvertorEndpointAddress("http://localhost:8080/ServiceProvider/services/TemperatureConvertor");
		
		try { 
          
			TemperatureConvertor temperatureConvertor;
			temperatureConvertor = temperatureConvertorServiceLocator.getTemperatureConvertor();
            System.out.print("Enter Temprature (in Fahrenheit):");
            Double fahrenheitTemprature = new java.util.Scanner(System.in).nextDouble();
			System.out.println("(In Celsius): "+temperatureConvertor.convert(fahrenheitTemprature));
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
