import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*This class extract the information from the file and stores it in ArrayList which is used further in 
 * program
 *@author Shishir Pareek
 *Date 17th August 2015 
 */
public class TrainInformation {
	public String trainID;
	public String trainType;
	public String source;
	public String destination;
	public String totalDistance;
	public String totalTime;
	public String seats;
	public String fare;
	public static List<TrainInformation> info=new ArrayList<TrainInformation>();
	public static String url="D://TrainDetails.txt";
	
	/*Parameterized constructor of the class*/ 
	public TrainInformation(String trainID,String trainType,String source,String destination,String totalDistance,String totalTime,String seats,String fare)
	{
		this.trainID=trainID;
		this.trainType=trainType;
		this.source=source;
		this.destination=destination;
		this.totalDistance=totalDistance;
		this.totalTime=totalTime;
		this.seats=seats;
		this.fare=fare;
	}
	/*This function reads the information from the file and stores in the array List and returns the array list*/ 
	public static List<TrainInformation> readTrainInfo()
	{
         try 
         {
        	 BufferedReader br=new BufferedReader(new FileReader(url));
        	 String line="";
        	 /*loop to read the file*/
        	 while((line=br.readLine())!=null)
        	 {   
        		 /*whenever the comma will come loop will transferred the string read to the string type array*/
        		 String trainInfo[]=line.split(",");
        		 /*condition to check if the value of string array is greater than length or not*/
        		 if(trainInfo.length>0)
        		 {
        			 info.add(new TrainInformation(trainInfo[0].trim(),trainInfo[1].trim(),trainInfo[2].trim(),trainInfo[3].trim(),trainInfo[4].trim(),trainInfo[5].trim(),trainInfo[6].trim(),trainInfo[7].trim()));
        		 }
        		 
        	 }
        	 
         }
         catch(Exception e)
         {
        	 e.printStackTrace();
         }
	return info;
	}
/*	public static List<TrainInformation> sortedList(List<TrainInformation> sortedlist)
	{ 
		Collections.sort(sortedlist);
		
		return sortedlist;
	}
	@Override
	public int compareTo(TrainInformation object) {
		
		int compareTime=Integer.parseInt(object.totalTime);// TODO Auto-generated method stub
		return Integer.parseInt(this.totalTime)-compareTime;
	}*/
	
}
