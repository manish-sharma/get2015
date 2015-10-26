package Model;

public abstract class Game {

	public void initialize() {
		System.out.println("Game is ready to Play");
	}

	public abstract void startPlay();

	public abstract void endPlay();

	public void play() {
		initialize();
		startPlay();
		endPlay();
	}
}
