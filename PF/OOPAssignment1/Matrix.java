
public class Matrix {
	 int data[][];
	 int noRows;
	 int noCols;
	 public Matrix(int row,int col){
	 this.noRows = row;
	 this.noCols = col;
	  data = new int[row][col];
	 }
	 public void addElements(int row, int col, int val ) {
		 
	 data[row][col]=val;
		 
	 }
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
