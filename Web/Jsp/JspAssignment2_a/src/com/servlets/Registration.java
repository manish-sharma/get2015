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
@WebServlet("/Registration")
public class Registration extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		String username, password, email;
		username = request.getParameter("userName").toString();
		password = request.getParameter("password").toString();
		String query = "SELECT * FROM Register";
		Connection con = null;
		int isInsert = 0;
		Statement stmt = null;
		ConnectionUtil conUtil = new ConnectionUtil();
		ResultSet rs = null;
		con = conUtil.getConnection();
		boolean usernameExist = false;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			String existUserName;
			while (rs.next()) {
				existUserName = rs.getString("userName");
				if (existUserName.equals(username)) {
					usernameExist = true;
					break;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (usernameExist == true) {
			request.setAttribute("Message", "User Name already exist");
			rd=request.getRequestDispatcher("/view/Error.jsp");
			
			rd.forward(request, response);
			
		} else {
			try {
				query = "INSERT INTO Register VALUES('" + email + "','"
						+ username + "','" + password + "')";

				try {
					stmt = con.createStatement();
					isInsert = stmt.executeUpdate(query);
					if (isInsert > 0) {
						request.setAttribute("Message", "User Registered");
						rd=request.getRequestDispatcher("/view/Success.jsp");
						rd.forward(request, response);
					}

				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					/* close connection */
					try {
						if (con != null) {
							con.close();
						}
						if (stmt != null) {
							stmt.close();
						}

					} catch (SQLException e) {
						e.printStackTrace();
					}

				}
			} catch (Exception e) {
				//out.print("Can't insert");
				request.setAttribute("Message", (Object)e.toString());
	            rd = request.getRequestDispatcher("/view/Error.jsp");
	            rd.forward(request, response);
			}
		}
		//out.print("<br><a href='http://localhost:8080/JspAssignment2_a/view/index.jsp'>Go to home.........</a>");
		
	}
}
