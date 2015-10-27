                                          package com.metacube.carDekho.model;

import com.metacube.carDekho.helper.FatchDatabase;


public class UserAuthenticator {

	public static String isUserValid(String userName, String password) {
		String isUserValid = null;
		
		if(!(FatchDatabase.isEmailCorrect(userName))) {
			isUserValid = "Invalid Email";
		} else if(!(FatchDatabase.isPasswordCorrect(userName, password))) {
			isUserValid = "Invalid password";
		} else {
			isUserValid = "success";
		}
		return isUserValid;
	}

}
