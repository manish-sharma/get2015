

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = "<table>";
		data += "<tr><td>Name</td><td>"+request.getParameter("name")+"</td></tr>";
		data += "<tr><td>Email</td><td>"+request.getParameter("email")+"</td></tr>";
		data += "<tr><td>Phone Number</td><td>"+request.getParameter("pNumber")+"</td></tr>";
		data += "<tr><td colspan='2'>You had submitted these details</td></tr>";
		data += "<tr><td colspan='2'><input type='submit' value='Verify'></td></tr>";
		data += "</table>";
		response.setContentType("text/html");
		PrintWriter output = response.getWriter();
		output.println(data);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
