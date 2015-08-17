package oop1;
import java.util.HashMap;

public class MainServiceStation {
	public static void main(String args[]){
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

