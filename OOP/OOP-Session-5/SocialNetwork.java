
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;


public class SocialNetwork extends Graph {

	public static Set<Person> personSet = new HashSet<Person>();
	public static Set<Organisation> organisationSet = new HashSet<Organisation>();
	final static String PERSONFILE = "C:/Users/Banwari/workspace/OOP-Session-5/src/Person.txt";
	final static String ORGANISATIONFILE = "C:/Users/Banwari/workspace/OOP-Session-5/src/Organisation.txt";
			
	//this method read information of organization from file
	public void readPersonInfo()
	{
		BufferedReader bufferedReaderObj;
		try
		{
			bufferedReaderObj = new BufferedReader(new FileReader(PERSONFILE));
			String line;
			while((line = bufferedReaderObj.readLine()) != null)
			{
				///Creation of String array from the details of person 
				String[] personDetail = line.split(",");
				if(personDetail.length == 5)
				{
					// Creating Person object from person details and stores that object in personSet. 
					personSet.add(new Person(personDetail[0].trim(), personDetail[1].trim(), personDetail[2].trim(), personDetail[3].trim(), personDetail[4].trim()));
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	//this method read information of organization from file
	public void readOrganisationInfo()
	{
		BufferedReader br;
		try
		{
			br = new BufferedReader(new FileReader(ORGANISATIONFILE));
			String line;
			while((line = br.readLine()) != null)
			{
				//Creation of String array from the details of Organization 
				String[] organisationDetails = line.split(",");
				if(organisationDetails.length == 5)
				{
					// Creating Person object from organization details and stores that object in personSet
					organisationSet.add(new Organisation(organisationDetails[0].trim(), organisationDetails[1].trim(), organisationDetails[2].trim(), organisationDetails[3].trim(), organisationDetails[4].trim()));
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}