package com.cardekho.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * AboutUS
 * @author Ankur
 * @since: 26 october,2015
 **/
@WebServlet("/AboutUs")
public class AboutUs extends HttpServlet
{
	private static final long serialVersionUID = 1L;
    // Constructor   
    public AboutUs() 
    {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * Name: doGet
     * Description: gets the Value
     **/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("aboutUs.jsp");
		requestDispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
