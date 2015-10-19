package com.assignment2;

import java.io.IOException;

import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author chetna
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		
		Employee employee1 = new Employee();
		employee1.setEmployeeName("chetna");
		employee1.setEmployeeId(101);
		employee1.setCtcPerAnnum(100000000);
		employee1.setDateOfBirth("08/03/1995");
		employee1.setEmailId("cs@gmail.com");
		employee1.setDateOfJoining("03/08/2015");
		System.out.println(employee1.toString());
		String json = "{\"employeeId\":101,\"emailId\":\"cs@gmail.com\",\"dateOfBirth\":\"08/03/1995\",\"dateOfJoining\":\"03/08/2015\",\"ctcPerAnnum\":1.0E8,\"employeeName\":\"chetna\"}";
		Employee employee2;
		
		try {
			//Serializing
			System.out.println(mapper.writeValueAsString(employee1));
			
			//De-serializing
			System.out.println("Json file = "+json);
			employee2 = mapper.readValue(json, Employee.class);
			System.out.println(employee2.toString());
			//Serializing
			System.out.println(mapper.writeValueAsString(employee2));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
