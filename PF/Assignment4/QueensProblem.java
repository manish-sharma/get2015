
import java.util.*;

/**
* Program to solve queens problem
* 
* @author Sumitra
*/
public class QueensProblem {

static int[] x;
int array1[][];

public QueensProblem(int N) {
x = new int[N];
}

public static void main(String[] args) {

System.out.println("Enter queens");
Scanner sc = new Scanner(System.in);
int queens = sc.nextInt();
if ((queens == 2) || (queens == 3)) {
System.out.println("Please enter right values");
} else {
QueensProblem Q = new QueensProblem(queens);

Q.callplaceNqueens();

System.out.println();
}
sc.close();
}

/**
* Program to print queens board as per the no of queens
* 
* 
* @return->array of placed queens
*/
public int[][] printQueens(int[] x) {
int N = x.length;
int array[][] = new int[N][N];
for (int i = 0; i < N; i++) {
for (int j = 0; j < N; j++) {
if (x[i] == j) {
System.out.print(" 1 ");
array[i][j] = '1';
} else {
System.out.print(" 0 ");
array[i][j] = '0';
}
}
System.out.println();
}
System.out.println();
return array;
}

/**
* Returns TRUE if a queen can be placed in row r and column c. Otherwise it
* returns FALSE. x[] is a global array whose first (r-1) values have been
* set.
*/
public boolean canPlaceQueen(int r, int c) {

for (int i = 0; i < r; i++) {
if (x[i] == c || (i - r) == (x[i] - c) || (i - r) == (c - x[i])) {
return false;
}
}
return true;
}

/**
* 
* Using backtracking this method prints all possible placements of n queens
* on an n x n chessboard so that they are non-attacking.
* 
* @param r
*            ->row value
* @param n
*            ->no of queen to be placed
* @return->position of queens
*/
public int[][] placeNqueens(int r, int n) {

for (int c = 0; c < n; c++) {
if (canPlaceQueen(r, c)) {
x[r] = c;
if (r == n - 1) {
array1 = printQueens(x);
return array1;

} else {
placeNqueens(r + 1, n);
}
}
}
return array1;
}

/**
* Program to call the recursive function which do backtracking to find all
* cases
*/
public int[][] callplaceNqueens() {
array1 = placeNqueens(0, x.length);
return array1;

}

}
