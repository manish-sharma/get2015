/*This class extends the Entity class and implements its own getter and setter for the other two attributes
 * @author Shishir Pareek
 * Date 24th August 2015
 */
public class Person extends Entity{

    /*variable to store user phone number*/
	public long phoneNo;
	/*variable to stroe user hobbies*/
	public String hobbies;
	/*constructor for Person class*/
	public Person(String emailID,String name,long phoneNo)
	{
		super(emailID, name);//call to constructor of Entity class
		this.phoneNo=phoneNo;
		this.hobbies=hobbies;
	}
    /*getter for phoneNumber*/
	public long getPhoneNo() {
		return phoneNo;
	}
    /*setter method for Phone Number*/
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
    /*getter method for hobbies*/
	public String getHobbies() {
		return hobbies;
	}
     /*setter method for hobbies*/
	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
     /*setter method for placement*/
	  public void setPlacementRecord(String placementRecord) {
	         }
     /*getter method for placement*/
	    public String getPlacementRecord() {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	    }
}
