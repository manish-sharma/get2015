package template;

/**
 * This class extends cricket class and overrides its abstract methods
 * 
 * @author Riddhi
 * 
 */
public class T20 extends Cricket {
	@Override
	void endPlay() {
		System.out.println("T20 Game Finished!");
	}

	@Override
	void initialize() {
		System.out.println("T20 Game Initialized! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("T20 Game Started. Enjoy the game!");
	}
}
