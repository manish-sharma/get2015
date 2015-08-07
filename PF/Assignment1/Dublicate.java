import java.util.Scanner;


public class Dublicate {

	public static void main(String[] args) {
		int s;
		int arr[]=new int[20];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no Elements of Array to be entered: ");
		s=sc.nextInt();
		System.out.println("Enter Elements of Array: ");
		for(int i=0;i<s;i++)
		{
			arr[i]=sc.nextInt();
		}
		int fynal[]=removeDuplicate(arr);
		for(int i=0;i<fynal.length;i++)
		{
			
			
			
			System.out.print(" "+fynal[i]);
			
		}
		
		
	}
	
		
		public static int[] removeDuplicate(int input[])
		{
	
			int [] fynal= new int[10];
		
		int b=0,flag=0,count=1;
		//int [] arr= {2,5,4,6,3,8,5,9,3,3,6,3,9,0};
   fynal[0]=input[0];
   System.out.println(" "+fynal[0]);
		for(int i=1;i<input.length;i++)
      {
		    	b=0;
			         while(b<count)
		    		{
		    			
		    			if(input[i]==fynal[b])
		    			{
		    				
		    				flag=-1;
		    				break;
		    			}
		    			
		    			
		    			b++;
		    		}
		
      
      if(flag==0)
      {
    	 
    	  fynal[count++]=input[i];
    	  
    	  
      }
      
      
      }

    return fynal;
}}