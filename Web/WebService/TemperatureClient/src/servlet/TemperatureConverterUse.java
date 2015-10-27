package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

import com.TemperatureConvertor;
import com.TemperatureConvertorServiceLocator;

/**
 * Servlet implementation class TemperatureConverterUse
 */
@WebServlet("/TemperatureConverterUse")
public class TemperatureConverterUse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TemperatureConverterUse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		TemperatureConvertorServiceLocator converterServiceLocator = new TemperatureConvertorServiceLocator();
		converterServiceLocator.setTemperatureConvertorEndpointAddress("http://localhost:8080/WebServiceAssignment/services/TemperatureConvertor");
		String fahr=request.getParameter("Fahrenheit");
		String celcius=request.getParameter("Celsius");
		if(fahr!=null && !fahr.equals(""))
		{   
			try {float result;
				TemperatureConvertor converter= converterServiceLocator.getTemperatureConvertor();
				result=converter.fahrenheitToCelsius(Float.parseFloat(fahr));
				request.setAttribute("result",""+result);
			} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		if(celcius!=null && !celcius.equals(""))
		{   
			try {
				float result;
				TemperatureConvertor converter= converterServiceLocator.getTemperatureConvertor();
				result=converter.celsiusTofahrenheit(Float.parseFloat(celcius));
				request.setAttribute("result1",""+result);
				} catch (ServiceException e) {
				e.printStackTrace();
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("TemperatureConvertor.jsp");
		dispatcher.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
