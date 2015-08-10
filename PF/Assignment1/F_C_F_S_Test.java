import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class F_C_F_S_Test 
{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
	}

	@Before
	public void setUp() throws Exception 
	{
	}

	@After
	public void tearDown() throws Exception 
	{
	}

	boolean isArrayEqual( int arrExpected[][], int arrOutput[][] )
	{
		for(int index1=0; index1<4; index1++)
		{
			for(int index2=0; index2<5; index2++)
			{
				if( arrExpected[index1][index2] != arrOutput[index1][index2] )
					return false;
			}
		}
		return true;
	}
	
	@Test
	public void testCorrect() 
	{
		F_C_F_S obj = new F_C_F_S();
		int arrExpected[][] = { {1,1,0,1,12}, {2,5,8,13,19}, {3,9,11,20,21}, {4,25,0,25,29} };
		int arrivalTime[] = {1,5,9,25};
		int jobSize[] = {12,7,2,5};
		int arrOutput[][] = obj.FCFS( arrivalTime, jobSize, jobSize.length );
		boolean bool = isArrayEqual( arrExpected, arrOutput );
		assertEquals( "Correct", true, bool );
	}

	@Test
	public void testIncorrect() 
	{
		F_C_F_S obj = new F_C_F_S();
		int arrExpected[][] = { {1,1,0,1,14}, {2,5,8,11,19}, {3,9,11,20,41}, {4,25,10,25,29} };
		int arrivalTime[] = {1,5,9,25};
		int jobSize[] = {12,7,2,5};
		int arrOutput[][] = obj.FCFS( arrivalTime, jobSize, jobSize.length );
		boolean bool = isArrayEqual( arrExpected, arrOutput );
		assertEquals("Incorrect", false, bool);
	}
}
