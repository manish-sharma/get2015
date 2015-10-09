/**
 * @author Girdhari
 * Program to implement 3*3 sliding puzzle problem
 * Main class 
 * 
 */
package assignment3;

/* Starting of Main class */
public class Main {
	/* Starting of main method */
	public static void main(String[] args) {
		System.out.println("3*3 Sliding Puzzle\n");
		char choice;
		do {
			int puzzle[] = Utility.getArrayInput("Enter 8 sliding puzzle : ");
			Puzzle puzzleObject = new Puzzle(p);
			System.out.println("Given puzzle:\n"
					+ puzzleObject.state.toString());

			if (!puzzleObject.isSolvable()) {
				System.out.println("Given puzzle:\n\nis NOT solvable!\n"
						+ puzzleObject.state.toString());
				System.exit(0);
			}

			puzzleObject.solve();
			choice = Utility
					.getCharacterInput("Do you want to continue press y otherwise n");
		} while (choice == 'y' || choice == 'Y');
	}
	/* Ending of main method */
}
/* Ending of Main class */
