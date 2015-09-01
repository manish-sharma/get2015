package QueueImplemetation;
import java.util.Comparator;

public class StudentRankComparater implements Comparator<Student> {
	
	

		@Override
		public int compare(Student student1, Student student2) {
			Student stdentFirst = (Student) student1;
			Student studentSecond = (Student)student2;

			if(stdentFirst.getRank()==studentSecond.getRank())
				return 0;
			else if(stdentFirst.getRank()>studentSecond.getRank())
				return 1;
			else
				return -1;
		}
		
}

	

