import java.util.HashMap;
import java.util.Map;

/*This method forms the entity objects with three attributes with one of them being of type HashMap and it contains getter
 * and setter method
 * @author Shishir Pareek
 * Date 24th August 2015
 */
public class Entity {
	public String emailID;//variable to store emailID
	public String name;//variable to store name
	HashMap<String,String> friend=new HashMap<String,String>();//hash map object to store the person and his friends
	//constructor for entity type
	public Entity(String emailID,String name){ 
		this.emailID=emailID;
		this.name=name;
	}
    /*getter for email id*/
	public String getEmailID() {
		return emailID;
	}
    /*setter for email id*/
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
    /*getter for name*/
	public String getName() {
		return name;
	}
     /*setter for name*/
	public void setName(String name) {
		this.name = name;
	}
	/*function to show friend of user*/
	public void showFriends(){
	    /*condition to check if friend list is empty*/ 
	    if(friend.isEmpty()){
	              System.out.println("Sorry !! You Don't have any friend in your Friend list\n");
	          }
	    /*printing friend list*/
	    else{
	        System.out.println("\nYour Friend List ---");
	        int p=0;
	      for(Map.Entry<String,String>entry:friend.entrySet()){
	          
	          System.out.println(++p+" "+entry.getKey());
	          
	      }
	    }
	    }
}
