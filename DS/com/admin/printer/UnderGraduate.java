/**
 * @author : Pooja Khandelwal
 * @created Date : 31/08/2015
 * @Name : UnderGraduate class
 * @Description :this class extends Student Class and uses properties (priority) of super class (Printer class)
 */
package com.admin.printer;

public class UnderGraduate extends Student {
	/**
	 * @Nmae : default constructor of UnderGraduate Class
	 * @Description : it will set priority for UnderGraduate's document
	 */
	UnderGraduate() {
		priority = 1;
		departmentName="UG";
	}

	/**
	 * @Name : addDocumentToThePrinter()
	 * @param : nothing
	 * @Description : it will send the UnderGraduate's document to the printer
	 *              by further calling addDocumentToThePrinter() function of
	 *              Printer class
	 * @return : nothing
	 */
	public void addDocumentToThePrinter() {
		addDocumentToThePrinter(departmentName,priority);
	}
}
