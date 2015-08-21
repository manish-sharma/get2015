import java.util.HashMap;
import java.util.Scanner;


public class CarModelingMain {
	public static void main(String [] arg) {
		
		System.out.println("\t\tWELCOME TO CAR SERVICE CENTER\n");
		      // Service station object created
				ServiceStation serviceStation = new ServiceStation();
				//Read mechanics list 
				serviceStation.readMechanics();
				// Read car list 
				serviceStation.readCars();
				//Read Rates
				serviceStation.readRate();
				
				//Now car allotment is done 
				serviceStation.doAllotment();
				
				HashMap<String, Integer> carProcessingList = serviceStation.getCarProcessingStatus();

				System.out.println("CarType \t Number");

				for (String carType : carProcessingList.keySet())
				{
					System.out.println(carType + "\t\t " + carProcessingList.get(carType));
				}

				System.out.println("\nTotal Earning \t " + serviceStation.getEarning());
		
	}

}
