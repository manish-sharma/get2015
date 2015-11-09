package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.MetaHRMBusinessException;
import com.MetaHRMSystemException;
import com.metahrm.service.MetaHRMService;
import com.model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardUrl = "failure.jsp";
		User user= null;
		com.model.Login login=null;
		try {
			login = createLogin(request);
			MetaHRMService metaHRMService = new MetaHRMService() ;
			user = metaHRMService.getUserByLogin(login);
			System.out.println(" hi logn");
			System.out.println("privilege"+user.getPrivilege());
			System.out.println(user);
			if(user.getPrivilege() == 1) {
				System.out.println("HI privilege");
				request.setAttribute("message", "Login Successfully");
				HttpSession session = request.getSession();
				session.setAttribute("id", user.getEmail());
				session.setAttribute("createdBy", user.getFirstName()+" "+user.getLastName());
				forwardUrl = "console.jsp";
			}
			else {
				request.setAttribute("message", "Login Successfully");
				request.setAttribute("email", user.getEmail());
				forwardUrl = "success.jsp";
			}

			} catch (MetaHRMSystemException e ) {
				System.out.println("Exception while login" + e.getMessage());
				//forwardUrl = "index.jsp";
				request.setAttribute("message", e.getMessage());
				request.setAttribute("email",login.getEmailId());
			
			} catch(MetaHRMBusinessException e) {
			System.out.println("Exception either emailid or password is incorrect "+ e.getMessage());
			//forwardUrl = "index.jsp";
			request.setAttribute("message", e.getMessage());
			request.setAttribute("email",login.getEmailId());
		}
		request.getRequestDispatcher(forwardUrl).forward(request,response);	
	}
					
	

	private com.model.Login createLogin(HttpServletRequest request)throws NullPointerException  { 
		
		com.model.Login login = new com.model.Login();
		login.setEmailId(request.getParameter("emailId").trim());
		login.setPassword(request.getParameter("password").trim());
		return login;
	}
	
	

}
