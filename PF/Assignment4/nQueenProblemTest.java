import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class nQueenProblemTest 
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
	public void testPositive1()    // for dimension of matrix = 4
	{
		nQueenProblem obj = new nQueenProblem();
		boolean expected = true;
		int dimensionOfMatrix = 4;    // can be any number
		int startRow = 0;
		int board[][] = new int [dimensionOfMatrix][dimensionOfMatrix];
		int expectedMatrix[][] = { {0,1,0,0}, {0,0,0,1}, {1,0,0,0}, {0,0,1,0}};
		boolean output = obj.nQueen(board, startRow, dimensionOfMatrix);
		assertEquals("Matched", expected, output);

		for (int index1 = 0; index1 < dimensionOfMatrix; index1++)
	    {
	        for (int index2 = 0; index2 < dimensionOfMatrix; index2++)
	        	assertEquals("Matched", expectedMatrix[index1][index2], board[index1][index2]);
	    }
	}

}
