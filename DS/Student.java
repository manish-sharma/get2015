/**
 * student class to add roll number with their name in the tree
 * insertion in binary search tree
 * sorting is tree sorting
 * @author Ankur
 * @since 03-09-2015
 */

public class Student extends TreeSort {
	/**
	 * creation of student list
	 * @return.. tree 
	 */
	public Node<Integer> createStudentList(){
		int noOfStudents=0;
		int[] studentRollno = null;
		String [] studentName=null;
		System.out.println("Enter no of Student to add:");
		while(!scan.hasNextInt()){
			System.out.println("Enter Integer values only");
			scan.next();
		}
		noOfStudents  = scan.nextInt();
		studentRollno = new int[noOfStudents];
		studentName=new String[noOfStudents];

		for(int i =0;i<noOfStudents;i++){
			System.out.println("Enter Roll Number of Student :");
			while(!scan.hasNextInt()){
				System.out.println("Enter Integer values only");
				scan.next();
			}

			 int studentrollno = scan.nextInt();
			 
			  while(isExist(studentRollno, studentrollno)){
				  System.out.println("Roll number already exist\nEnter Again");
				  studentrollno = scan.nextInt();
			  }
			  
				   if(!isExist(studentRollno,studentrollno)){
					  studentRollno[i] = studentrollno;
				  System.out.println("Enter  Name of  Student :");
				  studentName[i]=scan.next();
				  root = insertBinarySearchTree(root, studentRollno[i],studentName[i]);
			 
			  }
		  }
		
		  return root;
		 	 
	 }
	/**
	 * method to check the roll number is exist or not
	 * @param studentRollno...array list of  roll number of the student
	 * @param rollNumber...
	 * @return
	 */
	private boolean isExist(int[] studentRollno,int rollNumber) {
		for(int i=0;i<studentRollno.length;i++){
			if(rollNumber==studentRollno[i])
				return true;
		}
		return false;
	}
	/**
	 * insertion of the value in the tree
	 * @param root... student tree
	 * @param item1...roll number of the student
	 * @param item2...respective name of the student
	 * @return... returns the student tree
	 */
	public Node<Integer> insertBinarySearchTree(Node<Integer> root, int item1, String item2){
		if(root==null){
			root = new Node<Integer>(item1,item2);
		}
		else if(root.nodeValue1 > item1 ){
			if(root.left == null){
				root.left = new Node<Integer>(item1,item2);
			}
			else
				insertBinarySearchTree(root.left,item1,item2);
		}
		else {
			if(root.right == null){
				root.right = new Node<Integer>(item1,item2);
			}
			else
				insertBinarySearchTree(root.right , item1,item2);
		}
		return root	;
	}
	/**
	 * method to display the student tree
	 * @param newNode
	 */
	public void showStudentList(Node<Integer> newNode){
		if(root == null)
			System.out.println("Empty");

		if(newNode != null){
			showStudentList(newNode.left);
			System.out.println(newNode.nodeValue1 + " \t  ,\t"+newNode.nodeValue2);
			showStudentList(newNode.right);
		}
	}
}
