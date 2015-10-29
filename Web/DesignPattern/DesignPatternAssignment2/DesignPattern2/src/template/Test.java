package template;

/**
 * This class extends cricket class and overrides its abstract methods
 * 
 * @author Riddhi
 * 
 */
public class Test extends Cricket {
	 @Override
	   void endPlay() {
	      System.out.println("Test Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("Test Game Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("Test Game Started. Enjoy the game!");
	   }
}
