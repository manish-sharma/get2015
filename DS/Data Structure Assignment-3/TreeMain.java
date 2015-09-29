import java.util.Scanner;
/*This class present the menu to the user where user can choose various options out of given options through console
 * and can create tree and can perform various operations on them 
 * @author Shishir Pareek
 * Date 27th Aug 2015
 */

public class TreeMain {
    
	/*main function starts*/
	public static void main(String args[])
	{
		Tree treeObject = new Tree();
		//TreeNode root;
		//TreeNode root2;
		TreeMain object=new TreeMain();
		int item;
		int choice2=1;
		Scanner sc = new Scanner(System.in);
		while (true) {//loop to display menu 
			System.out.print("\n 1. Insert in Tree"
					+ "\n 2. Pre-Order Traversal"
					+ "\n 3. Post-Order Traversal "
					+ "\n 4. Compare Mirror Image"
					+ "\n 5. Exit");
			System.out.print("\n Enter Your choice : ");
			int choice = sc.nextInt();
			switch (choice) // Apply switch case and call corresponding method
						// according to the user's choice
			{
			case 1:
				System.out.print("\n Enter node value : ");
				item = sc.nextInt();
				treeObject.insert(item);
				break;
			case 2:treeObject.preOrderTraversal();
			    break;
			case 3:treeObject.postOrderTraversal();
				break;
			case 4:do//loop to ask values for creating the mirror image
			       { 
			       System.out.println("Enter the number if you want to add node to tree or 0 to exit");
		           Scanner sc2=new Scanner(System.in);
		           choice=sc.nextInt();
		           if(choice==0)//if choice is zero then user doesn't want to insert the value any more 
		             {
			       break;
			          }
		           else
		            {
		             treeObject.insertReverse(choice); 	//creating the mirrortree
		            }
			       }while(choice2!=0);
			       treeObject.compare();//comparing tree
		           break;
			case 5:System.exit(0);//to exit the program
			default:System.out.print("Enter correct choice");//if user enters wrong choice
		    	   break;
			}
	     }
	}
}