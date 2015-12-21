package com.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.model.GooglePojo;
/**
 * Servlet implementation class Oauth2CallBack
 */
@WebServlet("/Oauth2CallBack")
public class Oauth2CallBack extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Oauth2CallBack() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
	        try {
	            // get code
	            String code = request.getParameter("code");
	            System.out.println("code is"+code);
	            // format parameters to post
	            String urlParameters = "code="
	                    + code
	                    + "&client_id=838182657674-hh996isltlr5nt5bk63ngcgn2jdspj9a.apps.googleusercontent.com"
	                    + "&client_secret=DRjemI5iE_LQVIqG-9_mxryM"
	                    + "&redirect_uri=http://localhost:8080/DemoOauth2.0/Oauth2CallBack"
	                    + "&grant_type=authorization_code";
	            
	            //post parameters
	            URL url = new URL("https://accounts.google.com/o/oauth2/token");
	            URLConnection urlConn = url.openConnection();
	            urlConn.setDoOutput(true);
	            OutputStreamWriter writer = new OutputStreamWriter(
	                    urlConn.getOutputStream());
	            writer.write(urlParameters);
	            writer.flush();
	            
	            //get output in outputString 
	            String line, outputString = "";
	            BufferedReader reader = new BufferedReader(new InputStreamReader(
	                    urlConn.getInputStream()));
	            while ((line = reader.readLine()) != null) {
	                outputString += line;
	            }
	            System.out.println(outputString);
	            
	            //get Access Token 
	            JsonObject json = (JsonObject)new JsonParser().parse(outputString);
	            String access_token = json.get("access_token").getAsString();
	            System.out.println(access_token);

	            //get User Info 
	            url = new URL(
	                    "https://www.googleapis.com/oauth2/v1/userinfo?access_token="
	                            + access_token);
	            urlConn = url.openConnection();
	            outputString = "";
	            reader = new BufferedReader(new InputStreamReader(
	                    urlConn.getInputStream()));
	            while ((line = reader.readLine()) != null) {
	                outputString += line;
	            }
	            System.out.println(outputString);
	            
	            // Convert JSON response into Pojo class
	            GooglePojo data = new Gson().fromJson(outputString, GooglePojo.class);
	            System.out.println(data);
	            writer.close();
	            reader.close();
	            
	        } catch (MalformedURLException e) {
	            System.out.println( e);
	        } catch (ProtocolException e) {
	            System.out.println( e);
	        } catch (IOException e) {
	            System.out.println( e);
	        }
	        System.out.println("leaving doGet");
	    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
