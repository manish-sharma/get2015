/**
 * @author : Pooja Khandelwal
 * @crated Date : 04/09/2015
 * @Name : Student
 * @Description : this class will set the attributes of new student
 */
package com.treesort;

public class Student {
	private static int rollNo;
	private static String name;

	/**
	 * @Nmae : getRollNo()
	 * @Description : return roll no of student
	 * @param :
	 * @return : roolNo
	 */
	public int getRollNo() {
		return rollNo;
	}

	/**
	 * @Nmae : setRollNo()
	 * @Description : set roll no of student
	 * @param : rollNo
	 * @return :
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	/**
	 * @Nmae : getName()
	 * @Description : return name of student
	 * @param :
	 * @return : name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @Nmae : setName()
	 * @Description : set Name of student
	 * @param : Name
	 * @return :
	 */
	public void setName(String name) {
		this.name = name;
	}

}
