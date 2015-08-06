import java.util.Scanner;

public class mergeArray 
{
	public static void main(String[] args) 
	{
		int len1=0,len2=0,len3=0,i;		
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter the length of I array :");
		len1 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the I array :");
		int ip1[]=new int[len1];
		Scanner sc1= new Scanner(System.in);
		for(i=0;i<len1;i++)
		 	ip1[i]=Integer.parseInt(sc1.next());
		System.out.println("Enter the length of II array :");
		Scanner sc2= new Scanner(System.in);
		len2 = Integer.parseInt(sc2.nextLine());
		System.out.println("Enter the II array :");
		int ip2[]=new int[len2];
		Scanner sc3= new Scanner(System.in);
		for(i=0;i<len2;i++)
		 	ip2[i]=Integer.parseInt(sc3.next());
		mergeArray ma=new mergeArray();
		len3=len1+len2;
		int ip3[]=new int[len3];
		ip3=ma.getVal(ip1,len1,ip2,len2);
		for(i=0;i<len3;i++)
		 System.out.println(ip3[i]);

	}
	
	int[] getVal(int arr1[],int l1,int arr2[],int l2)
	{
		int i,j,l3=l1+l2,k;
		j=k=0;
		int arr3[]=new int[l3];
		
		for(i=0;i<l3;)
		{
			if(j<l1&&k<l2)
			{
				if(arr1[j]<arr2[k])
				{
					arr3[i]=arr1[j];
					j++;
				}
				else
				{
					arr3[i]=arr2[k];
					k++;
				}
				i++;
			}
			else if(j==l1)
			{
				for(;i<l3;i++)
				{
					arr3[i]=arr2[k];
					k++;
				}
			}
			else
			{
				for(;i<l3;i++)
				{
					arr3[i]=arr1[j];
					j++;
				}
			}
		}
		return arr3;
	}
}

