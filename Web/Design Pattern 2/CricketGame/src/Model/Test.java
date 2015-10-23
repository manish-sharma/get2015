package Model;
/**
 * This class information specific to Test cricket
 * @author Sanjay
 * Date Created : 22/10/2015
 */
public class Test extends Game{

	/** Method for start playing */
	@Override
	public void startPlay() {
		System.out.println("5 Day Game started");
	}

	/** Method for end playing */
	@Override
	public void endPlay() {
		System.out.println("End of Game");
	}
}
