import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;


public class ServiceStation {
	
	final String MECHANIC_DATA_FILE = "C://Users/Banwari/workspace/CarModeling/src/Mechanics.txt";
 	final String CAR_DATA_FILE = "C://Users/Banwari/workspace/CarModeling/src/Cars.txt";
 	final String RATE_LIST = "C://Users/Banwari/workspace/CarModeling/src/Rate.txt";
   
     //List of Mechanics  
 	  private List<Mechanics> mechanicsList = new ArrayList<Mechanics>();
 	 // List of cars 
 	  private List<Cars> carList = new ArrayList<Cars>();	
 	// List of cars 
 	  private List<Rate> rateList = new ArrayList<Rate>();	
 	
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
 	
 	
 	
 // readMechanics class is used for assign a mechanics 
  	public void readRate()
  	{
  		BufferedReader br;
  		try
  		{
  			br = new BufferedReader(new FileReader(RATE_LIST));
  			try
  			{    
  				// read first car model rate 
  				String sCurrentLine;
  				while ((sCurrentLine = br.readLine()) != null)
  				{   
  					// Reading up details line by line 
  					String[] RateDetails = sCurrentLine.split(",");
  					//setting up Rate object and storing it in rate list 
  					if (RateDetails.length == 2) {
  						Rate rate = new Rate(RateDetails[0].trim(), Integer.parseInt( RateDetails[1].trim() ) );
  						rateList.add(rate);
  					}
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
 					if (carDetailStrings.length == 2) // if in case details are less or line is whitespace 
 						{carList.add(new Cars(carDetailStrings[0].trim(), carDetailStrings[1].trim() ) ) ;
 						}
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
 				if (mech.isAvailable && mech.specificationInCarModel.equals(car.modelOfCar))
 				{  
 					// car is allotted to mechanics 
 					allotmentList.put(car.registrationNumber, mech.mechanicId);
 					
 					// Now availability makes false for this mechanics 
 					mech.isAvailable = false;
 					
 					// Earning is add to the total earning
 					int charge=0;
 					for(Rate rate : rateList){
 					    if(rate.carModel.equalsIgnoreCase(car.modelOfCar)) {
 					    
 					    	charge=rate.rate;
 					    	break;
 					    }
 					 }
 					totalEarning += charge;

 					if (carProcessingList.containsKey(car.modelOfCar))
 						carProcessingList.put(car.modelOfCar,carProcessingList.get(car.modelOfCar) + 1);
 					else
 						carProcessingList.put(car.modelOfCar, 1);
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
