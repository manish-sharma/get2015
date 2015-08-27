/***
 * 
* @author Dheeraj
 * Program to implement Matrix class that contains addElement, transpose, show methods
 */
public class Assignment1Matrix {
	int data[][];
	int noRows;
	int noCols;
	
	/* Start of Matrix class constructor */
	public Assignment1Matrix(int row, int col){
		this.noRows = row;
		this.noCols = col;
		data = new int[row][col];
	}
	/* End of Matrix class constructor */
	
	/* Start of addElement function */
	public boolean addElements(int row, int col, int val){
		if(row>=noRows||col>=noCols)
		{
			
			return false;
		}
		if(row<0||col<0)
		{
			return false;
		}
		data[row][col] = val;
		return true;
	}
	/* End of addElement function */
	
	/*Method to get data outside*/
	public int[][] getData()
	{
		return data;
	}
	

	/* Starting of transpose function */
	public Assignment1Matrix transpose(){
		Assignment1Matrix newobj=new Assignment1Matrix(noCols,noRows);
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
