package MatrixAss;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import MatrixAss.Matrix1;

public class JunitTest {

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
	public void testForMatrix()        // Positive Junit Test for matrix operations
	{

	   Matrix1 matrix=new Matrix1(2,2);
	   int expected[][]={{1,2},{3,4}};
	   
	    for(int i=0;i<expected.length;i++)
	     {
	       for(int j=0;j<expected[i].length;j++)
	       {

	        matrix.addElement(i, j, expected[i][j]);
	        }
	     }
	    for(int i=0;i<expected.length;i++)
	    {
	      assertArrayEquals(expected[i],matrix.data[i]);
	    }
	}
	/*@Test
	/*public void testForNagative()           //  Nagative Junit Test for matrix operations
	{ 

	   Matrix1 matrix=new Matrix1(2,2);
	   int expected[][]={{1,2},{3,4}};
	   
	    for(int i=0;i<expected.length;i++)
	     {
	       for(int j=0;j<expected[i].length;j++)
	       {

	        matrix.addElement(i, j, expected[i][j]);
	        }
	     }
	     int expected1[][]={{1,2,3},{3,4}};
	    for(int i=0;i<expected.length;i++)
	    {
	      assertArrayEquals(expected1[i],matrix.data[i]);
	    }
	}*/


}
