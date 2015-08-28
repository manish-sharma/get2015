
public class College {
	
	private String collegeName;
	private int collegeRank;
	private int capacityOfStudent;
	private static int noOfColleges;
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public  int getCapacityOfStudent() {
		return capacityOfStudent;
	}
	public void setCapacityOfStudent(int capacityOfStudent) {
		this.capacityOfStudent = capacityOfStudent;
	}
	public int getRank() {
		return collegeRank;
	}
	public void setRank(int rank) {
		this.collegeRank = rank;
	}
	public static int getNoOfColleges() {
		return noOfColleges;
	}
	public static void setNoOfColleges(int noOfColleges) {
		College.noOfColleges = noOfColleges;
	}

	public College(String collegeName ,int collegeRank) {
		this.collegeName=collegeName;
		this.collegeRank=collegeRank;
		
	}
}
