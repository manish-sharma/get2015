package com.meta.mainclasses;

import com.meta.webservices.TemperatureConverter;
import com.meta.webservices.TemperatureConverterServiceLocator;

public class TemperatureConverterUse {
	
	public static void main(String args[]){
		TemperatureConverterServiceLocator converterServiceLocator = new TemperatureConverterServiceLocator();
		converterServiceLocator.setTemperatureConverterEndpointAddress("http://localhost:8080/TemperatureConverterWS/services/TemperatureConverter");
		try{
			TemperatureConverter converter = converterServiceLocator.getTemperatureConverter();
			System.out.println(converter.convertFahrenheitToCelcius(90));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
