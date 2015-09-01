/**
 * @author : Pooja Khandelwal
 * @created Date : 31/08/2015
 * @Name : Printer Class
 * @Description : this class will extends AdminDepartment class use heap implementation to send documents to the printer and 
 * then to print the document with higher priority by using Heap class functions
 */
package com.admin.printer;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Printer extends AdminDepartment {
	protected static int priority;
	private static Heap heap = new Heap();

	/**
	 * @Name : addDocumentToThePrinter function
	 * @param : priority(it will gives the priority of new document ,that has to
	 *        be sent to the printer)
	 * @Description : it will add new document to the printer by further calling
	 *              the addNewPriorityNodeToHeap() function of Heap class
	 * @return : nothing
	 */
	public static void addDocumentToThePrinter(String departmentName,int priority) {
		heap.addNewPriorityNodeToHeap(departmentName,priority);
	}

	/**
	 * @Name : printDocumentWithHighestPriority()
	 * @param : nothing
	 * @Description : it will print the document with highest priority and then
	 *              remove that document instance from printer by further
	 *              calling the removeFromPrinter() function of Heap class
	 * @return : nothing
	 */
	public void printDocumentWithHighestPriority() {
		heap.removeFromPrinter();
	}

	/**
	 * @Name : showReminingDocumentsOnPrinter()
	 * @param : nothing
	 * @description : it will show the documents which are still on printer to
	 *              process by further calling the showDocumentsOnHeap()
	 *              function of Heap class
	 * @return : nothing
	 */
	public void showReminingDocumentsOnPrinter() {
		heap.showDocumentsOnHeap();
	}
}
