package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DBRetrievalServlet
 */
@WebServlet("/DBRetrievalServlet")
public class DBRetrievalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		

		// Depending on the GET parameters, passed from the Ajax call,

		// we are able to differentiate the requests and call the appropriate

		// method.

		String name = request.getParameter("name");
		response.setContentType("text/plain");

		response.setCharacterEncoding("UTF-8");

		switch (name) {

		case "Suman":
			response.getWriter().write("Name: Suman Sharma<br><br>Email:  ssumansharma04@gmail.com<br><br>Dob:  22 july<br><br>Address : Gopal pura<br><br>");
			break;

		case "Nidhi":
			response.getWriter().write("Name: Nidhi Sharma<br><br>Email:  nidhi04@gmail.com<br><br>Dob:  4 july<br><br>Address : Gandhi Nagar<br><br>");
			break;
			
		case "Richa":
			response.getWriter().write("Name: Richa Mittal<br><br>Email:  richa04@gmail.com<br><br>Dob:  5 july<br><br>Address : Gopal pura<br><br>");
			break;
			
		case "Chetna":
			response.getWriter().write("Name: Chetna Sharma<br><br>Email:  Chetnasharma@gmail.com<br><br>Dob:  8 july<br><br>Address : Jhotwara<br><br>");
			break;
		
		default:
			response.getWriter().write("Please Select a name!!!!!!!!!!!!!");
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
