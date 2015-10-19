package assignment2;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ObjectToJSON {

	public void objectToJSON() {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			Employee employee = new Employee();
			employee.setEmployeeId(101);
			employee.setEmployeeName("Dheeraj Kumar");
			employee.setEmployeeEmail("Dheeraj.kumar1@metacube.com");
			Date date = new Date();
			employee.setDateOfJoining(date);
			objectMapper.writeValue(new File("data.json"), employee);
			System.out.println(objectMapper.readValue(new File("data.json"),
					Employee.class));
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
