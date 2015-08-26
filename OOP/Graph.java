/**
 * to add and remove the connection between entities
 * @author Ankur
 *
 */
public class Graph {
	
	/**method to add friendship connection between 2 persons
	 * 
	 * @param personObject1
	 * @param personObject2
	 */
	public static void addEdge(Person personObject1, Person personObject2) {
		if (Processing.friendMap.get(personObject1.getEmail())
				.contains(personObject2.getEmail()) == false) {		//checking whether already friend or not
			Processing.friendMap.get(personObject1.getEmail())
				.add(personObject2.getEmail());						//adding personObject1 to friend list of personObject2
			Processing.friendMap.get(personObject2.getEmail())
				.add(personObject1.getEmail());						//adding personObject2 to friend list of personObject1
		}
	}
	
	/**method to remove friendship connection between 2 persons
	 * 
	 * @param personObject1
	 * @param personObject2
	 */
	public static void removeEdge(Person personObject1, Person personObject2) {
		if (Processing.friendMap.get(personObject1.getEmail())
				.contains(personObject2.getEmail()) == true) {		//checking whether connection exists or not
			Processing.friendMap.get(personObject1.getEmail())
				.remove(personObject2.getEmail());					//removing personObject1 from friend list of personObject2
			Processing.friendMap.get(personObject2.getEmail())
				.remove(personObject1.getEmail());					//removing personObject1 from friend list of personObject2
		}
	}
	
}

