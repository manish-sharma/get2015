/**
 * Assignment-1
 * Write a user registration application:
 * 1. Contains a user registration information form (JSP page) that requests a servlet.
 * 2. Contains a servlet that accepts the request sent by client and persists the information in the database tables.
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
public class RegistrationForm extends HttpServlet {

	/**
	 * this function is used to insert data in database
	 * @param uName
	 * @param psw
	 * @param eMail
	 * @return message
	 */
	public String insertData(String uName, String psw, String eMail) {

		try {
			ConnectionUtil connectionUtil = new ConnectionUtil();
			Connection conn = connectionUtil.getConnection();
			PreparedStatement ps;
			ResultSet rs;
			String query = "SELECT userName FROM formtable WHERE userName=?";
			String query1 = "INSERT INTO formtable (userName,password,email) VALUES (?,?,?)";

			ps = conn.prepareStatement(query);
			ps.setString(1, uName);
			rs = ps.executeQuery();
			if (rs.next()) {
				return "User name already exists";
			}
			ps = conn.prepareStatement(query1);
			ps.setString(1, uName);
			ps.setString(2, psw);
			ps.setString(3, eMail);
			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			return "duplicate email id";
		}
		return "Successfully profile created";
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
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		if (uName == "") {
			out.println("user Name not entered");
			flag = false;
		}

		if (email == "") {
			out.println("email is not entered");
			flag = false;
		}

		if (password.length() < 8) {
			out.println("Password Length should be greater than 8 ");
			flag = false;
		}

		if (!req.getParameter("password").equalsIgnoreCase(
				req.getParameter("confirmPassword"))) {
			out.println("Password doesn't match");
			flag = false;
		}

		if (req.getParameter("states") == "") {
			out.println("State is not entered");
			flag = false;
		}
		if (req.getParameter("cities") == "") {
			out.println("City is not entered");
			flag = false;
		}
		if (req.getParameter("address") == "") {
			out.println("Address is not entered");
			flag = false;
		}
		if (req.getParameter("age") == "") {
			out.println("Age is not entered");
			flag = false;
		}
		if (flag == true) {
			String output = insertData(uName, password, email);
			if (!output.equals("Successfully profile created")) {
				req.setAttribute("result", output);
				req.getRequestDispatcher("Form.jsp").forward(req, res);
			} else {
				out.println(output);
			}

		}
	}
}
