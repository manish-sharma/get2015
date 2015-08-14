import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ServiceStation
{
	final String MECHANICFILE = "E:\\Mechanics.txt";
	final String CARFILE = "E:\\Cars.txt";

	private List<Mechanic> mechanicsList = new ArrayList<Mechanic>();						// List of Mechanics
	private List<Cars> carList = new ArrayList<Cars>();										// List of cars
	
	private HashMap<String, String> allotmentList = new HashMap<String, String>();			// hashmap to store the one to one mapping of mechanics to cars
	private HashMap<String, Integer> carsServiced = new HashMap<String, Integer>(); 		// hashmap to store the number of cars serviced for each type
	
	private int totalIncome = 0;						//total income of the service station for one day

	
	//method to read the mechanic details from file
	public void readMechanics(){
		BufferedReader br;
		try{
			br = new BufferedReader(new FileReader(MECHANICFILE));
			try{
				String line;
				while ((line = br.readLine()) != null){
					String[] mechDetails = line.split(",");							// Reading up details line by line
																					// setting up mechanic object and storing it in mechanic list
					if (mechDetails.length == 4) 									// if details are less or line is whitespace
						mechanicsList.add(new Mechanic(mechDetails[0].trim(), mechDetails[1].trim(), mechDetails[2].trim(), mechDetails[3].trim()));

				}

			}
			catch (IOException e){
				e.printStackTrace();
			}

		}
		catch (FileNotFoundException e1){
			e1.printStackTrace();
		}

	}

	
	//method to read the car details from file
	public void readCars(){
		BufferedReader br;
		try{
			br = new BufferedReader(new FileReader(CARFILE));
			try{
				String sCurrentLine;
				while ((sCurrentLine = br.readLine()) != null){
					String[] carDetails = sCurrentLine.split(",");									// Reading up details line by line
																									// setting up car object and storing it in Cars list
					if (carDetails.length == 2) 													// if in case details are less or line is whitespace
						carList.add(new Cars(carDetails[0].trim(), carDetails[1].trim()));

				}

			}
			catch (IOException e){
				e.printStackTrace();
			}

		}
		catch (FileNotFoundException e1){
			e1.printStackTrace();
		}

	}

	
	// method to assign cars to mechanics base don the specialization of the mechanic
	public void assignCars(){
		for (Cars car : carList){
			for (Mechanic mech : mechanicsList){											//logic for checking the availability of a mechanic and if
				if (mech.isAvailable() && mech.speciality.equals(car.type)){				//a suitable mechanic is available the assign him the car
					allotmentList.put(car.carId, mech.mechId);								//for servicing
					mech.flag = false;												//setting the availability of the mechanic to false
					totalIncome += Integer.parseInt(mech.charge);							//adding service charges for the car to total income
										
					if (carsServiced.containsKey(car.type))
						carsServiced.replace(car.type, carsServiced.get(car.type), carsServiced.get(car.type) + 1);
					else
						carsServiced.put(car.type, 1);					//adding cars serviced to the hashmap for calculating
					break;												// number of cars serviced for each type
				}
			}
		}
	}

	//method to return total income
	public int getIncome(){
		return totalIncome;
	}

	//method to return hashmap containing number of cars serviced for each type
	public HashMap<String, Integer> getCarsServiced(){
		return carsServiced;
	}
}