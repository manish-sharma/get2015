package Assignment2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Assignment1.Singleton;
/**
 * this class is used to extends the Developer 
 * @author Ankur
 * Since: 21 October,2015
 **/
public class Company extends Developer
{
	// Creating Static object of class Company
	private static Company company = new Company();
	// can only be Orginated through getInstance Method
	private Company()
	{
		super();

	}

	//   List to store developers data
	private List<Developer> developerList = new ArrayList<Developer>();

	/**
	 * Name: getInstance
	 * @return 
	 * Description: Function to return instance of company
	 **/
	public static Company getInstance()
	{
		return company;
	}
	/**
	 * Name:addDeveloper
	 * @param name
	 * @param role
	 * Description: Adds the Information to the Developer List
	 **/
	public void addDeveloper(String name, String role) 
	{
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
	public void showList()
	{
		// Iterator Called to print the data
		Iterator<Developer> iterator = developerList.iterator();
		// Iterating problem
		if(developerList.size() == 0){
			System.out.println("Empty list");
		}
		else{
			while (iterator.hasNext()) 
			{
				System.out.println(iterator.next().toString());
			}
		}
	}

}
