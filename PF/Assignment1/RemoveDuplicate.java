
public class RemoveDuplicate {
	public int[] removeDuplicat(int input[])
	{
		int i=0,j=0,k=0,len;
		len=input.length;
		
		for(i=1;i<len;i++)
		{
			for(j=0;j<i;j++)
			{
				if(input[i]==input[j])
				{
					for(k=i;k<len-1;k++)
					  input[k]=input[k+1];
					
					i--;len--;
					
					/*for(i=0;i<len;i++)
						System.out.print(input[i]);*/
					
					break;
				}
				
			}
		}
		int a[]=new int[len];
		for(i=0;i<len;i++)
			a[i]=input[i];
		return a;
	}
	/*public static void main(String args[])
	{
		int i=0;
		RemoveDuplicate rm=new RemoveDuplicate();
		int arr[]=new int[]{3,2,2,6,7,7,6,1,2,3};
		System.out.println("output is"+arr.length);
		int op[]=rm.removeDuplicat(arr);
		
		for(i=0;i<op.length;i++)
			System.out.println(op[i]);
		
	}*/

}
