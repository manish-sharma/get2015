
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Graph {

	public static Set<Entity> nodeSet = new HashSet<Entity>();
	/*
	 * This method add node to graph
	 * @param node is the reference of Node class
	 */
	public int addNode(Node node)
	{
		try
		{
			Entity entity = (Entity)node;
			Iterator<Entity> iteratorNodeSet = nodeSet.iterator(); 
			while(iteratorNodeSet.hasNext())
			{
				if(iteratorNodeSet.next().getEmailId().equals(entity.getEmailId()))
				{
					return -1;
				}
			}
			if(entity instanceof Person)
				SocialNetwork.personSet.add((Person)entity);
			else
				SocialNetwork.organisationSet.add((Organisation)entity);
			nodeSet.add(entity);
			return 1;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	/*
	 * fine node in entity set by name
	 * @param name is name of organization or person
	 */
	public Entity nodeFinderByName(String name) {
		Entity entity1=null;
		Iterator<Entity> iteratorNodeSet = nodeSet.iterator();
		
		while(iteratorNodeSet.hasNext())
		{
			Entity entityTemp = iteratorNodeSet.next();
			if(entityTemp.getName().equals(name))
			{
				entity1 = (Entity)entityTemp;
			}
		}
		return entity1;
	}
	
	/*
	 * Method to remove a node from the network 
	 * @param name is the name To Remove
	 */
	public void searchDisplay(String name)
	{
		try
		{	
			Entity entityToRemove = nodeFinderByName(name);
			boolean isNameFound = false;
			Iterator<Entity> iteratorNodeSet = nodeSet.iterator();
			while(iteratorNodeSet.hasNext())
			{	
				Entity entity = iteratorNodeSet.next();
				if(entity.getEmailId().equals(entityToRemove.getEmailId())) {
					entity.getRecords();
					isNameFound = true;
				}
			}
			if(isNameFound == false)
				System.out.println("no record found");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * remove node by name
	 * @param nameToRemove
	 */
	public void removeNode(String nameToRemove)
	{
		try
		{	
			Entity entityToRemove = nodeFinderByName(nameToRemove);
			
			Iterator<Entity> iteratorNodeSet = nodeSet.iterator();
			while(iteratorNodeSet.hasNext())
			{	
				Entity entity = iteratorNodeSet.next();
				if(entity.getEmailId().equals(entityToRemove.getEmailId())) {
					removeFriends(entityToRemove);
					nodeSet.remove(entityToRemove);
					if(entityToRemove instanceof Person)
						SocialNetwork.personSet.remove((Person)entityToRemove);
					else
						SocialNetwork.organisationSet.remove((Organisation)entityToRemove);
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	/*
	 * This Method  add an edge between two nodes
	 * @param node1
	 * @param node2
	 * if edge is added successfully or return -1 if the edge cannot be added
	 * 			(whether the node is not available in the network or edge already exists between them)
	 */
	public int addEdge(String name1, String name2)
	{
		try
		{
			Entity entity1=null;
			Entity entity2=null;
			boolean firstPersonNameExist = false;
			boolean secondPersonNameExist = false;
			boolean checkForFriend = false;
			Iterator<Entity> iteratorNodeSet = nodeSet.iterator();
			
			while(iteratorNodeSet.hasNext())
			{
				
				Entity entityTemp = iteratorNodeSet.next();
				if(entityTemp.getName().equals(name1))
				{
					entity1 = (Entity)entityTemp;
					firstPersonNameExist = true;
				}
				if(entityTemp.getName().equals(name2))
				{
					entity2 = (Entity)entityTemp;
					secondPersonNameExist = true;
				}
			}
			if(firstPersonNameExist && secondPersonNameExist)
			{
				Iterator<Entity> itr = entity1.setFriends.iterator();
				while(itr.hasNext())
				{
					if(itr.next().getEmailId().equals(entity2.getEmailId()))
					{
						checkForFriend = true;
					}
				}
				if(checkForFriend == true)
					return -1;
				else
				{
					entity1.setFriends.add(entity2);
					entity2.setFriends.add(entity1);
					return 1;
				}
			}
			else
			{
				return -1;
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return 0;
		}
	}
	
	/* Method to remove an existing edge between two nodes
	 * @param name1 is the node1
	 * @param name2 is the node2
	 */
	public void removeEdge(String name1, String name2)
	{
		try
		{
			Entity entity1 = nodeFinderByName(name1);
			Entity entity2 = nodeFinderByName(name2);
			Iterator<Entity> iteratorFriends = entity1.setFriends.iterator();
			while(iteratorFriends.hasNext())
			{
				if(iteratorFriends.next().getEmailId().equals(entity2.getEmailId()))
				{
					entity1.setFriends.remove(entity2);
				}
			}
			iteratorFriends = entity2.setFriends.iterator();
			while(iteratorFriends.hasNext())
			{
				if(iteratorFriends.next().getEmailId().equals(entity1.getEmailId()))
				{
					entity2.setFriends.remove(entity1);
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 *  Method to remove an entity from friend list of all other entities
	 * @param entity that is removed from the network
	 */
	void removeFriends(Entity entity)
	{
		try
		{
			Iterator<Entity> iteratorNodeSet = nodeSet.iterator();
			
			while(iteratorNodeSet.hasNext())
			{
				Entity entityTemp = iteratorNodeSet.next();
				Iterator<Entity> itrFriends = entityTemp.setFriends.iterator();
				while(itrFriends.hasNext())
				{
					
					if(itrFriends.next().getEmailId().equals(entity.getEmailId()))
					{
						entityTemp.setFriends.remove(entity);
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	

}