package com;

import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
/**
 * this class is use to remove duplicate data in a collection
 * @author Sumitra
 *this use {@link Set} {@link TreeSet} to remove duplicate values using primary key EmployeeID
 */
public class RemoveDuplicate extends CollectionEmployee {
		
/**
* {@link Constructor}
* @param employeeName  @param employeeName employee name
* @param employeeID id of employee 
* @param address address of employee
 */
	public RemoveDuplicate(String employeeName, Integer employeeID,
			String address) {
		super(employeeName, employeeID, address);
		
	}
	/**
	 * this is the main method of class 
	 * this initialize a {@link List} 
	 * use {@link CollectionEmployee}
	 * use {@link Collections} to {@link Set}
	 * @param args
	 */
public static void main(String args[]) {
	
	               Set<CollectionEmployee> setRecord = new TreeSet<CollectionEmployee>();
	               setRecord.add(new CollectionEmployee("sumitra",691, "address of Sumitra"));
                   setRecord.add(new CollectionEmployee("ankita", 691, "address of ankita"));
	               setRecord.add(new CollectionEmployee("ravika", 693, "address of ravika"));
	               setRecord.add(new CollectionEmployee("pooja",  694, "address of pooja"));
	               setRecord.add(new CollectionEmployee("sushila",695, "address of sushila"));
	                System.out.println( "EmployeeName \tEmployeeID \t\tAddress");
		 for (CollectionEmployee c : setRecord) {
			        System.out.println( c.getEmployeeName()+"\t\t"+ c.getEmployeeID()+"\t\t"+  c.getAddress());
		}
	
}

}
