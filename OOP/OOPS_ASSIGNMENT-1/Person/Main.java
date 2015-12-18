package Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
						
		ArrayList<Student> st=new ArrayList<Student>();
		
		int uid,studentId,flag=1,i=1,no;
		String name;
		
		
		try
		{
		while(flag==1)
		{
			System.out.println("Enter Information Student- "+i);
			System.out.println("UId : ");
			uid=sc.nextInt();
			
			System.out.println("Name : ");
			name=sc.next();
			
			System.out.println("StudentId : ");
			studentId=sc.nextInt();
			Student  ref=new Student(uid, name, studentId);
			
		    st.add(ref);
		    
		    System.out.println("Number of Couses : ");
		    no=sc.nextInt();
		    
		    System.out.println("Name of Couses: ");
		    String[] course=new String[no];
		    
		    for(int j=0;j<no;j++)
		    {
		    	course[j]=sc.next();
		    }
		    ref.setCources(course);
		    
		    System.out.println("Enter 1 if you want to continue otherwise 0: ");
		    flag=sc.nextInt();
		    i++;
		}
				
		System.out.println("Details Of Student");
		
		System.out.println("UID\tNMAE\tSTUDENT-ID\tCOURSES");
		Iterator<Student> itr=st.iterator();//getting Iterator from arraylist to traverse elements  
		  
		while(itr.hasNext())
		{     
			
			Student stu=itr.next();
		   System.out.print(stu.toString()); 
		   
		   String[] course=new String[stu.getCourses().length];
		   course=(stu.getCourses()); 
		   
		  
		   int l=course.length;
		      
		   System.out.print("\t\t"+course[0]);
		   for(int j=1;j<l;j++)
		    {
			   System.out.print(","+course[j]);
		    }
		  
		   sc.close();
	    }  
			
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
		

	}

}
