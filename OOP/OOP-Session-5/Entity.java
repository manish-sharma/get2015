

public class Entity extends Node implements Record
{
	private String name;
	private String emailId;
	private String phoneNumber;
	
	/* Parameterized Constructor 
	 * @param emailId is the emailId of person or organization
	 * @param name is the name of person or organization
	 * @param phoneNo is the contact of person or organization
	 */
	public Entity(String emailId, String name, String phoneNumber)
	{
		this.emailId = emailId;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	//set name
	public void setName(String name)
	{
		this.name = name;
	}
	
	//set email-id
	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
	
	//set phone number
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	//This method return name
	public String getName()
	{
		return this.name;
	}
	
	//This method return email
	public String getEmailId()
	{
		return this.emailId;
	}
	
	//This method return phone number
	public String getphoneNumber()
	{
		return this.phoneNumber;
	}

	// Method to get records of an entity 
	 public void getRecords() 
	 {
		System.out.print( this.getName()+"\t\t" );
		System.out.print( this.getEmailId()+"\t\t" );
		System.out.print( this.getphoneNumber()+"\t\t" );
	}
}