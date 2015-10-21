package SocialNetwork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;


public class SocialNetwork extends Graph {

	public static Set<Person> personSet = new HashSet<Person>();
	public static Set<Organisation> organisationSet = new HashSet<Organisation>();
	final static String PERSONFILE = "C:/Users/Nikhil/Desktop/Person.txt";
	final static String ORGANISATIONFILE = "C:/Users/Nikhil/desktop/Organisation.txt";
			
	/** Method to read info of a Person from file */
	public void readPersonInfo()
	{
		BufferedReader bufferedReaderObj;
		try
		{
			bufferedReaderObj = new BufferedReader(new FileReader(PERSONFILE));
			String line;
			while((line = bufferedReaderObj.readLine()) != null)
			{          Person person= new Person(); 
			
				/* Creation of String array from the details of person */
				String[] personDetail = line.split(",");
				if(personDetail.length == 5)
				{
					person.setEmailId(personDetail[0].trim());
				    person.setName(personDetail[1].trim());
				    person.setPhoneNumber(personDetail[2].trim());
				    person.setSchoolName(personDetail[3].trim());
				    person.setCollegeName( personDetail[4].trim());
					/* Creating Person object from person details and stores that object in personSet. */
					personSet.add(person);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	
	/** Method to read info of an Organization from file */
	public void readOrganisationInfo()
	{
		BufferedReader br;
		try
		{
			br = new BufferedReader(new FileReader(ORGANISATIONFILE));
			String line;
			while((line = br.readLine()) != null)
			{  Organisation organisation=new Organisation();
				/* Creation of String array from the details of Organization */
				String[] organisationDetails = line.split(",");
				if(organisationDetails.length == 5)
				{
				                 organisation.setEmailId(organisationDetails[0].trim());
                      organisation.setName(organisationDetails[1].trim());
                      organisation.setPhoneNumber(organisationDetails[2].trim());
                      organisation.setNumberOfCoursesOffered( Integer.parseInt(organisationDetails[3].trim()));
                      organisation.setNumberOfPlacements(Integer.parseInt(organisationDetails[4].trim()));
					  organisationSet.add(organisation);
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