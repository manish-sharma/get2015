package com.DatabaseHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Connection.ConnectionUtil;
import com.Model.User;

public class UserTableQuery {
	
	public static boolean insertInfo(User user){
	
	boolean flag=true;	
	Connection con = null;
	ConnectionUtil conUtil = new ConnectionUtil();
	con = conUtil.getConnection();
	String query = "INSERT INTO userdetail VALUES(?,?,?)";
	ResultSet rs = null;
	PreparedStatement ps = null;

	try {

		ps = con.prepareStatement(query);
		ps.setString(1,user.getUserid());
		ps.setString(2,user.getEmail());
		ps.setString(3,user.getPassword());
		ps.executeUpdate();
		
	}
	
	catch (SQLException e) {
		// TODO Auto-generated catch block
		
		flag=false;
		
	} finally {
	

		try {

			if (con != null) {
				con.close();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	return flag;
}
	
	public static boolean isValidUser(User user){
		
		
		boolean flag=false;	
		Connection con = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		con = conUtil.getConnection();
		String query = "SELECT userid FROM userdetail WHERE userid=? and password=?";
		ResultSet rs = null;
		PreparedStatement ps = null;

		try {

			ps = con.prepareStatement(query);
			ps.setString(1,user.getUserid());
			ps.setString(2,user.getPassword());
			rs=ps.executeQuery();
			if(rs.next()){
				flag=true;
			}
			else{
				flag=false;
			}
		}
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			
		} finally {
		

			try {

				if (con != null) {
					con.close();
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return flag;
		
	}

	


}
