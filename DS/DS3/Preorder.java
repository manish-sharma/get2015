import java.util.InputMismatchException;
import java.util.Scanner;
//class to create a binary search tree and its operation
class Preorder {
	Object nodeInformation;
	Preorder rightChildAddress,leftChildAddress;
	static Preorder rootNode;
	Preorder() {
		rootNode=null;
	}	
	//to insert a new node in tree
	public Preorder insertNode(Preorder node,Object nodeInformation) {	
		if(node==null) {       //base condition of recursive method
			node=new Preorder();
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
	//to show preorder traversal
	public void displayPreorderTraversal(Preorder node) {
		if(node!=null) {
			System.out.print(node.nodeInformation+"->");
			displayPreorderTraversal(node.leftChildAddress);
			displayPreorderTraversal(node.rightChildAddress);
		}	
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		Preorder preorderObject=new Preorder();
		System.out.println("Enter Choise");
		try {
			while(true) {
				System.out.println("\n1:Insert a node\n2:Preorder display\n3:exit");
				int choise=sc.nextInt();
				switch(choise) {
				case 1:
					System.out.println("Enter value");
					int nodeInformation=sc.nextInt();
					rootNode=preorderObject.insertNode(rootNode,nodeInformation);
					break;
				case 2:
					preorderObject.displayPreorderTraversal(rootNode);
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
