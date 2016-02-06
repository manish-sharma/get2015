import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Name: FilterClass
 * @author Shishir pareek
 * Since: 20 August,2015
 * Description: Reads the details from list and filters the detail according to the preferences
 **/
public class UserInput extends FilterClass
{
	// Input the name of ticket
	static String name="";
	// No of passenger
	static int noOfPassenger;
	@SuppressWarnings("deprecation")
	/**
	 * Name: main
	 * @param args command line argument
	 * @throws IOException
	 * Description: user Interface
	 **/
	public static void main(String args[]) throws IOException
	{
		// For entering the
		String ch=" ";
	
		DataInputStream obj=new DataInputStream(System.in);
		System.out.println("Welcome To Train Reservation System" );
		do
		{
			MenuNew menuNew = new MenuNew();
			System.out.println("Do you want to Book more Tickets the press y otherwise any letter");
			ch=obj.readLine();
		
		}while(ch.equalsIgnoreCase("y"));
	}
	/**
	 * Name:printTicket
	 * @param finalTicket: list from user
	 * @return
	 * Description: Printing the ticket
	 **/
	public static void printTicket(List<String> finalTicket)
	{
		// printing the ticket
		for(int i=0;i<finalTicket.size();i++)
		{
			String[] tokens = finalTicket.get(i).split(" ");//Extracts the word
			System.out.println("Name:"+name);
			System.out.println("Train Name:"+tokens[0]);
			System.out.println("Number of Booked Seat:"+noOfPassenger);
			System.out.println("Paid Amount:"+(Integer.parseInt(tokens[4])*noOfPassenger));
		}
	}
	/**
	 * Name: printTicketFilter
	 * @param ticket: list to print
	 * @return 
	 * Description: Printing the Details 
	 **/
	public static void printTicketFilter(List<String> ticket)
	{
		System.out.println("Train source desti Avail Fare Duration TypeOfTrain ");
		for(int count=0;count<ticket.size();count++)
		{
			System.out.println(ticket.get(count));
		}
		
	}
	/**
	 * Name: reservation
	 * Description: calls the reservation function
	 **/
	public void reservation()
	{
		
	    DataInputStream obj=new DataInputStream(System.in);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name");
		// Type of carrier
		String type="";
		// Source of train
		String source="";
		// Destination
		String destination="";
		// Name of train
		String trainName="";
		// For filtering of the details
		List<String> firstFilter= new ArrayList();
		// For filtering of the details
		List<String> secondFilterget=new ArrayList();
		// For storing the details
		List<String> finalTicket=new ArrayList();
		// For Storing the list
		List<String> firstList=new ArrayList();
		try 
		{
			// Saving the name
			name =obj.readLine();
			// Calling the FUnction
			firstList=readCsvFile();
			printTicketFilter(firstList);
			System.out.print("Enter the train Type(P for passenger and G for goods) ");
			type= obj.readLine();
			// Checking the type of train
			if(type.equalsIgnoreCase("p")|| type .equalsIgnoreCase("G"))
			{
			firstFilter=trainTypeFilter(name,type );
			}
			else
			{
			System.out.println("Enter the type again ");
			type=obj.readLine();
			firstFilter=trainTypeFilter(name,type );
			}
			// Enter the source
			System.out.println("enter the Source and destination");
			System.out.print("Source=:");
			source=obj.readLine();
			System.out.println("");
			// Enter the Destination
			System.out.print("Destination=:");
			destination=obj.readLine();
			System.out.println("");
			// Calling the function
			secondFilterget=sourceAvailablity(firstFilter,source,destination);
			printTicketFilter(secondFilterget);
			System.out.println("Enter the train name");
			trainName=obj.readLine();
			System.out.println("Enter the number of passenger");
			noOfPassenger=sc.nextInt();
			finalTicket=seatsAvaliblity(secondFilterget,trainName,noOfPassenger);
			printTicket(finalTicket);
	    }
	    catch (IOException e)
	    {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    }
	}
	/**
	 * Name: chart
	 * @throws IOException
	 * Description: calls the updated chart to be printed
	 */
	public void chart() throws IOException
	{
		printTicketFilter(readCsvFile());
	}
}