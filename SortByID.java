package com;

import java.lang.reflect.Constructor;
import java.util.*;
/**
 * this class use to sort a list by employee id in natural order
 * @author Sumitra
 *
 */

public class SortByID extends CollectionEmployee {
/**
* {@link Constructor}
* @param employeeName   employee name
* @param employeeID id of employee 
* @param address address of employee
*/
	public SortByID(String employeeName, Integer employeeID, String address) {
		super(employeeName, employeeID, address);
		
	}

	/**
	 * this is the main method of class 
	 * this initialize a {@link List} 
	 * use {@link CollectionEmployee}
	 * use {@link Collections} to {@link SortByID}
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		@SuppressWarnings("rawtypes")
		List employee = new ArrayList();
		employee.add(new CollectionEmployee("sumitra",691, "address of Sumitra"));
		employee.add(new CollectionEmployee("ankita", 691, "address of ankita"));
		employee.add(new CollectionEmployee("ravika", 693, "address of ravika"));
		employee.add(new CollectionEmployee("pooja",  694, "address of pooja"));
		employee.add(new CollectionEmployee("sushila",695, "address of sushila"));
		

		Collections.sort(employee);
		System.out.println("Sorted List of Employee based on EmployeeID:\nName\t\tEmployeeID \t\tAddress");
		
		for(int i=0;i<employee.size();i++){
		System.out.println(employee.get(i));
	}
		}

}
