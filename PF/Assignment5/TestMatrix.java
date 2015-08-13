package Assignment5;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Arushi
 * For testing matrix cases
 *
 */
public class TestMatrix {

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

	/**
	 * Junit Test Case for Transpose
	 */
	/**
	 * 
	 */
	@Test
	public void test() {

		int expected[][] = new int[2][2];
		Matrix matrix = new Matrix(2, 2);
		int a[][] = { { 1, 2 }, { 3, 4 } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				expected[j][i] = a[i][j];
				matrix.addElements(i, j, a[i][j]);
			}
		}
		Matrix output = matrix.transpose();
		for (int i = 0; i < expected.length; i++) {
			assertArrayEquals(expected[i], output.data[i]);

		}
	}

	/**
	 * Junit Test Case for add elements
	 */
	/**
	 * 
	 */
	@Test
	public void test1() {

		Matrix matrix = new Matrix(2, 2);

		int a[][] = { { 1, 2 }, { 3, 4 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				matrix.addElements(i, j, a[i][j]);
			}
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				assertEquals(a[i][j], matrix.data[i][j]);
			}
		}
	}
}
