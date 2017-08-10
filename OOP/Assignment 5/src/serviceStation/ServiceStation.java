package serviceStation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* This class assigns the cars to mechanics according to their speciality and shows the required output
 * @author Shishir Pareek
 * Date 14th August 2015
 */
public class ServiceStation extends Person{
	/*This functions assign the cars to mechanics*/
	public static HashMap<String,String> Assign()
	{
		/*HashMap for storing the values after assignment*/
		HashMap<String,String> hashmap=new HashMap<String,String>();
		/*List of to store the details of mechanic*/
		List<String> mechanic=new ArrayList<String>();//list object to store mechanic details
		List<String> cars=new ArrayList<String>();//list object to store cars details 
		String COMMA_DELIMITER=" ";
		ServiceStation service=new ServiceStation();
		try
		{
			mechanic=service.readTheMechanicData();//reading mechanic data 
			cars=Cars.readCarsData();//reading car data
			String[] registrationNumber=new String[cars.size()];
			String[] carType=new String[cars.size()];
			String[] mechanics=new String[mechanic.size()];
			String[] carTypeService=new String[mechanic.size()];
			String[] price=new String[mechanic.size()];
	for(int index=0;index<cars.size();index++)
	{
		String token[]=cars.get(index).split(COMMA_DELIMITER);
		if(token.length>0)
		{
			registrationNumber[index]=token[0];//extracting the registration number 
			carType[index]=token[1];//extracting car type
		}
	}
	for(int index=0;index<mechanic.size();index++)
	{
		String token[]=mechanic.get(index).split(COMMA_DELIMITER);
		if(token.length>0)
		{
			mechanics[index]=token[0];//extracting the mechanic name 
			carTypeService[index]=token[2];//extracting the speciality of mechanic
			price[index]=token[3];//extracting the price for servicing
		}
	}
	int count = 0;
	for (int loopCount = 0; loopCount < cars.size(); loopCount++) //alloting cars to the mechanic
	{
		for (int loopmechanic = 0; loopmechanic < mechanic.size(); loopmechanic++)
		{
           /*this conditions check that the cartype and type of speciality of mechanic is same and 
            mechanic is avilabel*/
			if (carType[loopCount].equalsIgnoreCase(carTypeService[loopmechanic])&& (count <= cars.size()))
			{
				hashmap.put(mechanics[loopmechanic], carType[loopCount]);
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
	return hashmap;
}
	public static void main(String args[])
	{
	int suv = 0, hatchback = 0, sedan = 0;
	HashMap<String, String> output = new HashMap<String, String>();
	output = Assign();
	for (Map.Entry<String, String> m : output.entrySet())
	{
		// System.out.println(m.getKey()+" "+m.getValue());
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
	System.out.println("Total number of car Serviced");// printing of output
	System.out.println("SUV=" + suv);
	System.out.println("Sedan=" + sedan);
	System.out.println("hatchback=" + hatchback);
	long totalEarning = suv * 5000 + sedan * 3000 + hatchback * 2000;
	System.out.println("Total Earning=" + totalEarning);
}
}