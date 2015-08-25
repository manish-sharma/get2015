/****************************************************************************************
Name            : Person
Revision Log    : 2015-08-24: Babalu patidar : created.
                : 
                : 
Use             : This class is used to Add person of social network
                :
****************************************************************************************/

import java.util.Map;


public class Person extends Entity implements Record{
    
    long phoneNumber;
    String interest;
    
   
    public Person(long phoneNumber,String email,String name){
        super(email,name);
        this.phoneNumber=phoneNumber;
    }
    //End of constractor

    
 
    @Override
    public void setInterest(String interest) {
        this.interest=interest;
        
    }

    @Override
    public String getInterest() {
     
        return interest;
    }

    @Override
    public void setPlacementRecord(String placementRecord) {
         }

    @Override
    public String getPlacementRecord() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void showFriends(){
    
    	if(friends.isEmpty()){
    		System.out.println("Sorry !! You Don't have any friend in your Friend list\n");
    	}
    	else{
    		System.out.println("\nYour Friend List ---");
    		int p=0;
    		for(Map.Entry<String,String>entry:friends.entrySet()){
    			
    			System.out.println(++p+" "+entry.getKey());
    			
    		}
    	}	
    }
    //End of showfriends
}
//End of class
