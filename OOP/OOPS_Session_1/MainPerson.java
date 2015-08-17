import java.util.Scanner;
class Person 
{
   private int uid;
   private String name;
   public Person(int uid,String name)//person class constructor
   {
	   this.uid=uid;
	   this.name=name;
   }
   public int getUid()//to return user ID
   {
	   return uid;
   }
   public void setUid(int uid)//to save user Id
   {
	   this.uid=uid;
   }
   public String getName()//to return user name
   {
	   return name;
   }
   public void setName(String name)//to save user name
   {
	   this.name=name;
   }
   public String toString()//to return name and user id of user
   {
	   return "\nName:"+name+"\nuid:"+uid;
   }
}
class Student extends Person 
{
   private int studentid;
   private String[] courses;
   public Student(int uid,String name,int studentid)
   {
	   super(uid,name);//to refer parent class user id and name
	   this.studentid=studentid;
   }
   public int getstudentid()//to return student Id
   {
	   return studentid;
   }
   public void setUid(int studentid)//to save student Id
   {
	   this.studentid=studentid;
   }
   public String[] getCourses()//to return the list of courses
   {
	   return courses;
   }
   public void setCourses(String[] courses)//to save the list of courses
   {
	   this.courses=courses;
   }
   public String toString()//to return complete information of student
   {
	   return super.toString()+"\nstudentid:"+studentid;
   }
}
public class MainPerson
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   
	   System.out.println("How many student records do you want to store");
	   int numPerson=sc.nextInt();
	   Student student[]=new Student[numPerson];//object array of student class
	   int uid,studentId;
	   String courses[]={""};//string array to store courses name
	   String name;
	   int numCourses;
	   for(int i=0;i<numPerson;i++)//loop to store the information of student 
	   {
		   System.out.println("Enter userid here for student "+(i+1)+" ");
		   uid=sc.nextInt();
		   System.out.println("Enter name here for student "+(i+1)+" ");
		   name=sc.next();
		   System.out.println("Enter studentId here for student "+(i+1)+" ");
		   studentId=sc.nextInt();
		   student[i]=new Student(uid,name,studentId);
		   System.out.println("How many courses do you want to choose:");
		   numCourses=sc.nextInt(); 
		   courses=new String[numCourses];
		   for(int j=0;j<numCourses;j++)//loop to store the courses for particular student
		   {
	     	   System.out.println("Enter name of course"+(j+1)+" ");
			   courses[j]=sc.next();
		   }
		   student[i].setCourses(courses);
	   }
	   for(int i=0;i<numPerson;i++)//loop to show the complete information of student
	   {
	       System.out.println("Student "+(i+1)+" information is:"+student[i].toString());
	      
	    	   courses=student[i].getCourses();
	    	   for(int j=0;j<courses.length;j++)//loop to show the courses of prticular student
	    	   System.out.print(courses[j]+" ");
          
	   }
	   sc.close();
   }
}
