public class Result_Matrix extends Marix_Implementation {

	public Result_Matrix(int row, int col) {
		super(row, col);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void showOriginalOutputMatrix() {
		// TODO Auto-generated method stub
		System.out.println("Original Output Matrix Is :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(Matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	@Override
	protected void showTransposeMatrix() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Original Output Matrix Is :");
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(Transpose[i][j] + " ");
			}
			System.out.println();
		}

	}

}
