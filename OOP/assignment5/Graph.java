/**
 * This graph declares the function which for adding nodes and building edges between the user entering in social network. 
 * It is implemented by SocialNetwork class.
 * @author Riddhi
 *
 */
public interface Graph {

	public void addEntity(Entity E1);
	public void removeEntity(Entity E1);
	public void searchByName(String s);
	public boolean addFriend(Entity E1,Entity E2);
	public boolean removeFriend(Entity E1,Entity E2);
	public void mutualFriends(Entity E1,Entity E2);
}
