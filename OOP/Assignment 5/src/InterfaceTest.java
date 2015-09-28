import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



 public class InterfaceTest 
 {  /**
		 * creates the object
		 **/
 
  @BeforeClass
  public static void setUpBeforeClass() throws Exception
  {
	    
  /*** clears the test case after execution
  @throws Exception
  **/
   }
 
  @AfterClass 
  public static void tearDownAfterClass() throws Exception
  {
  }
   /**
   * creates the object
   **/
  @Before
  public void setUp() throws Exception 
  {
  } /*** cleans the object tested **/
  @After
  public void tearDown() throws Exception 
  { 
  }
/**
* Name:test
* Description: checks the value returned
**/
@SuppressWarnings("deprecation")
@Test
   public void test()
   {
	Shape obj=new Square(5);
	double expected=25.0;
	double actual=obj.getArea();
	assertEquals(expected,actual,0);
   }
	/**
	 * Name:test1
	 * Description: checks the value returned
	 **/
	@SuppressWarnings("deprecation")
	@Test
	public void test1()
	{
	 Shape obj=new Circle(5);
	 double expected=75.0;
	 double actual=obj.getArea();
	 assertEquals(expected,actual,0);
	}
	
}
