package creational.factory.controller;

import creational.factory.model.Developer;
import creational.factory.model.EmployeeType;
import creational.factory.model.IEmployee;
import creational.factory.model.SalesPerson;
/**
 * This is factory class using creational design pattern
 * @author Sumitra
 *
 */
public class EmployeeFactory {
	/**
	 *  it will return the instance of either Developer or SalesPerson class according to  input employee type
	 * @param employeeType - either developer or salesPerson
	 * @return iEmployee object of either Developer or SalesPerson 
	 */
	public static IEmployee getIEmployee(EmployeeType employeeType) {
		IEmployee iEmployee;
		if (employeeType.equals(EmployeeType.developer)) {
			iEmployee = Developer.getInstance();

		} else if (employeeType.equals(EmployeeType.salesPerson)) {
			iEmployee = SalesPerson.getInstance();

		} else {
			iEmployee = null;
		}
		return iEmployee;
	}

}
