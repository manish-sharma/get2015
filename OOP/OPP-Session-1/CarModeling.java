/*
 * This application used as car service station operations maintenance 
 * In Station car can  be serviced with specialized person in servicing this car
 * Every car has specific service rate
 * One mechanics can serviced a car only one in day
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/** this is a Person abstract class*/
abstract class People
{
	String mechID;
	String name;

}




/** this is a Car abstract class*/
 class Car
{
	String carNumber;
	String carType;

	/** parameterized constructor */
	public Car(String CarNum, String CarType) {
		carNumber = CarNum;
		carType = CarType;
	}
}
 
 
 /** mechanic class which inherits the properties of a People */
 class Mechanic extends People
 {

 	String type;
 	String rate;
 	
 	/** isAvailable check the availability of mechanics or is mechanics is busy */
 	boolean isAvailable; 

 	/**   parameterized constructor  */
 	public Mechanic(String mechId, String mechName, String mechType, String mechRate)
 	{
 		mechID = mechId;
 		name = mechName;
 		type = mechType;
 		rate = mechRate;
 		isAvailable = true;
 	}
 }

 
 
 
 class ServiceStation
 {
 	final String MECHANIC_DATA_FILE = "D:\\Mechanics.txt";
 	final String CAR_DATA_FILE = "D:\\Cars.txt";
   
     /**List of Mechanics  */
 	private List<Mechanic> mechanicsList = new ArrayList<Mechanic>();
 	
 	 /** List of cars */
 	private List<Car> carList = new ArrayList<Car>();	
 	
 	/** CarNumber,Mechanic */
 	private HashMap<String, String> allotmentList = new HashMap<String, String>();
 	
 	/** summary for processing of total number of cars */
 	private HashMap<String, Integer> carProcessingList = new HashMap<String, Integer>();  
 	private int totalEarning = 0;
      
 	
 	/** readMechanics class is used for assign a mechanics  */
 	public void readMechanics()
 	{
 		BufferedReader br;
 		try
 		{
 			br = new BufferedReader(new FileReader(MECHANIC_DATA_FILE));
 			try
 			{    
 				/** read first mechanics */
 				String sCurrentLine;
 				while ((sCurrentLine = br.readLine()) != null)
 				{   
 					/**  Reading up details line by line */
 					String[] mechDetailStrings = sCurrentLine.split(",");
 					/**setting up mechanic object and storing it in mechanic list */
 					if (mechDetailStrings.length == 4) /** if in case details are less or line is whitespace */
 						mechanicsList.add(new Mechanic(mechDetailStrings[0].trim(), mechDetailStrings[1].trim(), mechDetailStrings[2].trim(),
 								mechDetailStrings[3].trim()));
 				}

 			}
 			catch (IOException e)
 			{
 				e.printStackTrace();
 			}

 		}
 		catch (FileNotFoundException e1)
 		{
 			e1.printStackTrace();
 		}

 	}

 	/** readCars class is used for assign a car  */
 	public void readCars()
 	{
 		BufferedReader br;
 		try
 		{
 			br = new BufferedReader(new FileReader(CAR_DATA_FILE));
 			try
 			{   
 				/** read first car */
 				String sCurrentLine;
 				while ((sCurrentLine = br.readLine()) != null)
 				{
 					/**  Reading up details line by line */
 					String[] carDetailStrings = sCurrentLine.split(",");
 					/** setting up car object and storing it in Cars list */
 					if (carDetailStrings.length == 2) /** if in case details are less or line is whitespace */
 						carList.add(new Car(carDetailStrings[0].trim(), carDetailStrings[1].trim()));
 				}

 			}
 			catch (IOException e)
 			{
 				e.printStackTrace();
 			}

 		}
 		catch (FileNotFoundException e1)
 		{
 			e1.printStackTrace();
 		}

 	}
    
 	/** allotment method cars to mechanic  */
 	public void doAllotment() 
 	{
 		for (Car car : carList)
 		{
 			for (Mechanic mech : mechanicsList)
 			{     
 				
 				/** check availability of mechanics for specific type of car */
 				if (mech.isAvailable && mech.type.equals(car.carType))
 				{
 					/** car is allotted to mechanics */
 					allotmentList.put(car.carNumber, mech.mechID);
 					
 					/** Now availability makes false for this mechanics */
 					mech.isAvailable = false;
 					
 					/** Earning is add to the total earning  */
 					totalEarning += Integer.parseInt(mech.rate);

 					if (carProcessingList.containsKey(car.carType))
 						carProcessingList.replace(car.carType, carProcessingList.get(car.carType), carProcessingList.get(car.carType) + 1);
 					else
 						carProcessingList.put(car.carType, 1);
 					break;
 				}
 			}
 		}
 	}

 	
 	/** Total earning is returned from here */
 	public int getEarning()
 	{
 		return totalEarning;
 	}

 	public HashMap<String, Integer> getCarProcessingStatus()
 	{
 		return carProcessingList;
 	}
 }
 
 
 

  public class CarModeling {
	
	public static void main(String[] args)
	{   
		/** Service station object created */
		ServiceStation serviceStation = new ServiceStation();
		/**Read mechanics list */
		serviceStation.readMechanics();
		/** Read car list */
		serviceStation.readCars();
		
		/** Now car allotment is done */
		serviceStation.doAllotment();
		HashMap<String, Integer> carProcessingList = serviceStation.getCarProcessingStatus();

		System.out.println("CarType \t Number");

		for (String carType : carProcessingList.keySet())
		{
			System.out.println(carType + "\t\t " + carProcessingList.get(carType));
		}

		System.out.println("Total Earning \t " + serviceStation.getEarning());

	}
	

}
