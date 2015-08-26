import java.util.ArrayList;
/**
 * have college info
 * @author Ravika
 *@since 8/26/2015
 */

public class College {
	String code;
	int seats;
	ArrayList<Student> students;
	public College(String code, int seats) {
		// TODO Auto-generated constructor stub
		this.code = code;
		this.seats = seats;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public void setStudents(Student student) {
		students.add(student);
	}
	
	public String toString() {
		return code;
	}
}
