
public class Person extends Entity {

	private String schoolName;
	private String collegeName;
	
	/*Parameterized Constructor 
	 * @param emailId
	 * @param name
	 * @param phoneNo
	 * @param schoolName
	 * @param collegeName
	 */
	public Person(String emailId, String name, String phoneNo, String schoolName, String collegeName)
	{
		super(emailId, name, phoneNo); //calling of super constructor
		this.schoolName = schoolName;
		this.collegeName = collegeName;
	}
	
	/* This method set school name
	 * @param schoolName
	 */
	public void setSchoolName(String schoolName)
	{
		this.schoolName = schoolName;
	}
	
	/*This method set College name of a person
	 * @param collegeName
	 */
	public void setCollegeName(String collegeName)
	{
		this.collegeName = collegeName;
	}
	
	//This method return college name
	public String getCollegeName()
	{
		return this.collegeName;
	}
	
	//This method return school name
	public String getSchoolName()
	{
		return this.schoolName;
	}
	
	//This method returns all the record of persons
	public void getRecords() {
		super.getRecords();
		System.out.print(this.getSchoolName()+"\t\t");
		System.out.println(this.getCollegeName());
	}
}