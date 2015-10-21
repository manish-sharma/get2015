package mvcSession2.assignment2;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Name:JacksonMapper
 * @author Gaurav Saini
 * Since : 16-10-2015
 * Description: Maps The value to the Jackson Mapper
 **/

public class JacksonMapper {

	public static void main(String args[]) {

		// converting Java object to JSON String
		toJSON();

		// parsing JSON file to create Java object
		toJava();
	}

	/**
	 * Name: toJava
	 * Description: converts to java
	 **/

	public static void toJava()	{

		// this is the key object to convert JSON to Java
		ObjectMapper mapper = new ObjectMapper();

		try {
			// Reading the file employee json
			File json = new File("employee.json");
			Employee employee1 = mapper.readValue(json, Employee.class);
			System.out.println("Java object created from JSON String :");
			System.out.println(employee1.getEmployeeName());
			System.out.println(employee1.getEmployee_id());
			System.out.println(employee1.getDate_Of_Birth());

		} catch (JsonGenerationException ex) {
			ex.printStackTrace();
		} catch (JsonMappingException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Name: toJson
	 * Description: Java method to convert Java Object into JSON String with help of Jackson API
	 **/

	public static void toJSON() {
		Employee employee = new Employee("Gaurav", 22, "gaurav.saini@metacube.com", "03-08-2015");

		// our bridge from Java to JSON and vice versa
		ObjectMapper mapper = new ObjectMapper();

		try {
			// Calling employee json file
			File json = new File("employee.json");
			mapper.writeValue(json, employee);
			System.out.println("Java object converted to JSON String, written to file");
			System.out.println(mapper.writeValueAsString(employee));
		} catch (JsonGenerationException ex) {
			ex.printStackTrace();
		} catch (JsonMappingException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Name: parse
	 * @param tempClass
	 * @throws Exception
	 * Description: Parse the Class and provide information
	 */

	public void parse(Class<?> tempClass) throws Exception {

		// object pf methods to call methods
		Method[] methods = tempClass.getMethods();

		for (Method method : methods) {
			
			if (method.isAnnotationPresent(EmployeeDetails.class)) {
				EmployeeDetails test = method.getAnnotation(EmployeeDetails.class);
				method.invoke(Employee.class.newInstance());
			}
		}
	}
}