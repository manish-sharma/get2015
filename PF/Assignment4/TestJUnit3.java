import static org.junit.Assert.*;
import org.junit.Test;

public class TestJUnit3 {

	
	@Test
	public void test() {
		NQueen obj=new NQueen();
		int [][] board = new int [][] {
	             { 0,  0,  0,  0},
	              { 0,  0,  0,  0},
	              { 0,  0,  0,  0},
	              { 0,  0,  0,  0} };

	    Boolean result=obj.nQueen(board, 0, 4); 
	    Boolean exp=true;
	    assertEquals(exp ,result);
	}
	

}
