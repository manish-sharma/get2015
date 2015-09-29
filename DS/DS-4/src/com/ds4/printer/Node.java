package com.ds4.printer;
/*this class defines the attributes for the prinitng task 
 * @author Shishir Pareek
 * Date 31st Aug 2015
 */
public class Node {
	public int priority;
	public String name;
	public String department;
	public String message;
	
	/*default constructor*/
	public Node () {
		priority = -1;
		name = "";
		department = "";
		message = "";
	}
	/*overloaded constructor*/
	public Node(int priority, String name, String department, String message ) {
		this.priority = priority;
		this.name = name;
		this.department = department;
		this.message = message;
	}
	/*overloaded to string method of string class*/
	public String toString() {
		return "	"+name+"	"+department+"	"+message;
	}
}
