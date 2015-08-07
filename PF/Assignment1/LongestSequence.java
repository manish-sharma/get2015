package LongestSequence;



public class LongestSequence {
	
		public static void main(String[] args) 
		{
			
		}
		int[] longestSequence(int input[])
		{
				int previousIndex=0,size=0,count=0,startIndex=0;
			
				//System.out.println("input.length="+input.length);
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


