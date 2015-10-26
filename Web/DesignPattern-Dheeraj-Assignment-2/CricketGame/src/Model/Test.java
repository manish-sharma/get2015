package Model;

public class Test extends Game{

	@Override
	public void startPlay() {
		System.out.println("5 Day Game started");
	}

	@Override
	public void endPlay() {
		System.out.println("End of Game");
	}
}
