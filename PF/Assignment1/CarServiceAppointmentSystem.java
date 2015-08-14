/**
 * Program to manage the services of car to the mechanics
 * there are three types of car Suv Sedan Hatchback and their rate is 5000,3000,1000 respectively 
 *one mechanic is specialist of one of the three cars and it can service atmost one car 
 * */
package CarServiceAppointmentSystem;
import java.util.HashMap;
public class CarServiceAppointmentSystem
{

	public static void main(String[] args)
	{
		ServiceStation serviceStation = new ServiceStation();
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
