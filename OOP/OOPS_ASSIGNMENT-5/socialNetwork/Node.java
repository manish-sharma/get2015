package socialNetwork;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Node {
	HashMap<String, Person> personList = new HashMap<String, Person>();
	HashMap<String, Organization> organizationList = new HashMap<String, Organization>();

	public HashMap<String, Person> addNode() {
         //Add a node in hash map
		try {
			StringTokenizer stringTokenizer;
			FileInputStream fin = new FileInputStream(
					new File(
							"src\\socialNetwork\\Person.txt"));
			DataInputStream in = new DataInputStream(fin);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String personData = "";
			int i = 1;
			String email = "", name = "", phoneNumber = "", specific = "";
			while ((personData = br.readLine()) != null) {
				Person person;
				stringTokenizer = new StringTokenizer(personData, ",");
				i = 1;
				while (stringTokenizer.hasMoreTokens()) {
					if (i == 1) {
						email = stringTokenizer.nextToken();
					} else if (i == 2) {
						name = stringTokenizer.nextToken();
					} else if (i == 3) {
						phoneNumber = stringTokenizer.nextToken();
					} else {
						specific = stringTokenizer.nextToken();
					}

					i++;
				}
				long phoneNum = Long.parseLong(phoneNumber);
                
				
				person = new Person(phoneNum, email, name);
				person.setData(specific);
				personList.put(email, person);

			}

			fin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return personList;
	}

}
