package com.mkyong.web.service;

import com.mkyong.web.exception.CustomGenericException;

public class MainService {

	public static void getPages() throws CustomGenericException{
		try{
			int i=10/0;
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
			throw new CustomGenericException(MainService.class+e.getClass().getName(), e.getMessage());
		}
	}
}
