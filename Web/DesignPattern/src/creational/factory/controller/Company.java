package creational.factory.controller;

import java.util.ArrayList;
import java.util.List;

import creational.factory.model.IEmployee;
/**
 * this is company class which create employee instance
 * @author Sumitra
 *
 */
public class Company  {
	private static List<IEmployee> employees = new ArrayList<IEmployee>();
	private static Company instance = null;

	private Company() {

	}

	/**
	 * it will create if instance is null and return the instance of Company class whenever required
	 * @return Company object/instance of Company class
	 */
	public static Company getInstance() {
		
		if (instance == null) {

			instance = new Company();
		}
		return instance;
	}

	/**
	 *  it will add the new employee in the employee List of company
	 * @param iEmployee  object of either Developer or SalesPerson class
	 * @return
	 */
	public void addEmployee(IEmployee iEmployee) {
		employees.add(iEmployee);

	}

	/**
	 * it will provide the list of all employees of company when required
	 * @return employees  list of all employees of company
	 */
	public List<IEmployee> getEmployeesList() {
		return employees;

	}


	}