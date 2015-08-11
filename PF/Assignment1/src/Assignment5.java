
public class Assignment5
{
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
		int a[]={21,14,8,1};
		Assignment5 obj=new Assignment5();
		int n=obj.isSorted(a);
		System.out.println(n);
	}
}
