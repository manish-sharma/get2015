/**
 * @author Girdhari
 * Program to solve 3*3 sliding puzzle problem
 */

package assignment3;

import java.util.*;

/* Starting of Puzzle class */
public class Puzzle {

	public State initialState;

	public State state;

	static final int CAPACITY = 100;

	public final PriorityQueue<State> queue = new PriorityQueue<State>(
			CAPACITY, new Comparator<State>() {
				@Override
				public int compare(State stateObject1, State stateObject2) {
					return stateObject1.f() - stateObject2.f();
				}
			});

	public final HashSet<State> visited = new HashSet<State>();

	/* Constructor */
	public Puzzle(int[] puzzleInput) {
		this.initialState = new State(puzzleInput);
		this.state = this.initialState;
	}

	/* Starting of isSolvable method */
	public boolean isSolvable() {
		int inversions = 0;
		int[] puzzle = this.state.array;

		for (int counter = 0; counter < puzzle.length - 1; counter++) {
			for (int j = counter + 1; j < puzzle.length; j++) {
				if (puzzle[counter] > puzzle[j]) {
					inversions++;
				}
			}

			if (puzzle[counter] == 0 && counter % 2 == 1) {
				inversions++;
			}
		}

		return (inversions % 2 == 0);
	}

	/* Ending of isSolvable method */

	/* Starting of getHeuristic method */
	public static int getHeuristic(int[] array) {
		int heuristic = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				heuristic += getManhattanDistance(i, array[i]);
			}
		}

		return heuristic;
	}

	/* Ending of getHeuristic method */

	/* Starting of getManhattanDistance method */
	public static int getManhattanDistance(int index, int number) {
		return Math.abs((index / 3) - ((number - 1) / 3))
				+ Math.abs((index % 3) - ((number - 1) % 3));
	}

	/* Ending of getManhattanDistance method */

	/* Starting of addToQueue method */
	private void addToQueue(State nextState) {
		if (nextState != null && !this.visited.contains(nextState)) {
			this.queue.add(nextState);
		}
	}

	/* Ending of addToQueue method */

	/* Starting of solve method */
	public void solve() {
		queue.clear();
		queue.add(this.initialState);

		while (!queue.isEmpty()) {
			this.state = queue.poll();

			if (this.state.isSolved()) {
				System.out.println(this.state.solutionMessage());
				return;
			}

			visited.add(state);

			this.addToQueue(Move.up(state));
			this.addToQueue(Move.down(state));
			this.addToQueue(Move.left(state));
			this.addToQueue(Move.right(state));
		}
	}
	/* Ending of solve method */
}
