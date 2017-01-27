package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * Servlet implementation class googleController
 */

public class googleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public googleController() {
        // TODO Auto-generated constructor stub				
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String code = request.getParameter("code");				// get code
		
			
			String urlParameters = "code=" + code
					+ "&client_id=928031476013-nth01pvm685ordgbbuj51ikm5jo8kjvl.apps.googleusercontent.com"
					+ "&client_secret=Bmt3F1G4qEtBdk14FaS_BfVW"
					+ "&redirect_uri=http://localhost:8080/GoogleAuthDemo/google"
					+ "&grant_type=authorization_code";
			
			URL url = new URL("https://accounts.google.com/o/oauth2/token");
			
			URLConnection urlConn = url.openConnection();
			urlConn.setDoOutput(true);
			OutputStreamWriter writer = new OutputStreamWriter(urlConn.getOutputStream());
			writer.write(urlParameters);
			writer.flush();
			String line, outputString = "";				// get output in outputString
			BufferedReader reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
			
			while ((line = reader.readLine()) != null) {
				outputString += line;
			}

			JsonObject json = (JsonObject) new JsonParser().parse(outputString);
			
			
            String access_token = json.get("access_token").getAsString();	
			
			url = new URL("https://www.googleapis.com/oauth2/v1/userinfo?access_token="+ access_token);				// get User Info
			urlConn = url.openConnection();
			outputString = "";
			reader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
			
			while ((line = reader.readLine()) != null) {
				outputString += line;
			}
			System.out.println("hello"+outputString);
			
			request.setAttribute("msg",outputString);
			
			RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
			rd.forward(request, response);
			
		

	}

}
