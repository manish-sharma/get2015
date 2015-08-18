package priyamvada;

/*Program to find array in ascending, descending or unsorted order*/
public class Program5 {
int checkOrder(int input[])
{
	int i,j,count=0,count1=0,count2=0;
	
	for(i=0;i<input.length-1;i++)
	{
		
			if(input[i]<input[i+1] )
			{
				count1++;
			}
			else
				break;
			
	}
	for(i=0;i<input.length-1;i++)
	{
		if(input[i]>input[i+1])
		{
			count2++;
		}
		else break;
		
	}
	
	if(count1==input.length-1)
		return 1; //ascending order
	else if(count2==input.length-1)
	 return 2;    //descending order
	else return 0; //unsorted order
	}
public static void main(String arg[])
{
	int []input={5,4,1,7,1};
	Program5 obj=new Program5();
	System.out.println(obj.checkOrder(input));
}
}
