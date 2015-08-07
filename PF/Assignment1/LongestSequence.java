
public class LongestSequence {
	public int[] longestSequence(int input[])
	{
		int temp1=0,temp2=0,longSeqLen=0,start=0,last=0,len=1,j=0;;
		int i=0;
		for(i=1;i<input.length;i++)
		{
			if(input[i]>input[temp2])
			{
				temp2=i;
				
			}
			else
			{
				len=temp2-temp1+1;
				if(len>longSeqLen)
				{
					longSeqLen=len;
					start=temp1;
					last=temp2;
				}
			
				temp1=temp2=i;
				
			}
		}
		len=temp2-temp1+1;
		if(len>longSeqLen)
		{
			longSeqLen=len;
			start=temp1;
			last=temp2;
		}
	//	System.out.println("start is"+start);
	//	System.out.println("last is"+last);
	int arr[]=new int[longSeqLen];
		for(i=start;i<=last;i++)
			arr[j++]=input[i];
		/*for(i=0;i<arr.length;i++)
		System.out.print(arr[i]);*/
		return arr;
	}
	public static void main(String args[])
	{
		int i=0;
		LongestSequence rm=new LongestSequence();
		int arr[]=new int[]{3,2,2,1,2,3,4,3,4,5,6,7,8};
		System.out.println("output is"+arr.length);
		int op[]=rm.longestSequence(arr);
		
		for(i=0;i<op.length;i++)
			System.out.println(op[i]);
		
	}
	

}
