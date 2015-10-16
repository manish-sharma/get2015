
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONValue;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * it have the JSON to object  conversion and vice versa
 * @author Ravika
 * @since 10/16/2015
 */

public class JacksonMapper {
	public static void main(String args[]) {
		String jString = toJSON(new Employee("Ravika", "Ravika@mail.com", 1, 25, "25-4-89")); // converting Java object to JSON String
		toJava(); // parsing JSON file to create Java object
		System.out.println(jString);
	}

	/**
	 * Method to parse JSON String into Java Object using Jackson Parser.
	 *
	 */
	public static void toJava() {
		ObjectMapper mapper = new ObjectMapper();

		try {
			File json = new File("employee.json");
			
			Employee employee1 = mapper.readValue(json, Employee.class);
			System.out.println("Java object created from JSON String :");
			System.out.println(employee1.getName());
			System.out.println(employee1.getId());
			System.out.println(employee1.getDateOfBirth());

		} catch (JsonGenerationException ex) {
			ex.printStackTrace();
		} catch (JsonMappingException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();

		}
	}

	/**
	 * Java method to convert Java Object into JSON String with help of Jackson
	 * API.
	 * @param employee =for conversion
	 * @return the JSON string
	 */
	@SuppressWarnings("unchecked")
	public static String toJSON(Employee employee) {
		
		 @SuppressWarnings("rawtypes")
		 Map obj=new HashMap();    
		 obj.put("name",employee.getName());    
		 obj.put("id",employee.getId());    
		 obj.put("email",employee.getEmail());   
		 obj.put("dateOfRegistration", employee.getDateOfRegistration());
		 String jsonText = JSONValue.toJSONString(obj);  
		  
		  return jsonText;
	}
}
