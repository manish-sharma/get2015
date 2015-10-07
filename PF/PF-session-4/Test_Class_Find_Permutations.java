import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test_Class_Find_Permutations {

	Find_Permutations obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		obj=new Find_Permutations();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		 ArrayList<String> expected=new ArrayList<String>();
		 expected.add("21");
		 expected.add("21");
		 ArrayList<String> actual=new ArrayList<String>();
		
		 actual=obj.permutation1("12");
		 for (int i = 0; i < actual.size(); i++)
             assertEquals( expected.get(i),actual.get(i));
		 
		
		 
	}

	@Test
	public void test1() {
		 ArrayList<String> expected=new ArrayList<String>();
		 expected.add("12");
		 expected.add("21");
		 ArrayList<String> actual=new ArrayList<String>();
		
		 actual=obj.permutation1("12");
		 for (int i = 0; i < actual.size(); i++)
             assertEquals( expected.get(i),actual.get(i));
		 
		
		 
	}

}
