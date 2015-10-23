package com.designpattern.assignment3;
/**This is an abstract class which is used to show the how the Template Design Pattern works 
 * 
 * @author Shishir
 *Date 23rd October 2015
 */
public abstract class Cricket {
	abstract void intializeGameType();
	abstract void startGame();
	abstract void getGameDetails();
	abstract void endGame();
	/**Template Design Function
	 * 
	 */
	public final void start(){
		
		intializeGameType();
		
		startGame();
	
		getGameDetails();
		
		endGame();
		
	}
}
