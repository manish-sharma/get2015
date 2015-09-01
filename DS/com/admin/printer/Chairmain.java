/**
 * @author : Pooja Khandelwal
 * @created Date : 31/08/2015
 * @Name : Chairmain class
 * @Description :this class extends Printer Class and uses properties (Priority) of Printer class
 */
package com.admin.printer;

public class Chairmain extends Printer {
	/**
	 * @Nmae : default constructor of Chairmain Class
	 * @Description : it will set priority for Chairman's document
	 */
	Chairmain() {
		priority = 4;
		departmentName="Chairman";
	}

	/**
	 * @Name : addDocumentToThePrinter()
	 * @param : nothing
	 * @Description : it will send the chairman's document to the printer by
	 *              further calling addDocumentToThePrinter() function of
	 *              Printer class
	 * @return : nothing
	 */
	public void addDocumentToThePrinter() {
		addDocumentToThePrinter(departmentName,priority);
	}
}
