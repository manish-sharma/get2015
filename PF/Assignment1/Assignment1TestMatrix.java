import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Assignment1TestMatrix {

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
	public void testAddElements() //Negative test case
	{

		int noOfRows=3,noOfCols=4;
		Assignment1Matrix mat = new Assignment1Matrix(noOfRows,noOfCols);
		int value=4;
		boolean isCorrect=mat.addElements(-1, 0, value);
		assertEquals(false, isCorrect);
	
	}
	@Test	
	public void testAddElements1() //Negative test case
	{

		int noOfRows=3,noOfCols=4;
		Assignment1Matrix mat = new Assignment1Matrix(noOfRows,noOfCols);
		int value=4;
		boolean isCorrect=mat.addElements(0, 4, value);
		assertEquals(false, isCorrect);
	
	}
	
	@Test()
	public void testTranspose()
	{	
		int noOfRows=2,noOfCols=2;
		Assignment1Matrix mat = new Assignment1Matrix(noOfRows,noOfCols);
		mat.addElements(0, 0, 1);
		mat.addElements(0, 1, 2);
		mat.addElements(1, 0, 3);
		mat.addElements(1, 1, 4);
		Assignment1Matrix transposeMatrix= mat.transpose();
		int ExpectedMatrix[][]={{1,3},{2,4}};
		boolean isEqual=isMatrixEqual(ExpectedMatrix,transposeMatrix.getData());
		assertEquals(true, isEqual);
		
		
	}
	
	private boolean isMatrixEqual(int[][] expectedMatrix, int[][]transposeMatrix)
	{
		
		for(int row=0;row<expectedMatrix.length;row++)
		{
			for(int col=0;col<expectedMatrix[row].length;col++)
			{
				if(expectedMatrix[row][col]!=transposeMatrix[row][col])
					return false;
			}
			
		}
		return true;
	}

}
