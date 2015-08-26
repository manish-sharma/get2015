abstract class Matrix {
	protected int row, col;
	protected int Matrix[][], Transpose[][];;

	protected abstract void addMatrixElements();

	protected abstract void transposeMatrix();

	protected abstract void showOriginalOutputMatrix();

	protected abstract void showTransposeMatrix();

	protected Matrix() {

	}
}
