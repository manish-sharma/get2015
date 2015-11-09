package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MetaHRMBusinessException;
import com.MetaHRMSystemException;
import com.metahrm.service.MetaHRMService;
import com.model.Car;

/**
 * Servlet implementation class GetAllCar
 */
@WebServlet("/GetAllCar")
public class GetAllCar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllCar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardUrl = "console.jsp";
		String message = "";
		try {
			MetaHRMService service = new MetaHRMService();
			List<Car> carList = service.getAllCar();
			message="all cars ";
			System.out.println(message);
			request.setAttribute("message",message);
			request.setAttribute("carlist", carList);	
		} catch (MetaHRMSystemException e) {
			System.out.println("Exception while getting all car" + e.getMessage());
			forwardUrl = "error_page.jsp";
			request.setAttribute("message", e.getMessage());
		} catch (MetaHRMBusinessException e) {
			message ="car does not have any car";
			System.out.println(message);
			request.setAttribute("message",message);
		}
		request.getRequestDispatcher(forwardUrl).forward(request, response);
	}

}
