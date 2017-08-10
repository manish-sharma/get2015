package Assignment_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Company class adding developers to the list by extending the Developer
 * 
 * @author Shishir Date 21 Oct 2015
 */
public class Company extends Developer {

	List<Developer> developersList = new ArrayList<Developer>();

	/**
	 * protected type customer
	 * 
	 */
	protected Company() {

	}

	/**
	 * Function to get the company instance
	 * 
	 * @return instance
	 */
	public static Company getCompanyInstance() {
		Company instance = new Company();
		return instance;
	}

	/**
	 * Function to set the developer in the list
	 * 
	 */
	public void setDeveloper() {
		Developer developer = new Developer();
		developer.setName("Shishir");
		developer.setRole("Android Developer");
		developersList.add(developer);
		Developer developer1 = new Developer();
		developer1.setName("Kajal");
		developer1.setRole("iOS Developer");
		developersList.add(developer1);
		Developer developer2 = new Developer();
		developer2.setName("Riddhi");
		developer2.setRole("Project Manager");
		developersList.add(developer2);
	}

	/**
	 * function to get the developer list
	 * 
	 * @return developerList
	 */
	public List<Developer> getDevelopers() {
		return developersList;
	}
}
