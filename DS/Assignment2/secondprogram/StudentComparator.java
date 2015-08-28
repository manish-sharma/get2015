package secondprogram;

/**
 * This class is responsible for sorting the students stored in student list based on their rank
 */
import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		Student student1 = (Student) o1;
		Student student2 = (Student) o2;

		if (student1.getRank() == student2.getRank())
			return 0;
		else if (student1.getRank() > student2.getRank())
			return 1;
		else
			return -1;
	}

}