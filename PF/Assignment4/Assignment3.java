
public class Assignment3 {
	int[] tempArray;
	int array1[][];

	public Assignment3(int N) {
		tempArray = new int[N];
	}

	/**
	 * @param global array
	 * @return 2-Dimensional array of placed queen
	 */
	public int[][] placeQueens(int[] x) {
		int sizeOfMatrix = tempArray.length;
		int array[][]= new int[sizeOfMatrix][sizeOfMatrix];
		for (int i = 0; i < sizeOfMatrix; i++) {
			for (int j = 0; j < sizeOfMatrix; j++) {
				if (tempArray[i] == j) {
					array[i][j]='1';
				} else 
				{
					array[i][j]='0';
				}
			}
		}
		return array;
	}

	/**
	 * @param starting row
	 * @param dimension of matrix
	 * @return
	 */
	public boolean canPlaceQueen(int row, int c) {
		/**
		 * Returns TRUE if a queen can be placed in row r and column c.
		 * Otherwise it returns FALSE. x[] is a global array whose first (r-1)
		 * values have been set.
		 */
		for (int i = 0; i < row; i++) {
			if (tempArray[i] == c || (i - row) == (tempArray[i] - c) ||(i - row) == (c - tempArray[i])) 
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * @param startRow
	 * @param dimensionOfMatrix
	 * @return 2-Dimension matrix containing values
	 */
	public int[][] placeNqueens(int startRow, int dimensionOfMatrix) 
	{
		/**
		 * Using backtracking this method prints all possible placements of n
		 * queens on an n x n chessboard so that they are non-attacking.
		 */

		for (int count = 0; count < dimensionOfMatrix; count++) 
		{
			if (canPlaceQueen(startRow, count)) 
			{
				tempArray[startRow] = count;
				if (startRow == dimensionOfMatrix - 1) 
				{
					array1=placeQueens(tempArray);
					return array1;


				} 
				else 
				{
					placeNqueens(startRow + 1, dimensionOfMatrix);
				}
			}
		}
		return array1;
	}
}
