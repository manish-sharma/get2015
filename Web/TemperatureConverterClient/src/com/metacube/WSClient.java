/** temperature conversion web service client
 * 
 * 	@author: Gaurav Saini
 * 	Date: 26/10/2015
 * 
 */

package com.metacube;

import com.metacube.webservices.TemperatureConverter;
import com.metacube.webservices.TemperatureConverterServiceLocator;

public class WSClient {

	public static void main(String[] args) {

		TemperatureConverterServiceLocator calcCTCWebServiceImplServiceLocator = new TemperatureConverterServiceLocator();
		calcCTCWebServiceImplServiceLocator.setTemperatureConverterEndpointAddress("http://localhost:8080/SimpleSoapExample/services/TemperatureConverter");

		try {
			TemperatureConverter calcCTCWebService = calcCTCWebServiceImplServiceLocator.getTemperatureConverter();

			System.out.println(calcCTCWebService.convertFarenheitToCelsius(98.3));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}