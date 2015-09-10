package ds8;

import java.util.ArrayList;
import java.util.List;

/**This class is use to take input of list and then return back a list to calling function.
 * @author Khemanshu
 */
public class ListInput {
	
	public List<Integer> inputOfList() {
		List<Integer> list = new ArrayList<Integer>();
		int choice = 1;
		do{
			System.out.println("enter only integer in list");
			list.add(Util.arrayListInput());
			System.out.println("for enter one more element enter 1");
			choice = Util.userChoice();
		}while(choice == 1);
		
		return list;
	}
}
