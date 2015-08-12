package nqueenproblem;

import java.util.*;

/**
 * @author Girdhari 
 * @since:12 August,2015
 * Program to implement N Queen Problem 
 **/
class Queens 
{
	static int[] position;// where the position of queens is stored
	int queens[][];
	/*Starting of Queens class constructor*/
	public Queens(int numberOfQueens) 
	{
		position = new int[numberOfQueens];
	}
	/*End of Queens class constructor*/

	/*Starting of main function*/
	public static void main(String[] args)
	{
		System.out.println("N QUEENS PROBLEM");
		System.out.println("Enter Number Of Queens");
		Scanner inputObject = new Scanner(System.in);
		int queens = inputObject.nextInt();
		Queens queenObject = new Queens(queens);
		int[][] resultArray = queenObject.callplaceNqueens();
		for (int row = 0; row < queens; row++) // traversal of row
		{
			for (int column = 0; column < queens; column++) // traversal of  column
			{
				if (position[row] == column) // matches the if value of position  is equal to column
				{
					System.out.print(" 1 ");
				} 
				else 
				{
					System.out.print(" 0 ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	/*End of main function*/
	
	/*Starting of printQueens function*/
	public int[][] printQueens(int[] position) 
	{
		int numberOfQueens = position.length;
		int array[][] = new int[numberOfQueens][numberOfQueens];
		for (int counter1 = 0; counter1 < numberOfQueens; counter1++)
		{
			for (int counter2 = 0; counter2 < N; counter2++) 
			{
				if (position[counter1] == counter2) 
				{
					array[counter1][counter2] = '1';// inputing the position of queens as 1
				} 
				else 
				{
					array[counter1][counter2] = '0';// inputs other position as 0
				}
			}
		}
		return array;
	}
   /*End of printQueens function*/
	
	/*Starting of canPlaceQueen function*/
	public boolean canPlaceQueen(int row, int count)
	{
		for (int counter = 0; counter < row; counter++) 
		{
			if (position[counter] == count || (counter - row) == (position[counter] - count)|| (counter - row) == (count - position[counter]))//checks the position
			{
				return false;
			}
		}
		return true;
	}
	/*Starting of canPlaceQueen function*/
	
   /*Starting of placeNqueens function*/
	public int[][] placeNqueens(int row, int numberOfQueens) 
	{
		for (int counter = 0; counter < numberOfQueens; counter++) 
		{
			if (canPlaceQueen(row, counter)) 
			{
				position[row] = counter;
				if (row == numberOfQueens - 1) 
				{
					queens = printQueens(position);
					return queens;
				} 
				else 
				{
					placeNqueens(row + 1, numberOfQueens);
				}
			}
		}
		return queens;
	}
	/*End of placeNqueens function*/
	
	/*Starting of callplaceNqueens*/
	public int[][] callplaceNqueens()
    {
		queens = placeNqueens(0, position.length);
		return queens;
	}
	/*End of callplaceNqueens*/

}
