import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Assignment1TestMatrix {

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
	public void test() {
		
		Matrix mat = new Matrix(3,4);
		mat.addElements(0, 0, 1);
		mat.addElements(0, 1, 2);
		mat.addElements(0, 2, 3);
		mat.addElements(0, 3, 4);
		mat.addElements(1, 0, 5);
		mat.addElements(1, 1, 6);
		mat.addElements(1, 2, 7);
		mat.addElements(1, 3, 8);
		mat.addElements(2, 0, 9);
		mat.addElements(2, 1, 10);
		mat.addElements(2, 2, 11);
		mat.addElements(2, 3, 12);
		Matrix transposeMatrix= mat.transpose();
		int ExpectedMatrix[][]={{1,5,9},{2,6,10},{3,7,11},{4,8,12}};
		boolean isEqual=isMatrixEqual(ExpectedMatrix,transposeMatrix.getData());
		int check=0;
		if(isEqual)
			check=1;
		assertEquals(1, check);
	//transposeMatrix.show();
	}

	private boolean isMatrixEqual(int[][] expectedMatrix, int[][]transposeMatrix) {
		
		for(int row=0;row<expectedMatrix.length;row++)
		{
			for(int col=0;col<expectedMatrix[row].length;col++)
			{
				if(expectedMatrix[row][col]!=transposeMatrix[row][col])
					return false;
			}
			
		}
		return true;
	}

}
