import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ServiceStation {
	
	final String MECHANIC_DATA_FILE = "D:\\Mechanics.txt";
 	final String CAR_DATA_FILE = "D:\\Cars.txt";
   
     //List of Mechanics  
 	  private List<Mechanics> mechanicsList = new ArrayList<Mechanics>();
 	
 	 // List of cars 
 	  private List<Cars> carList = new ArrayList<Cars>();	
 	
 	// CarNumber,Mechanic
 	private HashMap<String, String> allotmentList = new HashMap<String, String>();
 	
 	// summary for processing of total number of cars 
 	private HashMap<String, Integer> carProcessingList = new HashMap<String, Integer>();  
 	private int totalEarning = 0;
      
 	
 	
 	
 	// readMechanics class is used for assign a mechanics 
 	public void readMechanics()
 	{
 		BufferedReader br;
 		try
 		{
 			br = new BufferedReader(new FileReader(MECHANIC_DATA_FILE));
 			try
 			{    
 				// read first mechanics 
 				String sCurrentLine;
 				while ((sCurrentLine = br.readLine()) != null)
 				{   
 					// Reading up details line by line 
 					String[] mechDetailStrings = sCurrentLine.split(",");
 					//setting up mechanic object and storing it in mechanic list 
 					if (mechDetailStrings.length == 3) // if in case details are less or line is whitespace 
 						mechanicsList.add(new Mechanics(mechDetailStrings[0].trim(), mechDetailStrings[1].trim(), mechDetailStrings[2].trim()));
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
 	
 	
 	// readCars class is used for assign a car  
 	public void readCars()
 	{
 		BufferedReader br;
 		try
 		{
 			br = new BufferedReader(new FileReader(CAR_DATA_FILE));
 			try
 			{   
 				// read first car 
 				String sCurrentLine;
 				while ((sCurrentLine = br.readLine()) != null)
 				{
 					//  Reading up details line by line 
 					String[] carDetailStrings = sCurrentLine.split(",");
 					// setting up car object and storing it in Cars list 
 					if (carDetailStrings.length == 3) // if in case details are less or line is whitespace 
 						carList.add(new Cars(carDetailStrings[0].trim(), carDetailStrings[1].trim(),Integer.parseInt(carDetailStrings[2].trim()) ) );
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
 	
 	
 	// allotment method cars to mechanic  */
 	public void doAllotment() 
 	{
 		for (Cars car : carList)
 		{
 			for (Mechanics mech : mechanicsList)
 			{     
 				
 				// check availability of mechanics for specific type of car */
 				if (mech.isAvailable && mech.specificationInCarModel.equals(car.model))
 				{
 					// car is allotted to mechanics 
 					allotmentList.put(car.registrationNumber, mech.mechnicId);
 					
 					// Now availability makes false for this mechanics 
 					mech.isAvailable = false;
 					
 					// Earning is add to the total earning  
 					totalEarning += car.rate;

 					if (carProcessingList.containsKey(car.model))
 						carProcessingList.put(car.model,carProcessingList.get(car.model) + 1);
 					else
 						carProcessingList.put(car.model, 1);
 					break;
 				}
 			}
 		}
 	}
 	
 	
 	// Total earning is returned from here 
 	public int getEarning()
 	{
 		return totalEarning;
 	}

 	public HashMap<String, Integer> getCarProcessingStatus()
 	{
 		return carProcessingList;
 	}
}
