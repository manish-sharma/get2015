package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connutil.ConnectionUtil;

import java.sql.*;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/CheckLoginDetails")
public class CheckLoginDetails extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username, password;
		username = request.getParameter("userName").toString();
		password = request.getParameter("password").toString();
		Connection conn = null;
		Statement stmt = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		ResultSet rs = null;
		conn = conUtil.getConnection();
		 PreparedStatement pstmt=null;
		RequestDispatcher dispatcher= request.getRequestDispatcher("Login.jsp");
		RequestDispatcher errorDispatcher= request.getRequestDispatcher("errorPage.jsp");
	   
		try {
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			
			String sql = "SELECT password FROM registration where username= ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, username);
		    rs = pstmt.executeQuery();
			// STEP 5: Extract data from result set
			if(rs.next()) {
				// Retrieve by column name
				String dbpassword = rs.getString("password");
				if(password.equalsIgnoreCase(dbpassword)) {
								out.print("<br><a href='Login.jsp'>Login Successfull</a>");
					}
					else{
						request.setAttribute("failure", "Password did'nt match");
						dispatcher.forward(request, response);
					}
				
				}
			else {
				request.setAttribute("failure", "User Name  did'nt exist");
				dispatcher.forward(request, response);
			}
			rs.close();
		
		} catch (SQLException se) {
			System.out.println("abamnkaikh");
			request.setAttribute("error", se.getMessage());
			errorDispatcher.forward(request, response);
		} catch (Exception e) {
			request.setAttribute("error", e.getMessage());
			errorDispatcher.forward(request, response);
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					conn.close();
			} catch (SQLException se) {
				request.setAttribute("error", se.getMessage());
				errorDispatcher.forward(request, response);
			}// do nothing
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				request.setAttribute("error", se.getMessage());
				errorDispatcher.forward(request, response);
			}// end finally try
		}// end try
	}// end main
}
