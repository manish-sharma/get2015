package com.vehicle.VeiwClasses;

import java.util.Scanner;

import com.xml.WriteVehicleXml;

public class InsertData {
 static Scanner  scan = new Scanner(System.in);
	public void insertion() {
		String make,model, engineInCC, fuelCapacity ,milage , price ,  roadTax, Ac, powerSteering, accessoryKit,selfStart,helmetPrice = null;
		String flag="";
		System.out.println("Enter brand name:");
		make =scan.nextLine();
		System.out.println("Enter Model name:");
		model =scan.nextLine();
		System.out.println("Enter engineInCC:");
		engineInCC =scan.nextLine();
		System.out.println("Enter fuelCapacity:");
		fuelCapacity =scan.nextLine();
		System.out.println("Enter milage:");
		milage =scan.nextLine();
		System.out.println("Enter price:");
		price =scan.nextLine();
		System.out.println("Enter roadTax:");
		roadTax =scan.nextLine();
		System.out.println("Enter 1 to car and 2 to bike:");
		flag =scan.nextLine();
		while(!(flag.equals("1")) || (flag.equals("2"))){
			System.out.println("Enter 1 or 2 value:");
			flag =scan.nextLine();
		}
		
		if(flag.equals("1")){
		System.out.println("Enter true of false- is Ac include :");
		Ac =scan.nextLine();
		System.out.println("Enter true of false- is powerSteering include :");
		powerSteering =scan.nextLine();
		System.out.println("Enter Accessory kit:");
		accessoryKit =scan.nextLine();
		WriteVehicleXml vehicleXml = new WriteVehicleXml();
		vehicleXml.setFile("vehicle.xml");
		try {
			vehicleXml.saveConfigCar(make, model, engineInCC, fuelCapacity, milage, price, roadTax, Ac, powerSteering, accessoryKit);
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		}
		if(flag.equals("2")){
			
		System.out.println("Enter true of false- is  selfStart:");
		selfStart = scan.nextLine();
		System.out.println("Enter Helmet price:");
		helmetPrice = scan.nextLine();
		WriteVehicleXml vehicleXml = new WriteVehicleXml();
		vehicleXml.setFile("vehicle.xml");
		try {
			vehicleXml.saveConfigBike(make, model, engineInCC, fuelCapacity, milage, price, roadTax, selfStart, helmetPrice);
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		}
	}
}
