package Model;

public class TwentyTwenty extends Game {

	@Override
	public void startPlay() {
		System.out.println("Each Team will play for at most 20 overs\n"
				+ "The team that will make more runs will win");

	}

	@Override
	public void endPlay() {
		System.out.println("End of Game");
	}
}
