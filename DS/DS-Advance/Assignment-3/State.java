/**
 * @author Girdhari
 * Program to implement 3*3 sliding puzzle problem
 */

package assignment3;

import java.util.Arrays;

/* Starting of State class */
public class State {

	public int[] array = new int[9];

	public int blankIndex;

	private int g;

	private int h;

	private State previous;

	public State(int[] input) {
		this.array = input;
		this.blankIndex = getIndex(input, 0);
		this.previous = null;
		this.g = 0;
		this.h = Puzzle.getHeuristic(this.array);
	}

	public State(State previous, int blankIndex) {
		this.array = Arrays.copyOf(previous.array, previous.array.length);
		this.array[previous.blankIndex] = this.array[blankIndex];
		this.array[blankIndex] = 0;
		this.blankIndex = blankIndex;
		this.g = previous.g + 1;
		this.h = Puzzle.getHeuristic(this.array);
		this.previous = previous;
	}

	public static int getIndex(int[] array, int value) {
		for (int i = 0; i < array.length; i++)
			if (array[i] == value)
				return i;
		return -1;
	}

	public boolean isSolved() {
		int[] p = this.array;
		for (int i = 1; i < p.length - 1; i++)
			if (p[i - 1] > p[i])
				return false;

		return (p[0] == 1);
	}

	public String toString() {
		int[] state = this.array;
		String s = "\n\n";
		for (int i = 0; i < state.length; i++) {
			if (i % 3 == 0 && i != 0)
				s += "\n";
			s += (state[i] != 0) ? String.format("%d ", state[i]) : "  ";
		}
		return s;
	}

	public String allSteps() {
		StringBuilder sb = new StringBuilder();
		if (this.previous != null)
			sb.append(previous.allSteps());
		sb.append(this.toString());
		return sb.toString();
	}

	public String solutionMessage() {
		StringBuilder sb = new StringBuilder();
		sb.append("Here are the steps to the goal state:");
		sb.append(this.allSteps());
		sb.append("\n\nGiven puzzle is SOLVED!");
		sb.append("\nSolution took " + this.g + " steps.\n");
		return sb.toString();
	}

	public int g() {
		return this.g;
	}

	public int h() {
		return this.h;
	}

	public int f() {
		return g() + h();
	}

	/* Starting of getPrevious method */
	public State getPrevious() {
		return this.previous;
	}
	/* Ending of getPrevious method */

}
/* Ending of State Class */
