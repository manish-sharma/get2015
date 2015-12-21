package socialNetwork;

import java.util.Map.Entry;

public class Person extends Entity implements Record{
    
    long phoneNumber;
    String interest;
    
   
    public Person(long phoneNumber,String email,String name){
        super(email,name);
        this.phoneNumber=phoneNumber;
    }

    
 
    @Override
    public void setData(String interest) {
    	//Set Interest
        this.interest=interest;
    }

    @Override
    public String getData() {
         //Get Interest
        return interest;
    }

    public void showFriends(){
    //Show Friend List
    if(friends.isEmpty()){
              System.out.println("Sorry !! You Don't have any friend in your Friend list\n");
          }
    else{
        System.out.println("\nYour Friend List ---");
        int p=0;
      for(Entry<String, String> entry:friends.entrySet()){
          
          System.out.println(++p+" "+entry.getKey());
          
      }
    }
    }

}
