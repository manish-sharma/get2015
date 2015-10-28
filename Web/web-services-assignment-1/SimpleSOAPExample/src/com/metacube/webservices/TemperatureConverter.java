package com.metacube.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
/**
 * Web service contain convert method that convert fahrenheit into celcius
 * @author Ravika
 * @since 26-10-2015
 */
@WebService
public class TemperatureConverter {
	/**
	 * method to convert fahrenheit into celcius
	 * @param farenheit
	 * @return converted value that is celcius value
	 */
	@WebMethod
	public double convert(double farenheit) {
		
		return (farenheit - 32) * 5/9;

	}

}
