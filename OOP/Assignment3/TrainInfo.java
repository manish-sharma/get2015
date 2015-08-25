import java.io.*;
import java.util.*;

public class TrainInfo {
	
	String trainId; 
	String trainType;
	String source;
	String destination;
	String seatsAvailable;
	String duration;
	String fare;
	
	public static List<TrainInfo> info = new ArrayList<TrainInfo>();			//List of object type that stores train type objects.
	
	public static String location = "E://trainInfo.txt";
	
	public TrainInfo(String trainId, String type, String from, String to, String seatsAvailable, String totalTime,String price) {
		this.trainId = trainId;
		this.trainType = type;
		this.source = from;
		this.destination = to;
		this.seatsAvailable = seatsAvailable;
		this.duration = totalTime;
		this.fare = price;
	}
	
	//method to read train information
	public static void readTrainInfo() {
		BufferedReader br;
		try	{										//Reading the questions stored in the txt file
			br = new BufferedReader(new FileReader(location));
			String line = "";
			String[] trainDetails;
			while ((line = br.readLine()) != null){
				trainDetails = line.split(",");									// Reading up details line by line
																				// setting up train object and storing it in train list												
				info.add(new TrainInfo(trainDetails[0], trainDetails[1].trim(), trainDetails[2].trim(), trainDetails[3].trim(), trainDetails[4].trim(), trainDetails[5].trim(), trainDetails[6].trim()));
			}
		}
		
		catch(FileNotFoundException e) {
				System.out.println(e);
		}
		
		catch(IOException e) {
				System.out.println(e);
		}

	}

	public static List<TrainInfo> returnInfo() {
		return info; 				//returns list containing train type objects.
	}
	
}
