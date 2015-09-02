/**
 * @author : Pooja khandelwal
 * @created Date : 02/09/2015
 * @Name : Employee class
 * @Description : this class implements java Comparable interface to provide natural order sorting(ascending order) of custom class objects.It overrides the compareTo() method of that interface and then sorts the Employee class object based on Id.This class also have overrided equals() and hashCode() method to remove duplicate objects in the collection of custom class objects
 */
package com.naturalOrderSorting.collection.employee;

public class Employee implements Comparable {
	private String name;
	private int Id;
	private String address;

	/**
	 * @Name : parameterized constructor of Employee class
	 * @param : name(employee name)
	 * @param : Id(employee Id)
	 * @param : address(employee address)
	 * @Description : it sets the name,address and id value for a new employee
	 */
	public Employee(String name, int Id, String address) {
		this.name = name;
		this.Id = Id;
		this.address = address;
	}

	/**
	 * @Nmae : toString() method
	 * @param : nothing
	 * @Description : generate string for an Employee object i.e. for an
	 *              employee attributes
	 * @return : string of attributes of Employee class object
	 */
	public String toString() {
		return "{" + Id + "," + name + "," + address + "}";
	}

	// for natural order sorting(ascending order) of Employee class objects
	// (based on Id)

	/**
	 * @Name : getId() method
	 * @param : nothing
	 * @Desription : getter method for employee id
	 * @return : Id(employee id)
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @Nmae : comapreTo() method
	 * @param : employeeObj(Employee class objects)
	 * @Description : it will compare instance of Employee class with other
	 *              objects of Employee class(on the basis of Employee Id) at a
	 *              time by further calling the comareTo() method of Comparator
	 *              class and then sort them i.e. sorts complete Employee
	 *              collection in this way
	 * @return :if first element is comes before the second element in
	 *         ordering,then -ve value will be returned. If first element comes
	 *         after,then +ve value is returned.Otherwise 0 will be returned. It
	 *         is not necessary that 0 return value will signifies equality of
	 *         elements. The 0 returned value just signifies that 2 object are
	 *         ordered at same position.
	 */
	@Override
	public int compareTo(Object employeeObj) {
		Employee employee = (Employee) employeeObj;
		Integer id1 = new Integer(this.getId());
		Integer id2 = new Integer(employee.getId());
		return id1.compareTo(id2);
	}

	// for name based sorting of Employee class objects

	/**
	 * @Name : getName() method
	 * @param : nothing
	 * @Desription : getter method for employee name
	 * @return : name(employee name)
	 */
	public Object getName() {
		return name;
	}

	// remove duplicate objects

	/**
	 * @Name : hashCode() method
	 * @param : nothing
	 * @Desription : avoid duplicate objects(here by id) in the collection of
	 *             custom class object
	 * @return : integer result(calculated using employee id)
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) Id;
		return result;
	}

	/**
	 * @Name : equals() method
	 * @param : new Employee class object
	 * @Desription : avoid duplicate objects(here by id) in the collection of
	 *             custom class object
	 * @return : boolean value(true if object(with same id) already exist in the
	 *         collection;false if object(with same id) not exist in collection.
	 */
	@Override
	public boolean equals(Object employeeObj) {
		if (this == employeeObj)
			return true;
		if (employeeObj == null)
			return false;
		if (getClass() != employeeObj.getClass())
			return false;
		Employee other = (Employee) employeeObj;
		if (Id != other.Id)
			return false;
		return true;
	}

}
