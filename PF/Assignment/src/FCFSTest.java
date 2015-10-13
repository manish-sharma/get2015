import static org.junit.Assert.*;

import org.junit.Test;


public class FCFSTest {

int	isArrayEqual(int expected[][],int output[][])
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
		System.out.print("First Come First Serve Job Scheduling Test");
		int expected[][]={{1,0,1,12},{5,8,13,19},{9,11,20,21},{25,0,25,29}};
		int arrival_time[]={1,5,9,25};
		int job_size[]={12,7,2,5};
		FCFSJobScheduler scheduler=new FCFSJobScheduler();
		int output [][]=scheduler.FCFS(arrival_time,job_size);
	    int result=isArrayEqual(expected, output);
		assertEquals("Fail",1, result);
	}

}
