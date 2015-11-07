package Assignment3;

public class PlayCricket {
	public static void main(String args[]) {
		Cricket cricket = new TestCricket();
		cricket.play();
		System.out.println();
		cricket = new OneDayCricket();
		cricket.play();
		System.out.println();
		cricket = new T20Cricket();
		cricket.play();
	}

}
