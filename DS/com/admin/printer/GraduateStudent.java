/**
 * @author : Pooja Khandelwal
 * @created Date : 31/08/2015
 * @Name : GraduateStudent class
 * @Description :this class extends Student Class and uses properties (priority) of super class (Printer class)
 */
package com.admin.printer;

public class GraduateStudent extends Student {
	/**
	 * @Nmae : default constructor of GraduateStudent Class
	 * @Description : it will set priority for Chairman's document
	 */
	GraduateStudent() {
		priority = 2;
		departmentName="PG";
	}

	/**
	 * @Name : addDocumentToThePrinter()
	 * @param : nothing
	 * @Description : it will send the GraduateStudent's document to the printer
	 * by further calling addDocumentToThePrinter() function of Printer class
	 * @return : nothing
	 */
	public void addDocumentToThePrinter() {

		addDocumentToThePrinter(departmentName,priority);
	}

}
