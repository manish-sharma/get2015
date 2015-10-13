package oopAssignment5;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Class to fetch data from the text file and store in passenger and goods type list
 * @author Riddhi
 *
 */

public class TrainDetails {

	public static List<PassengerTrain> passengerTrainInfo=new ArrayList<PassengerTrain>();
	public static List<GoodsTrain> goodsTrainInfo=new ArrayList<GoodsTrain>();
	public static String location="C://Users/Riddhi/workspace/OOPAssignment3/src/trainInfo.txt";
	
	public static void readTrainDetails()
	{
		BufferedReader br;
		String line=" ";
		try
		{
			//Reading the questions stored in the txt file
			br=new BufferedReader(new FileReader(location));
			String[] trainDetails;
			while ((line = br.readLine()) != null){
				trainDetails = line.split(",");									// Reading up details line by line
			    if(trainDetails[1].equalsIgnoreCase("Passenger"))
			    {// setting up train object and storing it in train list												
			    	passengerTrainInfo.add(new PassengerTrain(trainDetails[0], trainDetails[1].trim(), trainDetails[2].trim(), trainDetails[3].trim(), trainDetails[4].trim(), trainDetails[5].trim(), trainDetails[6].trim()));
			    }
			    else
			    {
			    	goodsTrainInfo.add(new GoodsTrain(trainDetails[0], trainDetails[1].trim(), trainDetails[2].trim(), trainDetails[3].trim(), trainDetails[4].trim(), trainDetails[5].trim(), trainDetails[6].trim()));
			    }
			}
		}
		//Catches an exception if file not found
				catch(FileNotFoundException e)
				{
					System.out.println(e);

				}
				catch(IOException e)
				{
					System.out.println(e);
				}
	}
}
