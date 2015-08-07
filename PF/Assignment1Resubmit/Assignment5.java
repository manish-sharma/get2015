import java.util.Scanner;


public class Assignment5
{
	/**isSorted is a function which check that the array is sorted or not and how it is sorted.It return 0 if array is not sorted, 
	 * 1 if array is sorted ascending and 2 if array is sorted descending.
	 * 
	 * 
	 * @param a is an array of integer.
	 * @return This function return a integer which shows the nature of given array.It return 0 if array is not sorted , 1 if array is ascending wise sorted
	 *         and 2 if array is descending wise sorted.
	 */
	public  int isSorted(int[] a)
	{
		int flag=0;
		    for(int i = 0; i < a.length-1; i ++){ 

		        if (a[i] < a[i+1])
		            flag=1;
		        else{
		        	flag=0;
		        	break;
		        	}
		        }
		    if(flag==1)
		    	return 1;
		    else {
		    	flag=0;
		    	for(int i = 0; i <a.length-1 ; i ++){ 

		            if (a[i] > a[i+1])
		                flag=1;
		            else{
		            	flag=0;
		            	break;
		            	}
		            }
		    	if(flag==1)
		        	return 2;
		    	else return 0;
			} 
		}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements in array");
		int n=sc.nextInt();
		int input[]=new int[n];
		System.out.println("enter the elements in array");
		for(int count=0;count<n;count++)
		{
			input[count]=sc.nextInt();
		}
		Assignment5 obj=new Assignment5();
		int result=obj.isSorted(input);
		System.out.println(result);
	}
}
