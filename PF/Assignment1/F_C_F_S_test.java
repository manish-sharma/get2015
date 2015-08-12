import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class F_C_F_S_test {

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

	
	int isArrayEqual(int expected_Jobschedule[][],int actual_jobschedule[][])
	{

	for(int index1=0;index1<4;index1++)
	{
		for(int index2=0;index2<5;index2++)
		{
			if(expected_Jobschedule[index1][index2]!=actual_jobschedule[index1][index2])
			{
				return 0;
			}
		}
	}
	return 1;	
	}
@Test
public void test_job_schedule() 
{
	F_C_F_S object=new F_C_F_S();
	int expected_Jobschedule[][]={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
	int arrivaltime[]={1,5,9,25};
	int jobsize[]={12,7,2,5};
	int actual_jobschedule[][]=object.jobSchedule(arrivaltime,jobsize,4);
	assertEquals("Pass",1,isArrayEqual(expected_Jobschedule,actual_jobschedule));
}

}
