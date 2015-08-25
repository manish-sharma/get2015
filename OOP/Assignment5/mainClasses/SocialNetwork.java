package mainClasses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SocialNetwork extends Graph {

	HashMap entityFriendship = new HashMap();
	
	// adds friend
	HashMap addFriend ( Person personObj, String friend, List<Entity> nodeList, HashMap entityFriendship )
	{
		boolean boolF = false, boolP = false;
		for(Entity entity : new ArrayList<Entity> (nodeList))
		{
			if (entity.name.equals(friend))
			{
				// person : friend
				// Get a set of entries
				Set set = entityFriendship.entrySet();
				// Get an iterator
				Iterator iterator = set.iterator();
				//display elements
				while ( iterator.hasNext() )
				{
					Map.Entry me = (Map.Entry)iterator.next();
					if ( me.getKey().equals(personObj.getName()))
					{
						if(me.getValue().toString().contains(friend))
						{
							System.out.println ("\nAlready friends");
							return entityFriendship;
						}
						me.setValue(me.getValue()+" "+friend);
						boolP = true;
						//return entityFriendship;
					}
				}
				if ( boolP == false )
					entityFriendship.put(personObj.name, " "+friend );
				
				// friend : person
				// Get a set of entries
				Set set1 = entityFriendship.entrySet();
				// Get an iterator
				Iterator iterator1 = set1.iterator();
				//display elements
				while ( iterator1.hasNext() )
				{
					Map.Entry me1 = (Map.Entry)iterator1.next();
					if ( me1.getKey().equals(friend))
					{
						me1.setValue(me1.getValue()+" "+personObj.name);
						boolF = true;
					}
				}
				if ( boolF == false )
					entityFriendship.put( friend, " "+personObj.name );
				
				return entityFriendship;
			}
		}
		System.out.println("\nSorry, this person does not have an account on facebook");
		return entityFriendship;
	}
	
	
	// removes friend
	HashMap removeFriend ( Person personObj, String friend, List<Entity> nodeList, HashMap entityFriendship )
	{
		for(Entity entity : new ArrayList<Entity> (nodeList))
		{
			if (entity.name.equals(friend))
			{
				// Get a set of entries
				Set set = entityFriendship.entrySet();
				// Get an iterator
				Iterator iterator = set.iterator();
				//display elements
				while ( iterator.hasNext() )
				{
					Map.Entry me = (Map.Entry)iterator.next();
					if ( me.getKey().equals(personObj.getName()))
					{
						if(me.getValue().toString().contains(friend))
						{
							me.setValue(me.getValue().toString().replaceAll(" "+friend,""));
							
							// friend : person
							// Get a set of entries
							Set set1 = entityFriendship.entrySet();
							// Get an iterator
							Iterator iterator1 = set1.iterator();
							//display elements
							while ( iterator1.hasNext() )
							{
								Map.Entry me1 = (Map.Entry)iterator1.next();
								if ( me1.getKey().equals(friend))
								{
									me1.setValue(me1.getValue().toString().replaceAll(" "+personObj.name,""));
								}
							}
							
							return entityFriendship;
						}
						else
						{
							System.out.println("\nSorry, this person is not in your friendlist");
							return entityFriendship;
						}
					}
				}
				return entityFriendship;
			}
		}
		System.out.println("\nSorry, this person does not have an account on facebook");
		return entityFriendship;
	}
	
	
	// search user
	String searchEntity(String searchUser, List<Entity> nodeList )
	{
		for(Entity entity :nodeList)
		{
			if (entity.name.equals(searchUser))
			{
				return "Name : "+entity.name+"\tEmail : "+entity.email+"\tPhone number : "+entity.phoneNumber;
				
			}
		}
		return "Sorry, this person does not have an account on facebook";
	}
	
	
	// Log in
	Person entityLogIn ( String email, List<Entity>  nodeList, Person personObj )
	{
		for(Entity entity : nodeList)
		{
			if (entity.email.equals(email))
			{
				personObj = (Person)entity ;
				return personObj ;
			}
		}
		return null;
	}
	
	
	// display whole social network
	void displaySocialNetwork ( HashMap entityFriendship )
	{
		// Get a set of entries
		Set set = entityFriendship.entrySet();
		// Get an iterator
		Iterator iterator = set.iterator();
		//display elements
		while ( iterator.hasNext() )
		{
			Map.Entry me = (Map.Entry)iterator.next();
			System.out.println( me.getKey() +" : " + me.getValue() );
		}
	}
	
}
