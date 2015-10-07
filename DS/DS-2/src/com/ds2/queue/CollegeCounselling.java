package com.ds2.queue;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*Class contains all the method of reading student and college info from file 
 * allotting seats to students based on ranks and showing students with alloted list
 * @author Shishir Pareek
 * Date 26th August 2015 
 */
public class CollegeCounselling {

	String line="";
	Queue studentQueue=new Queue();//queue to hold student object 
	Queue collegeQueue=new Queue();//queue to hold college object
	List<College> collegeList = new ArrayList<College>();
	/*function to read the student data from the file and inserting into queue*/
	public void readStudentDetails()
	{
		List<Student> studentList=new ArrayList<Student>();
		try
		{
			/*reading details from file and inserting into ArrayList*/
			BufferedReader br=new BufferedReader(new FileReader(""));
			while((line=br.readLine())!=null)
			{
				String [] token=line.split(",");
				if(token.length>0)//to check if some value is read or not from file
				{
				Student student=new Student();
				student.setName(token[0]);
				student.setRank(Integer.parseInt(token[1]));
				//student.setCollegeName(token[2]);
				studentList.add(student);//inserting object into list
				}
				br.close();//closing file
			} 
		}
		catch (FileNotFoundException e) {
				System.out.println(e);

			} catch (IOException e) {
				System.out.println(e);
			}
			Collections.sort(studentList,new StudentComparator());
			for(Student student1:studentList)
				studentQueue.enqueue(student1);//sorting the students according to list and inserting into queue
		}
	
	/*function to read college info and inserting into queue*/
	public void readCollegeInfo()
	{
		try
		{   /*reading from file and inserting into the queue of object type*/
			BufferedReader br=new BufferedReader(new FileReader(""));
			while((line=br.readLine())!=null)
			{
				String [] token=line.split(",");
				if(token.length>0)//condition to check if some data is read or not 
				{
					College colleges=new College();
					colleges.setCollegeName(token[0]);
					colleges.setSeatsAvilabel(Integer.parseInt(token[1]));
					collegeQueue.enqueue(colleges);//inserting into queue of type college object
				}
				br.close();//closing the file 
			} 
		}
			catch (FileNotFoundException e) {
				System.out.println(e);
              	} 
		     catch (IOException e) {
				System.out.println(e);
			}
	}
	/*function which allots the seats based on ranks*/
	public void seatAllotment()
	{
		int collegeCounter = calculteTotalSeat();
		int sizeCollege = collegeQueue.size();
		int sizeStudent = studentQueue.size();

		College colleges = new College();
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		while(sizeStudent!=0)//if the number of seats is greater than number of students
		{
			if(collegeCounter==0)//if students are greater than college seats and seats get exhausted
			{
			break;
			}
		 student = (Student) studentQueue.dequeue();//getting students from queue 
		 System.out.println("Student Name ->" + student.getName() + "\n"
					+ "Select any college");
		 showListOfCollege();
			String name = ValidationForCollegeName();//checking if the college which student want is participating or not 
			for(int index=0;index<sizeCollege;index++)
			{
				colleges=(College)collegeQueue.dequeue();//getting college details from queue 
				if(colleges.getCollegeName().equalsIgnoreCase(name))//Checking if the student preference college is same as retrieved from queue and seats is avilable or not 
				{
				student.setCollegeName(name);//college gets alloted to student
				colleges.setSeatsAvilabel(colleges.getSeatsAvilabel()-1);//decreasing the number of seats 
				}
				collegeQueue.enqueue(colleges);//inserting update details of college in queue 
			}
		  System.out.println("Allotment is done successfully");
		  studentQueue.enqueue(student);//putting student details inside queue
		  sizeStudent--;
		  collegeCounter--;
		}
	}
	/*function to show list of colleges*/
	void showListOfCollege() {
		int size = collegeQueue.size();
		College colleges = new College();

		for (int count = 0; count < size; count++) {
			colleges = (College) collegeQueue.dequeue();
			if (colleges.getSeatsAvilabel() > 0) {//condition to show only those colleges which are having seats
				System.out.println(colleges.getCollegeName());

				collegeQueue.enqueue(colleges);
			}
		}
    }
	/*function to show details of students*/
	void showListOfStudent() {
		int size = studentQueue.size();
		Student student = new Student();
		for (int count = 0; count < size; count++) {
			student = (Student) studentQueue.dequeue();
			if (student.getCollegeName()!=null) {
				System.out.println(student.getName() +" ->"+student.getCollegeName());
				
			}
			else
				System.out.println(student.getName() +" ->"+"Not alloted any college");
			studentQueue.enqueue(student);
		}
	}
	/*function to calculate total seats*/
	int calculteTotalSeat() {
		int totalSeat = 0;

		for (College college : collegeList) {
			totalSeat += college.getSeatsAvilabel();

		}

		return totalSeat;
	}
	/*validation function to check if the user has entered valid name of college and college seats are available or not */
	String ValidationForCollegeName() {
		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		for (College collage : collegeList) {
			if (collage.getCollegeName().equalsIgnoreCase(name)
					&& collage.getSeatsAvilabel() > 0) {
				flag = true;
				return name;
			}
		}
		if (!flag) {
			System.out.println("please enter correct college name");
			name = ValidationForCollegeName();

		}

		return name;
	}
}
