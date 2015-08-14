/****************************************************************************************
Name            : Matrix
Revision Log    : 2015-08-14: Babalu patidar : created.
                : 
Use             : This class is used to test of implement Matrix 
                :
****************************************************************************************/
import static org.junit.Assert.*;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MatrixTest {
	
	int noOfRow=3;
	int noOfColomn=2;
	int data[][]={{2,4},{5,6},{7,8}};
	int trans[][]={{2,5,7},{4,6,8}};
	Matrix matrix=new Matrix(3,2);
	
	
	

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
	//Test for show method
	public void testForShow() {
		for(int i=0;i<noOfRow;i++)
		{
			for(int j=0;j<noOfColomn;j++)
			{
				matrix.addElement(i, j, data[i][j]);
			}
		}
		for(int i=0;i<noOfRow;i++)
		{
			assertArrayEquals(data[i], matrix.showMatrix()[i]);
		}
	}
	//End of testForShow test
	//Test for tranpose method
	@Test
	public void testForTranspose(){
		for(int i=0;i<noOfRow;i++)
		{
			for(int j=0;j<noOfColomn;j++)
			{
				matrix.addElement(i, j, data[i][j]);
			}
		}
		for(int i=0;i<noOfColomn;i++)
		{
			assertArrayEquals(trans[i], matrix.matrixTranspose()[i]);
		}
		
	}
	//End of testForTranspose test
	

}
//End of class
