package com.cardekho.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cardekho.CarAlreadyExistsException;
import com.cardekho.CarDekhoSystemException;
import com.cardekho.model.Car;
import com.cardekho.model.helper.ModelHelper;
import com.cardekho.service.CarDekhoService;



/**
 * Servlet implementation class CreateCarController
 */
@WebServlet("/CreateCarController")
public class CreateCarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCarController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session = request.getSession(false);
		if(session.getAttribute("userName")==null) {
			response.sendRedirect("/CaseStudyPhase4/view/Login.jsp");
		}
		else 
		{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/view/CreateCar.jsp");
			requestDispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		HttpSession session = request.getSession(false);
		if(session.getAttribute("userName")==null) {
			response.sendRedirect("/CaseStudyPhase4/view/Login.jsp");
		}
		else 
		{
			String forwardUrl = "/view/AdminHome.jsp";
			Car car = ModelHelper.createCar(request);
			request.setAttribute("car", car);
			
			System.out.println("car is  "+ car);
			CarDekhoService service = new CarDekhoService();
		
			try {
				
				service.createCar(car);
				request.setAttribute("message", "Created Successfully");
			} catch (CarDekhoSystemException e) {
				System.out.println("Exception while creating car " + e.getMessage());
				forwardUrl = "/view/CreateCar.jsp";
				request.setAttribute("message", e.getMessage());
			} catch (CarAlreadyExistsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
			dispatcher.forward(request, response); 
		}
	}
	
	

}
