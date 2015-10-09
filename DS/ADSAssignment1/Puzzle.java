package SlidingPuzzle;

import java.util.*;

/**
 * This class contains logic and properties that are related to
 * a sliding puzzle.
 *
 * @author riddhi jain
 */
public class Puzzle {

	/** The initial state of the puzzle. */
	public State initialState;

	/** The current state of the puzzle. */
	public State state;

	/** The initial capacity of the queue. */
	static final int CAPACITY = 100;

	/** The priority queue used to solve the puzzle. */
	public final PriorityQueue<State> queue = new PriorityQueue<State>(CAPACITY, new Comparator<State>() {
		@Override
		public int compare(State o1, State o2) {
			return o1.f() - o2.f();
		}
	});

	/** A Hash set containing the states that have been visited. */
	public final HashSet<State> visited = new HashSet<State>();

	/**
	 * Constructor for puzzle class.
	 * @param puzzleInput Valid sliding puzzle in 2D array format.
	 */
	public Puzzle(int[] puzzleInput,int n) {
		this.initialState = new State(puzzleInput,n);
		this.state = this.initialState;
	}

	/**
	 * This method checks whether or not the puzzle object it
	 * is called on is a solvable puzzle or not.
	 * @return True if it is solvable, false if it is not.
	 */
	public boolean isSolvable() 
	{
		int inversions = 0;
		int[] p = this.state.array;
		
		for(int i = 0; i < p.length - 1; i++) 
		{
			for(int j = i + 1; j < p.length; j++)
			{
				if(p[i] > p[j])
				{
					inversions++;
				}
			}
			
			if(p[i] == 0 && i % 2 == 1)
			{
				inversions++;
			}
		}
		
		return (inversions % 2 == 0);
	}

	/**
	 * This method calculates the current heuristic for a puzzle's
	 * state. The heuristic it uses is the sum of the Manhattan Distance
	 * of each tile from where it is located to where is should be.
	 * @param array A puzzle state array.
	 * @return int - The heuristic for the current puzzle.
	 */
	public static int getHeuristic(int[] array,int n) 
	{
		int heuristic = 0;
		for(int i = 0; i < array.length; i++) 
		{
			if (array[i] != 0)
			{
				heuristic += getManhattanDistance(i, array[i],n);
			}
		}
		
		return heuristic;
	}

	/**
	 * This method calculates the Manhattan Distance between a tile's
	 * location and it's goal location.
	 * @param index The tile's current index.
	 * @param number The value of the tile.
	 * @return int - The distance between the tile and it's goal state.
	 */
	public static int getManhattanDistance(int index, int number,int n) 
	{
		return Math.abs((index / n) - ((number-1) / n)) + Math.abs((index % n) - ((number-1) % n));
	}

	/**
	 * This method handles adding the next state to the queue. It
	 * will only add the next state to the queue if it is a valid move
	 * and the state has not been visited previously.
	 * @param nextState
	 */
	private void addToQueue(State nextState) 
	{
		if(nextState != null && !this.visited.contains(nextState)) 
		{
			this.queue.add(nextState);
		}
	}

	/**
	 * This method handles the solving of the puzzle.
	 */
	public void solve(int n) 
	{
		// Clear the queue and add the initial state.
		queue.clear();
		queue.add(this.initialState);

		while(!queue.isEmpty()) 
		{
			// Get the best next state.
			this.state = queue.poll();

			// Check if the state is a solution.
			if (this.state.isSolved()) 
			{
				System.out.println(this.state.solutionMessage(n));
				return;
			}

			// Add this state to the visited HashSet so we don't revisit it.
			visited.add(state);

			// Add valid moves to the queue.
			this.addToQueue(Move.up(state,n));
			this.addToQueue(Move.down(state,n));
			this.addToQueue(Move.left(state,n));
			this.addToQueue(Move.right(state,n));
		}
	}

	public static void main(String[] args) {
		System.out.println("\t N X N Sliding Puzzle");
		char choice;
		do
		{	
			int n = Utility.getIntegerValue("Enter value of N");
			
		    int p[] = Utility.getArrayInput("Enter "+ n +"*"+n+" sliding puzzle : ",n);
			Puzzle puzzle = new Puzzle(p,n);
			System.out.println("Given puzzle:\n"+ puzzle.state.toString(n));
			
			// Check if the puzzle is solvable.
			if (!puzzle.isSolvable()) 
			{
				System.out.println("Given puzzle is NOT solvable!\n"+ puzzle.state.toString(n));
				System.exit(0);
			}
	
			// Solve the puzzle.
			puzzle.solve(n);
			choice = Utility.getCharacterInput("Do you want to contitnue press y otherwise n");
		}while(choice == 'y' || choice == 'Y');
	}
}
