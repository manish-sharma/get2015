import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class SurveyTest {

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
		SurveyQuestion object1= new SurveyQuestion();
		String question1="Overall rating of student: Single select(1/2/3/4)";
		String result= object1.singleSelect();
		assertEquals(question1,result);
	}
	@Test
	public void test1() {
		Answer object2= new Answer();
		int result=2;
		object2.singleAnsSet(2,0);
		int res=object2.singleAnsGet(0);
		assertEquals(result,res);
	}
	
}
