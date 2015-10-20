package designPattern.menu;

import java.util.Scanner;

import designPattern.Factory.WorkstationFactory;
import designPattern.engineer.Developer;
import designPattern.engineer.IEngineer;
import designPattern.engineer.MechanicalEngineer;
import designPattern.enumDef.Workstation;
import designPattern.workstation.IWorkstation;

public class Menu {
	private Scanner scanner;

	public void  printMenu()
	{
		scanner = new Scanner(System.in);
		WorkstationFactory workstationFactory=new WorkstationFactory();
		//class defining the operations of IWorkstation and IEngineer

		while (true) {
			System.out.println("\nMenu" 
					+ "\n1. Add Developer"
					+ "\n2. Add Mechanical Engineer"
					+ "\n3. Get list of Developer"
					+ "\n4. Get list of Mechanical Engineer"
					+ "\n5. Exit"
					+ "\nEnter your choice : ");
			String choice = scanner.next();
			switch (choice) {

			case "1":
				//Add Developer
				IWorkstation office = workstationFactory
						.getWorkstation(Workstation.Office);
				System.out.print("Enter name of  Developer : ");
				IEngineer developer = new Developer();
				String name = scanner.next();
				developer.setName(name);
				developer.setRole("Developer");
				office.addEngineers(developer);
				break;

			case "2":
				//Add Mechanical Engineer
				IWorkstation factory = workstationFactory
						.getWorkstation(Workstation.Factory);
				IEngineer mEngineer = new MechanicalEngineer();

				System.out.print("Enter name of  Developer : ");
				String name1 = scanner.next();
				mEngineer.setName(name1);
				mEngineer.setRole("Mechanical engineer");
				factory.addEngineers(mEngineer);
				break;

			case "3":
				//Get list of Developer
				IWorkstation officeList = workstationFactory
						.getWorkstation(Workstation.Office);
				officeList.printList();
				break;

			case "4":
				//Get list of Mechanical Engineer
				IWorkstation factoryList = workstationFactory
						.getWorkstation(Workstation.Factory);
				factoryList.printList();
				break;
			case "5":
				//exit
				System.exit(0);

			default:
				System.out.println("Please enter valid input");
				break;
			}
		}
	}
}
