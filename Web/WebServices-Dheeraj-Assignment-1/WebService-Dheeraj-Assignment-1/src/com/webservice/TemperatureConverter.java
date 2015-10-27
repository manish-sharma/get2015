package com.webservice;

import javax.jws.WebService;

@WebService
public class TemperatureConverter  {

		public Float convert(int converterType , Float  input)
		{ 
			Float output = null ;
			if(converterType<1||converterType >2 ||input == null)
				return output;
			if(converterType == 1)
				output = (input *(9/5)) +32;
			else if(converterType ==2)
				output = (input - 32)*(5/9);
			return output;
		}
}