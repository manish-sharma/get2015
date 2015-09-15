/*
 * This class contains the information of College
 * @author Banwari kevat
 */
public class College {
    private String name;
    private int rank;
    private int availableSeats;
    
    /*
     * parameterized constructor
     * @param name is the name of college
     * @param rank is the rank of college
     * @param availableSeats is the number of available seats
     */
    public College( String name , int rank, int availableSeats ) 
    {
    	this.name = name;
    	this.rank = rank;
    	this.availableSeats = availableSeats;
    }
    
    //get name 
    public String getName()
    {
 	   return name;
    }
    
    //get rank
    public int getRank()
    {
 	   return rank;
    }
    
    //get available seats
    public int getAvialableSeats()
    {
 	   return availableSeats;
    }
    //set seats
    public void setAvialableSeats(int seats)
    {
    	this.availableSeats = seats;
    }
}
