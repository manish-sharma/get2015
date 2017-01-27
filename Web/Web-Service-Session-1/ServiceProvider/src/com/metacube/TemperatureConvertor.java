package com.metacube;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class TemperatureConvertor {
	
	@WebMethod
	public double convert(double farenheit){
		return (farenheit-32) * 5 / 9;
		
	}

}
