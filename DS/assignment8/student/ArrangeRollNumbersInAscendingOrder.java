package student;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * purpose : to sort the roll number of students using tree sort
 * @author Ravika
 * @since 3/9/2015
 */

public class ArrangeRollNumbersInAscendingOrder {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Scan the number of students
		
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		System.out.print("Enter the Number of Students ");
		while(!scanner.hasNextInt()) {
			System.out.println("enter integer only ");
			scanner.next();
		}
		int numberOfStudents = scanner.nextInt();
		
		//Scan roll number of students and insert in the tree
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.print("Enter the Roll Number of Students ");
		for(int count = 0; count < numberOfStudents; count++) {
			while(!scanner.hasNextInt()) {
				System.out.println("enter integer only ");
				scanner.next();
			}
			int number = scanner.nextInt();
			if(list.contains(number)) {
				System.out.print("This roll number already inserted , please enter Other roll number : ");
				number = scanner.nextInt();
			}
			binarySearchTree.insert(number);
			list.add(number);
		}
		
		System.out.println("After Sorting ");
		binarySearchTree.inOrder(binarySearchTree.getRoot());
		scanner.close();
	}
}
