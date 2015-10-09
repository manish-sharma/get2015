/** 
 * @author Girdhari
 * LinkedListMain class contains main function to provide user interface
 */
package question3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinkedListMain {

	public static void main(String args[]) {
		LinkedList linkedList = new LinkedList();
		Node startNode = null;
		int data;
		do {
			System.out.println("Enter positive number");
			data = readData();
			startNode = linkedList.insertNode(startNode, data);
			System.out.println("Do you want to add more number( Press 1 other to exit )");
			data = readData();
			if (data == 1)
				continue;
			break;
		} while (true);
		System.out.println("Number in list are");
		linkedList.displayList(startNode);
	}

	public static int readData() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int data = 0;
		do {
			try {
				data = Integer.parseInt(br.readLine());
			} catch (IOException io) {
				System.out.println("Error occured please enter input again");
				continue;
			} catch (NumberFormatException nf) {
				System.out.println("Please enter correct input");
				continue;
			}
			if (data < 0) {
				System.out.println("Please enter positive no");
				continue;
			}
			break;
		} while (true);
		return data;
	}
}
