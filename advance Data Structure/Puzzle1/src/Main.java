/**
 * Main class to take input of the puzzle.
 * @author Sanjay
 *
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("3*3 Sliding Puzzle\n");
		char choice;
		do
		{
		
		    int p[] = Utility.getArrayInput("Enter 8 sliding puzzle : ");
			Puzzle puzzle = new Puzzle(p);
			System.out.println("Given puzzle:\n"+ puzzle.state.toString());
			
			// Check if the puzzle is solvable.
			if (!puzzle.isSolvable()) 
			{
				System.out.println("Given puzzle:\n\nis NOT solvable!\n"+ puzzle.state.toString());
				System.exit(0);
			}
	
			// Solve the puzzle.
			puzzle.solve();
			choice = Utility.getCharacterInput("Do you want to continue press y otherwise n");
		}while(choice == 'y' || choice == 'Y');
	}
}
