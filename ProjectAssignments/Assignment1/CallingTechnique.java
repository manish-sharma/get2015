package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class CallingTechnique {

	public static void main(String[] args) {
		CallingTechnique callingTechnique = new CallingTechnique();
		int firstValue = 34;

		Integer secondValue = new Integer(34);
		System.out.println(firstValue);
		callingTechnique.square(firstValue); // call by value call
		System.out.println(firstValue);

		List<Integer> listOfIntegers = new ArrayList<Integer>();
		listOfIntegers.add(firstValue);
		listOfIntegers.add(secondValue);
		System.out.println(listOfIntegers.toString());
		callingTechnique.addInList(listOfIntegers); // call by reference call
		System.out.println(listOfIntegers.toString());

	}

	private void square(int value) {
		value = value++;
	}

	private void addInList(List<Integer> listOfIntegers) {
		int result = listOfIntegers.get(0) + listOfIntegers.get(1);
		listOfIntegers.add(2, result);
	}

}
