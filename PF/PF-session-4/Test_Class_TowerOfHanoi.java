/*This test class will test the fn movementsInToh() 
 * which is defined in class TowerOfHanoi 
 */
import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Test_Class_TowerOfHanoi {
	TowerOfHanoi obj;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	obj=new TowerOfHanoi();
	}

	@After
	public void tearDown() throws Exception {
	}

	//this fn will test the fn movementsInToh() f defined in class TowerOfHanoi
	@Test
	public void test() {
		Scanner scan;
		scan=new Scanner(System.in);
		String source1="source1";
        String destination3="destination3";
        String auxiliary2="auxiliary2";
        int n;
        System.out.println("Enter total no. of disk");
        n=Integer.parseInt(scan.nextLine());
       
        ArrayList<String> expectedMovementsList=new ArrayList<String>((int) ((Math.pow(2, n))-1));
      
    
        System.out.println("Enter expected movements list in form of \nsource1/auxiliary2/destination3->source1/auxiliary2/destination3");
        String string=new String();
         for(int i=0;i<(int) ((Math.pow(2, n))-1);i++)
         {
        	 string=scan.nextLine();
        	 expectedMovementsList.add(string);
        
         }
         ArrayList<String> actualMovementsList=new ArrayList<String>((int) ((Math.pow(2, n))-1));
         actualMovementsList=obj.movementsInToh(n, source1, auxiliary2, destination3);
       
        
         //it will compare the expected output with actual output
       
         for (int i = 0; i < actualMovementsList.size(); i++)
             assertEquals( expectedMovementsList.get(i),actualMovementsList.get(i));	}

}
