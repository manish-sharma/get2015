// sub class  of Entity, used for person

package mainClasses;

public class Person extends Entity {
	
	String school;
	String interest;
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}

	public String getInterest() {
		return interest;
	}
	
	public void setInterest(String interest) {
		this.interest = interest;
	}

}
