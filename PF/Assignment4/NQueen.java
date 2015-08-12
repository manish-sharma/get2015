public class NQueen {

	static boolean solve(int row, int[][] board, int N) {
		if (row >= N) {
			return true;
		}
		for (int position = 0; position < N; position++) {
			if (isValid(board, row, position, N)) {
				board[row][position] = 1;
				if (!solve(row + 1, board, N)) {
					board[row][position] = 0;
				} else
					return true;
			}
		}
		return false;
	}

	static int[][] nQueen(int row, int[][] board, int N) {
		solve(row, board, N);
		return board;
	}

	static boolean isValid(int[][] board, int x, int y, int N) {
		int i, j;
		for (i = 0; i < x; i++) {
			if (board[i][y] == 1) {
				return false;
			}

		}

		i = x - 1;
		j = y - 1;
		while ((i >= 0) && (j >= 0)) {
			if (board[i--][j--] == 1) {
				return false;
			}
		}

		i = x - 1;
		j = y + 1;
		while ((i >= 0) && (j < N)) {
			if (board[i--][j++] == 1) {
				return false;
			}
		}

		return true;
	}
}
