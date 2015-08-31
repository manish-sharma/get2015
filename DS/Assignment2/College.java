/**
 * @author Girdhari
 * Program to implement counseling scenario 
 */
package queue;

public class College {
	
	private String collegeName;
	private int collegeRank;
	private int seatForStudents=10;
	private static int numberOfColleges;
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public  int getCapacityOfStudent() {
		return seatForStudents;
	}
	public void setCapacityOfStudent(int capacityOfStudent) {
		this.seatForStudents = capacityOfStudent;
	}
	public int getRank() {
		return collegeRank;
	}
	public void setRank(int rank) {
		this.collegeRank = rank;
	}
	public static int getNoOfColleges() {
		return numberOfColleges;
	}
	public static void setNoOfColleges(int noOfColleges) {
		College.numberOfColleges = noOfColleges;
	}

	public College(String collegeName ,int collegeRank) {
		this.collegeName=collegeName;
		this.collegeRank=collegeRank;
		numberOfColleges++;
	}
}
