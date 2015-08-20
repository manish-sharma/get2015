import java.util.HashMap;


  public class CarModeling {
	
	public static void main(String[] args)
	{   
		// Service station object created
		ServiceStation serviceStation = new ServiceStation();
		//Read mechanics list 
		serviceStation.readMechanics();
		// Read car list 
		serviceStation.readCars();
		
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