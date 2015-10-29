package template;

/**
 * This class shows template design pattern is followed in the classes
 * 
 * @author Riddhi
 * 
 */
public class CricketMain {

	public static void main(String[] args) {
		Cricket game = new T20();
		game.play();
		System.out.println();
		game = new Test();
		game.play();
		System.out.println();
		game = new OneDay();
		game.play();

	}

}
