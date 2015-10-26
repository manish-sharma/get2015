package Assignment3;

public abstract class Cricket {
	abstract void initialize();
	abstract void startPlay();
	abstract void endPlay();
	
	//template method
	public final void play(){
	
		//initialize the game
		initialize();
	
		//start game
		startPlay();
	
		//end game
	      endPlay();
	}
}
