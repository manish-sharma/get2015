import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class  Assignment4Test
{
	int [][]expected = new int[][] { { 1,1,0,1,12},
			{2,5,8,13,19}, {3,9,11,20,21}, {4,25,0,25,29}
	};
	int []arrival_time = new int[] {1, 5, 9, 25};
	int []job_size = new int[] {12, 7, 2, 5};


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

	public int isArrayEqual(int expected[][],int output[][])
	{
		int loopCount1,loopCount2,error=0;
		for(loopCount1=0; loopCount1<4;loopCount1++)
		{
			for(loopCount2=0; loopCount2<5;loopCount2++)
			{
				if(expected[loopCount1][loopCount2]!=output[loopCount1][loopCount2])
					error=1;
			}
		}
		return error;
	}
	
	
	@Test
	public void test()
	{
		Assignment4 obj = new Assignment4();
		assertEquals(0, isArrayEqual(expected,obj.FCFS(arrival_time ,job_size  , 4)));
	}

}
