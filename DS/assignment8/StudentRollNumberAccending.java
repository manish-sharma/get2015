package ds8;

import java.util.SortedSet;
import java.util.TreeSet;

/** this class takes roll number from user and store it in a tree set with no repeated value.
 * @author Khemanshu
 *
 */
public class StudentRollNumberAccending {
	
	SortedSet<Integer> rollNumbersTree = new TreeSet<Integer>();
	
	public SortedSet<Integer> getRollNumbersTree() {
		return rollNumbersTree;
	}


	public void setRollNumbersTree(SortedSet<Integer> rollNumbersTree) {
		this.rollNumbersTree = rollNumbersTree;
	}

	public String toString() {
		String displayString = "List of roll numbers is ";
		int count = 0;
		for(int rollNo: rollNumbersTree) {
			if(count == 0) {
				displayString+=rollNo;
				count++;
			}
			else
				displayString = displayString+", "+rollNo;
		}
		return displayString;
	}
	public static void main(String args[]) {
		StudentRollNumberAccending studentRollNumberAccending = new StudentRollNumberAccending();
		do{
			System.out.println("Enter your choice"
					+"\n 1. Add roll number"
					+"\n 2. view sorted Roll numbers"
					+"\n 3. Exit from system");
			int choice = Util.userChoice();
			switch(choice) {
			case 1:
				System.out.println("enter roll number");
				int rollNumber = Util.userChoice();
				if(studentRollNumberAccending.rollNumbersTree.contains(rollNumber)) {
					System.out.println(Error.rollNumberExist);
					break;
				}
				studentRollNumberAccending.rollNumbersTree.add(rollNumber);          //Adding roll number to tree by inbuilt function.
				break;
			case 2:
				//Printing all the nodes of tree, i.e roll numbers of students
				System.out.println(studentRollNumberAccending.toString());
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("enter correct choice");
				break;
			}
		}while(true);
	}
}
