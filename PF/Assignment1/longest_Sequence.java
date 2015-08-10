import java.util.*;
public class longest_Sequence 
{
	public static void main(String[] args) 
	{
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		size = Integer.parseInt(sc.nextLine());
		int input_array[]=new int[size];	
		int index;
		System.out.println("Enter the array :");
		for(index=0;index<size;index++)
		{
			input_array[index]=Integer.parseInt(sc.next());
		}
		longest_Sequence object=new longest_Sequence();
		int[] output_array=object.longIncrSeq(input_array);
		for(index=0;index<output_array.length;index++)
		{
			System.out.print(output_array[index]);
		}
	}
	
	int[] longIncrSeq(int array[])
	{
		int max=0,count=0,index,pos_long_seq=0;
		for(index=0;index<=array.length-1;index++)
		{
			if((index==array.length-1)||((array[index]>array[index+1])))
			{
			    count=count+1; 
				if(count>max)
				{
				   max=count;
				   pos_long_seq=index+1-max; // position of longest increasing sequence
				}
				count=0;
			}
		    else if((array[index]<array[index+1]))
			{
				count=count+1;
			}
		}
		
		int[] long_seq_array=new int[max];
		for(int index2=0,index1=pos_long_seq;index1<=pos_long_seq+max-1;index1++,index2++)
		{
			//store longest sequence 
			long_seq_array[index2]=array[index1];
		}
		
		return long_seq_array;
	}
}

