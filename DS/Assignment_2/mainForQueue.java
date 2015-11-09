package assignmentDS_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.lang.StringUtils;

public class mainForQueue {
	/*
	 * in main function we are implementing College Counseling Process
	 */
	public static void main(String args[])
	{
		Queue<String> student=new Queue<>(30);
		
		String line="";
		BufferedReader brStudents;
	  	try
		{
			brStudents = new BufferedReader(new FileReader("D:\\studentList.txt"));
	        while ((line = brStudents.readLine()) != null
					&& StringUtils.isNotEmpty(line)) 
			{
	        	if(student.isSpace())
	        	{
	        	student.enqueue(line);
	        	}
				
			}
	        ArrayList<Queue> arrayList=new ArrayList<Queue>();
	        String arr[]=new String[5];
	        arr[0]="College 1"; arr[1]="College 2"; arr[2]="College 2"; 
	        arr[3]="College 3"; arr[4]="College 4";
	        Queue<String> college1=new Queue<>(5); arrayList.add(college1);
	        Queue<String> college2=new Queue<>(5); arrayList.add(college2);
	        Queue<String> college3=new Queue<>(5); arrayList.add(college3);
	        Queue<String> college4=new Queue<>(5); arrayList.add(college4);
	        Queue<String> college5=new Queue<>(5); arrayList.add(college5);
	        Scanner scanner=new Scanner(System.in); 
	        System.out.println("College Counseling Process");
	        Boolean temp=true;
	        while(!student.isEmpty()&&temp)
	        {
	        	
	        	temp=false;
	        	String name=student.dequeue();
	        	System.out.println("\nFor "+name+" \nPlease select any of the below given choice");
	        	
	        	for(int j=0;j<arrayList.size();j++)
	        	{
	        		Queue college=(Queue)arrayList.get(j);
	        		if(college.isSpace())
	        		{
	        			//temp=true;
	        			System.out.println((j+1)+".college_"+(j+1));
	        		}
	        	}
	        	
	        	int choice =scanner.nextInt();
	        	
	        	if(choice==1&&college1.isSpace()) 
	        	{
	        		 college1.enqueue(name);
	        	}
	        	else if(choice==2&&college2.isSpace())
	        	{
	        		college2.enqueue(name);
	        		
	        	}
	        	else if(choice==3&&college3.isSpace())
	        	{
	        		college3.enqueue(name);
	        		
	        	}
	        	else if(choice==4&&college4.isSpace())
	        	{
	        		college4.enqueue(name);
	        		
	        	}
	        	else if(choice==5&&college5.isSpace())
	        	{
	        		college5.enqueue(name);
	        		
	        	}
	        	else
	        	{
	        		System.out.println("You entered incorrect choice");
	        	
	        	}
	        	
	        	
	        	for(int j=0;j<arrayList.size();j++)
	        	{
	        		Queue college=(Queue)arrayList.get(j);
	        		if(college.isSpace())
	        		{
	        			temp=true;
	        			
	        		}
	        	}
	        	if(!temp)
	        	{
	        		System.out.println("\n\nNow No seats are available");
	        		break;
	        	}
	        	
	        	
	        	
	        	
	        	
	        	
	        }
	       System.out.println("\nFinally Alloted Seats are as given");
	 	   for(int j=0;j<arrayList.size();j++)
	       {
	    		    Queue college=(Queue)arrayList.get(j);
	    		    System.out.println("\n\nlist of students who get admission in college_"+(j+1)+"\n");
	    		    while(!college.isEmpty())
	    		    {
	    		    	System.out.println(college.dequeue());
	    		    }
	       }
	 		
	        
		} 
	  
		
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	
	}
	
	

}
