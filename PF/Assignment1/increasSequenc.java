package assignment;

public class increasSequenc
{
	public static void main(String[] args) 
	{
		increasSequenc obj=new increasSequenc();
		int input[]={1,2,3,4,5,2,3,4,7,8,9,1,2,3,3,3,4,5,6,7,8,9};
		int actual[]=obj.longestSequence(input);
		
		for(int index=0;index<actual.length;index++)
				System.out.println(actual[index]);
	}
	int[] longestSequence(int input[])
	{
			int previousIndex=0,size=0,count=0,startIndex=0;
		
			
			int index=1;
			while(true)
			{
					while(index<input.length&&previousIndex<input.length&&input[previousIndex]<=input[index])
					{
						index++;
						count++;
						previousIndex++;
					}
					if(size<count)
					{
							size=count;
							
					}
					if(index>=input.length||previousIndex>=input.length)
						break;
					
					
						previousIndex=index;
						startIndex=index;
						index=previousIndex+1;
						count=0;
						
			}
					
	
			
			int output[]=new int[size+1];
			int outputIndex=0;
			System.out.println("size="+size+"startIndex="+startIndex);
		for( index=startIndex , outputIndex=0;index<=startIndex+size;index++,outputIndex++)
		{
			output[outputIndex]=input[index];
			System.out.println(output[outputIndex]);
		}
		return output;
	}
	}


