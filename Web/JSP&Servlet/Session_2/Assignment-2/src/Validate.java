

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validate
 */
@WebServlet(name = "Validate", urlPatterns = { "/Validate" })
public class Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("name");
		String psw = request.getParameter("password");
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");

		String output = authenticate(userName, psw);
		if(!output.equals("Successfully Login")) {
			request.setAttribute("result", output);
			rd.forward(request, response);
		}
		else {
			output = "Hello "+userName;
			out.println(output);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	private String authenticate(String userName, String psw )
	{
    	ServletContext context = getServletContext();
    	Connection conn=null;
       	PreparedStatement ps;
    	ResultSet rs;
    	String query = "select username,password from user where username = ?";
    	String url=context.getInitParameter("url");
    	String user = context.getInitParameter("user");
    	String password = context.getInitParameter("password");
    	try 
    	{
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conn=DriverManager.getConnection(url, user, password);
			ps=conn.prepareStatement(query);
			ps.setString(1,userName);
			rs=ps.executeQuery();
			if(rs.next()) {
				String userPassword = rs.getString("password");
				if(userPassword.equals(psw)) {
					return "Successfully Login"; 
				}
				else {
					return "Please enter correct password";
				}
			}
			
			
    	} catch (SQLException e) {
			e.printStackTrace();
			return "Email Id Exists";
		}
    	return "User doesn't exists";
    }

}
