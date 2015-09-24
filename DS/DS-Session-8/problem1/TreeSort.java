import java.util.*;

/*
 * DS-Session-8 Assignments
 * @authour Banwari kevat
 */

//This class extends BinaryTree
public class TreeSort extends BinaryTree {
	//list for insertion of sorted roll number list
    private List<Integer> inorderList = new ArrayList<Integer>();
    /*
     * This method for built binary search tree and then sort list 
     * @param list is the rollNumber list of students
     * @return sorted roll number list
     */
	public List<Integer> treeSort(List<Integer> list)
	{   //insert one by one roll number into binary search tree 
		for(int i : list)
		{  //This is the super class method for insert key into binary search tree
			insertKey(i);
		}
	
		//inorder of binary search tree gives sorted arrangement
		inorder();
		
		// return inorderList which is sorted
		return inorderList;
	}
	
	
	   //Recursive method for inorder traversing
		private void inorder(Node root)
		{   
		     if(root != null){
		    	 inorder(root.getLeft());   //recursive call
		    	 //Add roll number to sortedList which is inorderList
		    	 inorderList.add( root.getKey() );
		    	 inorder(root.getRight());  //recursive call	    	 
		     }
		   
		}
		
		//method for inorder traversing
		public void inorder()
		{
			inorder(root);
		}

	
	public static void main(String [] arg)
	{     try
	      {    Scanner sc = new Scanner(System.in);
		       System.out.print("Enter number of students: ");
		       //Reading number of students
		       int n = sc.nextInt();
		       //ArrayList for storing roll number s of students
		       List<Integer> rollNumberList = new ArrayList<Integer>(n);
		       System.out.println("Enter roll numbers: ");
		       for(int i = 0; i < n ; i++ )
		       {  //Read one by one roll number and then add to rollNumber List
		    	   rollNumberList.add( i, sc.nextInt() );
		       }
		       TreeSort treeSort = new TreeSort();
		       // calling tree sort
		       rollNumberList = treeSort.treeSort(rollNumberList);
		       //Displaying sorted roll number list
		       System.out.println("Ascending series of roll numbers: ");
		       for(int i : rollNumberList)
		       {
		    	   System.out.print(i+" ");
		       }
		       
		    }
	      catch(Exception e)
	      {
		      System.out.println(e.getMessage());
	      }
		
	}
}
