/**
 * @author : Pooja Khandelwal
 * @created Date : 31/08/2015
 * @Name : Professor class
 * @Description :this class extends Printer Class and uses properties (priority) Printer class
 */
package com.admin.printer;

public class Professor extends Printer {
	/**
	 * @Nmae : default constructor of Professor Class
	 * @Description : it will set priority for Professor's document
	 */
	Professor() {
		priority = 3;
		departmentName="Professor";
	}

	/**
	 * @Name : addDocumentToThePrinter()
	 * @param : nothing
	 * @Description : it will send the Professor's document to the printer by
	 *              further calling addDocumentToThePrinter() function of
	 *              Printer class
	 * @return : nothing
	 */
	public void addDocumentToThePrinter() {
		// Printer printer=new Printer();
		addDocumentToThePrinter(departmentName,priority);
	}

}
