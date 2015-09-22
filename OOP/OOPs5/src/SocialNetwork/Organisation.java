package SocialNetwork;

public class Organisation extends Entity{

	private int numberOfCoursesOffered;
	private int numberOfPlacements;
	
	/** Parameterized Constructor
	 * 
	 * @param emailId
	 * @param name
	 * @param phoneNo
	 * @param numberOfCoursesOffered
	 * @param numberOfPlacements
	 */
	public Organisation(){}
	/** method to get number of courses offered by an organization
	 * @return number of courses offered
	 */
	public int getNumberOfCoursesOffered() {
		return numberOfCoursesOffered;
	}

	/** method to set number of courses offered by an organization
	 * @param numberOfCoursesOffered
	 */
	public void setNumberOfCoursesOffered(int numberOfCoursesOffered) {
		this.numberOfCoursesOffered = numberOfCoursesOffered;
	}

	/** Method to get Number of placements of an organization
	 * 
	 * @return number of placements
	 */
	public int getNumberOfPlacements() {
		return numberOfPlacements;
	}

	/** Method to set number of placements of an organization
	 * 
	 * @param numberOfPlacements
	 */
	public void setNumberOfPlacements(int numberOfPlacements) {
		this.numberOfPlacements = numberOfPlacements;
	}

	/** Method to get records of an organisation */
	@Override
	public void getRecords() {
		super.getRecords();
		System.out.print(this.getNumberOfCoursesOffered()+"\t\t");
		System.out.println(this.getNumberOfPlacements());
	}

}

