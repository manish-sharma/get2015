package SortedArray;

public class SortedArray {
	public static void main(String args[])
	{
		
	}
	
	
	
	public  int isSorted(int[] a)
	{
			int flag=0;
		    for(int index = 0; index < a.length-1; index ++){ 

		        if (a[index] < a[index+1])
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
		    	for(int index = 0; index <a.length-1 ; index ++){ 

		            if (a[index] > a[index+1])
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



}
