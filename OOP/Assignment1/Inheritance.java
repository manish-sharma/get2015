// program to implement inheritance

class Person
{
	private int uid;
	private String name;
	
	// parameterized constructor
	public Person ( int uid, String name)
	{
		this.uid = uid ;
		this.name = name ;
	}
	
	// sets user id
	public void setUid( int uid )
	{
		this.uid = uid ;
	}
	
	// gets user id
	public int getUid()
	{
		return uid;
	}
	
	// sets person's name
	public void setName( String name )
	{
		this.name = name ;
	}
	
	// gets person's name
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "Name : "+name+", UId : "+uid;
	}
}


class Student extends Person
{
	private int studentId;
	private String courses[];
	
	// parameterized constructor
	Student ( int uid, String name, int studentId, String courses[])
	{
		super(uid, name);
		this.studentId = studentId ;
		this.courses = courses;
	}
	
	// sets Student id
	public void setStudentId( int studentId )
	{
		this.studentId = studentId ;
	}
	
	// gets Student id
	public int getStudentId()
	{
		return studentId;
	}
	
	// sets Student's courses
	public void setCourses( String courses[] )
	{
		this.courses = courses;
	}
	
	// gets Student's courses
	public String[] getCourses()
	{
		return courses;
	}
	
	public String toString()
	{
		String finalCourses = " ";
		for(int index1=0; index1<courses.length; index1++)
			finalCourses = finalCourses + courses[index1] + "\t";
		return "Student Id : " + studentId + ", Courses : " + finalCourses ;
	}
}


class Teacher extends Person 
{
	private int teacherId;
	private String[] subjects;
	
	// parameterized constructor
	public Teacher ( int uid, String name, int teacherId, String[] subjects )
	{
		super(uid, name);
		this.teacherId = teacherId ;
		this.subjects = subjects ;
	}
	
	// sets teacher's id
	public void setTeacherId( int teacherId )
	{
		this.teacherId = teacherId ;
	}
	
	// gets teacher's id
	public int getTeacherId()
	{
		return teacherId;
	}
	
	// sets teacher's subjects
	public void setSubjects( String subjects[] )
	{
		this.subjects = subjects ;
	}
	
	// gets teacher's subjects
	public String[] getSubjects()
	{
		return subjects ;
	}
	
	public String toString()
	{
		String finalCourses = " ";
		for(int index1=0; index1<subjects.length; index1++)
			finalCourses = finalCourses + subjects[index1] + "\t";
		return "Student Id : " + teacherId + ", Subjects : " + finalCourses;
	}
}

public class Inheritance 
{
	public static void main(String[] args) 
	{
		Student studentObj = null;
		Teacher teacherObj = null;
		
		try
		{
		/* *******************	for student class	********************** */
		String arrCourses[] = {"Java", "OOPs"};
		studentObj = new Student (1, "Kajal", 11, arrCourses);
		System.out.println("UId : "+studentObj.getUid());
		System.out.println("Name : "+studentObj.getName());
        System.out.println("Student Id : "+studentObj.getStudentId());
        
        System.out.println("Courses : ");
        String arrGetCourses[] = studentObj.getCourses();
        for(int index1=0; index1<arrGetCourses.length; index1++)
        	System.out.print(arrGetCourses[index1]+" ");
        
        System.out.println(studentObj);  // tests toString(), when object is printed toString is called by default
        
        
        /* *******************	for teacher class	********************** */
        String arrSubjects[] = {"DBMS", "Maths"};
		teacherObj = new Teacher (2, "Sonal", 111, arrSubjects);
		System.out.println("\n\nUId : "+teacherObj.getUid());
		System.out.println("Name : "+teacherObj.getName());
        System.out.println("Teacher Id : "+teacherObj.getTeacherId());
        
        System.out.println("Subjects : ");
        String arrGetSubjects[] = teacherObj.getSubjects();
        for(int index1=0; index1<arrGetSubjects.length; index1++)
        	System.out.print(arrGetSubjects[index1]+" ");
        
        System.out.println("\n"+teacherObj);  // tests toString()
		}
		catch( Exception ex )
		{
			System.out.println(ex);
		}
		finally
		{
			if(studentObj!=null)
				studentObj = null;
			if(teacherObj!=null)
				teacherObj = null;
		}
	}
}