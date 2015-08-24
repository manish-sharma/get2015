package MainClass;

public class Train
{
	String trainName;
	String trainFromTo;
	String trainCost;
	String trainDuration;
	String trainSeatsOrWeight;
	String trainType;
	
	public Train ( String trainName, String trainFromTo, String trainType, String trainCost, String trainSeatsOrWeight, String trainDuration )
	{
		this.trainName = trainName ;
		this.trainFromTo = trainFromTo ;
		this.trainType = trainType ;
		this.trainCost = trainCost ; 
		this.trainDuration = trainDuration;
		this.trainSeatsOrWeight = trainSeatsOrWeight ;
	}
}


class GoodsTrain extends Train
{
	String trainType = "Goods";
	String trainWeight;
	
	public GoodsTrain ( String trainName, String trainFromTo, String trainType, String trainCost, String trainWeight, String trainDuration )
	{
		super ( trainName, trainFromTo, trainType, trainCost, trainWeight, trainDuration ) ; 
		this.trainType = trainType ;
		this.trainWeight = trainWeight ;
	}	
}


class PassengerTrain extends Train
{
	String trainType = "Passenger";
	String trainSeats;
	
	public PassengerTrain ( String trainName, String trainFromTo, String trainType, String trainCost, String trainSeats, String trainDuration )
	{
		super ( trainName, trainFromTo, trainType, trainCost, trainSeats, trainDuration) ; 
		this.trainType = trainType ;
		this.trainSeats = trainSeats ;
	}

}