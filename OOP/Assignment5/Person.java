package SocialNetwork;

public class Person extends Entity {

	private String schoolName;
	private String collegeName;
	
	public Person(int id ,String emailId, String name, String phoneNo, String schoolName, String collegeName)
	{
		super(id,emailId, name, phoneNo);
		this.schoolName = schoolName;
		this.collegeName = collegeName;
	}
	

	public void setSchoolName(String schoolName)
	{
		this.schoolName = schoolName;
	}
	
	
	public void setCollegeName(String collegeName)
	{
		this.collegeName = collegeName;
	}
	
	
	public String getCollegeName()
	{
		return this.collegeName;
	}
	
	
	public String getSchoolName()
	{
		return this.schoolName;
	}
	

	@Override
	public void getRecord() {
		super.getRecord();
		System.out.print("Person School Name is "+schoolName);
		System.out.println("Person College Name is "+collegeName);
	}
	
	@Override
	public void display() {
		getRecord();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(!super.equals(obj))
			return false;
		Person person=(Person)obj;
		if(this.schoolName.equals(person.schoolName)&&this.collegeName.equals(person.collegeName))
			return true;
		return false;
	}
}
