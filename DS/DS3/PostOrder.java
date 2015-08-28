import java.util.InputMismatchException;
import java.util.Scanner;
//class to create a binary search tree and its operation
class Postorder {
	Object nodeInformation;
	Postorder rightChildAddress,leftChildAddress;
	static Postorder rootNode;
	Postorder() {
		rootNode=null;
	}	
	//to insert a new node in tree
	public Postorder insertNode(Postorder node,Object nodeInformation) {	
		if(node==null) {     //base condition of recursive method
			node=new Postorder();
			node.nodeInformation=nodeInformation;
			node.leftChildAddress=null;
			node.rightChildAddress=null;
		}
		else if((int)node.nodeInformation>=(int)nodeInformation) {
			node.leftChildAddress=insertNode(node.leftChildAddress,nodeInformation);
		}
		else {
			node.rightChildAddress=insertNode(node.rightChildAddress, nodeInformation);
		}
		return node;
	}			
	//to show postorder traversal
	public void displayPostorderTraversal(Postorder node) {
		if(node!=null) {
			displayPostorderTraversal(node.leftChildAddress);
			displayPostorderTraversal(node.rightChildAddress);
			System.out.print(node.nodeInformation+"->");
		}	
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Postorder PostorderObject=new Postorder();
		System.out.println("Enter Choise");
		try {
			while(true) {
				System.out.println("\n1:Insert a node\n2:Postorder display\n3:exit");
				int choise=sc.nextInt();
				switch(choise) {
				case 1:
					System.out.println("Enter value");
					int nodeInformation=sc.nextInt();
					rootNode=PostorderObject.insertNode(rootNode,nodeInformation);
					break;
				case 2:
					PostorderObject.displayPostorderTraversal(rootNode);
					break;
				case 3:
					System.exit(0);
					break;
				default:System.out.println("Enter correct choise");
				}
			}
		}catch(InputMismatchException exception) {System.out.println("Please Enter only screen values");}
	}
}
