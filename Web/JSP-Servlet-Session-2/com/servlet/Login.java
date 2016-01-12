
package com.servlet;
import javax.servlet.http.*;
import javax.servlet.*;

import database.Helper;

import java.sql.*;
import java.io.*;

public class Login extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		Helper helper = new Helper();
		
		String sql = "SELECT user_name,password FROM registration where user_name='"+userName+"'";
		ResultSet rs = helper.executeQuery(sql);
		try {
			if(rs.next())
			{
				if(rs.getString("password").equals(password))
				{
					out.print("<h1 style=\"color:green;\">You have been logged in Successfully!!!</h1>");
				}
				else 
				{
					out.print("<h1 style=\"color:red;\">Incorrect Password!!!</h1>");
				}
			}
			else 
			{
				out.print("<h1 style=\"color:red;\">User name is not exist!!!</h1>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}