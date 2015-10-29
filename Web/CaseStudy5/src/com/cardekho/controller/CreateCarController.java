package com.cardekho.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cardekho.exception.CarAlreadyExistException;
import com.cardekho.exception.CarDekhoSystemException;
import com.cardekho.model.Car;
import com.cardekho.model.helper.ModelHelper;
import com.cardekho.service.CarDekhoService;


/**
 * @author Anjita
 * Servlet implementation class CreateCarController
 */
public class CreateCarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
     * Default constructor
     * @see HttpServlet#HttpServlet()
     */
    public CreateCarController() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("admin")==null) {
			response.sendRedirect("/CaseStudy5/view/Login.jsp");
		}
		else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/view/CreateCar.jsp");
			dispatcher.forward(request, response);
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("admin")==null) {
			response.sendRedirect("/CaseStudy5/view/Login.jsp");
		}
		else {
			String forwardUrl = "/view/AdminHome.jsp";
			Car car = ModelHelper.createCar(request);
			request.setAttribute("car", car);
			CarDekhoService carDekhoService = new CarDekhoService();
			try {
				carDekhoService.insert(car);
				request.setAttribute("message", "Created Successfully");
			} catch (CarDekhoSystemException e) {
				System.out.println("Exception while creating car " + e.getMessage());
				forwardUrl = "/view/CreateCar.jsp";
				request.setAttribute("message", e.getMessage());
			} catch (CarAlreadyExistException e) {
				System.out.println("Exception while creating car " + e.getMessage());
				forwardUrl = "/view/CreateCar.jsp";
				request.setAttribute("message", e.getMessage());
				request.setAttribute("car", car);
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
			dispatcher.forward(request, response);
		}
	}
}
