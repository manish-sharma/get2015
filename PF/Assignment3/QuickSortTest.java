/****************************************************************************************
Name            : QuickSort
Revision Log    : 2015-08-11: Babalu patidar : created.
                : 
                : 
Use             : This class is used to test sort an given array using quick sort .
                :
****************************************************************************************/

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class QuickSortTest {

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
        QuickSort quick=new QuickSort();
        int expected[]={2,5,8,9,10,11,55,77};
        int input[]={2,5,8,9,10,55,77,11};
        quick.sort(input, 0, 7);
          assertArrayEquals(expected,input);
    }

    @Test
    public void testForZero() {
        QuickSort quick=new QuickSort();
        int expected[]={};
        int input[]={};
        quick.sort(input, 0, -1);
          assertArrayEquals(expected,input);
    }



}