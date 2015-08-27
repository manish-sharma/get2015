

public class Organisation extends Entity{

	private int numberOfCoursesOffered;
	private int numberOfPlacements;
	

	public Organisation(int id,String emailId, String name, String phoneNo, String numberOfCoursesOffered, String numberOfPlacements)
	{
		super(id,emailId, name, phoneNo);
		this.numberOfCoursesOffered = Integer.parseInt(numberOfCoursesOffered);
		this.numberOfPlacements = Integer.parseInt(numberOfPlacements);
	}

	
	public int getNumberOfCoursesOffered() {
		return numberOfCoursesOffered;
	}


	public void setNumberOfCoursesOffered(int numberOfCoursesOffered) {
		this.numberOfCoursesOffered = numberOfCoursesOffered;
	}


	public int getNumberOfPlacements() {
		return numberOfPlacements;
	}

	
	public void setNumberOfPlacements(int numberOfPlacements) {
		this.numberOfPlacements = numberOfPlacements;
	}

	
	@Override
	public void getRecord() {
		super.getRecord();
		System.out.print("No of Courses Offered"+numberOfCoursesOffered);
		System.out.println("No of Placements "+numberOfPlacements);
	}
	@Override
	public void display() {
		getRecord();
	}

	@Override
	public boolean equals(Object obj) {
		
		if(!super.equals(obj))
			return false;
		Organisation organisation=(Organisation)obj;
		if(this.numberOfCoursesOffered==organisation.numberOfCoursesOffered&&this.numberOfPlacements==organisation.numberOfPlacements)
			return true;
		return false;
	}
}
