package com.speedster.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.speedster.db.helper.CarDAO;
import com.speedster.exception.CarDekhoSystemException;
import com.speedster.model.Car;
import com.speedster.model.helper.ModelHelper;


/**
 * Servlet implementation class CreateCarServlet
 */
@WebServlet("/CreateCarServlet")
public class CreateCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("currentSessionUser")==null) {
		response.sendRedirect("/login.jsp");	
		}
		else{
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Addcar.jsp");
			requestDispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("currentSessionUser") == null) {
			response.sendRedirect("/login.jsp");
		}
		else{
			String forwardUrl = "/Addcar.jsp";
			Car car = ModelHelper.createCar(request);
			request.setAttribute("car", car);
			CarDAO carDao = new CarDAO();
			try{
				carDao.insert(car);
				request.setAttribute("message", "Added Car Successfully");
			}
			catch(CarDekhoSystemException e){
				System.out.println("Exception while creating car " + e.getMessage());
				forwardUrl = "/Addcar.jsp";
				request.setAttribute("message", e.getMessage());
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
			dispatcher.forward(request, response);
		}
	}

}
