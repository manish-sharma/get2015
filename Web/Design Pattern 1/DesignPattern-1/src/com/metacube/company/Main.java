package com.metacube.company;

import java.util.List;
import java.util.Scanner;
/**
 * this a main class to execute the company's functions
 * @author Sanjay
 * @since 10/21/2015
 */
public class Main {

	/**
	 * this main function
	 * @param args
	 */
	public static void main(String[] args) {
		int choice;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		//object of company factory
		CompanyFactory companyFactory = new CompanyFactory();
		
		do {
			System.out.println("Enter 1 to add Engineer \n 2 for show List \n 3 to print specific type engineer \n 0 for Exit");
			//to avoid the exception InputMisMatch
			while(!(scanner.hasNextInt())) {
				System.out.println("Enter Only Integer!!");
				scanner.next();
			}
			choice = scanner.nextInt();
			//menu to perform operation on company
			switch (choice) {
			//to add the engineer
			case 1:
				System.out.print("Enter the Name : ");
				String name = scanner.next();
				System.out.println("Enter 1 for developer \n2 for salesperson");
				int roleChoice;
				// to avoid the unwanted numbers and to avoid the exception InputMisMatch
				do{
					while(!(scanner.hasNextInt())) {
						System.out.println("Enter Only Integer!!");
						scanner.next();
					}
					roleChoice = scanner.nextInt	();
				}while(roleChoice >2 || roleChoice <1);
				
				String role = null;
				//menu to select the engineer's role 
				//to avoid the unwanted inputs from user
				switch (roleChoice) {
				case 1:
					role = "Developer";
					break;

				case 2 :
					role = "SalesPerson";
					break;
				}
				companyFactory.addEngineer(name, role);
				break;
				
				//to display the list
			case 2:
				List<IEngineer> list = companyFactory.getListOfEngineers();
				if(list.isEmpty()) {
					System.out.println("List is Empty");
				} else {
					System.out.println("Name\tRole");
					for(IEngineer engineer : list) {
						System.out.println(engineer.getName() + "\t" + engineer.getRole());
					}
				}
				break;
				
				//to display the list of specific type
			case 3:
				System.out.println("Enter 1 for developer \n2 for salesperson");
				int typeChoice;
				// to avoid the unwanted numbers and to avoid the exception InputMisMatch
				do{
				while(!(scanner.hasNextInt())) {
					System.out.println("Enter Only Integer!!");
					scanner.next();
				}
				typeChoice = scanner.nextInt();
				}while(typeChoice >2 || typeChoice <1);
				
				String type = null;
				
				//menu to select the engineer's role 
				//to avoid the unwanted inputs from user
				switch (typeChoice) {
				case 1:
					type = "Developer";
					break;

				case 2 :
					type = "SalesPerson";
					break;
				}
				
				List<IEngineer> listOfSpecificRoleEngineer = companyFactory.getListOfEngineers(type);
				if(listOfSpecificRoleEngineer.isEmpty()) {
					System.out.println("List is Empty");
				} else {
				
					for(IEngineer engineer : listOfSpecificRoleEngineer) {
						System.out.println("Name");
						System.out.println(engineer.getName() );
					}
				}
				break;
				//to exit the system if we want to stop the processing
			case 0 :
				System.exit(0);
			}
		}while(choice != 0);
		
	}
}
