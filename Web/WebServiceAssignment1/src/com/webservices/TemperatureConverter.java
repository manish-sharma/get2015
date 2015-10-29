package com.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class TemperatureConverter {

	@WebMethod
	public double Converter(double fahrneheit){
		double celcious = (fahrneheit -32)*5/9;
		return celcious;
		
	}
}
