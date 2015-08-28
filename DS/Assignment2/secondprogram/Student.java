package secondprogram;

/**
 * Class that stores information about a particular student
 * 
 * @author Riddhi
 * 
 */

public class Student {

	private String name; // name of the student
	private int rank; // rank of the student
	private String collegeName; // college alloted to him/her

	// getter setter for private fields
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

}
