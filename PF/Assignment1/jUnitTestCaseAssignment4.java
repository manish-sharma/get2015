import static org.junit.Assert.*;

import org.junit.Test;

public class jUnitTestCaseAssignment4 
{

	
	public int isArrayEqual(int expected[][], int output[][])
	{
		int flag=1;
		int col=expected[0].length;
		int row=expected.length;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(expected[i][j]!=output[i][j])
					flag=0;
			}
		}
		return flag;
	}
	@Test
	public void FCFS()
	{
		Assignment4 obj=new Assignment4();
		jUnitTestCaseAssignment4  obj1=new jUnitTestCaseAssignment4 ();
		int[] arrival_time={1,5,9,25};
		int[] job_size={12,7,2,5};
		int n=4;
		
		int[][] output=obj.FCFS(arrival_time,job_size,n);
		int[][] expected={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		
		assertEquals("array are not equal",obj1.isArrayEqual(expected,output) , 1);
	
	}
	
	
	
}
