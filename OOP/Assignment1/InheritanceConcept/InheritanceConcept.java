/****************************************************************************************
Name            : InheritanceConcept
Revision Log    : 2015-08-14: Babalu patidar : created.
                : 
                : 
Use             : This class is used to implement inheritance concept. 
                :
****************************************************************************************/
import java.util.Arrays;
import java.util.Scanner;
 

public class InheritanceConcept {

	//Start of main
	//@param int id has studentid
	//@param int Uid has univesol id
	//@param int name specify name of student
	public static void main(String[] arg) {
		int id;
		String name;
		int uid;
		int numofcourses;
		String course[];
		System.out.println("Please Enter Following Details One By One \nUid:\nName\nStudentid\n");
		Scanner scan=new Scanner(System.in);
		try{
			uid=scan.nextInt();
			name=scan.next();
			id=scan.nextInt();
			System.out.print("Enter No Of courses\n");
			numofcourses=scan.nextInt();
			course=new String[numofcourses];
			System.out.println("Enter All Courses :");
			for(int i=0;i<numofcourses;i++){
				course[i]=scan.next();
			}
		
			Student object=new Student(uid, name, id);
			object.setCourses(course);
			
			System.out.println("Student Details:");
			System.out.println(object.toString());
			System.out.print("Courses: ");
			System.out.print(Arrays.toString(object.getCourses()));
		
		}
		//End of try
		catch(Exception e){
			e.printStackTrace();
		}
		//End of catch
		scan.close();
		
	}
	//End of main
}
//End of class