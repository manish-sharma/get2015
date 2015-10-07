/*This is an interface which declares the methods to setup the connections between the nodes or friends
 * @author Shishir Pareek
 * Date 24th August 2015
 */
public interface Connection {

	    public void addConnection(Entity e1,Entity e2);
	    public void removeConnection(Entity e1,Entity e2);
	    public String  findFriend(String email);
}
