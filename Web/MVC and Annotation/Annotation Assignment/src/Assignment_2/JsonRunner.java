package Assignment_2;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/* Class to map the java objects to json objects and vice-versa  */

public class JsonRunner {
	/**
	 * @param args
	 * Main Function
	 */
	public static void main(String args[]) {
		System.out.println("parsing the objects");
		toJSON(); // converting Java object to JSON String
		toJava(); // parsing JSON file to create Java object
	}

	/* Method to parse JSON String into Java Object using Jackson Parser */
	public static void toJava() {
		// this is the key object to convert JSON to Java
		ObjectMapper mapper = new ObjectMapper();

		try {
			File jsonFile = new File("employee.json");
			EmployeeModel employee1 = mapper.readValue(jsonFile, EmployeeModel.class);
			System.out.println("Java object created from JSON String :");
			System.out.println(employee1);

		} catch (JsonGenerationException ex) {
			ex.printStackTrace();
		} catch (JsonMappingException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();

		}
	}

	/*
	 * Java method to convert Java Object into JSON String with help of Jackson
	 * API
	 */
	public static void toJSON() {
		EmployeeModel employee = new EmployeeModel();
		employee.setEmployeeName("Shishir Pareek");
		employee.setEmployeeId(688);
		employee.setCtcPerAnnum(18000);
		employee.setDateOfBirth("07-06-1993");
		employee.setDateOfJoining("03-08-2015");
		employee.setEmailId("shishirpareek07@gmail.com");
		// our bridge from Java to JSON and vice versa
		ObjectMapper mapper = new ObjectMapper();

		try {
			File json = new File("employee.json");

			mapper.writeValue(json, employee);

			System.out
					.println("Java object converted to JSON String, written to file");
			System.out.println(mapper.writeValueAsString(employee));

		} catch (JsonGenerationException ex) {
			ex.printStackTrace();
		} catch (JsonMappingException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
