import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MatrixTest {

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
	public void matrixTransposeTest() {
		int[] input []={{1,2},{3,4}};
		int[] expected[]={{1,3},{2,4}};
		boolean b= new MatrixTest().isArrayEqual(expected ,input);
		assertTrue(b);
	}
	public	boolean	isArrayEqual(int []expected[] ,int []actual[])
	{ 
		int flag=0;
		for(int count1=0;count1<2;count1++)
			for(int count2=0;count2<2;count2++)
			{
				if(expected[count1][count2]==actual[count1][count2])
					flag=0;
				else
					flag=1;
	        }
		if(flag==0)
			return true;
		else 
			return false;
	}
	@Test
	public void matrixTransposeTest2() {
		int[] input []={{1,2,3},{4,5,6},{7,8,9}};
		int[] expected[]={{1,4,7},{2,5,8},{3,6,9}};
		boolean b= new MatrixTest().isArrayEqual1(expected ,input);
		assertTrue(b);
	}
	public	boolean	isArrayEqual1(int []expected[] ,int []actual[])
	{ 
		int flag=0;
		for(int count1=0;count1<3;count1++)
			for(int count2=0;count2<3;count2++)
			{
				if(expected[count1][count2]==actual[count1][count2])
					flag=0;
				else
					flag=1;
	        }
		if(flag==0)
			return true;
		else 
			return false;
	}
	
	
}
