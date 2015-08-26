import java.util.InputMismatchException;
//this class is used to define an doubly linked list and its functionality
import java.util.Scanner;
class DoublyLinkList {
	private static int count=0;//this variable is used to count nodes in list
	Object nodeInformation;//to hold the node information 
	DoublyLinkList addressOfNextNode,startNode,addressOfBackNode;//to hold the address of next node and previous node
	//constructor of class to initialize an a start node which contains null
	DoublyLinkList() {
		startNode=null;
	}
	//this method is used to add a node at last
	public void addNode() {
		try {
			Scanner sc=new Scanner(System.in);
			DoublyLinkList node=new DoublyLinkList();
			node.addressOfNextNode=null;
			System.out.println("Enter value of node");
			node.nodeInformation=sc.nextInt();
			if(startNode==null) {
				startNode=node;
				node.addressOfBackNode=null;
				count++;
			}
			else {
				DoublyLinkList traversingNode=startNode;
				while(traversingNode.addressOfNextNode!=null) {
					traversingNode=traversingNode.addressOfNextNode;
				}
				traversingNode.addressOfNextNode=node;
				node.addressOfBackNode=traversingNode;
				count++;
			}
		}catch(InputMismatchException exception){System.out.println("Enter correct value");}
	}
	//this method is used to add a particular node in list at particular location 
	public void addPerticulatItemAtPerticulaLocation(int item,int location) {
		int counter=1;
		DoublyLinkList traversingNode=startNode;
		DoublyLinkList node=new DoublyLinkList();
		node.nodeInformation=item;
		if(startNode==null && location==1) {
			startNode=node;
			node.addressOfNextNode=null;
			node.addressOfBackNode=null;
			count++;
		}
		else if(startNode==null) {
			System.out.println("List is empty");
		}
		else if(location>count+1 || location<=0) {
			System.out.println("Please Enter correct location");
		}
		else if(location==1) {
			node.addressOfNextNode=startNode;
			node.addressOfBackNode=null;
			startNode=node;
			count++;
		}
		else {
			while(counter<location-1) {
				traversingNode=traversingNode.addressOfNextNode;
				counter++;
			}
			node.addressOfNextNode=traversingNode.addressOfNextNode;
			traversingNode.addressOfNextNode=node;
			node.addressOfBackNode=traversingNode;
			count++;
		}
	}
	//to remove node given by user
	public void removeItem(int item) {
		if(startNode==null) {
			System.out.println("List is empty");
		}
		else if(startNode.nodeInformation==(Object)item)
			startNode=startNode.addressOfNextNode;
		else {
			DoublyLinkList traversingNode=startNode;
			DoublyLinkList traversingNodeBack=startNode;
				while(traversingNode.nodeInformation!=(Object)item && traversingNode.addressOfNextNode!=null) {
					traversingNodeBack=traversingNode;
					traversingNode=traversingNode.addressOfNextNode;
				}
				if(traversingNode.nodeInformation==(Object)item) {
					traversingNodeBack.addressOfNextNode=traversingNode.addressOfNextNode;
					traversingNode.addressOfNextNode.addressOfBackNode=traversingNodeBack;
					count--;
				}
				else
					System.out.println("Item not found");
			}
		}
	//to remove node from location given by user
	public void removeItemFromLocation(int location) {
		if(startNode==null) {
			System.out.println("List is empty");
		}
		else if(location>count) 
			System.out.println("Please Enter correct location");
		else if(location==1) {
			startNode=startNode.addressOfNextNode;
			startNode.addressOfBackNode=null;
			count--;
		}
		else {
			int counter=1;
			DoublyLinkList traversingNodeBack=startNode;
			DoublyLinkList traversingNode=startNode;
				while(counter != location && traversingNode.addressOfNextNode!=null) {
					traversingNodeBack=traversingNode;
					traversingNode=traversingNode.addressOfNextNode;
					counter++;
				}
				if(counter == location) {
					traversingNodeBack.addressOfNextNode=traversingNode.addressOfNextNode;
					traversingNode.addressOfNextNode.addressOfBackNode=traversingNodeBack;
					count--;
				}
				else if(location==count) {
					traversingNodeBack.addressOfNextNode=null;
					count--;
				}
			}
		}
	//this method is used to retrieve a node from location of user given item 
	public void retrieveItemFromLocation(int location) {
		int counter=1;
		DoublyLinkList traversingNode=startNode;
		if(location>count || location<=0)
			System.out.println("Please Enter correct possition");
		else {
			while(counter!=location && traversingNode !=null) {
				traversingNode=traversingNode.addressOfNextNode;
				counter++;
			}
			if(counter==location)
				System.out.println("Item at "+location+"th location is "+traversingNode.nodeInformation);
		}
	}
	//to reverse the list
	public void reverseList() {
		if(startNode==null)
			System.out.println("List is Empty");
		else if(count==1) {
			return;
		}
		else {
			DoublyLinkList previousNode=startNode,currentNode=null,nextNode=null;
			while( previousNode != null )
			{
				nextNode = currentNode;			
				currentNode = previousNode;			
				previousNode = previousNode.addressOfNextNode;		
				currentNode.addressOfNextNode = nextNode;		
				currentNode.addressOfBackNode = previousNode;
			}
			startNode = currentNode;
		} 
	}
	//to sort the list
	public void toSortList() {
		if(startNode==null) 
			System.out.println("List is Empty");
		else if(count==1)
			return;
		else {
			for(int counter1=0;counter1<count;counter1++) {
				DoublyLinkList currentNode=startNode,nextNode=startNode.addressOfNextNode;
				for(int counter2=0;counter2<count-counter1-1;counter2++) {
					if((Integer)currentNode.nodeInformation>(Integer)currentNode.addressOfNextNode.nodeInformation) {
						Object bufferNode;
						bufferNode=currentNode.nodeInformation;
						currentNode.nodeInformation=nextNode.nodeInformation;
						nextNode.nodeInformation=bufferNode;
					}
					currentNode=nextNode;
					nextNode=nextNode.addressOfNextNode;
				}
			}
		}
	}
	//to display the list
	public void display() {
		if(startNode==null)
			System.out.println("List is empty");
		else
		{
			DoublyLinkList traversingNode=startNode;
			while(traversingNode!=null) {
				System.out.println(traversingNode.nodeInformation);
				traversingNode=traversingNode.addressOfNextNode;
			}
		}
	}
}
//Main class
public class MainDoublyLinkList {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		DoublyLinkList doublyLinkListObject=new DoublyLinkList();
		System.out.println("Choose an option");
		boolean isListCreated=false;
		try {
			while(true) {
				System.out.println("1:To create List\n2:Add perticular item at perticular location\n3"
						+ ":Remove an item\n4:Remove item from Location\n5:To retrieve item from given location"
						+ "\n6:To reverse Link List\n7:To sort the list\n8:display\n9:Exit");
				int choise=sc.nextInt();
				switch(choise) {
					case 1:
						doublyLinkListObject.addNode();
						break;
					case 2:
						System.out.println("Enter Item");
						int item=sc.nextInt();
						System.out.println("Enter location");
						int location=sc.nextInt();
						doublyLinkListObject.addPerticulatItemAtPerticulaLocation(item,location);
						break;
					case 3:
						System.out.println("Enter Item");
						item=sc.nextInt();
						doublyLinkListObject.removeItem(item);
						break;
					case 4:
						System.out.println("Enter location");
						location=sc.nextInt();
						doublyLinkListObject.removeItemFromLocation(location);
						break;
					case 5:
						System.out.println("Enter location");
						location=sc.nextInt();
						doublyLinkListObject.retrieveItemFromLocation(location);
						break;
					case 6:
						doublyLinkListObject.reverseList();
						break;
					case 7:
						doublyLinkListObject.toSortList();
						break;
					case 8:
						doublyLinkListObject.display();
						break;
					case 9:
						System.exit(0);
					default:System.out.println("Please Enter correct choise");
				}
			}
		}catch(InputMismatchException exception){System.out.println("Please Enter value provided on screen");}
	}
}
