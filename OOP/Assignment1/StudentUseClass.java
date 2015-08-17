package oop1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentUseClass {
	/**
	 * this function read the integer value from the console and then validate it.
	 * @return the number from the console.
	 */
	int UserInput() {
		int number;
		try {
			Scanner sc = new Scanner(System.in);

			number = sc.nextInt();
			if (number < 0) {
				System.out.println("number be negative");
				number = UserInput();

			}
			return number;
		} catch (InputMismatchException e) {
			System.out.println("enter the correct input");
			number = UserInput();
			return number;
		}

	}
	/** uses to read input from the user
	 */
	void readInput() {
		int inputOption=2;
		Scanner input= new Scanner(System.in);
		StudentUseClass use =new StudentUseClass();
		System.out.println("enter 1 for student section and 0 for person section");
		inputOption=use.UserInput();
		if(inputOption==1){
			System.out.println("Enter the student's person ID");
			int pId=use.UserInput();
			System.out.println("Enter the student ID");
			int sId=use.UserInput();
			System.out.println("Enter the student name");
			String sName=input.next();
			Student obj=new Student(pId,sName,sId);
			int option=0;
			System.out.println("enter 1 for set student courses, 2 for get student ID, 3 for get student courses, 4 to get student's all detail");
			option=use.UserInput();
			if(option==1){
				int nCourse=use.UserInput();
				String[] course=new String[nCourse];
				System.out.println("Enter the nmae of courses");
				for(int count=0;count<nCourse;count++)
					course[count]=input.next();
				obj.setCources(course);
			}
			else if(option==2){
				int id=obj.getStudentId();
				System.out.println("Student Id is"+id);
			}
			else if(option==3){
				String[] course=obj.getCourses();
				System.out.println("courses of student are");
				try{
					for(String str: course)
					System.out.print(str+"\n");
				}
				catch(NullPointerException e){
					System.out.println("Sorry!!!   no courses are there");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			else if(option==4){
				String detail=obj.toString();
				System.out.println("student details are \t"+detail);
			}
			else
				System.out.println("enter correct value next time");
		}
		else if(inputOption==0){
			System.out.println("Enter the person ID");
			int pId=use.UserInput();
			System.out.println("Enter the person name");
			String sName=input.next();
			person obj=new person(pId,sName);
			int option=0;
			System.out.println("enter 1 for set person id, 2 for set person name, 3 for get person id,4 to get person name, 5 to get person's all detail");
			option=use.UserInput();
			if(option==1){
				System.out.println("enter student id");
				int uid=use.UserInput();
				obj.setUid(uid);
			}
			else if(option==2){
				System.out.println("enter person name");
				String name=input.next();
				obj.setName(name);
			}
			else if(option==3){
				int id=obj.getUid();
				System.out.println("Person Id is"+id);
			}
			else if(option==4){
				String name=obj.getName();
				System.out.println("name: "+name);
			}
			else if(option==5){
				String detail=obj.toString();
				System.out.println("person details are \t"+detail);
			}
			else
				System.out.println("enter correct value next time");
		}
	}
	public static void main(String args[]){
		StudentUseClass use =new StudentUseClass();
		StudentUseClass obj=new StudentUseClass();
		int option=1;
		while(option==1){
			obj.readInput();
			System.out.println("enter 1 to continue");
			option=use.UserInput();
		}
	}

}
