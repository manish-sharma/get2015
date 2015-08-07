
public class ChkSorted {
	public int chkSorted(int input[])
	{
		int i=0,asc=0,desc=0;
		for(i=0;i<input.length-1;i++)
		{
			if(input[i]>input[i+1])
			 desc=1;
			else if(input[i]<input[i+1])
				asc=1;
			
		}
		if(asc==1&&desc==1)
			return 0;
		else if(asc==1)
			return 1;
		else return 2;
	}


public static void main(String args[])
{
	
	int op=0;
	int arr[]=new int[]{3,2,1};
	ChkSorted rm=new ChkSorted();
	op=rm.chkSorted(arr);
	System.out.println("output is"+op);
  
	
}
}
