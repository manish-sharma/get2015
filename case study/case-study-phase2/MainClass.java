package Com.HelperClasses;


import java.util.List;
import java.util.Scanner;
import Com.Vehicle.*;


public class MainClass {
	static Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {

		int choice;

		do{
			System.out.println("Enter 1 to create tables:\n Enter 2 to insert data into tables\n Enter 3 to update data\nEnter 4 "
					+ "to delete data from table\n Enter 5 to search vehicle\n Enter 6 to Display all data\n Enter 0 to  exit");

			System.out.println("Enter your choice"); 
			while(!scan.hasNextInt()){
				System.out.println("Enter intger value:");
				scan.next();
			}

			choice = scan.nextInt();
			switch (choice) {
			case 1:
				DatabaseHelper.createVehicleTable();
				DatabaseHelper.createBikeTable();
				DatabaseHelper.createCarTable();
				break;
			case 2:
				InsertInToTable insertInToTable = new InsertInToTable();
				insertInToTable.insert();
				break;
			case 3:
				UpdateTable updateTable = new UpdateTable();
				System.out.println("Enter brand name to update price");
				String make1 = scan.next();
				int rows = updateTable.updateByMake(make1);
				System.out.println(rows +"Rows updated of Brand "+make1);
				break;
			case 4:
				DeleteDataFromTable deleteDataFromTable = new DeleteDataFromTable();
				int row = deleteDataFromTable.deleteData();
				System.out.println(row +"Rows deletted");
				break;
			case 5:
				SearchVehicle searchVehicle = new SearchVehicle();
				String make = null,model = null;
				System.out.println("Enter brand and model of vehicle");
				make = scan.next();
				model = scan.next();
				List<Vehicle> vehicles =null;
				vehicles = searchVehicle.searchByMakeAndModel(make, model);
				if(vehicles.isEmpty()){
					System.out.println("No Matches Found");
				}
				else
					System.out.println(vehicles);
				break;
			case 6:
				PrintDataOfTable printDataOfTable = new PrintDataOfTable();
				printDataOfTable.printBikeSpecification();
				printDataOfTable.printCarSpecification();
				break;
			case 0:
				System.exit(0);
				break;
			default:
				break;
			}
		}while(choice!=0);
	}

}
