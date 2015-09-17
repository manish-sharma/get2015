import org.junit.Test;

import static org.junit.Assert.*;

public class TestJUnit1 {
	MatrixClass matrixClass;
    int arr[][];
	
    @Test
	public void testForShowFunction() {
    	matrixClass=new MatrixClass(3,3);
    	arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    	matrixClass.addElement(arr);
    	int expected[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
    	assertArrayEquals(expected,matrixClass.showMatrix());
    	
    }
   
	
	@Test
	public void testForTranspose() {
		matrixClass=new MatrixClass(3,3);
		arr=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		matrixClass.addElement(arr);
		MatrixClass transposedMatrix=matrixClass.transpose();
		
		
		int arr1[][]=new int[][]{{1,4,7},{2,5,8},{3,6,9}};
		assertArrayEquals(transposedMatrix.data, arr1);
		
	}
	
}
