package com;

import java.lang.reflect.Constructor;
import java.util.*;
/**
 * 
 * @author Sumitra
 *
 */

@SuppressWarnings("rawtypes")
public class SortByName extends CollectionEmployee {

	
/**
* this is {@link Constructor}
* @param employeeName employee name
* @param employeeID id of employee 
* @param address address of employee
*/
public SortByName(String employeeName, Integer employeeID, String address) {
		              super(employeeName, employeeID, address);
			}

@SuppressWarnings("unchecked")
/**
 * this is the main method of class Sort by name
* this initialize a {@link List} 
* use {@link CollectionEmployee}
* use {@link Collections} to {@link SortByName}
* @param args
*/
public static void main(String[] args){
	                
	                     List employee = new ArrayList();
	                     employee.add(new CollectionEmployee("sumitra",691, "address of Sumitra"));
	                     employee.add(new CollectionEmployee("ankita", 691, "address of ankita"));
	                     employee.add(new CollectionEmployee("ravika", 693, "address of ravika"));
	                     employee.add(new CollectionEmployee("pooja",  694, "address of pooja"));
	                     employee.add(new CollectionEmployee("sushila",695, "address of sushila"));
	
	                      Collections.sort(employee,new NameComparator());
	                      System.out.println("Sorted List of Employee based on EmployeeName:\nName\t\t EmployeeID \t\tAddress");
	      for(int i=0;i<employee.size();i++){
	
	    	               System.out.println(employee.get(i));
                         }
              	}

}
