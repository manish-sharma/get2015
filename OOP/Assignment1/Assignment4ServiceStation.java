import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Assignment4ServiceStation
{
	
	private final String MECHANIC_DATA_FILE=new File("src/Mechanics.txt").getAbsolutePath();
	private final String CAR_DATA_FILE =new File("src/Cars.txt").getAbsolutePath();

	private List<Assignment4Mechanic> mechanicsList = new ArrayList<Assignment4Mechanic>();				 		// List of Mechanics
	private List<Assignment4Car> carList = new ArrayList<Assignment4Car>();				 						// List of cars
	private HashMap<String, String> allotmentList = new HashMap<String, String>();		 // CarNumber,Mechanic
	private HashMap<String, Integer> carProcessingList = new HashMap<String, Integer>(); // carTyp ,carRate
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
					String[] mechDetailStrings = sCurrentLine.split(",");// Reading line by line
				
					if (mechDetailStrings.length == 4) // if in case details are less or line is whitespace
						mechanicsList.add(new Assignment4Mechanic(mechDetailStrings[0].trim(), mechDetailStrings[1].trim(), mechDetailStrings[2].trim(),
								mechDetailStrings[3].trim()));
				}

			}
			catch (IOException e)
			{
				System.out.println("IO Error Occured");
				System.exit(1);
			}

		}
		catch (FileNotFoundException e1)
		{
			System.out.println("File not found");
			System.exit(1);
		}

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
					String[] carDetailStrings = sCurrentLine.split(",");// Reading  line by line
						//storing it in Cars list
					if (carDetailStrings.length == 2) // if in case details are less or line is whitespace
						carList.add(new Assignment4Car(carDetailStrings[0].trim(), carDetailStrings[1].trim()));
				}

			}
			catch (IOException e)
			{
				System.out.println("IO Error Occured");
				System.exit(1);
			}

		}
		catch (FileNotFoundException e1)
		{
			System.out.println("File not found");
			System.exit(1);
		}

	}

	public void doAllotment() // allotment of  cars to the mechanic
	{
		for (Assignment4Car car : carList)
		{
			for (Assignment4Mechanic mech : mechanicsList)
			{
				if (mech.isAvailable && mech.type.equals(car.carType))
				{
					allotmentList.put(car.carNumber, mech.mechID);
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
