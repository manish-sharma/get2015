import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixTest 
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
	
	
	@Test
	/* test case for add elements */
	public void testAddElements()    
	{
		int row = 2, col = 2, val = 3;
		Matrix obj = new Matrix(row, col);
		obj.addElements(row-1, col-1, val);
		assertEquals("Matched", val, obj.data[row-1][col-1]);
	}
	
	
	/* checks if expected matrix after transpose matches the expected array or not, if yes return true */
	boolean isArrayEqual( int arrExpected[][], int data[][] , int row, int col)
	{
		for(int index1=0; index1<row; index1++)
		{
			for(int index2=0; index2<col; index2++)
			{
				if( arrExpected[index1][index2] != data[index1][index2] )
					return false;
			}
		}
		return true;
	}
	
	
	/* test case for transpose of matrix */
	@Test
	public void testTranspose() 
	{
		int row = 2, col = 2;
		int arrExpected[][] = { {1,3}, {2,4} };
		int arrInput[][] = { {1,2}, {3,4} };
		Matrix obj1 = new Matrix(row, col);
		for( int index1=0; index1<arrInput.length; index1++)
			for( int index2=0; index2<arrInput.length; index2++)
				obj1.addElements(index1, index2, arrInput[index1][index2]);
		Matrix obj2 = obj1.transpose();
		boolean bool = isArrayEqual( arrExpected, obj2.data , row, col);
		assertEquals( "Correct", true, bool );
	}	

}
