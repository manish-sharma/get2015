/**
 * @author Sumitra
 *this is for organization and will take all details about that.
 */
public class Organization extends Entity{
private String courses[];
private String placements[];
private String faculty[];

/**
 * @return the courses
 */
public String[] getCourses() {
	return courses;
}
/**
 * @param courses the courses to set
 */
public void setCourses(String[] courses) {
	this.courses = courses;
}
/**
 * @return the placements
 */
public String[] getPlacements() {
	return placements;
}
/**
 * @param placements the placements to set
 */
public void setPlacements(String[] placements) {
	this.placements = placements;
}
/**
 * @return the faculty
 */
public String[] getFaculty() {
	return faculty;
}
/**
 * @param faculty the faculty to set
 */
public void setFaculty(String[] faculty) {
	this.faculty = faculty;
}

}
