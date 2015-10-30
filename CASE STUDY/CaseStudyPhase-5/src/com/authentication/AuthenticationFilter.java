package com.authentication;

import java.io.IOException;
import java.net.URI;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class AuthenticationFilter
 */
@WebFilter("/*")
public class AuthenticationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AuthenticationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		HttpSession session =  httpServletRequest.getSession(false);
		String uri = httpServletRequest.getRequestURI();
		
		if(session == null && (uri.endsWith("add-new.jsp") || uri.endsWith("admin-edit.jsp") || uri.endsWith("admin.jsp") || uri.endsWith("admin-edit.jsp"))) {
			String error = "Please login to view this page";
			request.setAttribute("error_label", error);
			request.getRequestDispatcher("login.jsp").forward(request,response);
		 
		}
		else if(session!=null){
			if(session.getAttribute("user") == null  && (uri.endsWith("add-new.jsp") || uri.endsWith("admin-edit.jsp") || uri.endsWith("admin.jsp") || uri.endsWith("admin-edit.jsp"))){
				String error = "Please login to view this page";
				request.setAttribute("error_label", error);
				request.getRequestDispatcher("login.jsp").forward(request,response);
				}
				else{
					chain.doFilter(request, response);
				}
			}
		
			
		else{
			chain.doFilter(request, response);
		}
		
		
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
