package com.meta.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;
/**Class implementing webservice to convert the temperature in farenheit to celcius 
 * 
 * @author Shishir
 *Date 28th October 2015
 */
@WebService
public class TemperatureConvertor {

	@WebMethod
	public float farenheitToCelsius ( float farenheit ){
		return (farenheit - 32) * 5 / 9;
	}

}


