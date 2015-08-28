/****************************************************************************************
Name            : PreOrderTraversal
Revision Log    : 2015-08-27: Babalu patidar : created.
                : 
                : 
Use             : This class is used to travarse a tree in postorder manner
                :
****************************************************************************************/

import java.util.Scanner;


public class PreOrderTraversal extends BinarySeachTree {
	
public  static void main(String ard[]){
		
		BinarySeachTree BSTobject=new BinarySeachTree();
		int totalNode=0;
		Scanner scan=new Scanner(System.in);
		try{
		System.out.println("How many element you want to insert");
		totalNode=scan.nextInt();
		
		System.out.println("Enter all element");
		for(int count=0;count<totalNode;count++){
			BSTobject.addNode(scan.nextInt());
		}
		System.out.println("PreOrder of BST : ");
		BSTobject.preOrder(BinarySeachTree.rootNode);
		}
		catch(Exception e){
			System.out.println("Please enter Integer number ");
			main(ard);
		}
		scan.close();
	
	}
	

}
