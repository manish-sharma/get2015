package TrainReservationSystemConsoleApplication;

public class Ticket
{
	String UserName;
	int TrainNo;
	int noOfSeatOrWeight;
	String TrainType;
	int Fare;
	
	public void set( int trainNo, int noOfseat,String trainType)
	{
		
		TrainNo=trainNo;
		noOfSeatOrWeight=noOfseat;
		TrainType=trainType;
	}
	/**
	 *printTicket is function which is used to set the fare of perticuler train
	 *  
	 */
	public void setFare(int fare)
	{
		Fare=fare;
		
	}
	/**
	 *printTicket is function which is used to set the user name
	 *  
	 */
	public void setUserName(String name)
	{
		UserName=name;
	
	}
	/**
	 *printTicket is function which is used to print the ticket
	 *  
	 */
	public void printTicket()
	{
		 System.out.println("Ticket is succesfully Book.  Detail of ticket is");
		 System.out.println("Name is_->"+UserName+"\n"+"Train No. is ->"+TrainNo+"\n"+"Number Of Booking in "+TrainType+" Train is -> "+noOfSeatOrWeight+"\n"+"Total fare is    "+noOfSeatOrWeight*Fare);
	 
			
	}

}
