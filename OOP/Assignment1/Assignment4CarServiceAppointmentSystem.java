/**
 * Program to manage the services of car to the mechanics
 * there are three types of car Suv Sedan Hatchback and their rate is 500,300,100 respectively 
 *one mechanic is specialist of one of the three cars and it can service atmost one car 
 * */

import java.util.HashMap;
public class Assignment4CarServiceAppointmentSystem
{

	public static void main(String[] args)
	{
		Assignment4ServiceStation serviceStation = new Assignment4ServiceStation();
		serviceStation.readMechanics();
		serviceStation.readCars();
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
