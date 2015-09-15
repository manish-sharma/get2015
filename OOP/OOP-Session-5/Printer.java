
import java.util.Iterator;
import java.util.Set;


public class Printer {
	//This method disaplay social network
	public static void displaySocialNetwork()
	{
		System.out.println();
		System.out.println("Displaying Social Network:");
		Iterator<Entity> entityIterator = Graph.nodeSet.iterator();
		while(entityIterator.hasNext())
		{
			Entity entityTemp = entityIterator.next();
			if(entityTemp.setFriends.size()!=0)
			{
				System.out.print(entityTemp.getName()+"->");
				Iterator<Entity> iteratorEntityTempFriends = entityTemp.setFriends.iterator();
				while(iteratorEntityTempFriends.hasNext())
				{
					System.out.print(iteratorEntityTempFriends.next().getName()+", ");
				}
				System.out.println();
			}
			else
			{
				System.out.println(entityTemp.getName());
			}
		}
		System.out.println();
	}
	
	//This method display record for a particular entity
	public static void displayRecords()
	{
		System.out.println();
		System.out.println("Name1 \t\t\tEmail\t\t\t\tPhone No\t\tSchool Name\tCollege Name\n");
		Iterator<Person> iteratorPersonSet = SocialNetwork.personSet.iterator();
		while(iteratorPersonSet.hasNext())
		{
			iteratorPersonSet.next().getRecords();
		}
		System.out.println();
		System.out.println("Name3 \t\tEmail\t\t\tPhone No\t\tCourses\t\tPlacements\n");
		Iterator<Organisation> iteratorOrganisationSet = SocialNetwork.organisationSet.iterator();
		while(iteratorOrganisationSet.hasNext())
		{
			iteratorOrganisationSet.next().getRecords();
		}
		System.out.println();
	}
}