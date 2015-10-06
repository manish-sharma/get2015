package Com.AdvanceDS.Question3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PuzzleTest1 {

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
	  public void testSimpleSolve() {
	    int[] validPuzzle = { 1, 0, 2, 4, 5, 3, 7, 8, 6 };
	    Puzzle puzzle = new Puzzle(validPuzzle);
	    puzzle.solve();
	    assertEquals("\n\n1 2 3 \n4 5 6 \n7 8   ", puzzle.state.toString());
	  }

	  @Test
	  public void testSolutionMessage() {
	    int[] validPuzzle = { 1, 0, 2, 4, 5, 3, 7, 8, 6 };
	    Puzzle puzzle = new Puzzle(validPuzzle);
	    puzzle.solve();
	    assertTrue(puzzle.state.solutionMessage().contains("Here are the steps to the goal state:\n" +
	        "\n" +
	        "1   2 \n" +
	        "4 5 3 \n" +
	        "7 8 6 \n" +
	        "\n" +
	        "1 2   \n" +
	        "4 5 3 \n" +
	        "7 8 6 \n" +
	        "\n" +
	        "1 2 3 \n" +
	        "4 5   \n" +
	        "7 8 6 \n" +
	        "\n" +
	        "1 2 3 \n" +
	        "4 5 6 \n" +
	        "7 8   \n" +
	        "\n" +
	        "Given puzzle is SOLVED!"));
	  }

	  @Test
	  public void testHeuristic() {
	    int[] test1 = { 1, 4, 3, 7, 8, 5, 6, 2, 0 };
	    int[] test2 = { 7, 0, 4, 8, 1, 6, 5, 3, 2 };
	    int[] test3 = { 6, 8, 4, 3, 7, 2, 1, 0, 5 };
	    assertEquals(10, Puzzle.getHeuristic(test1));
	    assertEquals(17, Puzzle.getHeuristic(test2));
	    assertEquals(19, Puzzle.getHeuristic(test3));
	  }
}
