package controller.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TextGeneric;
import modelHelper.PageSelector;

/**
 * Servlet implementation class LandingController
 */

public class LandingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LandingController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PageSelector pageSelector = new PageSelector();
		List<TextGeneric> list = pageSelector.selector("Landing");
		String heading ="";
		for(TextGeneric t : list) {
			heading += t.getContent();
			
		}
		list.clear();
		request.setAttribute("heading", heading);
		RequestDispatcher rd = request.getRequestDispatcher("view/Landing.jsp");
		rd.forward(request, response);
		//response.sendRedirect("view/Landing.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
