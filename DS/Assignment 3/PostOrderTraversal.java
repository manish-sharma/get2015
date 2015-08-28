/****************************************************************************************
Name            : PostOrderTraversal
Revision Log    : 2015-08-27: Babalu patidar : created.
                : 
                : 
Use             : This class is used to travarse a tree in preorder manner
                :
****************************************************************************************/

import java.util.Scanner;


public class PostOrderTraversal {
		
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
			System.out.println("PostOrder of BST : ");
			BSTobject.postOrder(BinarySeachTree.rootNode);
			}
			catch(Exception e){
				System.out.println("Please enter Integer number ");
				main(ard);
			}
			scan.close();
		
		}	

}
