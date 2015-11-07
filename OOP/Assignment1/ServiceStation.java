package oop1;
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

	private List<Mechanic> mechanicsList = new ArrayList<Mechanic>();				 		// List of Mechanics
	private List<Car> carList = new ArrayList<Car>();				 						// List of cars
	private HashMap<String, String> allotmentList = new HashMap<String, String>();		 // CarNumber,Mechanic
	private HashMap<String, Integer> carProcessingList = new HashMap<String, Integer>(); // summary for processing of total number of cars
	private int totalEarning = 0;


	public void readMechanics()
	{
		BufferedReader br;
		try
		{
			br = new BufferedReader(new FileReader(MECHANIC_DATA_FILE));
			try
			{
				String sCurrentLine;
				while ((sCurrentLine = br.readLine()) != null)
				{
					String[] mechDetailStrings = sCurrentLine.split(",");// Reading up details line by line
					// setting up mechanic object and storing it in mechanic list
					if (mechDetailStrings.length == 4){ // if in case details are less or line is whitespace
						mechanicsList.add(new Mechanic(mechDetailStrings[0].trim(), mechDetailStrings[1].trim(), mechDetailStrings[2].trim(),
								mechDetailStrings[3].trim()));
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

		//System.out.print(mechanicDetailStrings[2]);

	}

	public void readCars()
	{
		BufferedReader br;
		try
		{
			br = new BufferedReader(new FileReader(CAR_DATA_FILE));
			try
			{
				String sCurrentLine;
				while ((sCurrentLine = br.readLine()) != null)
				{
					String[] carDetailStrings = sCurrentLine.split(",");// Reading up details line by line
					// setting up car object and storing it in Cars list
					if (carDetailStrings.length == 2) // if in case details are less or line is whitespace
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

	public void doAllotment() // allotment method cars to mechanic
	{
		for (Car car : carList)
		{
			for (Mechanic mech : mechanicsList)
			{
				if (mech.isAvailable && mech.type.equals(car.carType))
				{
					allotmentList.put(car.carId, mech.ID);
					mech.isAvailable = false;
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

	public int getEarning()
	{
		return totalEarning;
	}

	public HashMap<String, Integer> getCarProcessingStatus()
	{
		return carProcessingList;
	}
}

