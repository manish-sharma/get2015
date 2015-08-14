import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class MatrixTransposeTest {

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
	int noRows=2,noColumns=2;
	MatrixTranspose object=new MatrixTranspose(noRows, noColumns);
	object.addElements(0, 0, 1);
	assertEquals("Match",1,object.data[0][0]);

	}
	@Test
	public void test1() {
	int noRows=2,noColumns=2;
	MatrixTranspose object=new MatrixTranspose(noRows, noColumns);
	object.addElements(0, 0, 1);
	object.addElements(0, 1, 2);
	object.addElements(1, 0, 3);
	object.addElements(1, 1, 4);
	MatrixTranspose object2=object.transpose();
	for(int index=0;index<noRows;index++)
	{
	for(int index2=0;index2<noColumns;index2++)
	{
	assertEquals("Match",object2.data[index][index2],object.data[index2][index]);
	}
	}
	}

}
