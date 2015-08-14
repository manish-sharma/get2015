import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class matrixTest {

	matrix obj = new matrix(2, 3);

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
	// test for transpose
	public void test() {
		int[][] original = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] transpose = { { 1, 4 }, { 2, 5 }, { 3, 6 } };
		assertArrayEquals(transpose, obj.transpose(3, 2, original));
	}

	@Test
	// test for addElement
	public void test1() {
		int[][] originl = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] data = obj.addElement(2, 3);
		assertArrayEquals(originl, data);
	}
}
