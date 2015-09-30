import java.util.Scanner;

public class Assignment2 
{

    int l=0;
	static String Result=new String();   //Global Variable Result used for storing permuted strings
	String permutation(String str)       // Recursive function permutation() used to calculate permuted strings
	{
	       char[] c = str.toCharArray();  
		  
		   int r=str.length()-1;             
		   if (l == r)                     // Base Condition
		   Result=Result+str+"\n";
		   else
		   {
		       for (int i = l; i <= r; i++)          
		       {
		    	   char temp;
				    temp = c[l];                  //Swapping
				    c[l] = c[i];
				    c[i] = temp;
				    str = new String(c);
				    ++l;
		            permutation(str);            //Recursive logic of permutation
		            --l;
		            char temp1;                  //Swapping
				    temp1 = c[l];
				    c[l] = c[i];
				    c[i] = temp1; 
				    str = new String(c);
		       }
		       str = new String(c);             
		   }
		 
		return Result;
		
	}
		public static void main(String args[])
		{
						
			Scanner sc=new Scanner(System.in);
		   	 
		    System.out.println("Enter the string : " ); //User input
		   	String input_String=sc.next();
		   	
		   	if(input_String.length()>7)             //Exception or heap storage problem handled
		   	 {
		   		System.out.print("Exception:Memmory Space Problem.....\nYou can permute upto 7 letter word at a time......");
		   		sc.close(); 
		   		return;
		   	 }
			
			Assignment2  ass=new Assignment2 ();
			Result=ass.permutation(input_String);
			
		    System.out.println(Result);  
				
			sc.close();
		}

	

	}
