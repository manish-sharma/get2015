import java.util.Scanner;

public class merge_Array 
{
	public static void main(String[] args) 
	{
		int length1=0,length2=0,length3=0,index;		
		Scanner sc= new Scanner(System.in);	
		System.out.println("Enter the length of I array :");
		length1 = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the I array :");
		int input_array1[]=new int[length1];
		Scanner sc1= new Scanner(System.in);
		for(index=0;index<length1;index++)
		{
			input_array1[index]=Integer.parseInt(sc1.next());
		}
		System.out.println("Enter the length of II array :");
		length2=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the II array :");
		int input_array2[]=new int[length2];
		for(index=0;index<length2;index++)
		{
		 	input_array2[index]=Integer.parseInt(sc.next());
		}
		merge_Array object=new merge_Array();
		length3=length1+length2;
		int merged_array[]=new int[length3];
		merged_array=object.merging_array(input_array1,length1,input_array2,length2);
		System.out.println("Array after Merging  :");
		for(index=0;index<length3;index++)
		{
			System.out.print(merged_array[index]+"\t");
		}

	}
	
	int[] merging_array(int array1[],int length1,int array2[],int length2)
	{
		int index1,index2,length3=length1+length2,index3;
		index1=index2=0;
		int array3[]=new int[length3];
		
		for(index3=0;index3<length3;index3++)
		{
			if(index1<length1&&index2<length2)
			{
				if(array1[index1]<array2[index2])
				{
					array3[index3]=array1[index1];
					index1++;
				}
				else
				{
					array3[index3]=array2[index2];
					index2++;
				}
	
			}
			else if(index1==length1)
			{
				for(;index3<length3;index3++)
				{
					array3[index3]=array2[index2];
					index2++;
				}
			}
			else
			{
				for(;index3<length3;index3++)
				{
					array3[index3]=array1[index1];
					index1++;
				}
			}
		}
		return array3;
	}
}

