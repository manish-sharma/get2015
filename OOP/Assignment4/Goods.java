package oop3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**this class handle the functionality of goods train
 * @author khemanshu
 *
 */
public class Goods extends Train{
	// weight available in train.
	int availableWeight;
	//holds the objects of goods trains.
	public static List<Goods> trains = new ArrayList<Goods>();
	//holds the refine objects of goods train.
	public static List<Goods> refineTrainsList=new ArrayList<Goods>();
	//holds the location of train file.
	public static String location="C:/Users/Khemanshu/workspace/Assignment/src/oop3/goodsTrain.txt";
	//used in readTrainDetails function to hold one line from file.
	public static String line="";
	//un-parameterized constructor.
	public Goods(){};
	/**parameterized constructor
	 * @param trainNumber
	 * @param trainName
	 * @param source
	 * @param destination
	 * @param duration
	 * @param fare
	 * @param availableWeight
	 */
	public Goods(int trainNumber, String trainName, String source,String destination, String duration, int fare, int availableWeight) {
		super(trainNumber, trainName, source, destination, duration, fare);
		this.availableWeight = availableWeight;
	}
	/**read train details from the file.
	 * @return the list of Goods object detail.
	 */
	public  List<Goods> readTrainDetails(){  
		
		try
		{
			//Reading the questions stored in the csv file
			BufferedReader br=new BufferedReader(new FileReader(location));
			while((line=br.readLine())!=null)
			{
				String[] token=line.split(",");
				//Questions are added in the list of string type
				trains.add(new Goods(Integer.parseInt(token[0]),token[1],token[2],token[3], token[4],Integer.parseInt(token[5]),Integer.parseInt(token[6])));
			}
			br.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
	
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		return trains;
	}
	/** display the trains to user
	 * @param trains list of Goods object.
	 */
	public void showTrain(List<Goods> trains){
		System.out.print("trainNumber"+"\t");
		System.out.print("trainName"+"\t");
		System.out.print("source"+"\t");
		System.out.print("destination"+"\t");
		System.out.print("duration"+"\t");
		System.out.print("fare"+"\t");
		System.out.println("availableWeight"+"\n");
		for(int count=0;count<trains.size();count++){
			System.out.print(trains.get(count).trainNumber+"\t");
			System.out.print(trains.get(count).trainName+"\t");
			System.out.print(trains.get(count).source+"\t");
			System.out.print(trains.get(count).destination+"\t\t");
			System.out.print(trains.get(count).duration+"\t\t");
			System.out.print(trains.get(count).fare+"\t\t");
			System.out.println(trains.get(count).availableWeight);
		}
	}
	/**refine trains according to user specification.
	 * @param source station of train. 
	 * @param destination station of train
	 * @return list of Goods object.
	 */
	public List<Goods> refineTrains(String source, String destination){
		for(int count=0;count<trains.size();count++){
			if(trains.get(count).source.equalsIgnoreCase(source) && trains.get(count).destination.equalsIgnoreCase(destination)){
				refineTrainsList.add(trains.get(count));
			}
		}
		return refineTrainsList;
	}
	/** check the availability of weight in a train
	 * @param trainNumberUser 
	 * @param loadWeight
	 * @return true or false
	 */
	public boolean checkDetails(int trainNumberUser, int loadWeight){
		for(int count=0;count<refineTrainsList.size();count++){
			if(refineTrainsList.get(count).trainNumber == trainNumberUser){
				if(refineTrainsList.get(count).availableWeight>=loadWeight){
					return true;
				}
				else{
					System.out.println("weight you entered is not available in train");
					return false;
				}
			}
		}
		return false;
	}
	/** get the fare per weight of train.
	 * @param trainNo
	 * @return fare of train
	 */
	public int getFare(int trainNo){
		for(int count=0;count<refineTrainsList.size();count++){
			if(refineTrainsList.get(count).trainNumber == trainNo){
				return refineTrainsList.get(count).fare;
			}
		}
		return 0;
	}
	/** deduct the weight from train's available weight.
	 * @param trainNo
	 * @param weight
	 */
	public void deductWeight(int trainNo, int weight){
		for(int count=0;count<trains.size();count++){
			if(trains.get(count).trainNumber == trainNo){
				printTicket(count,weight);
				trains.get(count).availableWeight=trains.get(count).availableWeight-weight;
				refineTrainsList.clear();
			}
		}

	}
	/** print ticket of user
	 * @param trainObjectNumber
	 * @param weight
	 */
	public void printTicket(int trainObjectNumber, int weight){
		System.out.println("Your ticket is here \n\n");
		System.out.print("person Name \t"+"Train No.\t"+"Train Name\t\t"+"Weight\n");
		System.out.print(Input.userName+"\t\t");
		System.out.print(trains.get(trainObjectNumber).trainNumber+"\t\t");
		System.out.print(trains.get(trainObjectNumber).trainName+"\t");
		System.out.println(weight+"\t");
	}
	
}
