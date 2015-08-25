import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/*This class implements the conection interface and defines the function for graph operations 
 * @author Shishir Pareek
 * Date 24th August 2015  
 */

public class Graph implements Connection{
    
	/*function to join the edge between two nodes which signifies them being friend*/
	@Override
	public void addConnection(Entity e1, Entity e2) {
		// TODO Auto-generated method stub
		e1.friend.put(e2.emailID,e1.emailID);
		e2.friend.put(e1.emailID,e2.emailID);
		System.out.print("Friend added successfully");
	}
     /*function to remove the edge between two nodes which signifies deletion of friend*/
	@Override
	public void removeConnection(Entity e1, Entity e2) {
		// TODO Auto-generated method stub
		e1.friend.remove(e2.emailID);
		e2.friend.remove(e1.emailID);
	}
    /*function to find the search from email*/
	@Override
	public String findFriend(String email) {
	        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
	
}
