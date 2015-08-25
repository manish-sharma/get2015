/****************************************************************************************
Name            : Organisation
Revision Log    : 2015-08-24: Babalu patidar : created.
                : 
                : 
Use             : This class is used to Add orgnisation of social network
                :
****************************************************************************************/


import java.util.Map;


public class Organisation extends Entity implements Record{
    long phoneNumber;
    
     String placementRecord;
     public Organisation(long phoneNumber,String email,String name){
        super(email,name);
        this.phoneNumber=phoneNumber;
    }
    //End of constructor

    @Override
    public void setInterest(String interest) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInterest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPlacementRecord(String placementRecord) {
    this.placementRecord=placementRecord;    
    }

    @Override
    public String getPlacementRecord() {
        
    return placementRecord;
            }
    public void showFriends(){
        
        if(friends.isEmpty()){
                  System.out.println("Sorry !! You Don't have any member in your Member list\n");
              }
        else{
            System.out.println("\nYour Organisation Member List ---");
            int p=0;
          for(Map.Entry<String,String>entry:friends.entrySet()){
              
              System.out.println(++p+" "+entry.getKey());
              
     	    	}
        }
    }
    //End of showfriends method
    
}
//End of class 