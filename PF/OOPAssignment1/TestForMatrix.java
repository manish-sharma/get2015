import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestForMatrix {

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
	public void testForMatrixOfTwo() {
		int expected[][]=new int[2][2];
		Matrix matrix=new Matrix(2,2);
		int a[][]={{1,2},{3,4}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				expected[j][i]=a[i][j];
				matrix.addElements(i, j, a[i][j]);
			}
		}
	   Matrix output=matrix.transpose();
	   for(int i=0;i<expected.length;i++)
	   {
		   assertArrayEquals(expected[i],output.data[i]);
	   }
	}
	@Test
	public void testForAddElement()
	{
		
		Matrix matrix=new Matrix(2,2);
		int expected[][]={{1,2},{3,4}};
		for(int i=0;i<expected.length;i++)
		{
			for(int j=0;j<expected[i].length;j++)
			{
				
				matrix.addElements(i, j, expected[i][j]);
			}
		}
	   for(int i=0;i<expected.length;i++)
	   {
		   assertArrayEquals(expected[i],matrix.data[i]);
	   }
	}

}
