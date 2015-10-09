/**
 * @author Girdhari
 * Program to solve 3*3 sliding puzzle problem 
 */
package assignment3;

/* Starting of Move class */
public class Move {
	
	/* Starting of up method */
	public static State up(State state) {
		if (state.blankIndex > 2) {
			return new State(state, state.blankIndex - 3);
		}

		return null;
	}
	/* Ending of up method */
	/* Starting of down method */
	public static State down(State state) {
		if (state.blankIndex < 6) {
			return new State(state, state.blankIndex + 3);
		}

		return null;
	}
	/* Ending of down method */
	
	/* Starting of left method */
	public static State left(State state) {
		if (state.blankIndex % 3 > 0) {
			return new State(state, state.blankIndex - 1);
		}

		return null;
	}
	/* Ending of left method */
	/* Starting of right method */
	public static State right(State state) {
		if (state.blankIndex % 3 < 2) {
			return new State(state, state.blankIndex + 1);
		}
		return null;
	}
	/* Ending of right method */
}
