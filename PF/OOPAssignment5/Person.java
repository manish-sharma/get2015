/**
 * @author Sumitra
 *this will take all details about person
 */
public class Person extends Entity {
	
	private String school;
	private String college;
	private String[] interests;
	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}
	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}
	/**
	 * @return the college
	 */
	public String getCollege() {
		return college;
	}
	/**
	 * @param college the college to set
	 */
	public void setCollege(String college) {
		this.college = college;
	}
	/**
	 * @return the interests
	 */
	public String[] getInterests() {
		return interests;
	}
	/**
	 * @param interests the interests to set
	 */
	public void setInterests(String[] interests) {
		this.interests = interests;
	}
	

	
}
