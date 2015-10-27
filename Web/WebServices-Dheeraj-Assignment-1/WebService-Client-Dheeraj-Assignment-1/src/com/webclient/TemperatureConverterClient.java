package com.webclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.webservice.TemperatureConverter;
import com.webservice.TemperatureConverterServiceLocator;

public class TemperatureConverterClient {

	public static void main(String[] args) {
		TemperatureConverterServiceLocator temperatureConverterServiceLocator = new TemperatureConverterServiceLocator();
		temperatureConverterServiceLocator
				.setTemperatureConverterEndpointAddress("http://localhost:8080/WebService-Dheeraj-Assignment-1/services/TemperatureConverter");
		TemperatureConverter temperatureConverter = null ;
		float output = 0 ;
		try {
			temperatureConverter = temperatureConverterServiceLocator.getTemperatureConverter();
			System.out.println("Enter 1 for Fahrenheit to celsius and 2 for  celsius to Fahrenheit Converter");
			int inputType = (int) readData(InputType.INTEGER, 1, 2);
			System.out.println("Enter data");
			float data = (float)readData(InputType.FLOAT,1,2000);
			output = temperatureConverter.convert(inputType, data);
			
		} catch(Exception e ) {
			System.out.println(e.getMessage());
		}
		System.out.println("Output is "+ output);
	}
	
	private static Number readData (InputType inputType ,Integer min ,Integer max) {
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Number data;
		
		do {
			try {
				if(inputType.equals(InputType.INTEGER))
					data = new Integer( Integer.parseInt(bufferedReader.readLine().trim()));
				else
					data = new Float(Float.parseFloat(bufferedReader.readLine().trim()));
			}
			catch (NumberFormatException nf) {
				System.out.println("Please enter numbers");
				continue;
			}
			catch(IOException io) {
				System.out.println("Error Occrued please enter input again");
				continue;
			}
			if(inputType.equals(InputType.INTEGER)&&((Integer)data<min||(Integer)data>max)){
				System.out.println("please enter valid input");
				continue;
			}
		
			break;
		}while(true);
		return data;
	}
}
