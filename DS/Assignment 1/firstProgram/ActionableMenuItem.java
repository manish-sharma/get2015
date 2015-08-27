package firstProgram;
import java.util.Scanner;

public class ActionableMenuItem implements MenuItem {

	Scanner sc = new Scanner(System.in);
	String displayText;
	int num,y=1;

	// ArrayList newArray = new ArrayList();

	public ActionableMenuItem(String displayText) {
		this.displayText = displayText;
	}

	@Override
	public void display() {
		System.out.println(displayText);

	}

	@Override
	public void takeActions(int choice) {
		switch(choice){
		case 1: 
		System.out.println("Enter number which u want to insert");
		num=sc.nextInt();
		newArray.add((Integer)num);
		break;
		
		case 2:System.out.println("Enter element to be added");
		num=sc.nextInt();
		System.out.println("Enter position");
		
		case 3:System.out.println("Enter the element to be searched");
		num=sc.nextInt();
		System.out.println("Index is:"+newArray.retrieve(num));
		break;
		
		case 4:System.out.println("Enter the element to be searched");
		num=sc.nextInt();
		System.out.println("Enter starting position");
		int pos=sc.nextInt();
		System.out.println("Index is:"+newArray.retrieveItemsBasedOnLocation(num, pos));
		break;
		
		case 5:System.out.println("Enter the index of item to be removed");
		pos=sc.nextInt();
		System.out.println("Item removed is:"+newArray.remove(pos));
		System.out.println("Updated Array:\n");
		newArray.display();
		
		case 6:System.out.println("Enter item to be removed");
		num=sc.nextInt();
		break;
		
		case 7:newArray.clear();
		newArray.display();
		break;
		
		case 8:System.out.println("Reversed array is");
		newArray.reverse();
		newArray.display();
		break;
		
		case 9:newArray.sort();
		System.out.println();
        for(int i=0;i<newArray.size();i++){
            System.out.print(newArray.get(i)+" ");
        }
            break;
            
            case 10:ArrayList secondArray=new ArrayList();
            do
            {
            System.out.println("Enter elements in the array");
            int item=sc.nextInt();
            secondArray.add(item);
            System.out.println("Press 1 to add more");
            y=sc.nextInt();
            }while(y==1);
            newArray.mergeLists(secondArray);
            break;
 
		
		}
	}
}
