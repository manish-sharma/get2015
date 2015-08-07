package FirstComeFirstServe;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFirstComeFirstServe {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		 int ArrivalTime[] ={1, 5, 9, 25};
		 int jobSize[]={12,7,2,5};
		 int n=jobSize.length;
		 FirstComeFirstServe assign=new FirstComeFirstServe();
		 int output[][]= assign.FCFS(ArrivalTime, jobSize, n);
		 int expected[][]={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		 
		/* System.out.println("job job arrival Time Job Waiting Time Job Start Time Job Finish Time");
		
		 for(int row=0;row<output.length;row++)
		 {
			 	for(int column=0;column<output[row].length;column++)
				{
			 		System.out.print(output[row][column]+"\t");
				}
			 	System.out.println();
			 }*/
		 int  ans=isArrayEqual(expected,output);
		 assertEquals(1, ans);
	 }
		
		
	int  isArrayEqual(int expected[][],int output[][])
	{
		int flag=1;
		for(int row=0;row<expected.length;row++)
		{
			for(int column=0;column<expected[row].length;column++)
			{
				if(expected[row][column]!=output[row][column])
				{
					flag=0;
					return flag;
					
				}
			}
		}
		return flag;
	}
	

}
