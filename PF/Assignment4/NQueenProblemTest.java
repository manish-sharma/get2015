package programingFundamental4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NQueenProblemTest {

	NQueenProblem assign = new NQueenProblem();
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
	public void CheckForNQueen()
	{
		int[][] board = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };
		int[][] exResponse = new int[][] { { 0, 0, 1, 0 }, { 1, 0, 0, 0 }, { 0, 0, 0, 1 }, { 0, 1, 0, 0 } };
		NQueenProblem.NUMBER_OF_COLUMNS=board[0].length;
		boolean NqueenResponse = assign.nQueen(board, 0);
		if (NqueenResponse) // if true then check for processed matrix
			Assert.assertEquals(1, isArrayEqual(board, exResponse));
		else
			fail("No solution Found");

	}

	static int isArrayEqual(int expected[][], int output[][])
	{
		int result = 1;
		int row = expected.length;
		for (int i = 0; i < row; i++)
			for (int j = 0; j < 4; j++)
				if (expected[i][j] != output[i][j])
				{
					result = 0;
					break;
				}

		return result;
	}

}
