package TrainReservationSystemConsoleApplication;

public class Train {

	public int trainNumber;
	public String trainName;
	public String travelTime;
	public int rate;
	public String source;
	public String destination;

    public Train(){ }
    
   public Train( int trainNumber,String trainName,String source,String destination, String travelTime,int rate)
   {
	   this.trainNumber=trainNumber;
	   this.trainName=trainName;
	   this.travelTime=travelTime;
	   this.rate=rate;
	   this.source=source;
	   this.destination=destination;
	      
   }

}
