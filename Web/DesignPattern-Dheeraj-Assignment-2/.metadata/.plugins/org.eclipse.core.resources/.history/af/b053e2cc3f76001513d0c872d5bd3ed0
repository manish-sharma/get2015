package assignment2;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ObjectToJSON {

	public void objectToJSON() {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			Employee employee = new Employee();
			employee.setEmployeeId(101);
			employee.setEmployeeName("Girdhari Agrawal");
			employee.setEmployeeEmail("Girdhari.agrawal@metacube.com");
			Date dNow = new Date(2015,10,19);
			employee.setDateOfJoining(dNow);
			objectMapper.writeValue(new File("data.json"), employee);
			System.out.println(objectMapper.readValue(new File("data.json"), Employee.class));
		} catch(JsonParseException e) {
			e.printStackTrace();
		} catch(JsonMappingException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
