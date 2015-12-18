package vehicle;

import java.util.List;
import java.util.Scanner;

import vehicle.InsertInDatabase.InsertInDatabase;
import vehicle.pojoClasses.Vehicle;
import vehicle.vehicleEnum.VehicalType;
import vehicle.vehicleHelper.VehicleHelper;
import vehicle.xmlParsing.XmlParsing;

public class VehicleMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*Case study Assignment-1 part*/
		VehicleHelper vehicleHelper = new VehicleHelper();

		/*VehicleDetailPrinter vehicleDetailPrinter = new VehicleDetailPrinter();
		 
		vehicleDetailPrinter.display("Enter vehical type : ");
		String vehicleType = sc.next();

		vehicleDetailPrinter.display("Enter Maker : ");
		String maker = sc.next();

		vehicleDetailPrinter.display("Enter Model : ");
		String model = sc.next();

		vehicleDetailPrinter.display("Enter Engin in CC : ");
		int enginInCC = sc.nextInt();

		vehicleDetailPrinter.display("Enter Fuel Capacity : ");
		int fuelCapacity = sc.nextInt();

		vehicleDetailPrinter.display("Enter mailage : ");
		int milage = sc.nextInt();

		vehicleDetailPrinter.display("Enter Price : ");
		int price = sc.nextInt();

		vehicleDetailPrinter.display("Enter Road tax : ");
		int roadTax = sc.nextInt();

		Vehicle vehicle = vehicleHelper.createVehicle(VehicalType.BIKE, maker,
				model, enginInCC, fuelCapacity, milage, price, roadTax);
				
		vehicleDetailPrinter.display("\nDetails of " + VehicalType.CAR + "\n"
				+ vehicleDetailPrinter.printVehicleSpecification(vehicle));
		vehicleDetailPrinter.display("\n\nOn Road Price : "
				+ vehicle.calculateOnRoadPrice(vehicle));*/
		
		/*hash code and equals function implementation*/
		Vehicle vehicle1 = vehicleHelper.createVehicle(VehicalType.CAR, "2013", "120",
				120, 10, 34, 15000, 34);
		Vehicle vehicle2 = vehicleHelper.createVehicle(VehicalType.CAR, "2013", "120",
				120, 10, 34, 15000, 34);
		
		System.out.println("\nvehicle1.equals(vehicle2)--->>>"+vehicle1.equals(vehicle2));
		
		/*Parsing data from XML file and inserting in database*/
		XmlParsing read=new XmlParsing();
		/*Parsing data from XML file and inserting in database for car*/
	    List<Vehicle> readCar = read.readConfig("../CaseStudy-2/src/vehicle/XMLFile/VehicleCar.xml");
	    System.out.println(readCar);
	    
	    for (Vehicle vehicleObject : readCar) 
	      InsertInDatabase.InsertIntoVehicle(vehicleObject);
	
	    /* Parsing data from XML file and inserting in database for bike*/
	    List<Vehicle> readBike = read.readConfig("../CaseStudy-2/src/vehicle/XMLFile/VehicleBike.xml");
	    System.out.println(readBike);
	    for (Vehicle vehicleObject : readBike) 
		   InsertInDatabase.InsertIntoVehicle(vehicleObject);
	    
		sc.close();
	   }
}
