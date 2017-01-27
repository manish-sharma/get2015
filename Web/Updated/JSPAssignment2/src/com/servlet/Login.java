
package com.servlet;
import javax.servlet.http.*;
import javax.servlet.*;

import com.helper.UserHelper;
import com.model.User;

import database.Helper;

import java.sql.*;
import java.io.*;

public class Login extends HttpServlet
{
	public void doGet( HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException 
	{
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		User user = UserHelper.getUserByUserName(userName);
		   if(user != null)
		   { 
				if(user.getPassword().equals(password))
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
	}  
			

}
		