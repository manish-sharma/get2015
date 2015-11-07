package oop1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixTest {

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
	int isEqual(int[][] expected, int[][] actual)
	{
		int comp=1;
		for(int count=0;count<expected.length;count++)
		{
			for(int count1=0;count1<expected[0].length;count++)
			{
				if(expected[count][count1]!=actual[count][count1])
					comp=0;
			}
		}
		return comp;
	}
	@Test
	public void test() {
		Matrix obj=new Matrix(3,2);
		MatrixTest assign=new MatrixTest();
		int[][] dataa={{2,3,5},{4,9,8}};
		obj.data=dataa;
		Matrix obj1=obj.transpose();
		assertEquals(obj,obj1);
	}

}
