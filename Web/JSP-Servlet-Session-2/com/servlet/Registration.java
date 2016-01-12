
package com.servlet;
import javax.servlet.http.*;
import javax.servlet.*;
import database.Helper;
import java.sql.*;

import java.io.*;

public class Registration extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String userName = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Helper helper = new Helper();
		
		String sql = "INSERT INTO registration values ('"+name+"','"+userName+"','"+email+"','"+password+"')";
		int res = helper.executeUpdate(sql);
		if(res==1)
		{
		   out.print("<h1 style=\"color:green;\">You have been Registered Successfully!!!</h1>");
		}
		else 
		{
			out.print("<h1 style=\"color:red;\">User of user name '"+userName+"' is already exist !!!</h1>");
		}
	}
		
}