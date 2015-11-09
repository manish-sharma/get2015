

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeDetailServlet
 */
@WebServlet("/EmployeeDetailServlet")
public class EmployeeDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String output="";
		if(name.equalsIgnoreCase("neha"))
		{
			output="NAME: Neha Bansal </br> DOB : 10 OCT </br> EMail : neha.bansal@metacube.com</br> Address : Jaipur";
		}
		else if(name.equalsIgnoreCase("richa"))
		{
			output="NAME: Richa Mittal </br> DOB : 11 SEP </br> EMail : richa.mittal@metacube.com</br> Address : Jaipur";
		}
		else if(name.equalsIgnoreCase("chetna"))
		{
			output="NAME: Chetna Sharma </br> DOB : 20 DEC </br> EMail : chetna.sharma@metacube.com</br> Address : Jaipur";
		}
		else if(name.equalsIgnoreCase("SUMAN"))
		{
			output="NAME: Suman Sharma </br> DOB : 23 NOV </br> EMail : suman.sharma@metacube.com</br> Address : Jaipur";
		}
		
        response.getWriter().append(output);
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
