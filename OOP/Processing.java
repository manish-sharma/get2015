import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 * this class is used to read friendslist and read details of the person
 * @author Ankur
 *
 */
public class Processing {
	
	BufferedReader br;
	
	final static String DETAILS_FILE = "E:\\PersonDetails.txt";		//location of person details file
	final static String FRIEND_FILE = "E:\\FriendsList.txt";		//location of friends list file
	
	public static List<Person> personSet = new ArrayList<Person>();	//list to store set of persons
	
	public static HashMap<String, List<String>> friendMap
						= new HashMap<String, List<String>>();		//hashMap to manage friendship connections of persons
	
	
	/**method to read friend list from the specified file
	 * 
	 */
	public void readFriends() {
		try {
			br = new BufferedReader(new FileReader(FRIEND_FILE));
			try {
				String line;
				while ((line = br.readLine()) != null) {
					List<String> tempEmailSet = new ArrayList<String>();
					String[] email = line.split(",");
					for (int index = 1; index < email.length; index++) {
						tempEmailSet.add(email[index]);
					}
					friendMap.put(email[0], tempEmailSet);
				}
			}
			
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	/**method to read person details from the specified file
	 * 
	 * @return
	 */
	public List<Person> readPersons() {
		try {
			br = new BufferedReader(new FileReader(DETAILS_FILE));
			try {
				String line;
				while ((line = br.readLine()) != null) {
					String[] personDetails = line.split(",");
					if (personDetails.length == 5) {
						Person tempPerson = new Person();
						tempPerson.setName(personDetails[0]);
						BigInteger ob1 = new BigInteger(personDetails[1]);
						tempPerson.setPhone(ob1);
						tempPerson.setEmail(personDetails[2]);
						tempPerson.setSchool(personDetails[3]);
						tempPerson.setCollege(personDetails[4]);
						personSet.add(tempPerson);
					}
				}
			}
			
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		return personSet;
	}
}
