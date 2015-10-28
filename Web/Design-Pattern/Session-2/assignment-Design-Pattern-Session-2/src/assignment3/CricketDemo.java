package assignment3;

public class CricketDemo 
{
	public static void main(String[] args) {
			
			Cricket oneDayCricket = new OneDayCricket();
			oneDayCricket.play();
			System.out.println();
			
			Cricket t20Cricket = new T20Cricket();
			t20Cricket.play();
			System.out.println();
			
			Cricket testCricket = new TestCricket();
			testCricket.play();
			
		}

}
