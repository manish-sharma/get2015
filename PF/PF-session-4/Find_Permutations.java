import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Find_Permutations {
	 static ArrayList<String> list;
	
	public static void main(String args[]) 
	{
		Scanner scan;
		scan=new Scanner(System.in);
	    int n;
	    String no;
	    System.out.println("Enter no or any string");
	    no=scan.nextLine();
	    n=no.length();
	    Find_Permutations obj=new Find_Permutations();
	    list=new ArrayList<String>();
	  
	    list=obj.permutation1(no);
	  
	
		int i;
		 System.out.println("n! Permutations of the characters of the string no (in Order) :");
		 for(i=0;i<list.size();i++)
		 {
			 System.out.println(list.get(i));
		 }
		 
		 
	    
   }

	public ArrayList<String> permutation1(String s) {
		// TODO Auto-generated method stub
		if(list==null)
		{
			list=new ArrayList<String>();
		}
		 Find_Permutations obj=new Find_Permutations();
		 list=obj.permutation1("",s);
		 return list;
		
	}

	public ArrayList<String> permutation1(String prefix, String s) {
		// TODO Auto-generated method stub
		if(list==null)
		{
			list=new ArrayList<String>();
		}
		
		int n=s.length();
		//String s1=s;
		int i;
		if(n==0)
		{
			list.add(prefix);
			
		}
		
		else
		{
		
		   for(i=0;i<n;i++)
		   {
			list=permutation1(prefix+s.charAt(i),s.substring(0, i)+s.substring(i+1, n));
			
		   }
		}
		
		return list;
		
		
		
	}

	

	
	}

	