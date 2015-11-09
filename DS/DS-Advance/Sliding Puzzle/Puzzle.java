package Puzzle;

import java.io.*;
import java.util.*;

public class Puzzle {

 
  public State initialState;

  
  public State state;

  
  static final int CAPACITY = 100;

 
  private String outFile;

 
  public final PriorityQueue<State> queue = new PriorityQueue<State>(CAPACITY, new Comparator<State>() {
    public int compare(State o1, State o2) {
      return o1.f() - o2.f();
    }
  });

  
  public final HashSet<State> visited = new HashSet<State>();

 
  public Puzzle(int[] puzzleInput) {
    this.initialState = new State(puzzleInput);
    this.state = this.initialState;
  }

  
  public static boolean isValid(String puzzleInput)
  {
    if (puzzleInput.length() == 17) 
    {
      // Check if duplicates exist in the input.
      HashSet<Integer> lump = new HashSet<Integer>();
      for(String s : puzzleInput.split(" "))
      {
		int i = Integer.parseInt(s);
		if (lump.contains(i) || i > 8)
			return false;
		lump.add(i);
      }
      return true;
    }
    return false;
  }

  
  public static int[] getConsoleInput()
  {
    System.out.println("\nEnter a valid 8-puzzle below:");
    Scanner scanner = new Scanner(System.in);

    String t = handleBlankSpaces(scanner.nextLine());
    String m = handleBlankSpaces(scanner.nextLine());
    String b = handleBlankSpaces(scanner.nextLine());

    return convertToArray(String.format("%s %s %s", t, m, b));
  }

  
  
  public static int[] convertToArray(String s) 
  {
	    if (!isValid(s))
	    {
	      System.out.println("Invalid 8-puzzle entered!");
	      System.exit(0);
	    }
	    int[] p = new int[9];
	    s = s.replace(" ", "");
	    for(int i = 0; i < s.length(); i++)
	      p[i] = Integer.parseInt(Character.toString(s.charAt(i)));
	    return p;
 }

  public static String handleBlankSpaces(String row) 
  {
    row = row.replaceAll("\\s+$", "");
    if (row.length() == 3)
    	row += " 0";
    row = row.replace("   ", " 0 ").replace("  ", "0 ");
    System.out.println("row "+row);
    return row.trim();
  }

 
  public void writeToFile(String content) throws IOException 
  {
    File f = new File(this.outFile);
    if (!f.exists()) f.createNewFile();

    FileWriter fw = new FileWriter(f.getAbsoluteFile());
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write(content);
    bw.close();
  }


  public static int getHeuristic(int[] array)
  {
    int heuristic = 0;

    for(int i = 0; i < array.length; i++) {
      if (array[i] != 0)
        heuristic += getManhattanDistance(i, array[i]);
    }
    return heuristic;
  }

 
  public static int getManhattanDistance(int index, int number) {
    return Math.abs((index / 3) - ((number-1) / 3)) + Math.abs((index % 3) - ((number-1) % 3));
  }

  
  private void addToQueue(State nextState) {
    if(nextState != null && !this.visited.contains(nextState)) this.queue.add(nextState);
  }

  
  public void solve() {
    // Clear the queue and add the initial state.
    queue.clear();
    queue.add(this.initialState);
    long startTime = System.currentTimeMillis();

    while(!queue.isEmpty()) {
      // Get the best next state.
      this.state = queue.poll();

      // Check if the state is a solution.
      if (this.state.isSolved()) {
        if(this.outFile != null) {
          try { // Write to the file.
            this.writeToFile(this.state.solutionMessage(startTime));
          } catch (IOException e) {}
        } else { // Print to the console.
          System.out.println(this.state.solutionMessage(startTime));
        }
        return;
      }

      // Add this state to the visited HashSet so we don't revisit it.
      visited.add(state);

      // Add valid moves to the queue.
      this.addToQueue(Move.up(state));
      this.addToQueue(Move.down(state));
      this.addToQueue(Move.left(state));
      this.addToQueue(Move.right(state));
    }
  }

  public static void main(String[] args) {
    int[] input;
    Puzzle puzzle = null;

    // Retrieve input based on argument length.
    if (args.length == 0){
      puzzle = new Puzzle(getConsoleInput());
    } 

    // Check if the puzzle is solvable.
    if (!puzzle.isSolvable()) {
      System.out.printf("Given puzzle:%s\n\nis NOT solvable!\n", puzzle.state.toString());
      System.exit(0);
    }

    // Solve the puzzle.
    puzzle.solve();
  }


  public boolean isSolvable()
  {
    int inversions = 0;
    int[] p = this.state.array;

    for(int i = 0; i < p.length - 1; i++)
    {
      for(int j = i + 1; j < p.length; j++)
        if(p[i] > p[j]) 
        	inversions++;
      	if(p[i] == 0 && i % 2 == 1)
      		inversions++;
    }
    return (inversions % 2 == 0);
  }

}