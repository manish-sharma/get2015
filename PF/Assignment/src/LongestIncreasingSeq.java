import java.util.*;
public class LongestIncreasingSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};	
		int output[];
		int i;
	    LongestIncreasingSeq ls=new LongestIncreasingSeq();
	    output=ls.longestIncreasinSeq(input);
	    for(i=0;i<output.length;i++)
	    	System.out.print(output[i]);
		}
		
		int[] longestIncreasinSeq(int input[])
		{
			int array_length=input.length;
			int tempArray1[]=new int[array_length];
			int tempArray2[]=new int[array_length];
			int count1=1,count2=1;
			int k=0;
			int i,j,l;
			tempArray1[k]=input[0];
			for(i=0;i<array_length;)
			{
				k=0;
				tempArray2[k++]=input[i];
				for(j=i;j<array_length-1;j++)
				{
					if(input[j]>=input[j+1])
					{
						
						break;
					}
					tempArray2[k++]=input[j+1];
					count2++;
				}
				if(count2>count1)
				{
					for(l=0;l<count2;l++)
						tempArray1[l]=tempArray2[l];
					count1=count2;
				}
				i=i+count2;
				count2=1;
			}
			int outputArray[]=new int[count1];
			for(i=0;i<count1;i++)
				outputArray[i]=tempArray1[i];
			return outputArray;
		}
	}

