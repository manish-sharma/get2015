package com.cardekho.authentication;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
public class AuthenticationFilter implements Filter {

	 private ServletContext context;
     
	    public void init(FilterConfig fConfig) throws ServletException {
	        this.context = fConfig.getServletContext();
	        this.context.log("AuthenticationFilter initialized");
	    }
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String userName = request.getParameter("email");
		String password = request.getParameter("password");
		if(userName!=null){
			if(userName.equals("admin@gmail.com") && password.equals("admin")) {
				HttpSession session = ((HttpServletRequest) request).getSession(true); 
				session.setAttribute("admin", "Admin");
				//System.out.println("session == "+session);
			}	
			else {
				request.setAttribute("message", "Please Enter right username password");
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/Login.jsp");
				requestDispatcher.forward(request, response);
				return;
			}
		}
		chain.doFilter(request, response);
	}
}
