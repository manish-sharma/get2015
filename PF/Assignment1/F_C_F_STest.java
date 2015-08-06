import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class F_C_F_STest {

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

	int isArrayEqual(int op[][],int jobschedule[][])
			{
		
			for(int i=0;i<4;i++)
			{
				for(int j=0;j<5;j++)
				{
					if(op[i][j]!=jobschedule[i][j])
					{
						return 0;
					}
				}
			}
		return 1;	
			}
	@Test
	public void test() {
		F_C_F_S fcfs=new F_C_F_S();
		int Jobschedule[][]={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		int arrivaltime[]={1,5,9,25};
		int jobsize[]={12,7,2,5};
		int op[][]=fcfs.jobSchedule(arrivaltime,jobsize,4);
		
		assertEquals("Pass",1,isArrayEqual(op,Jobschedule));
	}

}
