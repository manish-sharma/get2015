import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FormHandler
 */
@WebServlet("/FormHandler")
public class FormHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String errorMessage = "";

	public FormHandler() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* Starting of doPost function */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	/* Ending of doPost function */

	/* Starting of doGet function */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter output = response.getWriter();
		response.setContentType("text/html");
		User userObject = new User();

		try {
			if (request.getParameter("signup") != null) {
				userObject.setName(request.getParameter("name").trim());
				userObject.setPassword(request.getParameter("password").trim());
				userObject.setcPassword(request.getParameter("cPassword")
						.trim());
				userObject.setEmail(request.getParameter("email").trim());
				userObject.setPhoneNumber(request.getParameter("pNumber")
						.trim());

				if (!verifyData(userObject)) {
					output.println(errorMessage);
				} else {
					FormHandler.profileHandler(request, response, userObject);
				}
			} else if (request.getParameter("login") != null) {
				userObject.setName(request.getParameter("user").trim());
				userObject.setPassword(request.getParameter("password").trim());

				if (!verifyData(userObject)) {
					output.println(errorMessage);
				} else {

					FormHandler.profileHandler(request, response, userObject);
				}
			} else {
				response.sendRedirect("index.jsp");
			}
		} catch (NullPointerException | SQLException exception) {
			output.println(exception);
		}
	}

	/* Ending of doGet function */

	/* Starting of profileHandler function */
	private static void profileHandler(HttpServletRequest request,
			HttpServletResponse response, User userObject) throws SQLException,
			IOException {

		String query = "";
		Connection connectionObject = ConnectionUtil.createConnection(response);
		Statement statementObject = connectionObject.createStatement();
		PrintWriter output = response.getWriter();
		query = "SELECT * FROM userAccount WHERE name='" + userObject.getName()
				+ "'";
		ResultSet result = statementObject.executeQuery(query);
		HttpSession session = request.getSession();

		if (result.next()) {

			if (request.getParameter("login") != null) {

				if (result.getString("name").equalsIgnoreCase(
						userObject.getName())
						&& result.getString("password").equals(
								userObject.getPassword())) {

					session.setAttribute("Username", userObject.getName());
					response.sendRedirect("user.jsp");
				} else {

					session.setAttribute("loginError","Either User or Password is incorrect");
					response.sendRedirect("index.jsp");
				}
			} else {

				session.setAttribute("message", "User Already Exist");
				response.sendRedirect("index.jsp");
			}

		} else if (request.getParameter("signup") != null) {
			query = "INSERT INTO userAccount VALUES('" + userObject.getName()
					+ "','" + userObject.getPassword() + "','"
					+ userObject.getEmail() + "')";
			if (statementObject.executeUpdate(query) != 1) {
				response.sendRedirect("error.jsp");
			} else {
				output.println("User Created Successfully!!");
			}
		} else {
			session.setAttribute("loginError",
					"Either User or Password is incorrect");
			response.sendRedirect("index.jsp");
		}
	}

	/* Ending of createProfile function */

	/* Starting of verifyData function */
	private boolean verifyData(User userObject) {

		boolean returnValue = true;
		String name = userObject.getName();
		String password = userObject.getPassword();
		String cPassword = userObject.getcPassword();
		String email = userObject.getEmail();
		String phoneNumber = userObject.getPhoneNumber();
		if (name.equals("") || password.equals("")) {
			errorMessage = "Form Field can't be empty";
			returnValue = false;
		} else if ((cPassword != null || email != null || phoneNumber != null)) {
			if ((cPassword.equals("") || email.equals("") || phoneNumber
					.equals(""))) {
				errorMessage = "Form Field can't be empty!!";
				returnValue = false;
			} else if (!password.equals(cPassword)) {

				errorMessage = "Password and Confirm password should be same!!";
				returnValue = false;

			} else if (password.length() < 8) {

				errorMessage = "Password length should be greater than 8";
				returnValue = false;

			} else if (email.indexOf("@") < 0 || email.length() < 4
					|| (email.lastIndexOf(".") - email.indexOf("@") < 1)
					|| (email.length() - email.lastIndexOf(".")) < 0) {

				errorMessage = "Invalid Email Address!!";
				returnValue = false;

			} else if (phoneNumber.length() > 12 || phoneNumber.length() < 9) {

				errorMessage = "Incorrect phone number";
				returnValue = false;
			}
		}
		return returnValue;
	}
	/* Ending of verifyData function */

}
