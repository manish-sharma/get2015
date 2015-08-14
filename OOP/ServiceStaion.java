package oops_asignment_1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**This function returns the required serviceList
 * Name: ServiceStation
 * @author ankur gupta
 * Since: 13August,2015
 *  
 **/

public class ServiceStaion extends Mechanic
{  
    /**prints the serviceList after calling the functions
     * Name: main 
     * @param args
     * 
     */
	public static void main(String args[])
	{
		int suv = 0, hatchback = 0, sedan = 0;
		HashMap<String, String> serviceList = new HashMap<String, String>();
		serviceList = Call();
		for (Map.Entry<String, String> m : serviceList.entrySet())
		{
			
			if (m.getValue().equalsIgnoreCase("SUV")) // check for number of cars
			{
				suv++;
			} 
			else if (m.getValue().equalsIgnoreCase("Sedan")) //check for number of sedan
			{
				sedan++;
			} 
			else if (m.getValue().equalsIgnoreCase("hatchback"))//check for no of hatchback
			{
				hatchback++;
			}
		}
		System.out.println("Total number of car Serviced");// printing of serviceList
		System.out.println("SUV=" + suv);
		System.out.println("Sedan=" + sedan);
		System.out.println("hatchback=" + hatchback);
		long totalEarning = suv * 5000 + sedan * 3000 + hatchback * 2000;
		System.out.println("Total Earning=" + totalEarning);

	}
    /**This calls the person and car class and performs operation 
     * Name:Call
     * @return hashmap
     * 
     */
	public static HashMap<String, String> Call()
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		List<String> mechanicList = new ArrayList();
		List<String> carList = new ArrayList();
		String COMMA_DELIMITER = " ";// separation based on this
		
		try{
			mechanic = ServiceStaion.readCsvFilePersons();
			carList = Car.readCsvFile();
			String[] registrationnumber = new String[carList.size()];
			String[] cartype = new String[carList.size()];
			String[] name = new String[mechanic.size()];
			String[] carTypeService = new String[mechanic.size()];
			String[] rate = new String[mechanic.size()];

			for (int i = 0; i < carList.size(); i++) 
			{
				String[] tokens = carList.get(i).split(COMMA_DELIMITER);// intializing the value to the string array
				if (tokens.length > 0) {
					registrationnumber[i] = tokens[0];
					cartype[i] = tokens[1];
				}
			}
			for (int i = 0; i < mechanic.size(); i++) 
			{
				String[] tokens = mechanic.get(i).split(COMMA_DELIMITER);// intializing the value to the string array
				if (tokens.length > 0) {
					name[i] = tokens[0];
					carTypeService[i] = tokens[2];
					rate[i] = tokens[3];

				}
			}

			int count = 0;
			for (int loopCount = 0; loopCount < car.size(); loopCount++) //alloting cars to the mechanic
			{
				for (int loopmechanic = 0; loopmechanic < mechanic.size(); loopmechanic++)
				{

					if (cartype[loopCount].equalsIgnoreCase(carTypeService[loopmechanic])&& (count <= car.size()))
					{
						hm.put(name[loopmechanic], cartype[loopCount]);
						carTypeService[loopmechanic] = " ";
						count++;
						break;
					}
				}
			}

		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return hm;
	}
}
