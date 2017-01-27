/**
 * This interface describe the cricket
 * @author Banwari
 *
 */
public abstract class Cricket {
	  abstract void initialise();
	  abstract void startPlay();
	  abstract void endPlay();
	  //templet method
	  public final void play()
	  {
		  initialise();
		  startPlay();
		  endPlay();
	  }
}
