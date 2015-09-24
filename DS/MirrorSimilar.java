import java.util.Scanner;


public class MirrorSimilar {

	public MirrorSimilar() {
		// TODO Auto-generated constructor stub
	}
	public boolean areMirrorSimilar(Node root1 , Node root2) {
		boolean status = false;
		if(root1 == null && root2 == null) {
			status = true;
		}
		if(root1 == null) {
			status = false;
		} else if(root2 == null) {
			status = false;
		} else if(root1.getData() == root2.getData() ) {
			return areMirrorSimilar(root1.getLeft(), root2.getRight()) && areMirrorSimilar(root1.getRight(), root2.getLeft());
		} else {
			status = false;
		}
		return status;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Node root1 = null,root2 = null;
		MirrorSimilar mirrorSimilar = new MirrorSimilar();
		BinaryTreee BinaryTreeeFirst = new BinaryTreee();
		System.out.println("enter number of nodes in first tree");
		int numberOfNodesInFirstTree = scanner.nextInt();
		if(numberOfNodesInFirstTree == 0) {
			System.out.println("first tree is empty");
			return;
		}
		for (int count = 0; count < numberOfNodesInFirstTree ; count++) {
			System.out.println("Enter node data ");
			int item = scanner.nextInt();
			BinaryTreeeFirst.insert(root1,item,0);
			root1 = BinaryTreeeFirst.getRoot();
		}
		BinaryTreee BinaryTreeeSecond = new BinaryTreee();
		System.out.println("enter number of nodes in second tree");
		int numberOfNodesInSecondTree = scanner.nextInt();
		if(numberOfNodesInSecondTree == 0) {
			System.out.println("second tree is empty");
			return;
		}
		for (int count = 0; count < numberOfNodesInSecondTree ; count++) {
			System.out.println("Enter node data ");
			int item = scanner.nextInt();
			BinaryTreeeSecond.insert(root2,item,0);
			root2 = BinaryTreeeSecond.getRoot();
		}
		if(numberOfNodesInFirstTree != numberOfNodesInSecondTree) {
			System.out.println("trees are not mirror similar ");
			return;
		}
		if(mirrorSimilar.areMirrorSimilar(root1, root2)) {
			System.out.println("trees are mirror similar ");
		} else {
			System.out.println("trees are not mirror similar ");
		}
	}
}
