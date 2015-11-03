package com.metacube.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class TempConvert {
	
	@WebMethod
	public double fahrenhiteToCelsius( double tempInFahrenhite) {
		return (tempInFahrenhite - 32)*5/9;
	}

}
