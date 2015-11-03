package com.metacube;

import com.metacube.webservices.TempConvert;
import com.metacube.webservices.TempConvertServiceLocator;

public class WSClient {

	public static void main(String[] args) {
		TempConvertServiceLocator calcCTCWebServiceImplServiceLocator = new TempConvertServiceLocator();
		calcCTCWebServiceImplServiceLocator.setTempConvertEndpointAddress("http://localhost:8080/TempConverter/services/TempConvert");
		
		try {
			TempConvert calcCTCWebService = calcCTCWebServiceImplServiceLocator.getTempConvert();
			
			System.out.println(calcCTCWebService.fahrenhiteToCelsius(98.7));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}