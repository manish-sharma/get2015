import static org.junit.Assert.*;

import javax.xml.transform.stax.StAXSource;

import org.junit.BeforeClass;
import org.junit.Test;

public class Assignment4Test 
{

	
	public int isArrayEqual(int expected[][], int output[][])
	{
		int result=1;
		int col=expected[0].length;
		int row=expected.length;
		for(int count=0;count<row;count++)
		{
			for(int count1=0;count1<col;count1++)
			{
				if(expected[count][count1]!=output[count][count1])
					result=0;
			}
		}
		return result;
	}
	@Test
	public void FCFS()
	{
		Assignment4 obj=new Assignment4();
		Assignment4Test obj1=new Assignment4Test();
		int[] arrival_time={1,5,9,25};
		int[] job_size={12,7,2,5};
		int n=4;
		
		int[][] output=obj.FCFS(arrival_time,job_size,n);
		int[][] expected={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		
		assertEquals("array are not equal",obj1.isArrayEqual(expected,output) , 1);
	
	}
	
	
	
}
