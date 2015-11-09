package com.model;

import lombok.Data;

@Data
public class Login {

	private String emailId;
	private String password;
	private static Login adminLogin = new Login();

	static {
		adminLogin.setEmailId("admin@metahrm.com");
		adminLogin.setPassword("admin");

	}

	public static Login getAdminInstance() {
		return adminLogin;
	}

}
