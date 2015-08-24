// program to solve n- queen problem

import java.util.*;
public class nQueenProblem 
{
	public static void main(String[] args) 
	{
		int dimensionOfMatrix, startRow = 0,  board[][] = null ;
		boolean result;
		nQueenProblem obj = null;
		List<String> stringArray ;
		Scanner sc = null;
		try
		{
			System.out.println("Enter the dimension of matrix : ");
			sc = new Scanner(System.in);;
			dimensionOfMatrix = sc.nextInt();
			board = new int [dimensionOfMatrix][dimensionOfMatrix];
			obj = new nQueenProblem();
			System.out.println("Arrangement is as follows : ");
			result =  obj.nQueen(board, startRow, dimensionOfMatrix);
			System.out.println(result);
			for (int index1 = 0; index1 < dimensionOfMatrix; index1++)
		    {
		        for (int index2 = 0; index2 < dimensionOfMatrix; index2++)
		            System.out.print(board[index1][index2]+"\t");
		        System.out.println();
		    }
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(sc!=null)
				sc = null;
			if(obj!=null)
				obj = null;
			if(board!=null)
				board = null;
		}
	}
	
	
	boolean isSafe(int board[][], int row, int col, int dimensionOfMatrix)
	{
	    int index1, index2;

	    // Check this column has any value or not on up side
	    for (index1 = 0; index1 < row; index1++)
	    {
	        if (board[index1][col]!='\0')
	            return false;
	    }

	    // Check if upper diagonal on left side has any item or not
	    for (index1 = row, index2 = col; index1 >= 0 && index2 >= 0; index1--, index2--)
	    {
	        if (board[index1][index2]!='\0')
	            return false;
	    }
	    
	    // Check if lower diagonal on left side has any item or not 
	    for (index1 = row, index2 = col; index2 >= 0 && index1 < dimensionOfMatrix; index1++, index2--)
	    {
	        if (board[index1][index2]!='\0')
	            return false;
	    }

	    return true;
	}
	
	
	boolean nQueen( int board[][], int startRow, int dimensionOfMatrix )
	{ 
	    if (startRow >= dimensionOfMatrix)   // base case - all queens are placed so it returns true
	        return true;
	    for(int index = 0; index<dimensionOfMatrix; index++)   // In this row we place queen in all columns one by one to find correct position
	    {
	    	 // Check if queen can be placed on board[startRow][index] 
	    	if(isSafe(board, startRow, index, dimensionOfMatrix))
	    	{
	    		// Place this queen in board[startRow][index] 
	            board[startRow][index] = 1;

	            // recur to place rest of the queens 
	            if ( nQueen(board, startRow + 1, dimensionOfMatrix ) == true )
	                return true;

	            /* If placing queen in board[startRow][index] doesn't lead to a solution
	               then remove queen from board[startRow][index] */
	            board[startRow][index] = 0; // BACKTRACK

	    	}
	    }
	    // If queen can not be place in any row in this column column then return false 
        return false;
	}
	
	
}
