package Assignment2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ WebServlet("/Login")
public class Login extends HttpServlet {

 
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Validation validation=new Validation();  
	   
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		String status=validation.isValidate(userid,password); 
		
	    if(status.equalsIgnoreCase("Success")){  
	    	
           
	    	if(DBHelper.isLogInCorrect(userid,password)) {
	        RequestDispatcher requestDispatcher=request.getRequestDispatcher("Login-Success.jsp");  
	        requestDispatcher.forward(request, response);  
	    } 
	    	 else {  
	 	    	
	 	    	request.setAttribute("msg","ID Password not match" );
	 	    	 RequestDispatcher requestDispatcher=request.getRequestDispatcher("error.jsp");  
	 	        requestDispatcher.forward(request, response);  
	 	    }
	    }
	    else {  
	    	
	    	request.setAttribute("msg",status );
	    	 RequestDispatcher requestDispatcher=request.getRequestDispatcher("error.jsp");  
	        requestDispatcher.forward(request, response);  
	    }
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request,response);
	
	}

}
