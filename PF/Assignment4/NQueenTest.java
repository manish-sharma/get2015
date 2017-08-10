import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NQueenTest {
	int[][] expected = new int[][] { { 0, 1, 0, 0 }, { 0, 0, 0, 1 },
			{ 1, 0, 0, 0 }, { 0, 0, 1, 0 } };

	int[][] expected2 = new int[][] { { 1, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0 },
			{ 0, 0, 0, 0, 1 }, { 0, 1, 0, 0, 0 }, { 0, 0, 0, 1, 0 } };

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

	public static boolean isArrayEqual(int expected[][], int output[][]) {
		boolean b = true;
		int loopCount1;
		int loopCount2;
		for (loopCount1 = 0; loopCount1 < expected.length; loopCount1++) {
			for (loopCount2 = 0; loopCount2 < expected.length; loopCount2++) {
				if (expected[loopCount1][loopCount2] != output[loopCount1][loopCount2])
					return false;
			}
		}
		return b;
	}

	@Test
	public void test() {
		int board[][] = new int[4][4];

		assertEquals(true,
				NQueenTest.isArrayEqual(expected, NQueen.nQueen(0, board, 4)));

		int board1[][] = new int[5][5];

		assertEquals(true,
				NQueenTest.isArrayEqual(expected2, NQueen.nQueen(0, board1, 5)));

	}

}
