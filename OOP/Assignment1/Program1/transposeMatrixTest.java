import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class transposeMatrixTest {

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
	public void test1() 
	{
		transposeMatrix object= new transposeMatrix(3,3);
		int matrix1[][]={{1,2,3},
				         {4,5,6},
				         {7,8,9}};
		int matrix2[][]={{1,4,7},
		         		 {2,5,8},
		         		 {3,6,9}};
		int matrix3[][]= object.addElements(3,3);
		int matrix4[][]= object.transpose(3,3,matrix2);
		assertArrayEquals(matrix1,matrix3);
		assertArrayEquals(matrix2,matrix4);
		
	}
	
}
