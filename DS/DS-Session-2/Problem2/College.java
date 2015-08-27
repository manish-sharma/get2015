
public class College {
    private String name;
    private int rank;
    private int availableSeats;
    
    public College( String name , int rank, int availableSeats ) 
    {
    	this.name = name;
    	this.rank = rank;
    	this.availableSeats = availableSeats;
    }
    
    public String getName()
    {
 	   return name;
    }
    
    public int getRank()
    {
 	   return rank;
    }
    
    public int getAvialableSeats()
    {
 	   return availableSeats;
    }
    public void setAvialableSeats(int seats)
    {
    	this.availableSeats = seats;
    }
}
