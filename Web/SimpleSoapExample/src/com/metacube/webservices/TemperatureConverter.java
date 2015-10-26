/** temperature conversion web service. converts farenheit temperature to celsius temperature
 * 
 * 	@author: Gaurav Saini
 * 	Date: 26/10/2015
 * 
 */

package com.metacube.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class TemperatureConverter {
	
	/**	method to convert farenheit to celsius.
	 * 
	 * @param farenheit
	 * @return
	 */
	@WebMethod
	public double convertFarenheitToCelsius(double farenheit) {
		
		return (farenheit - 32) * 5 / 9;		//converting the farenheit temperature to celsius temperature
		
	}

}