/**Title : Recursively solve the N Queens Problem for different values of N
 * 
 * @author Gaurav Saini
 */

import java.util.*;

public class NQueensProblem {

	
	static int[] x;
	int array1[][];
	
	public NQueensProblem(int N) {
        x = new int[N];
    }
	
	//main method
	public static void main(String[] args) {
		System.out.println("Enter no. of queens");
    	Scanner sc = new Scanner(System.in);
    	int queens = sc.nextInt();						//queens store the number of queens for the problem
        NQueensProblem obj1 = new NQueensProblem(queens); 
        obj1.callplaceNqueens();
        sc.close();  
	}
	
	
	//printQueens method prints the queens at correct non-conflicting positions
	public int[][] printQueens(int[] x) {
        int N = x.length;
        int array[][]= new int[N][N];				//array contains the correct positions of the queens
        for (int i = 0; i < N; i++) {				//marked by 1 and empty places marked  by 0
            for (int j = 0; j < N; j++) {
                if (x[i] == j) {
                   System.out.print(" 1 ");
                    array[i][j]='1';
                } else 
                {
                    System.out.print(" 0 ");
                    array[i][j]='0';
                }
            }
            System.out.println();
        }
      System.out.println();
       return array;							//returning the array containing queens placed at non-conflicting positions
    }
	
	public boolean canPlaceQueen(int r, int c) {
        /**
         * Returns TRUE if a queen can be placed in row r and column c.
         * Otherwise it returns FALSE. x[] is a global array whose first (r-1)
         * values have been set.
         */
        for (int i = 0; i < r; i++) {
            if (x[i] == c || (i - r) == (x[i] - c) ||(i - r) == (c - x[i])) 
            {
                return false;
            }
        }
        return true;
	}
	
	public int[][] placeNqueens(int r, int n) 
	{
        /**
         * Using backtracking this method prints all possible placements of n
         * queens on an n x n chess board so that they are non-attacking.
         */
		
		for (int c = 0; c < n; c++) 
        {
            if (canPlaceQueen(r, c)) 
            {
                x[r] = c;
                if (r == n - 1) 
                {
                    array1=printQueens(x);
                    return array1;
                    
                  
                } 
                else 
                {
                    placeNqueens(r + 1, n);
                }
            }
        }
        return array1;
    }

    public int[][] callplaceNqueens() {
        array1=placeNqueens(0, x.length);
        return array1;
        
    }
	
}