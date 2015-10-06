/**
 * Test class to test the puzzle.
 * @author Sanjay
 */

import org.junit.*;


import static org.junit.Assert.*;

public class PuzzleTest {

 

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
  public void testHeuristic1() {
    int[] test1 = { 1, 4, 3, 7, 8, 5, 6, 2, 0 };
    assertEquals(10, Puzzle.getHeuristic(test1));
  }
  
  @Test
  public void testHeuristic2() {
    int[] test2 = { 7, 0, 4, 8, 1, 6, 5, 3, 2 };
    assertEquals(17, Puzzle.getHeuristic(test2));
  }
  
  @Test
  public void testHeuristic3() {
    int[] test3 = { 6, 8, 4, 3, 7, 2, 1, 0, 5 };
    assertEquals(19, Puzzle.getHeuristic(test3));
  }
}
