import java.util.*;
public class N_Queen
{
	static int[] check;					
	int resultArray[][];				
	
	public N_Queen(int numOfQueens) 
	{
        check = new int[numOfQueens];		// Array definition with size as noOFQueens
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter queens");
    	Scanner sc=new Scanner(System.in);							
    	int noOfQueens=sc.nextInt();								
        N_Queen queenObject = new N_Queen(noOfQueens); 	
        queenObject.callplaceNqueens();					
        sc.close();  							
	}
	
	/* this method print the queens in respective places */
	public int[][] printQueens(int[] itemArray) 
	{
        int noOfQueens = itemArray.length;
        int tempResult[][]= new int[noOfQueens][noOfQueens]; //temp result stores the 2D array for representation of queens
        for (int i = 0; i < noOfQueens; i++) {
            for (int j = 0; j < noOfQueens; j++) {
                if (itemArray[i] == j) {
                   System.out.print(" 1 ");
                    tempResult[i][j]='1';
                } else 
                {
                    System.out.print(" 0 ");
                    tempResult[i][j]='0';
                }
            }
            System.out.println();
        }
      System.out.println();
       return tempResult;		// returning the 2-D array tempResult that contain the representation of queens
	}
	
	public boolean canPlaceQueen(int row, int column) 
	{
        /**
         * Returns TRUE if a queen can be placed in row and column .
         * Otherwise it returns FALSE. check[] is a global array whose first (row-1)
         * values have been set.
         */
        for (int i = 0; i < row; i++) {
            if (check[i] == column || (i - row) == (check[i] - column) ||(i - row) == (column - check[i])) 
            {
                return false;			
            }
        }
        return true;		
	}
	
	
	/* this method places the queens in proper row and column after checking */
	public int[][] placeNqueens(int row, int noOfQueens) 
	{
        /**
         * Using backtracking this method prints all possible placements of
         * noOfQueens queens on an noOfQueens x noOfQueens chessboard so that they are non-attacking.
         */
		
		for (int count = 0; count < noOfQueens; count++) 
        {
            if (canPlaceQueen(row, count)) 
            {
                check[row] = count;
                if (row == noOfQueens - 1) 
                {
                    resultArray=printQueens(check);
                    return resultArray;
                    
                  
                } 
                else 
                {
                    placeNqueens(row + 1, noOfQueens);
                }
            }
        }
        return resultArray;
    }
	
    public int[][] callplaceNqueens() {
    	resultArray=placeNqueens(0, check.length);
        return resultArray;		
        	
    }
	
}
