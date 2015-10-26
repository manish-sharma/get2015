package assignment2;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JSONToObject {
	public void convertJSONToObject() {
		String jsonString = "{\"employeeName\":\"Girdhari\",\"employeeId\":101,\"dateOfBirth\":22}";
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			Employee employee = objectMapper.readValue(jsonString, Employee.class);
			System.out.println("Employee Id : "+employee.getEmployeeId());
			System.out.println("Employee Name : "+employee.getEmployeeName());
			System.out.println("Date Of Birth : "+employee.getDateOfBirth());
			
		} catch(JsonParseException e) {
			e.getStackTrace();
		} catch(JsonMappingException e) {
			e.getStackTrace();
		} catch(IOException e) {
			e.getStackTrace();
		}
	}

}
