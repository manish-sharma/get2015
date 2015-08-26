
public class Student implements Comparable {
	String id;
	int rank;
	College college;
	public Student(String id , int rank) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.rank = rank;
	}

	@Override
	public int compareTo(Object obj) {
		Student st=(Student)obj;  
		if(rank==st.rank)  
		return 0;  
		else if(rank>st.rank)  
		return 1;  
		else  
		return -1;   
	}
	
	public String toString() {
		return id;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}
	
	
}
