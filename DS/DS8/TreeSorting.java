import java.util.Scanner;
//class for sorting usinf binary search tree
public class TreeSorting {
	static int[] list = null;
	public static void input() {
		Scanner sc=new Scanner(System.in);
		int sizeOfList=0;
		boolean isPositive=false;
		try {
			while(!isPositive) {
				System.out.println("Enter size of array");
				sizeOfList=sc.nextInt();
				if(sizeOfList<=0) {
					System.out.println("Enter only positive value");
				}
				else {
					isPositive=true;
				}
			}
		list=new int[sizeOfList];
		System.out.println("Enter Roll number of Student:");
		addElement(list,sc);
		}catch(Exception exception) {System.out.println("Enter only integer value");}
	}
	//method to produce output
	public static void output() {
		try {
			Node nodeObject=new Node();
			BinarySearchTree binaryTreeObject=new BinarySearchTree();
			for(int i=0;i<list.length;i++)
			nodeObject.rootNode=binaryTreeObject.insertNode(nodeObject.rootNode,list[i]);
			String result=binaryTreeObject.inorder(nodeObject.rootNode);
			System.out.println("Roll number in sorted manner :"+result);
		}catch(Exception exception) {System.out.println("Please Enter only Integer values");}
	}
	//method to add item in array from user
	public static int [] addElement(int[] list,Scanner sc) {
		for(int i=0;i<list.length;i++) {
			list[i]=sc.nextInt();
		}
	return list;
	}
	public static void main(String args[]) {
		input();
		output();
	}
}