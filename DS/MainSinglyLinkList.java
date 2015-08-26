import java.util.InputMismatchException;
import java.util.Scanner;
//this class is used to define an singly linked list and its functionality
class SinglyLinkList {
	private static int count=0;//this variable is used to count nodes in list
	private Object nodeInformation;//to hold the node information 
	private SinglyLinkList addressOfNextNode,startNode;//to hold the address of next node
	//constructor of class to initialize an a start node which contains null
	SinglyLinkList() {
		startNode=null;
	}
	//this method is used to add a node at last
	public void addNode() {
		try{
			Scanner sc=new Scanner(System.in);
			SinglyLinkList node=new SinglyLinkList();
			node.addressOfNextNode=null;
			System.out.println("Enter value of node");
			node.nodeInformation=sc.nextInt();
			if(startNode==null) {
				startNode=node;
				count++;
			}
			else {
				SinglyLinkList traversingNode=startNode;
				while(traversingNode.addressOfNextNode!=null) {
					traversingNode=traversingNode.addressOfNextNode;
				}
				traversingNode.addressOfNextNode=node;
				count++;
			}
		}catch(InputMismatchException exception){System.out.println("Please enter only integer value");}
	}
	//this method is used to add a particular node in list at particular location 
	public void addPerticulatItemAtPerticulaLocation(int item,int location) {
		int counter=1;
		SinglyLinkList traversingNode=startNode;
		SinglyLinkList node=new SinglyLinkList();
		node.nodeInformation=item;
		if(startNode==null && location==1) {
			startNode=node;
			node.addressOfNextNode=null;
			count++;
		}
		else if(startNode==null) {
			System.out.println("List is empty");
		}
		else if(location>count+1 ||  location<=0) {
			System.out.println("Please Enter correct location");
		}
		else if(location==1) {
			node.addressOfNextNode=startNode;
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
			int counter=1;
			SinglyLinkList traversingNode=startNode;
			SinglyLinkList traversingNodeBack=startNode;
				while(traversingNode.nodeInformation!=(Object)item && traversingNode.addressOfNextNode!=null) {
					traversingNodeBack=traversingNode;
					traversingNode=traversingNode.addressOfNextNode;
				}
				if(traversingNode.nodeInformation==(Object)item) {
					traversingNodeBack.addressOfNextNode=traversingNode.addressOfNextNode;
					count--;
				}
				else if(traversingNode.nodeInformation==(Object)item) {
					traversingNodeBack.addressOfNextNode=null;
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
			count--;
		}
		else {
			int counter=1;
			SinglyLinkList traversingNodeBack=startNode;
			SinglyLinkList traversingNode=startNode;
				while(counter != location && traversingNode.addressOfNextNode!=null) {
					traversingNodeBack=traversingNode;
					traversingNode=traversingNode.addressOfNextNode;
					counter++;
				}
				if(counter == location) {
					traversingNodeBack.addressOfNextNode=traversingNode.addressOfNextNode;
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
		SinglyLinkList traversingNode=startNode;
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
			SinglyLinkList previousNode=startNode,currentNode=null,nextNode=null;
			while( previousNode != null )
			{
				nextNode = currentNode;			
				currentNode = previousNode;			
				previousNode = previousNode.addressOfNextNode;		
				currentNode.addressOfNextNode = nextNode;		
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
				SinglyLinkList currentNode=startNode,nextNode=startNode.addressOfNextNode;
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
			SinglyLinkList traversingNode=startNode;
			while(traversingNode!=null) {
				System.out.println(traversingNode.nodeInformation);
				traversingNode=traversingNode.addressOfNextNode;
			}
		}
	}
}
//Main class
public class MainSinglyLinkList {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		SinglyLinkList singlyLinkListObject=new SinglyLinkList();
		System.out.println("Choose an option");
		boolean isListCreated=false;//boolean to check weather list contains item or not
		try {
			while(true) {
				System.out.println("1:To create List\n2:Add perticular item at perticular location\n3"
						+ ":Remove an item\n4:Remove item from Location\n5:To retrieve item from given location"
						+ "\n6:To reverse Link List\n7:To sort the list\n8:display\n9:Exit");
				int choise=sc.nextInt();
				switch(choise) {
					case 1:
						singlyLinkListObject.addNode();
						break;
					case 2:
						System.out.println("Enter Item");
						int item=sc.nextInt();
						System.out.println("Enter location");
						int location=sc.nextInt();
						singlyLinkListObject.addPerticulatItemAtPerticulaLocation(item,location);
						break;
					case 3:
						System.out.println("Enter Item");
						item=sc.nextInt();
						singlyLinkListObject.removeItem(item);
						break;
					case 4:
						System.out.println("Enter location");
						location=sc.nextInt();
						singlyLinkListObject.removeItemFromLocation(location);
						break;
					case 5:
						System.out.println("Enter location");
						location=sc.nextInt();
						singlyLinkListObject.retrieveItemFromLocation(location);
						break;
					case 6:
						singlyLinkListObject.reverseList();
						break;
					case 7:
						singlyLinkListObject.toSortList();
						break;
					case 8:
						singlyLinkListObject.display();
						break;
					case 9:
						System.exit(0);
					default:System.out.println("Please Enter correct choise");
				}
			}
		}catch(InputMismatchException exception){System.out.println("Please Enter value provided on screen");}
	}
}
