/**
 * 
 */
package cricket;

/**
 * @author Suman
 *
 */
public class TestMatch extends Cricket {

	@Override
	void initialize() {
		// method to initialize Test Match
		System.out.println("Test Match Initialized! Start playing..........\n");
	}

	@Override
	void startPlay() {
		// method defining play state of  Test Match
		System.out.println("Test Match Started! Enjoy the game.............\n");
	}

	@Override
	void endPlay() {
		// method to end  Test Match
		 System.out.println("Test Match Finished!!!!!!!!!!!\n");
	}
	
}
