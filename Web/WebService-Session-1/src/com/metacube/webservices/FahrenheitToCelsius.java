package com.metacube.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author Anjita
 * WebService Class FahrenheitToCelsius having webMethod fahrenheitToCelsiusConverter. 
 */
@WebService
public class FahrenheitToCelsius {
	
	/**
	 * @param fahrenheit : temprature in fahrenheit
	 * @return celsius : temprature in celsius.
	 */
	@WebMethod
	public float fahrenheitToCelsiusConverter(float fahrenheit){
		float celsius = (fahrenheit-32)*5/9;
		return celsius;
	}

}
