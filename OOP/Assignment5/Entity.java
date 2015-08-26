package oop5;

public class Entity extends Node implements Record
{
	/* Data Members */
	private String name;
	private String emailId;
	private String phoneNumber;
	
	/** Parameterized Constructor 
	 * @param emailId
	 * @param name
	 * @param phoneNo
	 */
	public Entity(String emailId, String name, String phoneNumber)
	{
		this.emailId = emailId;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	/** Method to set Name of a Entity 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/** Method to set Email Id of Entity 
	 * @param emailId
	 */
	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
	
	/** Method to set Phone Number of entity
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	/** Method to get Name of entity
	 * @return name
	 */ 
	public String getName()
	{
		return this.name;
	}
	
	/** Method to get Email Id of Entity
	 * @return Email Id
	 */
	public String getEmailId()
	{
		return this.emailId;
	}
	
	/** Method to get phone number of entity
	 * @return phone number
	 */
	public String getphoneNumber()
	{
		return this.phoneNumber;
	}

	/** Method to get records of an entity */
	@Override
	public void getRecords() {
		
		System.out.print(this.getName()+"\t\t");
		System.out.print(this.getEmailId()+"\t\t");
		System.out.print(this.getphoneNumber()+"\t\t");
	}
}