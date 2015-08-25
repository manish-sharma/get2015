import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Sumitra
 *this class conation method to add node delete node add edge delete edge
 */
public class Graph {
	
	/**adding connection between these two entity
	 * @param entityFirst :first entity 
	 * @param entitySecond :second entity
	 */
	public void addEdge(Entity entityFirst, Entity entitySecond) {
		Iterator<Entity> itr1 = Processing.nodeSet.iterator();	//Iterating list of questions
		while (itr1.hasNext()) {
			if(itr1.next().getEmail().equals(entitySecond.getEmail())){
				if(Processing.friendMap.containsKey(entityFirst.getEmail())) {
					if(!Processing.friendMap.get(entityFirst.getEmail()).contains(entitySecond.getEmail())) {
						Processing.friendMap.get(entityFirst.getEmail()).add(entitySecond.getEmail());
						System.out.println(entitySecond.getEmail()+" is now friend of you");
					}else if(Processing.friendMap.get(entityFirst.getEmail()).contains(entitySecond.getEmail())){
						System.out.println(entitySecond.getEmail()+" is already friend of you");
					}else {
						System.out.println(entitySecond.getEmail()+" does not exist");
					}
				} else{
					Iterator<Entity> itr2 = Processing.nodeSet.iterator();	//Iterating list of questions
					while (itr2.hasNext()) {
						if(itr2.next().getEmail().equals(entityFirst.getEmail())){
							Set<String> set=new HashSet<String>();
							set.add(entitySecond.getEmail());
							Processing.friendMap.put(entityFirst.getEmail(),set);
							System.out.println(entitySecond.getEmail()+" is now friend of you");
						}
					}
				}
			}
		}
	}
	
	/**removing connection between these two entity
	 * @param entityFirst :first entity 
	 * @param entitySecond :second entity
	 */
	public void removeEdge(Entity entityFirst, Entity entitySecond) {
		if(Processing.friendMap.containsKey(entityFirst.getEmail())) {
			if(Processing.friendMap.get(entityFirst.getEmail()).contains(entitySecond.getEmail())) {
				Processing.friendMap.get(entityFirst.getEmail()).remove(entitySecond.getEmail());
				System.out.println(entitySecond.getEmail()+" is removed from your Friend list");
			}
			else{
				System.out.println(entitySecond.getEmail()+" is not friend of you");
			}
			
		}else {
			System.out.println(entityFirst.getEmail()+" does not exist");
		}
	}
	
	
	/**Add element to Set
	 * @param entity: entity to be added in set
	 */
	void addNode(Entity entity) {
		Processing.nodeSet.add(entity);
		System.out.println("the person was successfully added to the network.");
	}
	
	/**remove element to Set
	 * @param entity: entity to be removed from set
	 */
	void removeNode(Entity p) {
		Processing.nodeSet.remove(p);
		Processing.friendMap.remove(p.getEmail());
		System.out.println("the person was successfully removed from the network.");
	}
	
	
	/**this method search by name 
	 * @param name : name to be searched
	 */
	void searchByName(String name) {
		int i=0;
			for (Entity entity : Processing.nodeSet) {
				if(entity instanceof Person) {//if belong to person 
					Person person=(Person)entity;
					if(person.getName().equalsIgnoreCase(name)){
					System.out.println("the person details are :");
					System.out.println("   name : " + person.getName());
					System.out.println("   phone : " + person.getPhone());
					System.out.println("   email : " + person.getEmail());
					System.out.println("   school : " + person.getSchool());
					System.out.println("   college : " + person.getCollege() + "\n");
						for(String interest:person.getInterests()){
							System.out.println("   interest in : " +interest + "\n");
						}
						break;
					}
				}else {//if belong to organization
					Organization organization=(Organization)entity;
					if(organization.getName().equalsIgnoreCase(name)){
						System.out.println("the person details are :");
						System.out.println("   name : " + organization.getName());
						System.out.println("   phone : " + organization.getPhone());
						System.out.println("   email : " + organization.getEmail());
						for(String interest:organization.getCourses()){
							System.out.println("   courses are : " +interest + "\n");
						}
						for(String interest:organization.getFaculty()){
							System.out.println("   Faculties are : " +interest + "\n");
						}
						for(String interest:organization.getPlacements()){
							System.out.println("   Placements are : " +interest + "\n");
						}
						break;
					}
				}
				i++;
			}
			if(i>=Processing.nodeSet.size()) {//if no such name exist
				System.out.println(name+" does not exist");
			}
	}
}
