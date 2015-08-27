// sub class  of Entity, used for organization

package mainClasses;

public class Organization extends Entity {

	String courses;
	String placement;
	
	public String getCourses() {
		return courses;
	}
	
	public void setCourses(String courses) {
		this.courses = courses;
	}
	
	public String getPlacement() {
		return placement;
	}
	
	public void setPlacement(String placement) {
		this.placement = placement;
	}
	
}
