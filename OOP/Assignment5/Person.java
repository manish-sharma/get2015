package oop5;

public class Person extends Entity {

	private String schoolName;
	private String collegeName;
	
	/** Parameterized Constructor 
	 * 
	 * @param emailId
	 * @param name
	 * @param phoneNo
	 * @param schoolName
	 * @param collegeName
	 */
	public Person(String emailId, String name, String phoneNo, String schoolName, String collegeName)
	{
		super(emailId, name, phoneNo);
		this.schoolName = schoolName;
		this.collegeName = collegeName;
	}
	
	/** Method to set School name of a person
	 * 
	 * @param schoolName
	 */
	public void setSchoolName(String schoolName)
	{
		this.schoolName = schoolName;
	}
	
	/** Method to set College name of a person
	 * 
	 * @param collegeName
	 */
	public void setCollegeName(String collegeName)
	{
		this.collegeName = collegeName;
	}
	
	/** Method to get college name of a person
	 * 
	 * @return collegeName
	 */
	public String getCollegeName()
	{
		return this.collegeName;
	}
	
	/** Method to get school name of a person
	 * 
	 * @return schoolName
	 */
	public String getSchoolName()
	{
		return this.schoolName;
	}
	
	/** Method to get records of a person */
	@Override
	public void getRecords() {
		super.getRecords();
		System.out.print(this.getSchoolName()+"\t\t");
		System.out.println(this.getCollegeName());
	}
}