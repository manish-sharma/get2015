package oops_asignment_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTest {

	/*to check add element in the matrix at its position*/
	@Test
	public void test() {
	int noRows = 2  , noColumns = 2;
	Matrix object = new Matrix(noRows, noColumns);
	object.addElements(0, 0, 1);
	assertEquals("Match",1,object.data[0][0]);

	}
	
	/*to test transpose of matrix*/
	@Test
	public void test1() {
	int noRows = 2  , noColumns=2;
	Matrix object = new Matrix(noRows, noColumns);
	object.addElements(0, 0, 1);
	object.addElements(0, 1, 2);
	object.addElements(1, 0, 3);
	object.addElements(1, 1, 4);
	Matrix object2 = object.transpose();
	for(int index = 0 ; index<noRows ; index++)
		{
		for(int index2 = 0 ; index2 < noColumns ; index2++)
			{
				assertEquals("Match",object2.data[index][index2],object.data[index2][index]);
			}
		}
	}
	
	/*tested perfectly*/
}
