package com.cardekho.authentication;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * AuthenticationFilter
 * @author Ankur
 * @Since: 26 October,2015
 **/
@WebFilter("/*")
public class AuthenticationFilter implements Filter
{
	private ServletContext context;
	//Default constructor. 
    public AuthenticationFilter() 
    {
        // TODO Auto-generated constructor stub
    }
	public void destroy()
	{
		// TODO Auto-generated method stub
	}
	/**
	 * Name: doFilter
	 * Description: Filters the Request
	 **/
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{
		//  request 
		HttpServletRequest req = (HttpServletRequest) request;
		// response
        HttpServletResponse res = (HttpServletResponse) response;
        // Uniform resource Identifier
        String uri = req.getRequestURI();
        this.context.log("Requested Resource::"+uri);
        HttpSession session = req.getSession(false);
        // Checking the Validity of session
        if(session == null && (uri.endsWith("Create") || uri.endsWith("Edit") || uri.endsWith("create.jsp") || uri.endsWith("edit.jsp")))
        {
            this.context.log("Unauthorized access request");
            res.sendRedirect("login.html");
        }
        else
        {
            // pass the request along the filter chain
            chain.doFilter(request, response);
        }
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException
	{
		this.context = fConfig.getServletContext();
        this.context.log("AuthenticationFilter initialized");
	}

}
