
import java.io.BufferedReader;
import java.io.FileReader;


public class SocialNetwork extends Graph {

	public SocialNetwork() {
		super();
		
	}
	public boolean  addEntitySocialNetwork(Entity entity)
	{
		return super.addNode(entity);
	}
	public void deleteEntitySocialNetwork(Entity entity)
	{
		super.deleteNode(entity);
	}
	public void displaySocialNetwork()
	{
		super.printGraph();
	}

	/** Method to read info of a Person from file */
	public void readPersonInformation()
	{
		Person person=null;
		BufferedReader bufferedReaderObj;
		try
		{
			bufferedReaderObj = new BufferedReader(new FileReader(Constants.PERSON_FILE));
			String line;
			while((line = bufferedReaderObj.readLine()) != null)
			{
				/* Creation of String array from the details of person */
				String[] personDetail = line.split(",");
				if(personDetail.length == 6)
				{
					/* Creating Person object from person details and stores that object in personSet. */
					 person=new Person(Integer.parseInt(personDetail[0].trim()), personDetail[1].trim(), personDetail[2].trim(), personDetail[3].trim(), personDetail[4].trim(),personDetail[5].trim());
					addNode(person);
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
	public void readOrganisationInformation()
	{
		BufferedReader br;
		Organisation organisation=null;
		try
		{
			br = new BufferedReader(new FileReader(Constants.ORGANISATION_FILE));
			String line;
			while((line = br.readLine()) != null)
			{
				/* Creation of String array from the details of Organization */
				String[] organisationDetails = line.split(",");
				if(organisationDetails.length == 6)
				{
					/* Creating Person object from organization details and stores that object in personSet. */
					organisation=new Organisation(Integer.parseInt(organisationDetails[0].trim()), organisationDetails[1].trim(), organisationDetails[2].trim(), organisationDetails[3].trim(), organisationDetails[4].trim(),organisationDetails[5].trim());
					addNode(organisation);
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	public void printGraph()
	{
		super.printGraph();
	}
	public Person getNode(int index)
	{
		Entity entity=super.getNode(index);
		return (Person)entity;
	}
}
