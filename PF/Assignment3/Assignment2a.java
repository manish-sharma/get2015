import java.util.Scanner;


public class Assignment2a
{
	  static int linearSearch(int arr[],int element,int index)   /*Recursive Function used For Linear searching */
		{
		    int status;
		   
		   if((arr.length)>index  && element!=arr[index] )          
		   {    
			   return linearSearch(arr,element,index+1);       //Recursive call to Function linearSearch()
		
		   }
		   else if((arr.length)>index  &&  element==arr[index])   //Boundary or exit condition
		   { 
			   status=index;
			   return status;
		   }
		   else
		   {
			  return status=-1;                                //When searched  element not present in given array
		   }
		      
					
		}

		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
		   
		   int no,element,index=0;
		   int status;
		   
		   Scanner sc=new Scanner(System.in);
		   
		   System.out.print("Enter number of elments in array: ");
		   no=sc.nextInt();
		   
		   int arr[] =new int[no];
		   
		   System.out.print("Enter values of array: ");
		   
		   for(int count=0;count<no;count++)                //Array input from user
		      arr[count]=sc.nextInt();
		   
		   System.out.print("Enter element which you want to search: ");
		   element=sc.nextInt();                            
		   
		   status=linearSearch(arr,element,index);
		   		   
		   if(status>=0)
		   {
		   System.out.print("Searched element "+element+" found at position: "+(status+1));
		   }
		   else
		   {
			   System.out.print("Searched element not found in given array ");
		   }
		   
		   sc.close();

		}
	
}
