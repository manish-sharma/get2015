package com.metacube.clientmodel;

import com.metacube.webservices.TemperatureConverter;
import com.metacube.webservices.TemperatureConverterServiceLocator;

public class TemperatureConverterClient {

	public static void main(String[] args) {
		TemperatureConverterServiceLocator converterServiceLocator = new TemperatureConverterServiceLocator();
		converterServiceLocator.setTemperatureConverterEndpointAddress("http://localhost:8080/SOAPTemperatureConverter/services/TemperatureConverter");
		try{
			TemperatureConverter converter = converterServiceLocator.getTemperatureConverter();
			System.out.println(converter.farheniteToCelsius(98));
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
