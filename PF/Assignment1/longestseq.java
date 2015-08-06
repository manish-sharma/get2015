import java.util.*;
public class longestseq 
{
	public static void main(String[] args) 
	{
	int ip[]=new int[25];	
	
	int i;
    Scanner sc=new Scanner(System.in);
    for(i=0;i<25;i++)
    	ip[i]=Integer.parseInt(sc.next());
    longestseq ls=new longestseq();
   int[] op=ls.longIncrSeq(ip);
    for(i=0;op[i]!=0;i++)
    	System.out.print(op[i]);
	}
	
	int[] longIncrSeq(int arr[])
	{
		//1 2 3 2 3 4 5 3 4 2 2 3 4 5 6 7 8 1 2 4 5 6 7 8 9
		
		int max=0,count=0,pos=0,p=0;
		for(pos=0;pos<=arr.length-1;pos++)
		{
			if((pos==arr.length-1)||((arr[pos]>arr[pos+1])))
			{
			    count=count+1; 
				if(count>max)
				{
				   max=count;
				   p=pos+1-max;
				}
				count=0;
			}
		    else if((arr[pos]<arr[pos+1]))
			{
				count=count+1;
			}
		}
		int i;
		int[] arr1=new int[max];
		for(i=0,pos=p;pos<=p+max-1;pos++,i++)
		{
			arr1[i]=arr[pos];
		}
		return arr1;
	}
}

