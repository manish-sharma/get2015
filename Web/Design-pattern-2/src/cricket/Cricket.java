/**
 * 
 */
package cricket;

/**
 * @author Suman
 *
 */
public abstract class Cricket {
	//Super class implementing different format of cricket 
	
	abstract void initialize();

	abstract void startPlay();

	abstract void endPlay();

	// template method used in different format of cricket
	public final void play() {
		
		// initialize cricket 
		initialize();

		// start  cricket
		startPlay();

		// end  cricket
		endPlay();
	}
}
