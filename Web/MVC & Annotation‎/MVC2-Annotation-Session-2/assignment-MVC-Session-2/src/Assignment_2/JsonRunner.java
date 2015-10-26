package Assignment_2;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonRunner
{
	/***************************
	 * Create Employee Object to
	 * write in file
	 * @return
	 **************************/
	public static Employee createEmployee()
	{
		Employee emp = new Employee();
		emp.setEmployeeName("Neha");
		emp.setEmployeeId(101);
		emp.setEmailId("neha.bansal@metacube.com");
		emp.setDateOfBirth("10-Oct-1992");
		emp.setDateOfJoining("6-July-2015");
		emp.setCtcPerAnnum(250000);
		return emp;
	}

	/***************************
	 * Writing in json file
	 **************************/
	public static void toJson(Employee e)
	{
		ObjectMapper object = new ObjectMapper();
		
		File json = new File("my_file.json");
		try 
		{
			object.writeValue(json, e);
		} 
		catch (JsonGenerationException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		catch (JsonMappingException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		catch (IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	/***************************
	 * Reading data from json file
	 **************************/
	public static Employee fromJson()
	{
		ObjectMapper object = new ObjectMapper();
		
		File json = new File("my_file.json");
		Employee e = null;
		try 
		{
			e = object.readValue(json, Employee.class);
		} 
		catch (JsonGenerationException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		catch (JsonMappingException e1)
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		catch (IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}
}
