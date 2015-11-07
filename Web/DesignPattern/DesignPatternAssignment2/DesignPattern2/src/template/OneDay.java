package template;

/**
 * This class extends cricket class and overrides its abstract methods
 * 
 * @author Riddhi
 * 
 */
public class OneDay extends Cricket{
	 @Override
	   void endPlay() {
	      System.out.println("One Day Game Finished!");
	   }

	   @Override
	   void initialize() {
	      System.out.println("One Day Initialized! Start playing.");
	   }

	   @Override
	   void startPlay() {
	      System.out.println("One Day Game Started. Enjoy the game!");
	   }
}
