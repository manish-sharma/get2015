/**
 *Assignment 4: Apply oop’s technique learned in session
Car Service Appointment System
Console based application to manage car service appointments for a day.
Modelling the Operations of a Service Station
We need to create a design and implement the operations of a Car Service Station.
A Service Station has many Persons (Mechanics , Manager , Staff etc. ) which work in the service station.

The Service Station services multiple Cars (Which can be a Sedan , Hatchback or SUV ) every day .

Every car is serviced by a mechanic who specializes in servicing a particular type of a car. For example a Mechanic specializing in SUV will be able to service a SUV Car.

The service station has a list of Mechanic working in the office.
The service station has a list of Cars entering the center for servicing.
The service station maintains the assignment of the work (i.e. which mechanic is working on which car)

Each car has a different rate for servicing. For example rate of SUV can be 5000 while the rate of the Sedan can be 3000 Rs .
Input
Setting up the Mechanics 
You can load list of the Mechanics from a file (You can use  InputFileReader/BufferedReader )
The way you can store the data in CSV format (Comma Separated Values)

The format of data in the file can be (Name, Type, Rate)
Mechanic1 , SUV , 5000   
Mechanic2 , Sedan , 3000

You can read from the file can create the objects.
Reading the car input,,,
You can load the list of cars arriving in the service center from the file.
You can keep the format of the data as (Car Number, Car Type)
SUV
SUV
Sedan
Hatchback
Sedan

Output
 
After reading the data print 

How many cars are serviced by each type 

Example : 
SUV : 5
Sedan : 10 
Hatchbak : 3

2. What was the total earning

Example 
12000 Rs 
 */

package ServiceCarSystem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

/**
 * @author Sumitra
 *
 */

public class ServiceCarManagement{
	ServiceStation serviceStation = new ServiceStation();
	Scanner scanner=new Scanner(System.in);
	int flag1=0;
	
	public static void main(String[] args) {
		ServiceCarManagement carManagement = new ServiceCarManagement();
		try {
			// Mechanic Data
			carManagement.writeData("E://Java//eclipse//Session5//src//ServiceCarSystem//Mechanic.csv");
			carManagement.readMechanicData("E://Java//eclipse//Session5//src//ServiceCarSystem//Mechanic.csv");

			// Car Data
			carManagement.writeData("E://Java//eclipse//Session5//src//ServiceCarSystem//Car.csv");

			carManagement.readCarData("E://Java//eclipse//Session5//src//ServiceCarSystem//Car.csv");

		} catch (IOException e) {
		
			e.printStackTrace();
		}
		// Mapping for Services
		carManagement.mapping();

		double Amount = carManagement.calculation();

		// 2. What was the total earning
		System.out.println("What was the total earning" + Amount);
		
	
	}

	/**Reading data from Mechanic File
	 * @param fileName :name of file for reading from it
	 */
	public void readMechanicData(String fileName) {

		CSVReader csvReader = null;
		try {
			csvReader = new CSVReader(new FileReader(fileName));
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		
		String[] row = null;
		String name = "";
		String carType = "";
		String price = "";
		try {
			while ((row = csvReader.readNext()) != null) {
				name = row[0];
				carType = row[1];
				price = row[2];
				int count=0;
				//Storing values in list of person and car
				Person person = new Person(name, carType, 0);
				serviceStation.getPersonList().add(person);
				Cars cars = new Cars(carType, Double.parseDouble(price));
				
				
				if(flag1==0) {
					serviceStation.getCarsList().add(cars);
					flag1++;
				}
				else {
					Iterator<Cars> itr1 = serviceStation.getCarsList().iterator();// getting Iterator from arraylist to traverse elements
					while (itr1.hasNext()) {
						if(!(itr1.next().getType().equals(cars.getType()))) {
							count++;	
						}
					}
					if(count==serviceStation.carsList.size()) {
						serviceStation.getCarsList().add(cars);
					}
				}
			}
			csvReader.close();
		} catch (IOException e) {

		}
	}

	/**Reading data from car file
	 * @param fileName :name of file for reading from it
	 */
	public void readCarData(String fileName) throws IOException {

		CSVReader csvReader = null;
		csvReader = new CSVReader(new FileReader(fileName));

		String[] row = null;
		String name = "";
		String carType = "";

		try {
			while ((row = csvReader.readNext()) != null) {
				name = row[0];
				carType = row[1];
				ServicingCars servicingCars1 = new ServicingCars(carType,
						Integer.parseInt(name));
				serviceStation.getServicingList().add(servicingCars1);

			}
			csvReader.close();
		} catch (IOException e) {

		}
	}

	/**Writing data of Mechanic and car through it in files
	 * @param fileName :name of file for writing into it
	 * @throws IOException
	 */
	public void writeData(String fileName) throws IOException {
		CSVWriter writer = new CSVWriter(new FileWriter(fileName));

		System.out.println("Enter no. of entry");
		int n =scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter entry");

			String[] data = scanner.next().split(",");
			writer.writeNext(data);
		}
		writer.close();
	}

	/**
	 *Mapping for Services class  
	 */
	public void mapping() {
		Iterator<Person> itr = serviceStation.getPersonList().iterator();// getting Iterator from arraylist to traverse elements
		while (itr.hasNext()) {
			Person object1 = itr.next();

			Iterator<Cars> itr1 = serviceStation.getCarsList().iterator();// getting Iterator from arraylist to traverse elements
			while (itr1.hasNext()) {
				Cars object2 = itr1.next();
				if (object2.getType().equals(object1.carType)) {
					Iterator<ServicingCars> itr3 = serviceStation.getServicingList().iterator();// getting Iterator from arraylist to traverse elements
					while (itr3.hasNext()) {
						ServicingCars object3 = itr3.next();
						if (object3.getCarType().equals(object2.getType())&& (object1.getFlag() == 0)) {
							object1.setFlag(1);
							Services services = new Services(object1.getName(),
									object1.getCarType(),
									object2.getServiceRate(),
									object3.getCarNumber());
							serviceStation.getServicesList().add(services);
						}
					}
				}
			}
		}

	}

	
	/**In this calculation of no. of cars of each type is done and amount of Total cars serviced in a day
	 * @return :returning amount of Total cars serviced in a day
	 */
	public double calculation() {
		int count1 = 0;
		double Amount = 0.0;
		// How many cars are serviced by each type
		System.out.println("How many cars are serviced by each type ");
		Iterator<Cars> itr1 = serviceStation.getCarsList().iterator();// getting Iterator from arraylist to traverse elements
		while (itr1.hasNext()) {
			Cars object2 = itr1.next();
			Iterator<Services> itr = serviceStation.getServicesList().iterator();// getting Iterator from arraylist to traverse elements
			while (itr.hasNext()) {
				Services object1 = itr.next();
				if (object2.getType().equals(object1.getCarType())) {
					count1++;
					Amount = Amount + object2.getServiceRate();
				}

			}
			System.out.println(object2.getType() + ":  " + count1);
			count1 = 0;
		}
		return Amount;
	}

	

	
}
