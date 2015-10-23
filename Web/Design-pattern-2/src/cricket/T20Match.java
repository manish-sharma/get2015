/**
 * 
 */
package cricket;

/**
 * @author Suman
 *
 */
public class T20Match extends Cricket {

	@Override
	void initialize() {
		// method to initialize T-20 Match
		System.out.println("T-20 Match Initialized! Start playing..........\n");
	}

	@Override
	void startPlay() {
		// method defining play state of T-20 Match
		System.out.println("T-20 Match Started! Enjoy the game.............\n");
	}

	@Override
	void endPlay() {
		// method to end T-20 Match
		System.out.println("T-20 Match Finished!!!!!!!!!!!\n");
	}

}
