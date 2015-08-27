import java.util.ArrayList;
import java.util.List;
/*This class performs all the booking functions related to ticket booking and sorting the list according to the user 
 * journey source and destination Goods,passenger preference,seats availability,weight can be sent and then calculate 
 * the final price and Ticket information 
 * @author Shishir Pareek
 * Date 17th August 2015
 */
public class Reservation  {
	/*ArrayList Object of type TrainInformation holding custom TrainInformation Objects*/
	List<TrainInformation> selectedList=new ArrayList<TrainInformation>();
	List<TrainInformation> selectedList1=new ArrayList<TrainInformation>();
	/*variable to hold user Information*/
	String name,trainID,seatsBooked;
	/*variable to hold total amount*/ 
	double amount;
	int count;
	public Reservation()//default constructor
	{
		
	}
	public Reservation(String name,String trainID,String seatsBooked,double amount2)//overloaded constructor
	{
		this.name = name;
		this.trainID = trainID;
		this.seatsBooked = seatsBooked;
		this.amount = amount2;
	}
	/*function which takes source and destination as input and returns the matching train to user*/
	public String listOFAvilabelTrains(String from,String to)
	{ 
		count=0;
		for(TrainInformation s:selectedList)//for each loop to iterate the list 
		{
			String source=s.source;
			String destination=s.destination;
			/*condition which checks the given source and destination matches the train source and destination*/
			if(source.equalsIgnoreCase(from) && destination.equalsIgnoreCase(to))
			{
				count++;
				System.out.println(s.trainID+" "+s.trainType+" "+s.source+" "+s.destination+" "+s.seats+" "+s.totalTime+" "+s.fare);
			}
		}
		/*this condition check if the trains are avilabel or not for required staions or not*/
		if(count==0)
		{
			System.out.println("No train found");
			return "";
		}
		return "true";
	 }
	/*sorts the list according to the travel time.The least one comes first*/
	public List<TrainInformation> sorting(List<TrainInformation> info)
	{
		TrainInformation temp;
		/*sorting logic using bubble sort*/
		for(int index=0;index<info.size();index++)
	   	{
	      for(int i=0;i<info.size();i++)
	      { 
	       int totalTime1=Integer.parseInt(info.get(index).totalTime);
	       int totalTime2=Integer.parseInt(info.get(i).totalTime);
	       if(totalTime1<totalTime2)
	       {
	        temp=info.get(index);
	        info.set(index,info.get(i));
	        info.set(i,temp);
	       }
	     }
	   }
		return info;
	}
	    
   /*This functions does all the reservation and payment related work*/
   public int reservation(int trainID,double weight)
    {
	   count=0;
		for(TrainInformation s:selectedList)
		{
			/*condition to check if the trainID matches with user entered trainID*/
			if(Integer.parseInt(s.trainID)==(trainID) && Integer.parseInt(s.seats)>weight)
			{
				double total=Integer.parseInt(s.seats);
				total=total-weight;
				s.seats=String.valueOf(total);
				count++;
				return (Integer.parseInt(s.fare));
			}
		}
		if(count==0)
		{
			System.out.println("Enter a valid trainId");
			return 0;
		}
		return 0;
    }
   /*This updates the train chart after the bpooking in seats*/
   public void update(List<TrainInformation> info)
	{
		for(TrainInformation s:info)
		{
			for(TrainInformation s1:TrainInformation.info)
			{
				if((s.trainID).equals(s1.trainID))
					{
					s1.seats=s.seats;
			        }
			}
			
		} 
	}
   /*This function displays all the trains*/
   public void displayAll(List<TrainInformation> selectedList)
	{
		for(TrainInformation s:selectedList)
		{

			System.out.println(s.trainID+" "+s.trainType+" "+s.source+" "+s.destination+" "+s.seats+" "+s.totalTime+" "+s.fare);

		}

	}
   /*This function prints all the booking details of passenger*/
   public void bookingDetails()
	{
		System.out.println("\nyour booking is successfull\nbooking deatils are : ");
		System.out.println("\n\tname : " + name + "\n\ttrain Id : " + trainID + "\n\tseats booked : " +seatsBooked + "\n\tamount : " + amount);

	}
   /*This function displays the information according to user choice of goods or passenger train*/
   public List<TrainInformation> display(String answer)
	{
		selectedList.clear();
		count=0;
		/*condition to check the user input value with the tain type information*/
		if((answer.equalsIgnoreCase("Goods")==false) && (answer.equalsIgnoreCase("Passenger")==false) )
		{
			System.out.println("Enter a valid input");
			return selectedList;
		}
		for(TrainInformation s:TrainInformation.info)
		{   
			if((s.trainType).equalsIgnoreCase(answer))
			{
				count++;
				selectedList.add(s);
				
			}
		}
		if(count==0)
		{
			System.out.println("No train found");
			return selectedList;
		}
		if(count>0)
		{
			return selectedList;
		}
		return selectedList;
	}
}


