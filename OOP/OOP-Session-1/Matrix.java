/*
 *This class contains the matrix functions
 * addElement method gives the functionality of adding element 
 * Transpose of matrix can be receive
 * Here actually Matrix is implement in two dimensional array format
 */
import java.util.*;

public class Matrix {
	/** maxRow and maxCol are the Maximum size of rows and columns of a matrix */
	private int matrix[][];
    private int maxRow, maxCol;
    
    /** Parametreized constructor which takes number of rows and columns as parameter */
    Matrix(int x, int y) {
    	maxRow=x;
    	maxCol=y;
    	matrix= new  int[maxRow][maxCol];
    }
    
    /** this method take position where item should be placed */
    void addElement(int r, int c, int item) {
    	matrix[r][c]=item;
    }
    
    /** returning of rth row and cth column element  */
    int getElement(int r, int c) {
    	return matrix[r][c];
    }
    
    
    /** method for returning transpose of matrix */
    int[][] transpose(){
    	
    	int[][] Tmatrix= new int[maxCol][maxRow];
    	for(int i=0;i<maxCol;i++) {
    		for(int j=0;j<maxRow;j++) {
    			Tmatrix[i][j]=matrix[j][i];
    		}
    	}
    	return Tmatrix;
    }
    
	/** It is for returning matrix for printing */
    int[][] showMatrix(){
    	return matrix;
    }
    
    
    public static void main(String [] hfhd) throws Exception{
    	
		try {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter the number of row and colomn of matrix"); 
    	/** for take input for number of rows and number of column */
    	System.out.println("Number of rows: ");
    	int row=sc.nextInt();
    	System.out.println("Number of coloumns: ");
    	int col=sc.nextInt();
    	/*
    	 * matx1 is a object of class Matrix
    	 * parameterised constructor is called for row=3 and column= 4
    	 */    	
    	Matrix matx1= new Matrix(row,col);
    	
    	/*
    	 * entry of elements in array
    	 */
    	System.out.println("Enter "+row*col+" Elements in array: ");
    	for(int i=0;i<row;i++) {
    		for(int j=0;j<col;j++) {
    			matx1.addElement(i,j,sc.nextInt());
    		}
    	}

    	
    	/*
    	 * printing of element of array
    	 */
    	System.out.println("Array is: ");
    	for(int i=0;i<row;i++) {
    		for(int j=0;j<col;j++) {
    			System.out.print(matx1.getElement(i,j)+" ");
    		}
    		System.out.println("");
    	}
    	
    	
    	/** It is for printing transpose of array tmat[][] */
    	System.out.println("\nTranspose of Array is: ");
    	int[][] Tmat=matx1.transpose();
    	   
    	for(int i=0;i<col;i++) {
    		for(int j=0;j<row;j++) {
    			System.out.print(Tmat[i][j]+" ");
    		}
    		
    		/** new line */
    		System.out.println(""); 
    	}
    	
		}	
    }
       

}
