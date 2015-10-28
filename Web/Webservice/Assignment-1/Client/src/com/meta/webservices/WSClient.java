package com.meta.webservices;
/**Client class for using the webservice 
 * 
 * @author Shishir
 *Date 28th October 2015
 */
public class WSClient {

	public static void main(String[] args) {
      TemperatureConvertorServiceLocator convertorServiceLocator = new TemperatureConvertorServiceLocator();
	  convertorServiceLocator.setTemperatureConvertorEndpointAddress("http://localhost:8080/WSAssignment_1/services/TemperatureConvertor");
	  try{
		  TemperatureConvertor convertor = convertorServiceLocator.getTemperatureConvertor();
		  System.out.println(convertor.farenheitToCelsius(99));
	  }catch(Exception e){
		  e.printStackTrace();
	  }
	}

}
