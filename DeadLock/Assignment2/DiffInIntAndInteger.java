package Assignment2;

public class DiffInIntAndInteger {
	public static void main(String args[]) {
		int firstValue = 1;
		Integer secondInteger = new Integer(2);
		String secondIntegerString = secondInteger.toString() + " I am now String";
		//String firstIntegerString = firstValue.toString;         here we can't change int to string whereas Integer Object can be
		System.out.println(secondIntegerString);
		System.out.println(firstValue  + " : I am still integer");
	}
}
