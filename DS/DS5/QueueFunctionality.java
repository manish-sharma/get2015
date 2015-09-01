import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
//class to implement queue functionality by using linked list
//because to add and remove an node from link list is very easy
public class QueueFunctionality {
	public static void main(String args[]) {
		LinkedList<Object> queueList=new LinkedList<Object>();
		Scanner sc=new Scanner(System.in);
		int choise;
		try {
			do {
				System.out.println("Enter your choise:");
				System.out.println("\n1:Push\n2:Pop\n3:To Front item\n4To Empty Queue\n5To Display Queue\n6:Exit");
				do {
					while(!sc.hasNextInt()) {
						System.out.println("Enter only integer value");
						sc.nextInt();
					}
					choise=sc.nextInt();
				}
				while(choise<0 || choise >6);
				switch(choise) {
				case 1:
					System.out.println("Enter value");
					queueList.addLast(sc.nextInt());
					break;
				case 2:
					System.out.println("Popped item is "+queueList.pollFirst());
					break;
				case 3:
					System.out.println("Front item is "+queueList.getFirst());
					 break;
				case 4:
					queueList.clear();
					break;
				case 5:
					Iterator<Object> queueListIterator=queueList.iterator();
					if(queueList.isEmpty())
						System.out.println("Queue is empty");
					else {
						while(queueListIterator.hasNext()) {
							System.out.println(queueListIterator.next());
						}
					}
					break;
				case 6:
					System.exit(0);
				}
			}while(true);
		}catch(Exception exception){System.out.println("Enter correct value");}
		sc.close();
	}
}
