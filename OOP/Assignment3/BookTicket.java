
public class BookTicket {
	
	String name, trainId, seatsBooked;
	double amount;
	
	public BookTicket(String name, String trainId, String seatsBooked, double amount){		//constructor to initialize booking class objects
		this.name = name;
		this.trainId = trainId;
		this.seatsBooked = seatsBooked;
		this.amount = amount;
	}
	
	//method to print ticket details
	public void bookingDetails() {
		System.out.println("\nyour booking is successfull\nbooking deatils are : ");
		System.out.println("\n\tname : " + name + "\n\ttrain Id : " + trainId + "\n\tseats booked : " +seatsBooked + "\n\tamount : " + amount);
	}

}
