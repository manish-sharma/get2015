import static org.junit.Assert.*;

import org.junit.Test;


public class JobSchedulingTest {

int	arrayCompare(int expected[][],int output[][])
	{
	 for(int i=0;i<expected.length;i++)
	 {
		  for(int j=0;j<output.length;j++)
		   {
			   if(expected[i][j]!=output[i][j])
				   return 0;
		   }
	 
	 }
	  return 1;	
}
	@Test
	public void test() {
		int expected[][]={{1,0,1,12},{5,8,13,19},{9,11,20,21},{25,0,25,29}};
		int arrival_time[]={1,5,9,25};
		int job_size[]={12,7,2,5};
		JobScheduling testObj=new JobScheduling();
		int output [][]=testObj.FCFS(arrival_time,job_size);
	    int result=arrayCompare(expected, output);
		assertEquals("Fail",0,result);
	}

}
