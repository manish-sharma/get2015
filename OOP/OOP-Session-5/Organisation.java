
public class Organisation extends Entity{

	private int numberOfCoursesOffered;
	private int numberOfPlacements;
	
	/*Parameterized Constructor
	 * @param emailId
	 * @param name
	 * @param phoneNo
	 * @param numberOfCoursesOffered
	 * @param numberOfPlacements
	 */
	public Organisation(String emailId, String name, String phoneNo, String numberOfCoursesOffered, String numberOfPlacements)
	{
		super(emailId, name, phoneNo);
		this.numberOfCoursesOffered = Integer.parseInt(numberOfCoursesOffered);
		this.numberOfPlacements = Integer.parseInt(numberOfPlacements);
	}

	
    //this method return number of courses offered	
	public int getNumberOfCoursesOffered()
	{
		return numberOfCoursesOffered;
	}

	//This method set number of courses offered by organisation
	public void setNumberOfCoursesOffered(int numberOfCoursesOffered)
	{
		this.numberOfCoursesOffered = numberOfCoursesOffered;
	}

	//This method return number of placement
	public int getNumberOfPlacements() {
		return numberOfPlacements;
	}

	//This Method to set number of placements of an organization
	public void setNumberOfPlacements(int numberOfPlacements) 
	{
		this.numberOfPlacements = numberOfPlacements;
	}

	// This method returns all the records
	public void getRecords()
	{
		super.getRecords();
		System.out.print(this.getNumberOfCoursesOffered()+"\t\t");
		System.out.println(this.getNumberOfPlacements());
	}

}