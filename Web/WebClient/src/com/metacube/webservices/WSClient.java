package com.metacube.webservices;

import java.util.Scanner;

/**
 * @author Anjita
 * Client using web service FahrenheitToCelsius
 */
public class WSClient {
	public static void main(String[] args) {
		FahrenheitToCelsiusServiceLocator fahrenheitToCelsiusServiceLocator = new FahrenheitToCelsiusServiceLocator();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temprature in fahrenheit");
		float fahrenheit = scanner.nextFloat();
		fahrenheitToCelsiusServiceLocator.setFahrenheitToCelsiusEndpointAddress("http://localhost:8080/WebService-Session-1/services/FahrenheitToCelsius");
		try {
			FahrenheitToCelsius fahrenheitToCelsius = fahrenheitToCelsiusServiceLocator.getFahrenheitToCelsius();
			System.out.println("Tempratuer in Celsius is = "+fahrenheitToCelsius.fahrenheitToCelsiusConverter(fahrenheit));
		} catch (Exception e) {
			e.printStackTrace();
		}
		scanner.close();
	}
}