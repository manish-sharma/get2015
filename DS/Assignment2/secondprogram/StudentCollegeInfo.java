package secondprogram;
/**
 * Class that is responsible for reading student and college information from txt file
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollegeInfo {
	List<Student> studentList;          //list that stores student class object
	List<College> collegeList;          //list that stores college class object
	Queue studentQueue = new Queue();   //Queue is used to store information of student based on rank
	BufferedReader br;

	public StudentCollegeInfo() {
		studentList = new ArrayList<Student>();       //initializing list
		collegeList = new ArrayList<College>();
	}
	
	//function to read student information
	public Queue readStudentInfo() {

		try {
			br = new BufferedReader(new FileReader(
					"G:/WorkSpace/DSA2/src/StudentDetails.txt"));      //reading file
			String line;
			while ((line = br.readLine()) != null) {       //iterates till their is some information in the file
				String tokens[] = line.split(","); 			//splits multiple information stored in file on the basis of ','

				if (tokens.length <2)                       //if information is not complete than not stored in the list
					continue;

				Student student = new Student();            //student class object is used to set values of private data members
				student.setName(tokens[0]);
				student.setRank(Integer.parseInt(tokens[1]));
				studentList.add(student);                  //object is added in student list

			}
			/*sort function of collection classes is invoked to sort Student list based on their rank*/
			Collections.sort(studentList, new StudentComparator());            
			for (Student s1 : studentList)
				studentQueue.enqueue(s1);

		}catch (Exception e) {
			System.out.println(e);
		}
		return studentQueue;                   //queue is returned
	}

	//function to read college information
	public List<College> readCollegeInfo() {


		try {
			br = new BufferedReader(new FileReader(
					"G:/WorkSpace/DSA2/src/CollegeDetails.txt"));			//reading file
			String line;
			while ((line = br.readLine()) != null) {				//iterates till their is some information in the file
				
				String tokens[] = line.split(",");					//splits multiple information stored in file on the basis of ','
				
				if (tokens.length <2) 								//if information is not complete than not stored in the list
					continue;
			
				College college = new College();					//college class object is used to set values of private data members
				college.setCollegeName(tokens[0]);
				college.setSeatsAvailable(Integer.parseInt(tokens[1]));
				collegeList.add(college);							//object is added in college list

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return collegeList;				//list is returned

	}
}

