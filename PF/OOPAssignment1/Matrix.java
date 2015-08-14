
/**
 * @author Sumitra
 * this class is to get a matrix and to transpose the matrix and to print that.
 */
public class Matrix {
	 int data[][];
	 int noRows;
	 int noCols;
	 /**
	  * 
	  * @param row number of row for matrix
	  * @param col number of column for matrix
	  */
	 public Matrix(int row,int col){
	 this.noRows = row;
	 this.noCols = col;
	  data = new int[row][col];
	 }
	 /**
	  * 
	  * @param row number of row in which value is inserted
	  * @param col number of column in which value is to be inserted
	  * @param val the value top be set at index [row][col]
	  */
	 public void addElements(int row, int col, int val ) {
		 
	 data[row][col]=val;
		 
	 }
	 /**
	  * 
	  *  @return will return the matrix after transpose
	  */
	 public Matrix transpose(){
	 // matrix Transpose logic
		 Matrix mat=new Matrix(noCols,noRows);
		 
		 for(int i=0;i<mat.noRows;i++)
		 {
			 for(int j=0;j<mat.noCols;j++)
			 {
				 mat.data[i][j]=data[j][i];
			 }
		 }
		 return mat;
		 
	 }
	 /**
	  * this method is to print the whole matrix.
	  */
	 public void show() {//logic to display}
		 for(int i=0;i<noRows;i++)
		 {
			 for(int j=0;j<noCols;j++)
			 {
				 System.out.print(data[i][j]);
			 }
			 System.out.println();
		 }
	 }
	 

}
