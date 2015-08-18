import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *C
 * @author Riddhi
 *
 *Class to fetch details from the text file that stores train information.
 */
public class TrainInfo {

	String trainId; 
	String type;
	String from;
	String to;
	String seatsAvailable;
	String totalTime;
	String price;
	public static List<TrainInfo> info=new ArrayList<TrainInfo>(); //List of object type that stores train object.
	public static String location="C://Users/Riddhi/workspace/OOPAssignment3/src/trainInfo.txt";

	public TrainInfo(String trainId, String type, String from, String to, String seatsAvailable, String totalTime,String price)
	{
		this.trainId=trainId;
		this.type=type;
		this.from=from;
		this.to=to;
		this.seatsAvailable=seatsAvailable;
		this.totalTime=totalTime;
		this.price=price;
	}

	//method to read train information
	public static void readTrainInfo()
	{
		BufferedReader br;
		try
		{
			//Reading the questions stored in the txt file
			br=new BufferedReader(new FileReader(location));
			String line=" ";
			String[] trainDetails;
			while ((line = br.readLine()) != null){
				trainDetails = line.split(",");									// Reading up details line by line
			   // setting up train object and storing it in train list												
				info.add(new TrainInfo(trainDetails[0], trainDetails[1].trim(), trainDetails[2].trim(), trainDetails[3].trim(), trainDetails[4].trim(), trainDetails[5].trim(), trainDetails[6].trim()));

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

	public static List<TrainInfo> returnInfo()
	{
		return info; //returns list containing train type objects.
	}


}


