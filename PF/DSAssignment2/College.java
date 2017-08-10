package CollegeAllotment;
/**
 * @author Sumitra
 *this class is for college to set all data in them.
 */
public class College {
String name;
int i;
int seats;
String studentName;
public College(String name, int i, int seats) {
	
	this.name = name;
	this.i = i;
	this.seats = seats;
	this.studentName="";
}
/**
 * @return the studentName
 */
public String getStudentName() {
	return studentName;
}
/**
 * @param studentName the studentName to set
 */
public void setStudentName(String Name) {
	studentName += Name+" ";
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the i
 */
public int getI() {
	return i;
}
/**
 * @param i the i to set
 */
public void setI(int i) {
	this.i = i;
}
/**
 * @return the seats
 */
public int getSeats() {
	return seats;
}
/**
 * @param seats the seats to set
 */
public void setSeats(int seats) {
	this.seats = seats;
}

}
