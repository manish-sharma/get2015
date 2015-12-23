/**
 * Servlet Filter implementation class AuthenticationFilter
 * @Author Banwari kevat
 */
package filter;

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

import com.sun.jndi.toolkit.url.Uri;


@WebFilter("/*")
public class AuthenticationFilter implements Filter {

    /**
     * Default constructor. 
     */
	private ServletContext context;
	
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
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		HttpSession session = req.getSession();
		
		String uri = req.getRequestURI();
        this.context.log("Requested Resource::"+uri);
		
		if(session.getAttribute("admin") == null && (uri.endsWith("adminindex.jsp") || uri.endsWith("adminsearch.jsp") || uri.endsWith("adminsearchresult.jsp") || uri.endsWith("create.jsp") || uri.endsWith("edit.jsp") || uri.endsWith("Create") || uri.endsWith("Edit")) ) {
			res.sendRedirect("../login.jsp");
		} else {
		
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.context = fConfig.getServletContext();
        this.context.log("AuthenticationFilter initialized");
	}

}
