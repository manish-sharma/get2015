package com.controller;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Employee;

/* This  Class  to map the java objects to json objects and vice-versa 
 * @author Banwari Kevat
 */
public class JacksonMapper {
	/*
	 * Method to parse JSON String into Java Object using Jackson Parser.
	 */
	public static String toJava()
     {
		// this is the key object to convert JSON to Java
		ObjectMapper mapper = new ObjectMapper();

		try 
		 {
			File json = new File("employeeJson.json");
            Employee employee1 = mapper.readValue(json, Employee.class);
			return employee1.toString();
			

		} catch (JsonGenerationException ex) 
		{
			ex.printStackTrace();
		} catch (JsonMappingException ex)
		{
			ex.printStackTrace();
		} catch (IOException ex)
		{
			ex.printStackTrace();

		}
		return null;
	}

	//Java method to convert Java Object into JSON String with help of Jackson  API.
	public static String toJSON() 
	{
		Employee employee = new Employee("Banwari", 20,"mits.banwari2011@gmail.com","11-11-2015","10-12-1994",10000);

		// our bridge from Java to JSON and vice versa
		ObjectMapper mapper = new ObjectMapper();
        String jsonString = null;
		try
		{
			File json = new File("employee.json");

			mapper.writeValue(json, employee);

			jsonString = mapper.writeValueAsString(employee);
			

		} catch (JsonGenerationException ex)
		{
			ex.printStackTrace();
		} catch (JsonMappingException ex) 
		{
			ex.printStackTrace();
		} catch (IOException ex) 
		{
			ex.printStackTrace();

		}
		return jsonString;
	}
	




}