/**
 *@author : Pooja Khandelwal
 *@created Date : 31/08/2015
 *@Name : MainClassForPrinting Class
 *@Description : this class will manage the printing task 
 */
package com.admin.printer;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.menu.admin.printer.Menu;
import com.menu.admin.printer.MenuForDocumentsSelection;

public class MainClassForPrinting {
	public static void main(String args[]) {
		Printer printer = new Printer(); // Printer Class object
		Menu menu = new Menu(); // Menu Class Object
		MenuForDocumentsSelection menuForDocumentsSelection = new MenuForDocumentsSelection(); // MenuForDocumentsSelection Class object
		int exitFlag = 1;
		Scanner scan = new Scanner(System.in);
		int departmentChoice = 0;
		int documentChoice = 0;
		String department;
		String regix = "[0-9]+";
		while (exitFlag != 0) {
			String departmentChoice1;
			do {
				menu.displayMenu(); // call displayMenu() function of Menu class
				departmentChoice1 = scan.next();
			} while (!(departmentChoice1.matches(regix)));
			departmentChoice = Integer.parseInt(departmentChoice1);
			switch (departmentChoice) {
			case 1:
				int validChoiceFlag = 0;
				while (validChoiceFlag == 0) {
					String documentChoice1;
					do {
						menuForDocumentsSelection.displayMenuForDocuments(); // call displayMenuForDocuments() function of MenuForDocument class
						documentChoice1 = scan.next();
					} while (!(documentChoice1.matches(regix)));
					documentChoice = Integer.parseInt(documentChoice1);
					if (documentChoice == 4) {
						validChoiceFlag = 1;
						Chairmain chairmain = new Chairmain();
						chairmain.addDocumentToThePrinter(); // call addDocumentToThePrinter() function of Chairman class
					} else if (documentChoice == 3) {
						validChoiceFlag = 1;
						Professor professor = new Professor();
						professor.addDocumentToThePrinter(); // call addDocumentToThePrinter() function of Professor class
					} else if (documentChoice == 2) {
						validChoiceFlag = 1;
						GraduateStudent graduateStudent = new GraduateStudent();
						graduateStudent.addDocumentToThePrinter(); // call addDocumentToThePrinter() function of GraduateStudents class
					} else if (documentChoice == 1) {
						validChoiceFlag = 1;
						UnderGraduate underGraduate = new UnderGraduate(); // call addDocumentToThePrinter() function of UnderGraduate class
						underGraduate.addDocumentToThePrinter();
					} else {
						System.out.println("Enter valid choice for document");
					}
				}
				break;
			case 2:
				printer.printDocumentWithHighestPriority(); // call printDocumentWithHighestPriority() function of Printer class
				break;
			case 3:
				printer.showReminingDocumentsOnPrinter(); // call showReminingDocumentsOnPrinter() function Printer class
				break;

			case 4:
				exitFlag = 0;
				System.out.println("**Exit**");
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid choice");
				break;
			}
		}
	}
}