import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test_Class_Matrix_Implementation {
	Matrix_Implementation obj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_AddMatrixElements() {
		int row,col;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter total no. of rows in matrix");
		row=Integer.parseInt(scan.nextLine());
		System.out.println("Enter total no. of columns in matrix");
		col=Integer.parseInt(scan.nextLine());
		Matrix_Implementation obj=new Matrix_Implementation(row,col);
		int ActualMatrix[][]=obj.addMatrixElements();
		int row1,col1;
		System.out.println("Enter total no. of rows in expected matrix");
		row1=Integer.parseInt(scan.nextLine());
		System.out.println("Enter total no. of columns in expected matrix");
		col1=Integer.parseInt(scan.nextLine());
		int ExpectedMatrix[][]=new int[row1][col1];
		System.out.println("Enter Elements of Expected Matrix");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				ExpectedMatrix[i][j]=Integer.parseInt(scan.nextLine());
			}
		}
		assertArrayEquals(ExpectedMatrix,ActualMatrix );
		
	}
	
	@Test
	public void test_transposeMatrix() {
		int row,col;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter total no. of rows in original matrix");
		row=Integer.parseInt(scan.nextLine());
		System.out.println("Enter total no. of columns in original matrix");
		col=Integer.parseInt(scan.nextLine());
		Matrix_Implementation obj=new Matrix_Implementation(row,col);
		int ActualMatrix[][]=obj.transposeMatrix();
		int row1,col1;
		System.out.println("Enter total no. of rows in expected transpose matrix");
		row1=Integer.parseInt(scan.nextLine());
		System.out.println("Enter total no. of columns in expected transpose matrix");
		col1=Integer.parseInt(scan.nextLine());
		int ExpectedMatrix[][]=new int[row1][col1];
		System.out.println("Enter Elements of Expected transpose Matrix");
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<col1;j++)
			{
				ExpectedMatrix[i][j]=Integer.parseInt(scan.nextLine());
			}
		}
		assertArrayEquals(ExpectedMatrix,ActualMatrix );
	}	
	
}
