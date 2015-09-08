package SocialNetwork;

import java.util.List;

public class Connection extends Edge{
	
	public Connection() {
		super();
	}
	
	public boolean addFriend(SocialNetwork socialNetwork,Entity source,Entity destination )
	{
		return super.addEdge(socialNetwork, source, destination);
	}
	
	public boolean removeFriend(SocialNetwork socialNetwork,Entity source ,Entity destination)
	{
		return  super.deleteEdge(socialNetwork, source, destination);
	}
	
	public  int searchEntity(SocialNetwork socialNetwork,Entity nodeToSearch) 
	{
		return super.searchNode(socialNetwork, nodeToSearch);
	}
	
	public int searchFriend(List<Edge> connectionList,Entity noToSearch)
	{
		return super.searchAdjacentNode(connectionList, noToSearch);
	}
}
