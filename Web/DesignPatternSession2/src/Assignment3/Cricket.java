/**
 * Write a Template class for different formats of Cricket.(Template Method)
 */
package Assignment3;

/**
 * @author Ravika
 * Template abstract class Cricket  
 */
public abstract class Cricket {
	
	protected abstract void initialization();
	protected abstract void startCricket();
	protected abstract void teaBreak();
	protected abstract void endCricket();
	
	/**
	 * template method maintaining order of game
	 */
	public final void play(){
		initialization();
		startCricket();
		teaBreak();
		endCricket();
	}
}
