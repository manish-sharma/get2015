import java.util.ArrayList;

/*This class extends the Entity and implements the records interface ass well has its own attributes out of which 
 * one is Array List of type String to keep track of the followers of the page
 * @author Shishir Pareek
 * Date 24th August 2015
 */
public class Organisation extends Entity implements Record{
    long phoneNumber;//varibale to store the phone number
     ArrayList<String> friends=new ArrayList<String>();//array list object to store the organization followers
     String placementRecord;//variable to store placementRecord
     /*Constructor of class which calls super class constructor*/
     public Organisation(long phoneNumber,String email,String name){
        super(email,name);
        this.phoneNumber=phoneNumber;
    }
     /*setter for interest*/
    @Override
    public void setInterest(String interest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /*getter for interest*/
    @Override
    public String getInterest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /*setter for placement record*/
    @Override
    public void setPlacementRecord(String placementRecord) {
    this.placementRecord=placementRecord;    
    }
    /*getter for placement*/
    @Override
    public String getPlacementRecord() {
        
    return placementRecord;
            }
    
}