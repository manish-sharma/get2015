package com.metacube.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class TemperatureConverter {

	@WebMethod
	public float farheniteToCelsius(float farhenite){
		float celsius = ((farhenite - 32)*5)/9;
		return celsius;
	}
}
