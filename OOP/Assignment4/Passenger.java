package oop3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Passenger extends Train{
	// available seats in train.
	int availableSeat;
	//location of file in disk.
	public static String location="C:/Users/Khemanshu/workspace/Assignment/src/oop3/passengerTrain.txt";
	// line use in readTrainDetails to hold a single line from file
	public static String line="";
	//trains holds the list of object of passenger class
	public static List<Passenger> trains=new ArrayList<Passenger>();
	//refinetrainlist holds the object of refine trains
	public static List<Passenger> refineTrainsList=new ArrayList<Passenger>();
	/**un parameterized constructor.
	 */
	public Passenger(){
		super();
	}
	/** parameterized constructor
	 * @param trainNumber
	 * @param trainName
	 * @param source
	 * @param destination
	 * @param duration
	 * @param fare
	 * @param availableSeat
	 */
	public Passenger(int trainNumber, String trainName, String source,String destination,
			String duration, int fare, int availableSeat) {
		super(trainNumber, trainName, source, destination, duration, fare);
		this.availableSeat = availableSeat;
	}
	/**reads train detail from file
	 * @return list of passenger train objects.
	 */
	public  List<Passenger> readTrainDetails(){  
		try
		{
			//Reading the questions stored in the csv file
			BufferedReader br=new BufferedReader(new FileReader(location));
			while((line=br.readLine())!=null)
			{
				String[] token=line.split(",");
				//Questions are added in the list of string type
				trains.add(new Passenger(Integer.parseInt(token[0]),token[1],token[2],token[3], token[4],Integer.parseInt(token[5]),Integer.parseInt(token[6])));
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
	/** display trains to user
	 * @param trains
	 */
	public void showTrain(List<Passenger> trains){
		System.out.print("trainNumber"+"\t");
		System.out.print("trainName"+"\t");
		System.out.print("source"+"\t");
		System.out.print("destination"+"\t");
		System.out.print("duration"+"\t");
		System.out.print("fare"+"\t");
		System.out.println("availableSeat"+"\n");
		for(int count=0;count<trains.size();count++){
			System.out.print(trains.get(count).trainNumber+"\t");
			System.out.print(trains.get(count).trainName+"\t");
			System.out.print(trains.get(count).source+"\t");
			System.out.print(trains.get(count).destination+"\t\t");
			System.out.print(trains.get(count).duration+"\t\t");
			System.out.print(trains.get(count).fare+"\t\t");
			System.out.println(trains.get(count).availableSeat);
		}
	}
	/** refine trains according to user specification.
	 * @param source
	 * @param destination
	 * @return refine list of passenger object.
	 */
	public List<Passenger> refineTrains(String source, String destination){
		for(int count=0;count<trains.size();count++){
			if(trains.get(count).source.equalsIgnoreCase(source) && trains.get(count).destination.equalsIgnoreCase(destination)){
				refineTrainsList.add(trains.get(count));
			}
		}
		return refineTrainsList;
	}
	/** checking the details entered by user
	 * @param trainNumberUser
	 * @param numberOfSeat
	 * @return true or false
	 */
	public boolean checkDetails(int trainNumberUser, int numberOfSeat){
		for(int count=0;count<refineTrainsList.size();count++){
			if(refineTrainsList.get(count).trainNumber == trainNumberUser){
				if(refineTrainsList.get(count).availableSeat>=numberOfSeat){
					return true;
				}
				else{
					System.out.println("Number of seat you entered are not available");
					return false;
				}
			}
		}
		return false;
	}
	/** getting the fair of train per seat.
	 * @param trainNo
	 * @return fare
	 */
	public int getFare(int trainNo){
		for(int count=0;count<refineTrainsList.size();count++){
			if(refineTrainsList.get(count).trainNumber == trainNo){
				return refineTrainsList.get(count).fare;
			}
		}
		return 0;
	}
	/**deduct the seat from train
	 * @param trainNo
	 * @param noOfSeat
	 */
	public void deductSeat(int trainNo, int noOfSeat){
		for(int count=0;count<trains.size();count++){
			if(trains.get(count).trainNumber == trainNo){
				printTicket(count,noOfSeat);
				trains.get(count).availableSeat=trains.get(count).availableSeat-noOfSeat;
				refineTrainsList.clear();
			}
		}

	}
	/** print ticket of user.
	 * @param trainObjectNumber
	 * @param noOfSeat
	 */
	public void printTicket(int trainObjectNumber, int noOfSeat){
		System.out.println("Your ticket is here \n\n");
		System.out.print("person Name \t"+"Train No.\t"+"Train Name\t\t"+"Number of Seats\n");
		System.out.print(Input.userName+"\t\t");
		System.out.print(trains.get(trainObjectNumber).trainNumber+"\t\t");
		System.out.print(trains.get(trainObjectNumber).trainName+"\t");
		System.out.print(noOfSeat+"\n");
	}
}
