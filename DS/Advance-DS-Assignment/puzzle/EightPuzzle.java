package puzzle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/*************************************************************************
 * Compilation: javac EightPuzzle.java Execution: java EightPuzzle Dependencies:
 * MinPQ.java
 * 
 * AI solution to N-by-N slider puzzle using heuristic function which is depth
 * in tree plus number of tiles out of position.
 * 
 * Note: integer 0 corresponds to blank cell
 * 
 * Goal state is of the following form and is hard wired into the dist() and
 * manhattan() methods.
 * 
 * 1 2 3 4 5 6 7 8
 * 
 *************************************************************************/

public class EightPuzzle implements Comparable<EightPuzzle> {

	private static int N;
	private String[] names = null;
	private static int totalEnqueued;
	private int[][] solved;
	private int moves;
	private int[][] tiles;
	private EightPuzzle parent;
	private int priority;
	private int distance;
	int zeroLocX = 0;
	int zeroLocY = 0;

	// allocate separate memory for new tiles array
	EightPuzzle(int[][] tiles) {
		System.out.println(tiles.length);
		N = tiles.length;
		this.tiles = new int[N][N];
		this.solved = new int[N][N];
		this.names = new String[N * N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				this.tiles[i][j] = tiles[i][j];
			}
		}

		int count = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				this.solved[i][j] = count;
				count++;
			}
		}
		this.solved[N - 1][N - 1] = 0;
		for (int i = 1; i < N * N; i++)
			this.names[i] = i + "";
		this.names[0] = " ";
	}

	EightPuzzle(int[][] tiles, EightPuzzle parent, int moves) {
		this.tiles = new int[N][N];
		this.solved = new int[N][N];
		this.names = new String[N * N];
		int count = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				this.solved[i][j] = count;
				count++;
			}
		}
		this.solved[N - 1][N - 1] = 0;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				this.tiles[i][j] = tiles[i][j];
		this.parent = parent;
		this.moves = moves;
		for (int i = 1; i < N * N; i++)
			this.names[i] = i + "";
		this.names[0] = " ";
		priority();
	}

	// priority
	/**
	 * @return
	 */
	public int priority() {
		int manhatDist = 0;
		for (int x = 0; x < N; x++)
			for (int y = 0; y < N; y++) {
				manhatDist += posDiff(x, y, tiles[x][y] / N, (tiles[x][y] - 1)
						% N);
				/*
				 * switch (tiles[x][y]) {
				 * 
				 * case 1: manhatDist += posDiff(x, y, 0, 0); break; case 2:
				 * manhatDist += posDiff(x, y, 0, 1); break; case 3: manhatDist
				 * += posDiff(x, y, 0, 2); break; case 4: manhatDist +=
				 * posDiff(x, y, 1, 0); break; case 5: manhatDist += posDiff(x,
				 * y, 1, 1); break; case 6: manhatDist += posDiff(x, y, 1, 2);
				 * break; case 7: manhatDist += posDiff(x, y, 2, 0); break; case
				 * 8: manhatDist += posDiff(x, y, 2, 1); break; case 0:
				 * manhatDist += posDiff(x, y, 2, 2); break; default: break; }
				 */

			}
		this.priority = manhatDist + moves;
		return priority;
	}

	private int posDiff(int xPos, int yPos, int xGoal, int yGoal) {
		int diff = Math.abs(xPos - xGoal);
		diff += Math.abs(yPos - yGoal);

		return diff;
	}

	// which board position is closer to the goal board position
	/**
	 * (non-Javadoc) see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(EightPuzzle b) {
		if (b.distance() == distance()) {
			for (int i = 0; i < N; i++) {
				if (!(Arrays.equals(b.getBoard()[i], this.getBoard()[i]))) { // if
																				// any
																				// elements
																				// are
																				// different,
																				// we
																				// know
																				// the
																				// arrays
																				// are
																				// not
																				// equal
					if (b.priority() > priority()) // but we still need to know
													// whether to return a -1 or
													// 1
						return -1;
					return 1;
				}
			}
			return 0; // if we make it here they are equal
		} else if (b.priority() > priority()) // if the distances are different
			return -1;
		else
			return 1;
	}

	/**
	 * @return
	 */
	public int[][] getBoard() {
		return tiles;
	}

	// does board position equal goal position?
	/**
	 * @return
	 */
	public boolean isSolved() {
		// your implementation
		for (int i = 0; i < N; i++) {
			if (!(Arrays.equals(tiles[i], solved[i]))) {
				return false;
			}

		}
		return true;
	}

	// for NxN expansion...not quite complete yet.
	public int[][] findGoalState() {
		int[][] solved = new int[N][N];
		int nums = 1;

		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++) {
				solved[i][j] = nums;
				nums++;
				if (nums == (N * N)) {
					solved[N - 1][N - 1] = 0;
					break;
				}
			}
		return solved;
	}

	// return sum of Manhattan distances of tiles to their proper position
	private int distance() {
		this.distance = priority() - moves;
		return this.distance;
	}

	private int getZeroXLoc() {
		for (int x = 0; x < N; x++)
			for (int y = 0; y < N; y++)
				if (tiles[x][y] == 0) {
					zeroLocX = x; // finding our zero so we can begin moving
									// tiles
					zeroLocY = y;
				}
		return zeroLocX;
	}

	private int getZeroYLoc() {
		getZeroXLoc();
		return zeroLocY;
	}

	private void assignZeroLoc() {
		getZeroYLoc();
	}

	// return the neighboring board positions
	/**
	 * @return
	 */
	public EightPuzzle[] neighbors() {
		ArrayList<EightPuzzle> tempneighbors = new ArrayList<EightPuzzle>();

		assignZeroLoc(); // determines both x and y loc's of the zero

		for (int i = -1; i < 2; i++) { // creating all surrounding x coordinates
			int p = zeroLocX + i; // current array being looked at
			if (p < 0 || p > N - 1)
				continue; // meaning these squares are out of bounds
			for (int j = -1; j < 2; j++) {
				int q = zeroLocY + j; // current index in current array
				if (q < 0 || q > N - 1 || (p == zeroLocX && q == zeroLocY) || // if
																				// we
																				// are
																				// out
																				// of
																				// bounds
																				// or
																				// at
																				// the
																				// same
																				// square
						((Math.abs(zeroLocX - p) + Math.abs(zeroLocY - q))) > 1) // or
																					// if
																					// delta
																					// x
																					// +
																					// delta
																					// y
																					// is
																					// greater
																					// than
																					// 1,
																					// aka
																					// at
																					// a
																					// diagonal
																					// space
					continue; // skip this iteration

				int[][] temptiles = new int[N][N];

				for (int m = 0; m < N; m++)
					temptiles[m] = Arrays.copyOf(tiles[m], N); // copy the
																// original
																// board

				int tempQ = temptiles[p][q]; // store the value of the value to
												// swap
				temptiles[p][q] = 0; // place the 0 in a valid location
				temptiles[zeroLocX][zeroLocY] = tempQ; // place the stored value
														// to swap where the 0
														// was
				EightPuzzle neighbor = new EightPuzzle(temptiles, this,
						this.moves + 1); // create a new 8 puzzle
				tempneighbors.add(neighbor); // add it to the arraylist
				totalEnqueued++;

			}

		}

		EightPuzzle[] neighbors = new EightPuzzle[tempneighbors.size()];

		return tempneighbors.toArray(neighbors);
	}

	// print parents in reverse order
	/**
 * 
 */
	public void showPath() {
		if (parent != null)
			parent.showPath();
		System.out.println("Move #" + moves + " Priority = " + priority);
		System.out.println(toString());
	}

	// print details of puzzle
	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				s += names[tiles[i][j]] + " ";
			s += "\n";
		}
		return s;
	}

	/**
	 * @return
	 */
	public boolean isSolvable() {
		int[] row = new int[(N * N) - 1];
		int rowIndex = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (tiles[i][j] != 0) {
					row[rowIndex] = tiles[i][j];
					rowIndex++;
				}
			}
		}

		int inversions = 0;
		for (int x = 0; x < row.length; x++) {
			for (int y = x; y < row.length; y++)
				if (row[x] > row[y])
					inversions++;
		}
		return inversions % 2 == 0;
	}

	/***********************************************************************
	 * Test routine.
	 **********************************************************************/
	public static void main(String[] args) {

		// 6 moves
		int[][] easy0 = { { 1, 2, 3 }, { 7, 0, 5 }, { 8, 4, 6 } }; // <1 second
		int[][] hard0 = { { 0, 8, 7 }, { 2, 5, 1 }, { 3, 6, 4 } }; // 5.5
																	// minutes
		int[][] hard1 = { { 4, 5, 0 }, { 6, 8, 7 }, { 1, 2, 3 } }; // 5.5
																	// minutes
		int[][] medium0 = { { 2, 3, 1 }, { 7, 0, 8 }, { 6, 5, 4 } }; // 1 second
		int[][] medium1 = { { 1, 2, 3 }, { 8, 0, 4 }, { 7, 6, 5 } }; // 1 second
		int[][] medium2 = { { 1, 2, 3 }, { 7, 0, 4 }, { 8, 6, 5 } }; // 2
																		// seconds
		int[][] twentytwo = { { 4, 8, 2 }, { 3, 6, 5 }, { 1, 7, 0 } };
		// int[][] puzzle
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter N : ");
		int N = scan.nextInt();

		System.out
				.println("Please enter the NxN grid in the format \n\"XXX \n XXX  \n XXX\" where X is a number between 0 and 8");
		int[][] userIn = new int[N][N];
		// userIn = easy0;

		try {

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					userIn[i][j] = scan.nextInt();
				}
			}

		} catch (Exception e) {
			System.out
					.println("Please restart the program and enter the gridin the correct format");
			System.exit(0);
		}

		EightPuzzle x = new EightPuzzle(userIn);
		System.out.println(x);

		ArrayList<EightPuzzle> pq = new ArrayList<EightPuzzle>();
		pq.add(x);

		int nodes = 0;
		ArrayList<EightPuzzle> seen = new ArrayList<EightPuzzle>();
		// Stopwatch sw = new Stopwatch();
		while (!pq.isEmpty()) {
			ArrayList<EightPuzzle> ar = pq;

			Collections.sort(ar);

			x = ar.get(0);
			pq.remove(x); // get the minimum key

			if (nodes == 0) {
				if (!x.isSolvable()) {
					System.out
							.println("This is an unsolvable puzzle, please enter a solvable one");
					System.exit(0);
				}
			}
			nodes++;

			// TODO:make this faster, maybe a binary search tree instead of
			// arraylist
			for (int i = 0; i < seen.size(); i++) { // make sure we aren't back
													// tracking.
				if (x.compareTo(seen.get(i)) == 0) {
					ar = pq;
					Collections.sort(ar);
					if (!ar.isEmpty()) {
						x = ar.get(0);
						pq.remove(x); // get the minimum key
					}
				}
			}

			seen.add(x); // add to the nodes we've seen

			if (x.isSolved()) {
				// System.out.println(sw.elapsedTime());
				break;
			}

			EightPuzzle[] neighbors = x.neighbors(); // find and add all
														// neighbors
			for (int i = 0; i < neighbors.length; i++) {
				// System.out.println("neighbors");
				if (!(x.compareTo(neighbors[i]) == 0)
						&& neighbors[i].isSolvable())
					pq.add(neighbors[i]);
			}
		}
		System.out.println("Total nodes enqueued = " + totalEnqueued);
		System.out.println("Nodes expanded = " + nodes);
		x.showPath();
	}

}