/* This class contain the puzzle function call
 * @author Banwari Kevat
 */
public class Pmain {
	public static void main(String[] args) {
		int[] input;
		Puzzle puzzle = null;

		// Retrieve input based on argument length.
		if (args.length == 0) {
			puzzle = new Puzzle(Puzzle.getConsoleInput());
		} else {
			input = Puzzle.readFromFile(args[0]);
			puzzle = (args.length == 1) ? new Puzzle(input) : new Puzzle(input, args[1]);
		}

		// Check if the puzzle is solvable.
		if (!puzzle.isSolvable()) {
			System.out.printf("Given puzzle:%s\n\nis NOT solvable!\n", puzzle.state.toString());
			System.exit(0);
		}

		// Solve the puzzle.
		puzzle.solve();
	}

}