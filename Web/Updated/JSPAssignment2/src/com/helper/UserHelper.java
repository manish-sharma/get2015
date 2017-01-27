package com.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.User;

import database.Helper;

public class UserHelper {
   public static User getUserByUserName(String userName){
	    
	    User user = null;
	    Helper helper = new Helper();
		String sql = "SELECT * FROM registration where user_name='"+userName+"'";
		ResultSet rs = helper.executeQuery(sql);
		try {
			if(rs.next()) 
			{
				     String name = rs.getString(1);
					 String email = rs.getString(3);
					 String password =rs.getString(4);
					 user = new User(name, userName, email, password);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
	   return user;
   } 
}
