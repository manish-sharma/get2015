import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class JunitTest4 {

	

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
	public void test() 
	{
		 int arrival_Time[]={1, 5, 9, 25};
		 int job_Size[]={12,7,2,5};
		 int size=job_Size.length;
		 int op[][]= new int[size+1][size+1];
		 
		 Fcfs  f=new Fcfs();
		 op=f.jobSchedule(arrival_Time,job_Size,size);
		 int expected[][]={{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
		 
		 int flag=compare2darr(expected,op);
		 
		 assertEquals(1, flag);
		
	}
	
	int compare2darr(int expected[][],int op[][])
	{
		int i,j,flag=1;
		for(i=0;i<4;i++)
		{
			for(j=0;j<5;j++)
			{
				if(op[i][j] == expected[i][j])
				{
					
				}
				else
				{
					flag=0;
				}
			}
		}
		return flag;
	}

}
