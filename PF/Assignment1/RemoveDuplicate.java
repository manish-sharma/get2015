import java.util.Scanner;


public class RemoveDuplicate
 {
	public static void main(String[] args) 
	{
		int i,size;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the size of array :");   //14
		   size = Integer.parseInt(sc.nextLine());
		int ip[]=new int[size];	
		System.out.println("Enter the array :");
	    for(i=0;i<ip.length;i++)
	    	ip[i]=Integer.parseInt(sc.next());
	    RemoveDuplicate obj = new RemoveDuplicate();
		int op[]=obj.getVal(ip);
		for(i=0;i<op.length;i++)//op[i]!='\0'
		    System.out.print(op[i]);
		//2 5 4 6 3 8 5 9 3 3 6 3 9 0
	}
	
    int[] getVal(int arr[])
    {
    	int i,j,count=0,l=arr.length;
	    for(i=0;i<arr.length;i++)
	    {
	    	for(j=i+1;j<arr.length;j++)
		    {
	    		if((arr[j]==arr[i])&&(arr[i]!='\0'))
	    		{	
	    			arr[j]='\0';
	    			count=count+1;
	    		}
		    }
	    }

	    int arr1[]=new int[l-count];
	    for(i=0,j=-1;i<l;i++)
	    {
	    	if(arr[i]!='\0')
	    	{
	    		j=j+1;
	    		arr1[j]=arr[i];
	        }
	    }
	    return arr1;
    }
}