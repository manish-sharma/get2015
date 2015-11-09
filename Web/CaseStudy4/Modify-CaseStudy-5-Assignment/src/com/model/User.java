package com.model;

import lombok.Data;

@Data
public class User {

	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String phoneNo;
	private Gender gender ;
	private String address;
	private int privilege =0;
}
