

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
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("userPass");
		String email = request.getParameter("userEmail");
		Validation validation = new Validation();
		String result=validation.validate(userName, password, email);
		System.out.println(result);
		RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
		if(!result.equalsIgnoreCase("Validated"))
		{
			request.setAttribute("result", result);
			out.print(request.getAttribute("result"));
			rd.include(request, response);
			
		}
		else
		{
			String output = inserData(userName, email, password);
			if(!output.equals("Profile Created")) {
				request.setAttribute("result", output);
				out.print(request.getAttribute("result"));
				rd.include(request, response);
			}
			else {
				out.println(output);
			}
			
		}
	}

	private String inserData(String userName, String email, String password) 
	{
		ServletContext servletContext =getServletContext();
		Connection conn=null;
		PreparedStatement ps ,ps1;
		ResultSet rs;
		String query = "SELECT username FROM user WHERE username = ?";
		String query1 = "INSERT INTO user (username,password,email) VALUES (?,?,?)";
		String url=servletContext.getInitParameter("url");
    	String user = servletContext.getInitParameter("user");
    	String sqlpassword = servletContext.getInitParameter("password");
    	try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			conn=DriverManager.getConnection(url, user, sqlpassword);
			System.out.println(conn);
			ps=conn.prepareStatement(query);
			ps.setString(1, userName);
			rs =  ps.executeQuery();
			
			if(rs.next()){
				return "User Name Exists";
			}
			ps1=conn.prepareStatement(query1);
			ps1.setString(1, userName);
			ps1.setString(2, password);
			ps1.setString(3, email);
			ps1.execute();
    	} catch (SQLException e) {
			e.printStackTrace();
			return "Email Id Exists";
		}
    	return "Profile Created";
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doGet(request, response);
	}
	
	

}
