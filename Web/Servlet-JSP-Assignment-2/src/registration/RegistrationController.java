package registration;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBHelper.InsertInDatabase.InsertInDatabase;

/**
 * Servlet implementation class RegistrationController
 */
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//get parameter from Login.jsp
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd = null;
		
		//checking validations
		if (username.trim() == "")
			out.println("Please Enter a valid user name ");
		else if (email.trim() == "")
			out.println("Please Enter a valid email id ");
		else if (email.trim() == "")
			out.println("Please Enter a valid date of birth ");
		else if (password.trim() == "" || password.length() < 8)
			out.println("Please Enter a valid password of length more then 8 character ");
		else {
			//Inserting data in database
			int flag = InsertInDatabase.insertIntoDatabase(username, email,
					password);
			
			//checking weather data inserted or not in database 
			if (flag > 0) {
				rd = request.getRequestDispatcher("view/Login.jsp");
				rd.forward(request, response);
			} else {
				out.println("User name already exit........Please try another user name.....");
			}
		}
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
