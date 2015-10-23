/**
 * 
 */
package cricket;

/**
 * @author Suman
 *
 */
public class OneDayMatch extends Cricket{

	@Override
	void initialize() {
		// method to initialize One Day Match
		System.out.println("One Day Match Initialized! Start playing..........\n");
	}

	@Override
	void startPlay() {
		// method defining play state of  One Day Match
		System.out.println("One Day Match Started! Enjoy the game.............\n");
	}

	@Override
	void endPlay() {
		// method to end  One Day Match
		System.out.println("One Day Match Finished!!!!!!!!!!!\n");
	}

}
