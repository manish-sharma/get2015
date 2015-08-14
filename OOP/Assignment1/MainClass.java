/**Title : Show and modify the details for persons and students.
 * 
 * @author Gaurav Saini
 */

/**main class used to instantiate person and student classes
 * and call their member functions
 */

public class MainClass {

	//main method
	public static void main(String[] args) {
		Person p1 = new Person(1, "Gaurav");						//p1 person type object
		Student s1 = new Student(2, "James Bond", 1);				//s1 student type object
		
		System.out.println("old details of person 1:");				//invoking toString method
		System.out.println("\t" + p1.toString());					//of person class
		
		System.out.println("\nnew details of person 1:");
		p1.setUid(4);												//changing the details using
		p1.setName("Gaurav Saini");									//setUid and setName methods
		System.out.println("\tname: " + p1.getName() + ", UID: " + p1.getUid());	//showing new details
		
		s1.setCources(new String[]{"Computer", "Electronics", "Mechanical"});		//setting courses for student s1
		
		System.out.println("\nold details of student 1:");			//invoking toString method
		System.out.println("\t" + s1.toString());					//of student class
		
		System.out.println("\nnew details of student 1:");
		s1.setUid(7);												//changing details for
		s1.setName("James Bond 007");								//student s1
		s1.setStudentId(7);
		System.out.println("\tname: " + s1.getName() + ", UID: " + s1.getUid() + ", StudentId: " + s1.getStudentId());
		
		System.out.println("\nStudent 1 courses are: ");
		String[] courses = s1.getCourses();
		for (String str : courses) {								//showing courses for student s1
			System.out.print(" " + str + " ");
		}
	}

}