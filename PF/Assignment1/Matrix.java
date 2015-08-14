/***
 * 
* @author Dheeraj
 * Program to implement Matrix class that contains addElement, transpose, show methods
 */
public class Matrix {
	int data[][];
	int noRows;
	int noCols;
	
	/* Start of Matrix class constructor */
	public Matrix(int row, int col){
		this.noRows = row;
		this.noCols = col;
		data = new int[row][col];
	}
	/* End of Matrix class constructor */
	
	/* Start of addElement function */
	public void addElements(int row, int col, int val){
		if(row>noRows||col>noCols)
		{
			System.out.println("Please enter valid index");
			System.exit(1);
		}
		data[row][col] = val;
	}
	/* End of addElement function */
	
	/*Method to get data outside*/
	public int[][] getData()
	{
		return data;
	}
	

	/* Starting of transpose function */
	public Matrix transpose(){
		Matrix newobj=new Matrix(noCols,noRows);
		for(int counterRow = 0; counterRow < noRows ; counterRow++){
			for(int counterCol = 0; counterCol < noCols ; counterCol++){
				
				newobj.data[counterCol][counterRow]=this.data[counterRow][counterCol];
			}
		}
		return newobj;
	
	}
	/*End of transpose function*/
	
	/*Start of show function*/
	public void show(){
		for(int row = 0 ; row < this.noRows ; row++){
			for(int col = 0 ; col < this.noCols ; col++){
				System.out.print(this.data[row][col]+" ");
			}
			System.out.println();
		}
		
	}
	/*End of show function*/
}
