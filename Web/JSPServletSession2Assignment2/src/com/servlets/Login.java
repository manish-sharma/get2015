/**
 * Assignment-2
 * login page:
 * 1. Contains a login jsp page which requires username and password.
 * 2. The login page requests a servlet to validate the login credentials. 
 * The servlet calls the api to fetch the information saved in assignment #1 and then validates it 
 * (possibly username and password) against the login credentials.
 * 3. In case of successful login the jsp page must be displayed showing the successfully logged in 
 * and in case of failure the login page 	must again be displayed to re-login.
 */
package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Anjita
 *
 */
public class Login extends HttpServlet {

	/**
	 * @param uName
	 * @param psw
	 * @return message that user name and password is matched or not
	 */
	public String matchData(String uName, String psw) {
		try {
			ConnectionUtil connectionUtil = new ConnectionUtil();
			Connection conn = connectionUtil.getConnection();
			PreparedStatement ps;
			ResultSet rs;
			String query = "SELECT userName FROM formTable WHERE userName=? AND password=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, uName);
			ps.setString(2, psw);
			rs = ps.executeQuery();
			if (rs.next()) {
				return "successfully login";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Please check your user name and password";
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		boolean flag = true;
		res.setContentType("text/html");
		String uName = req.getParameter("userName");
		String password = req.getParameter("password");
		if (uName == "") {
			out.println("Please enter user Name ");
			flag = false;
		}
		if (password == "") {
			out.println("Please enter password");
			flag = false;
		}
		if (flag == true) {
			String output = matchData(uName, password);
			if (!output.equals("successfully login")) {
				req.setAttribute("result", output);
				req.getRequestDispatcher("Form.jsp").forward(req, res);
			} else {
				out.println(output);
			}

		}
	}
}
