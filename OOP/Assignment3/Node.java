/** node class to implement node functionality such as add node, remove node, etc.
 * 
 * @author Gaurav
 * Date : 22-Aug-2015
 */

public class Node {
	
	//method to add a new node to the network
	void addNode(Person personObject) {					//personObject holds the details of the person to be added to the network
			Processing.personSet.add(personObject);		//adding person to set of persons
			System.out.println("the person was successfully added to the network.");
	}
	
	//method to remove a node from the network
	void removeNode(Person personObject) {				//personObject holds the details of the person to be removed from the network
		Processing.personSet.remove(personObject);		//removing person from the network
		for (String s : Processing.friendMap.keySet()) {
			Processing.friendMap.get(s).remove(personObject.getEmail());		//removing connections of the person
		}
		Processing.friendMap.remove(personObject.getEmail());					//removing person from friendMap
		
		System.out.println("the person was successfully removed from the network.");
	}
	
	//method to find a node in the network
	int searchByName(String name) {						//name holds the name of the person to be searched in the network
		for (Person p : MainSocialNetwork.pSet) {
			if (p.getName().equalsIgnoreCase(name)) {
				return MainSocialNetwork.pSet.indexOf(p);		//return the index in list if person is found
			}
		}
		return -1;
	}
	
}
