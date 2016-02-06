package com.ds2.queue;

import java.util.Comparator;
/*this class implements the comparator interface and overrides its compare method so that sorting can be performed in collection
 * among objects
 * @author Shishir Pareek
 * Date 26th August 2015
 */
public class StudentComparator implements Comparator<Student> {
		
		/*over ridden function to sort objects based on rank*/

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
