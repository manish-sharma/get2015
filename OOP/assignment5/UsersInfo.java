import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class Used to read User details from the file
 * 
 * @author Riddhi
 *
 */

public class UsersInfo {

	public static String location = "C://Users/Riddhi/workspace/SocialNetworking/src/UserInfo.txt"; // location

	// of
	// the
	// file

	public static void readUserDetails() {
		BufferedReader br;

		try {
			// Reading the information stored in the txt file
			br = new BufferedReader(new FileReader(location));
			try {
				String line;
				while ((line = br.readLine()) != null) { // Reading up details
															// line by line
					String[] personDetails = line.split(",");

					if (personDetails[0].equals("Person")) {
						// Reading data from file and updating class variables using set method
						if (personDetails.length == 6) {
							Person tempPerson = new Person();
							tempPerson.setFirstName(personDetails[1]);
							Long ob1 = new Long(personDetails[2]);
							tempPerson.setPhoneNumber(ob1);
							tempPerson.setEmail(personDetails[3]);
							tempPerson.setHobbies(personDetails[4]);
							tempPerson.setUniqueId(Integer
									.parseInt(personDetails[5]));
							SocialNetwork.totalUsers.add(tempPerson);        //adding object in the list of entity type
						}

					} else {

						if (personDetails[0].equals("Organization")) {

							if (personDetails.length == 6) {
								// Reading data from file and updating class variables using set method
								Organization tempOrganization = new Organization();
								tempOrganization.setFirstName(personDetails[1]);
								Long ob1 = new Long(personDetails[2]);
								tempOrganization.setPhoneNumber(ob1);
								tempOrganization.setEmail(personDetails[3]);
								tempOrganization
										.setAchievements(personDetails[4]);
								tempOrganization.setUniqueId(Integer
										.parseInt(personDetails[5]));
								SocialNetwork.totalUsers                   //adding object in the list of entity type
										.add(tempOrganization);
							}
						}
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

	}
}
