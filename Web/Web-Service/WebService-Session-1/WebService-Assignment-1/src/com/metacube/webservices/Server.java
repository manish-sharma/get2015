package com.metacube.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Server {
	@WebMethod
	public double fahrenheitToCelsius(double fahrenheit)
	{
		//Method converting temperature Fahrenheit To Celsius
		double celsius = 0;
		celsius = (5*(fahrenheit-32)/9);
        System.out.print("The fahrenheit degree " + fahrenheit + " is " + celsius + " in celsius." );
		return celsius;	
	}

}
