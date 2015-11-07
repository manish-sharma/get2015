/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metacrm.controller;

import java.io.IOException;
import java.io.PrintWriter;

import com.metacrm.exception.MetaCRMSystemException;
import com.metacrm.model.Car;
import com.metacrm.service.MetaCRMService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author admin
 */
@WebServlet("/CreateCarController")
public class CreateCarController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
	 * methods.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	protected void processRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			/* TODO output your page here. You may use following sample code. */
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet CreateCarController</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet CreateCarController at "
					+ request.getContextPath() + "</h1>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}

	// <editor-fold defaultstate="collapsed"
	// desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// redirects to edit.jsp page
		RequestDispatcher dispatcher = request.getRequestDispatcher("edit.jsp");
		request.setAttribute("objOfCar", null);
		dispatcher.forward(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String forwardUrl = "";
		MetaCRMService service = new MetaCRMService();
		Car objCar = createCar(request);
		try {
			if (service.createCar(objCar) > 0) {
				// if more than zero rows are affected than the updated car
				// object is set and forwarded to details.jsp
				request.setAttribute("objOfCar", objCar);
				forwardUrl = "details.jsp";
			} else {
				// if car not updated than remains at same page and error
				// message is displayed
				forwardUrl = "create.jsp";
				request.setAttribute("message", "Enter correct values");
			}
		} catch (MetaCRMSystemException e) {
			try {
				throw new MetaCRMSystemException("Could not create Car, ["
						+ e.getMessage() + "]");
			} catch (MetaCRMSystemException e1) {
				forwardUrl = "edit.jsp";
				request.setAttribute("message", e.getMessage());
			}
		} finally {

		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
		dispatcher.forward(request, response);
	}

	// object is created of car model class
	private Car createCar(HttpServletRequest request) throws IOException,
			ServletException {
		Car objCar = new Car();
		objCar.setMake(request.getParameter("make"));
		objCar.setModel(request.getParameter("model"));
		objCar.setAC(Boolean.parseBoolean(request.getParameter("ac")));
		objCar.setPowerSteering(Boolean.parseBoolean(request
				.getParameter("powerSteering")));
		objCar.setAccessoryKit(Boolean.parseBoolean(request
				.getParameter("accessoryKit")));
		objCar.setEngineInCC(request.getParameter("engineInCC"));
		objCar.setFuelCapacity(Double.parseDouble(request
				.getParameter("fuelCapacity")));
		objCar.setMilage(Double.parseDouble(request.getParameter("milage")));
		objCar.setPrice(Integer.parseInt(request.getParameter("price")));
		objCar.setRoadTax(Integer.parseInt(request.getParameter("roadTax")));
		objCar.setImagePath("images/" + request.getParameter("photo"));
		return objCar;
	}

}
