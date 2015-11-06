package com.meta.webservices;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class TemperatureConverter {
	@WebMethod
	public float convertCelciusToFahrenheit(float cel){
		return ((((cel) * 9) / 5) + 32);
	}
	@WebMethod
	public float convertFahrenheitToCelcius(float fahr){
		 return ((((fahr) - 32) / 9) * 5);
	}
}
