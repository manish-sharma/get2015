/*This method  transposes the matrix*
 * @author Shishir Pareek
 * date 13th August 2015*/

	import java.util.Scanner;

	public class MatrixTranspose {
	 int data[][];//global variable for data
	 int noOfRows;//number of Rows
	 int noOfCols;//numbers of Columns
	 /*Constructor*/
	  public MatrixTranspose(int noOfRows,int noOfCols){
	      this.noOfRows=noOfRows;
	      this.noOfCols=noOfCols;
	      data=new int[noOfRows][noOfCols];
	  }
	  /*add element to array*/
	  public void addElements(int rows,int cols,int val )
	  {
	     
	       data[rows][cols]=val;
	  }
	   /*transposing the matrix*/ 
	  public MatrixTranspose transpose()
	  {
	    MatrixTranspose matrixObject = new MatrixTranspose(noOfCols, noOfRows);
	     
	          for(int index=0;index<noOfRows;index++)
	          {
	              for(int index2=0;index2<noOfCols;index2++)
	              {
	                  matrixObject.data[index2][index]=data[index][index2];
	              }
	          }
	     
	     return matrixObject;
	  }
	  /*Function to show the transposed matrix*/
	  public void show()
	  {
	      for(int index=0;index<noOfRows;index++)
	      {
	          for(int index2=0;index2<noOfCols;index2++)
	          {
	              System.out.print(this.data[index][index2]);
	            
	              System.out.print("\t");
	          }
	          System.out.println();
	      }
	  }
	      public static void main(String args[])
	      {    
	           int val;
	           int row;
	           int col;
	           try
	           {
	           Scanner sc=new Scanner(System.in);
	           System.out.println("enter the number of Rows");
	           row=sc.nextInt();
	           System.out.println("enter the number of Columns");
	           col=sc.nextInt();
	           MatrixTranspose matrix=new MatrixTranspose(row, col);
	           System.out.println("Enter the values of matrix elements");
	           for(int index=0;index<row;index++)
	              {
	                  for(int index2=0;index2<col;index2++)
	                  {
	                      val=sc.nextInt();
	                      matrix.addElements(index,index2,val);
	                  }
	                 
	              }
	           
	           MatrixTranspose matrixObject2=matrix.transpose();
               matrixObject2.show();
	      }
	catch(Exception e)
	           {
		System.out .print("Invalid value!!! only integer vallues are allowed");
	           }
	      }
	}

