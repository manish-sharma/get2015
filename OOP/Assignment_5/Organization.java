package socialNetwork;

import java.util.ArrayList;

public  class Organization extends Entity implements Record{
    long phoneNumber;
    ArrayList<String> friends=new ArrayList<String>();
    String placementRecord;
    public Organization(long phoneNumber,String email,String name){
       super(email,name);
       this.phoneNumber=phoneNumber;
   }

    @Override
   public void setData(String placementRecord) {
    	//Set PlacementRecord
   this.placementRecord=placementRecord;    
   }

   @Override
   public String getData() {
	 //Get PlacementRecord 
   return placementRecord;
   }
   
}
