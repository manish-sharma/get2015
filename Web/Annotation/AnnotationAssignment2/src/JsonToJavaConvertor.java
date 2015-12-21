import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonToJavaConvertor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//JsonToJavaConvertor.javaToJsonConvertor();
		JsonToJavaConvertor.JsonTojavaConvertor();
	}

	private static void javaToJsonConvertor() {
		
		ObjectMapper mapper = new ObjectMapper();
		Employee employee = new Employee();
		employee.setEmployeeName("nikhil");
		employee.setEmployeeId(101);
		employee.setCtcPerAnnum(100000000);
		employee.setDateOfBirth("08/03/1995");
		employee.setEmailId("cs@gmail.com");
		employee.setDateOfJoining("03/08/2015");

		try {
			mapper.writeValue(new File("../employee.json"), employee);
			System.out.println("Write Employee object into json file: ---------");
			System.out.println(mapper.writeValueAsString(employee) + "\n\n");

		} catch (JsonGenerationException e) {

			e.printStackTrace();
		} catch (JsonMappingException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	private static void JsonTojavaConvertor() {
		ObjectMapper mapper = new ObjectMapper();
		Employee employee=null;

		try {

			employee = mapper.readValue(new File("../employee.json"),Employee.class);
			System.out.println("Read Employee object from json file: ---------");
			System.out.println(employee.toString() + "\n\n");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
