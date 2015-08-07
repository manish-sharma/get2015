import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class F_C_F_S_Test {

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

	boolean isArrayEqual(int e[][],int o[][])
	{
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(e[i][j]!=o[i][j])
					return false;
			}
		}
		return true;
	}
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		F_C_F_S fcfs=new F_C_F_S();
		int exp[][]={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		int arrivalTime[]={1,5,9,25};
		int jobSize[]={12,7,2,5};
		int op[][]=fcfs.jobSchedule(arrivalTime, jobSize, jobSize.length);
		boolean b = isArrayEqual(exp,op);
		assertEquals("Correct",true,b);
	}

}
