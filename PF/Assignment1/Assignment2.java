
public class Assignment2 {
	
	 int[] removeDuplicate(int input[])
	 { 
		 int n=input.length-1;
			
			int i,j,k;
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<=n;j++)
				{
					if(input[i]==input[j])
					{
						for(k=j;k<n;k++)
							input[k]=input[k+1];
						n--;
						j--;
					}
				}	
			}
			int b[]=new int[n+1];
			for(i=0;i<=n;i++)
			{
				b[i]=input[i];
			}
			return b;
	 }
	
	public static void main(String [] arg)
	{
	   Assignment2 obj=new Assignment2();
	   int[] arr={2,5,4,6,3,8,5,9,3,3,6,3,9,0};
	   arr=obj.removeDuplicate(arr);
	   
	   for(int i=0;i<arr.length;i++)
		 {
			System.out.print(arr[i]+" ");
		 }
		
		
	}

}
