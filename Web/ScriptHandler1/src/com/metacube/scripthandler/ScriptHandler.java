package com.metacube.scripthandler;


	import java.io.IOException;

	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import org.apache.commons.lang.StringEscapeUtils;

	/**
	 * this class is used to handle script in text area...
	 * @author Sumitra
	 *
	 */
	public class ScriptHandler extends HttpServlet {
		private static final long serialVersionUID = 1L;

		/**
		 * @see HttpServlet#HttpServlet()
		 */
		public ScriptHandler() {
			super();
		}

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		protected void doGet(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
			String input = request.getParameter("input");
			String result = StringEscapeUtils.escapeHtml(input);
			request.setAttribute("output", result);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		protected void doPost(HttpServletRequest request,
				HttpServletResponse response) throws ServletException, IOException {
		
		}

	}


