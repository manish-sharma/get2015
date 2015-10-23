package session1.assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Name: Company
 * @author Gaurav Saini
 * Since: 21-10-2015
 * Description: company class extends developer class
 **/

public class Company extends Developer {

	// Creating Static object of class Company
	private static Company company = new Company();

	// can only be originated through getInstance Method
	private Company() {
		super();
	}

	//   List to store developers data
	private List<Developer> developerList = new ArrayList<Developer>();

	/**
	 * Name: getInstance
	 * @return 
	 * Description: Function to return instance of company
	 **/
	public static Company getInstance()	{
		return company;
	}

	/**
	 * Name:addDeveloper
	 * @param name
	 * @param role
	 * Description: Adds the Information to the Developer List
	 **/
	public void addDeveloper(String name, String role) {
		// Creating object
		Developer developer = new Developer();
		// Adding Details
		developer.setName(name);
		developer.setRole(role);
		developerList.add(developer);
	}
	
	/**
	 * Name: showList
	 * Description: Shows the List of the Developer
	 **/
	public void showList() {
		
		// Iterator Called to print the data
		Iterator<Developer> iterator = developerList.iterator();
		
		// Iterating problem
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
}