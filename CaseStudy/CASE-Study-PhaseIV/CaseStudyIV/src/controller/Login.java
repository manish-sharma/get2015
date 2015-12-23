
package controller;
import javax.servlet.http.*;
import javax.servlet.*;

import dao.Helper;

import java.sql.*;
import java.io.*;

public class Login extends HttpServlet {
	public void doPost( HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userId = request.getParameter("userid");
		String password = request.getParameter("password");
		
		Helper helper = new Helper();
		
		String sql = "SELECT user_id,password FROM admin WHERE user_id='"+userId+"' AND password='"+password+"'";
		ResultSet rs = helper.executeQuery(sql);
		try {
			if(rs.next())
			{
					RequestDispatcher rd=request.getRequestDispatcher("view/admin/adminindex.jsp");
					HttpSession session = request.getSession();
					session.setAttribute("admin", userId);
					rd.forward(request, response); 
			}
			else 
			{   request.setAttribute("flag", "UserId or Password incorrect!!");
				RequestDispatcher rd=request.getRequestDispatcher("view/login.jsp");  
				rd.forward(request, response); 
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}