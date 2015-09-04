package question2;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SortingTest {

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
	public void testComparision() {
		LinearSort linearSortObject = new LinearSort();
		ComparsionSorting comparisonSortObject = new ComparsionSorting();
		Sorting sortingObject = new Sorting();

		BufferedReader bufferedReaderObject = new BufferedReader(
				new InputStreamReader(System.in));

		int array[] = null;
		int sortedArray[] = null ;
		try {
			System.out.println("Enter Your Choice for Algorithm Type: \n"
					+ "1. Comparision Sort \n" + "2. Linear Sort");
			int choice = Integer.parseInt(bufferedReaderObject.readLine());
			
			switch (choice) {
			case 1:
				array = sortingObject.takeInput();
				
				if(array.length <= 10) {
				sortedArray	= comparisonSortObject.bubbleSort(array);
				} else {
					sortedArray = comparisonSortObject.quickSort(array);
				}
				break;
			case 2:
				array = sortingObject.takeInput();
				int largest = 0;
				for(int value : array) {
					if(largest < value ) {
						largest = value;
					}
				}
				if(largest > 99 ) {
					sortedArray = linearSortObject.radixSort(array);
				}
				else {
					sortedArray = linearSortObject.countingSort(array);
				}
				break;
			default:
				System.out.println("Wrong Choice!!");
			}
		} catch (NumberFormatException exception) {
			System.out.println("Not A valid number!!");
		} catch (IOException exception) {
			System.out.println("Some Input / Output related error occured!!");
		}
		int expected[] = {2, 33, 231, 3432, 42313};
		
		assertArrayEquals(expected, sortedArray);
	}

}
