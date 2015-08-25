package mainClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph  implements Node {

	List<Entity> nodeList = new ArrayList<Entity>();
	HashMap entityFriendship = new HashMap();
	
	
	// adds new node
	public List<Entity> addNode ( Entity entity, List<Entity> nodeList ) // sign up
	{
		nodeList.add(entity);
		return nodeList;
	}
	
	
	// deletes nodes
	boolean deleteNode ( List<Entity> nodeList, String entityName, HashMap entityFriendship )  //Set<Node>   //delete account
	{		
		boolean flag = false;
		for(Entity entity : new ArrayList<Entity> (nodeList))
		{
			if (entity.name.equals(entityName))
			{	
				nodeList.remove(entity);
				
				// Get a set of entries
				Set set = entityFriendship.entrySet();
				// Get an iterator
				Iterator iterator = set.iterator();
				//display elements
				while ( iterator.hasNext() )
				{
					Map.Entry me = (Map.Entry)iterator.next();
					if ( me.getKey().equals(entityName))
					{
						iterator.remove();
					}
					else if(me.getValue().toString().contains(entityName))
					{
						me.setValue(me.getValue().toString().replaceAll(" "+entityName,""));
					}
				}
				flag = true;
			}
		}
		return flag;
	} 
	
	
	// prints node list
	void printnodeList( List<Entity> nodeList )
	{
		for(Entity entity : nodeList)
		{
			System.out.println(entity.name);
		}
	}
	
}
