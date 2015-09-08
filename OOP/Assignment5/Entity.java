package SocialNetwork;
public class Entity extends Node implements Record
{

	private String name;
	private String emailId;
	private String phoneNumber;
	
	public Entity(int id,String emailId, String name, String phoneNumber)
	{
		super(id);
		this.emailId = emailId;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
	

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	

	public String getName()
	{
		return this.name;
	}
	

	public String getEmailId()
	{
		return this.emailId;
	}
	

	public String getphoneNumber()
	{
		return this.phoneNumber;
	}

	
	@Override
	public void getRecord() {
		
		System.out.println("Entity name is "+name);
		System.out.println("Entity Email Id is emailId"+emailId);
		System.out.println("Entity PhoneNumber is"+phoneNumber);
		
	}
	@Override
	public void display() {
		super.display();
		getRecord();
	}
	@Override
	public boolean equals(Object obj) {
		
		if(!super.equals(obj))
			return false;
		Entity entity=(Entity)obj;
		if(this.name.equals(entity.name)&&this.emailId.equals(entity.emailId)&&this.phoneNumber.equals(entity.phoneNumber))
			return true;
		return false;
	}
}
