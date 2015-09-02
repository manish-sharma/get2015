/**
 * @author : Pooja khandelwal
 * @created Date : 02/09/2015
 * @Name : NameComparator class
 * @Description : this class implements java Comparator interface and override the compare()
 *  method of that interface and then sorts the Employee class object based on name
 */
package com.nameSorting.collection.employee;

import com.naturalOrderSorting.collection.employee.*;

import java.util.Comparator;

class NameComparator implements Comparator {
	/**
	 * @Nmae : comapre() method
	 * @param : employeeObj1,employeeObj2(Employee class objects)
	 * @Description : it will compare 2 Employee class objects(on the basis of
	 *              Employee nmae) at a time by further calling the comareTo()
	 *              method and then sort them i.e. sorts complete Employee
	 *              collection in this way
	 * @return :if first element is comes before the second element in
	 *         ordering,then -ve value will be returned. If first element comes
	 *         after,then +ve value is returned.Otherwise 0 will be returned. It
	 *         is not necessary that 0 return value will signifies equality of
	 *         elements. The 0 returned value just signifies that 2 object are
	 *         ordered at same position.
	 */
	@Override
	public int compare(Object employeeObj1, Object employeeObj2) {
		Employee employee1 = (Employee) employeeObj1;
		Employee employee2 = (Employee) employeeObj2;
		return ((String) employee1.getName()).compareTo((String) employee2
				.getName());
	}
}
