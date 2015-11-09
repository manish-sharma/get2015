import java.util.ArrayList;
import java.util.List;


public class Company extends Developer{
	private static List<Developer> listOfDeveloper;
	
	public static void addDeveloper(Developer developer)
	{
		if(listOfDeveloper == null)
		{
			listOfDeveloper = new ArrayList<Developer>();
		}
		listOfDeveloper.add(developer);
		
	}
	
	public static Developer getDeveloper(String name, String role) {
		Developer developer = DeveloperFactory.getDeveloper();
		developer.setName(name);
		developer.setRole(role);
		return developer;
		
		
	}
	
	public static List<Developer> getDeveloperList()
	{
		return listOfDeveloper;
	}
	
}
