import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Name:FilterClass
 * @author Shishir Pareek
 * Since : 20 August,2015
 * Description: Filters the choice on users choice
 */
public class FilterClass extends Train
{    
	/**
	 * Name: trainTypeFilter
	 * @param name: name of user
	 * @param type: Type of Train 
	 * @return list
	 * @throws IOException
	 * Description: Filters the information on type of train
	 **/
	public static List<String> trainTypeFilter(String name,String type) throws IOException
	{
		// Inputed list
		List<String> input=new ArrayList();
		// To get the list from method passed
		List<String> getList=new ArrayList();
		// Calling the function to read the values
		getList=FilterClass.readCsvFile();
		String line="";
		// Loop to split
		for(int count=0;count<getList.size();count++)
		{
			String[] tokens = getList.get(count).split(" ");//Extracts the word
			if (tokens.length > 0) 
			{
				if(tokens[6].equalsIgnoreCase(type))
				{
					input.add(getList.get(count));
				}
			}
		}
	return input;
	}
	/**
	 * Name: sourceAvailablity
	 * @param secondInput: list contaning the input
	 * @param source: Train orginating from
	 * @param destination: Train end Point
	 * @return list
	 * Description: returns the filtered array
	 **/
	public static List<String> sourceAvailablity(List<String> secondInput,String source, String destination)
	{
		// list array
		List<String> getList1=new ArrayList();
		List<String> getList4=new ArrayList();
		getList4=secondInput;
		// Storing the value
		for(int count=0;count<getList4.size();count++)
		{
			String[] tokens = getList4.get(count).split(" ");//Extracts the word
			if (tokens.length > 0) 
			{
				// Matching the source and destination
				if(tokens[1].equalsIgnoreCase(source) && tokens[2].equalsIgnoreCase(destination)) 
				{
					getList1.add(secondInput.get(count));
				}
		     }
		}
	return getList1;
	}
	/**
	 * Name: seatsAvaliblity
	 * @param thirdInput: list of input
	 * @param trainName: Name of the train
	 * @param noOfPassengers: no of passenger to be booked
	 * @return
	 * @throws IOException
	 * Description: filters according to the train name and no of passenger
	 */
	public static List<String> seatsAvaliblity(List<String> thirdInput,String trainName, int noOfPassengers) throws IOException
	{
		// list for getting the input
		List<String> getList3=new ArrayList();
		List<String> list=new ArrayList();
		//read the file
	    list=readCsvFile();
		List<String> getList4=new ArrayList();
		// Updating the file 
		for(int count=0;count<thirdInput.size();count++)
		{
			//Extracts the word
			String[] tokens = thirdInput.get(count).split(" ");
			if (tokens.length > 0) 
			{
				// Matching the train name and value of the list
				if(tokens[0].equalsIgnoreCase(trainName)&&((Integer.parseInt(tokens[3])>=noOfPassengers)))
				{
					// Calling the payment
					if(payment())
					{
						String header = " TrainName Source,Destination Availability Fare Duration";
						for(int i=0;i<list.size();i++)
						{
							// Storing the values
							String[] tokens1 = list.get(i).split(" ");
							if(tokens1[0].equalsIgnoreCase(trainName))
							{
								tokens[3]=Integer.toString(Integer.parseInt(tokens[3])-noOfPassengers);
							    String s= tokens[0]+" ,"+tokens[1]+" ,"+tokens[2]+" ,"+tokens[3]+" ,"+tokens[4]+" ,"+tokens[5]+" ,"+tokens[6];
								list.set((i), s);
								//Writing to the file
								WriteToFile(list);
							}
							else
							{
								String s= tokens1[0]+" ,"+tokens1[1]+" ,"+tokens1[2]+" ,"+tokens1[3]+" ,"+tokens1[4]+" ,"+tokens1[5]+" ,"+tokens1[6];
								list.set((i), s);
								WriteToFile(list);
							}
						}
					// Adding to the list
                    getList3.add(thirdInput.get(count));
					}
				}
			    else
			    {
			    	System.out.print("Entered wrong input");
			    }
			}
		}
		// Returning the list
		return getList3;
	}
	/**
	 * Name: payment
	 * @return
	 * @throws IOException
	 * Description: Payment is performed
	 **/
	public static boolean payment() throws IOException
	{   
		Scanner sc=new Scanner(System.in);
		DataInputStream obj= new DataInputStream(System.in);
		boolean flag=false;
		System.out.println("Enter the mode you want to choose ");
		System.out.print("Enter 1 for credit Card");
		System.out.print("Enter 2 for wallet");
		System.out.print("Enter 3 for Net banking");
		// Taking the input
		int i=sc.nextInt();
		switch(i)
		{
		    // credit card entry
			case 1: System.out.println("Enter the card number");
		    		long cardNumber= sc.nextInt();
		    		System.out.println("Enter the cvv number");
		    		int cvv=sc.nextInt();
		    		flag=true;
		    		break;
		    // Wallet
			case 2: System.out.println("payable amount processed");
			        flag=true;
					break;
			// Net banking
			case 3: System.out.println("Enter the username ");
			        String name= obj.readLine();
			        System.out.println("Enter the password");
			        String pass=obj. readLine();
			        flag=true;
			default:System.out.println("wrong choice entered");
			        flag=false;
		}
	// Returning flag
	return flag;
	}
	/**
	 * Name:writeToFile
	 * @param list
	 * Description: Writes to the file
	 **/
	public static void WriteToFile(List<String> list)
	{
		try 
		{
			// Buffer is called
			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Train.txt"));
			writer.newLine();
			// Printing the value
			for (String x : list) 
			{
				// Writing to the file
				writer.write(x);
				writer.newLine();
			}
			writer.close();
		} 
		catch (IOException e) 
		{
			e.getStackTrace();
		}
	}
}
