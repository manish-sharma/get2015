package com.metacube.registration.helper;

import com.metacube.registration.User;
import com.metacube.registration.dBHelper.FatchDatabase;
import com.metacube.registration.dBHelper.InsertUser;

public class CreateUser {
	
	public static String createUser(String email, String firstName, String lastName, String password) {
		
		boolean isUserAlreadyPresernt = FatchDatabase.isUserAlreadyPresernt(email);
		System.out.println(isUserAlreadyPresernt);
		String message = null;
		if(isUserAlreadyPresernt) {
			message =  "User with this Email is already present";
		} else {
			User user = new User(email, firstName, lastName, password);
			boolean isUserInserted = InsertUser.insertUser(user);
			System.out.println(isUserInserted);
			if(isUserInserted) {
				message = "success";
			} else {
				message = "There is Some Problem please check Console";
			}
		}
		
		return message;
	}
}
