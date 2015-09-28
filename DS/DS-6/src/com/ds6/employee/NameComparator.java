package com.ds6.employee;

import java.util.Comparator;
/**This class implements the Comparator interface for type Object and overrides the compare 
 * function to comapre the object using employee id
 * @author Shishir
 *Date 2nd September 2015
 */
public class NameComparator implements Comparator<Object> {

/*Overridden function to implement the comparison using employee id*/
public int compare(Object o1,Object o2){
		
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		return e1.getEmpID().compareTo(e2.getEmpID());
	}
}
