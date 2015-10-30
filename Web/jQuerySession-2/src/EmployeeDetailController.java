

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeDetailController
 */
@WebServlet("/EmployeeDetailController")
public class EmployeeDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDetailController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			String query="SELECT * FROM EmployeeTable WHERE name=?";
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/employee?user=root&password=mysql");
			PreparedStatement preparedStatement = null;
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, request.getParameter("name"));
			ResultSet resultSet = preparedStatement.executeQuery();
			String result = "";
			while(resultSet.next()) {
				result = "name : "+resultSet.getString(1)+"<br>email :"+resultSet.getString(2)+"<br>dob :"+resultSet.getString(3)+"<br>address :"+resultSet.getString(4)+"<br>salary :"+resultSet.getInt(5);
			}
			response.getWriter().append(result);	
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
