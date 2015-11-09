/*Here we implement the matrix class having collection of function for manipulating matrices  .
* @author  Neha Bansal
* @version 1.0
* @since   2015-08-14
*/
public class MatrixClass 
{
	int data[][];
	int noOfRows;
	int noOfCol;
	
	/*It is the Constructor of class.It will called automatically when we create object of class.
	 *
	 * @param noOfRows
	 * @param noOfCol
	 */
	public MatrixClass(int noOfRows, int noOfCol)
	{
		
		this.noOfRows = noOfRows;
		this.noOfCol = noOfCol;
		data=new int[noOfRows][noOfCol];
	}
	
	/*It is the function of class which add elements in matrix.
	 *
	 * @param arr
	 */
	public void addElement(int[][]arr)
	{
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				data[i][j]=arr[i][j];
	}
	
	/*It is the function of class which return transpose matrix of given matrix.
	 *
	 * @return matrix
	 */
	public MatrixClass transpose()
	{
		MatrixClass matrix=new MatrixClass(this.noOfCol,this.noOfRows);
		for(int i=0;i<this.noOfRows;i++)
			for(int j=0;j<this.noOfCol;j++)
				matrix.data[j][i]=this.data[i][j];
		 
		return matrix;
		
	}
	/*It is the function of class which return matrix of Object.
	 *
	 * @return data
	 */
	public int[][] showMatrix()
	{
		return data;
		
	}
	public static void main(String args[])
	{
		MatrixClass ob=new MatrixClass (0,0);
		int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		ob.addElement(arr);
		int arr1[][]=ob.showMatrix();
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
				System.out.print(arr[i][j]+"  ");
			System.out.println();
		}
		
		
	}
	
	
		

}
