package assignment1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class fcfsSchedulingTest {

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
		fcfsSchedule ob=new fcfsSchedule();
		
		int out[][]=ob.FCFS(new int[]{1,5,9,25},new int[]{12,7,2,5},4);
		
		int exp[][]={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		fcfsSchedulingTest test1=new fcfsSchedulingTest();

		assertEquals(1,test1.isEqual(exp, out));

		
	}
	
	public int isEqual(int exp[][], int out[][])
	{
		int flag=1;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(exp[i][j]!=out[i][j])
				{
					flag=0;
					break;
				}
			}
		}
		return flag;
	}

}
