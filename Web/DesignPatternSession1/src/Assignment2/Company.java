package Assignment2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chetna
 * application to create a Company and its employees(Developers) without exposing their public constructors.
 * Implement Classes(Factory Pattern) 
 */
public class Company {

	private static List<Developer> devloperList;

	/**
	 * @param developer : to be added in devloperList
	 */
	public static void addDevloper(Developer developer) {
		if (devloperList == null) {
			devloperList = new ArrayList<Developer>();
		}
		devloperList.add(developer);
	} 
 
	/**
	 * @param name : name of developer
	 * @param role : role of developer
	 * @return : instance of Developer
	 */
	public static Developer getDeveloper(String name, String role) {
		Developer developer = DeveloperFactory.getDeveloper();
		developer.setName(name);
		developer.setRole(role);
		return developer;
	}

	/**
	 * @return : list of Developer, devloperList
	 */
	public static List<Developer> getDeveloperList() {
		// DeveloperFactory.getDeveloper();
		return devloperList;
	}

}