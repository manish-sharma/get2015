import java.util.*;
/*
 * 
 * class Heap perform multiple task on heap concept
 *@ author Ravika
 *@since 31/8/2015
 */

public class Heap {
	 
	int size = 0;
	static int maxSize = 10;
	static final int Index =  1;
	static Scanner scan = new Scanner(System.in);
	static int [] heap;
	/*
	 * main method of class heap
	 * @choice -take from user to perform different operation on heap
	 * @priority calculate priority of task
	 */
	public static void main(String []args){
		       heap = new int[maxSize +1];
		       heap[0] = Integer.MAX_VALUE; 
		       Heap heapObject = new Heap();
		       int choice =0;
		       int priority =0;
		 try{    
			 do
			 {
				System.out.println("Enter 1 to add job\nEnter 2 to print document from the queue\nEnter 3 to next job in the queue\nEnter 0 to Exit");
				choice = scan.nextInt();
				switch(choice){
			
				case 1:
					priority =heapObject.setPriority();
					
					heapObject.insert(priority);
					int choice1;
					do{
						System.out.println("Enter 1 to add more tasks\nOtherwise Press 2:");
					
						choice1 = scan.nextInt();
						switch (choice1 ) {
						case 1:
							priority = heapObject.setPriority();
							heapObject.insert(priority);
							break;
						case 2:
							break ;
						default:
							System.out.println("Enter valid option:");
							break;
						}
					} while(choice1 != 2);
					break;
				case 2:
					if(heapObject.size <=0)	{
						System.out.println("There is no task in the queue to  print. Please add task first.");
					} else {
						System.out.println("The task print is " + heapObject.deleteRoot());
					}
					break;

				case 3:
					if(heapObject.size <= 0) {
						System.out.println("There is no task to  print");
					} else {
						System.out.println("The next job to print in the queue is " + Heap.heap[Index]) ;
					}
					break;
				default:
					System.out.println("Enter valid option:");
					break;
				case 0:
					System.out.println("***Exit***");
					System.exit(0);
				}
			 }while(choice != 0);
		 }catch(Exception e){
			 System.out.println("Enter valid value");
			 System.out.println("***Exit***");
		 }
	}
/*
 * this method delete root node of heap
 * @PARAM delete root of heap
 * @return deleted item from heap
 */
	private int deleteRoot() {
		int delete = heap[Index];
		heap[Index] = heap[size--]; 
		heapify(Index);
		return delete;
	}
	/*
	 * this method set priorities according to question
	 * @param priorityOfTask take priority from user 
	 * @return priority of task
	 */
	private int setPriority(){
	 
	   System.out.println("Enter the priority of job");
	   System.out.println("Press 1 for Under Graduate");
	   System.out.println("Press 2 for Graduate");
	   System.out.println("Press 3 for Professors");
	   System.out.println("Press 4 for Chairman");
		
	   int priorityOfTask = scan.nextInt();	
	   while((priorityOfTask > 4 )||(priorityOfTask <1)){
			System.out.println("enter valid value");
			priorityOfTask = scan.nextInt();
	   }
	   return priorityOfTask;
               
	}
/*
 * this method heapify  heap
 * 
 */
 private void heap() {
	// TODO Auto-generated method stub
	for(int position = (size / 2); position >= 1; position--)
	{
		heapify(position);
	}
}

/*
 * this method use to insert element in the priority queue or heap where root element is treated
 * @param current is the current node
 * @param parentnode calculate parent
 */
private void insert(int priorityOfTask) {
	
	int current = ++size;
	
	heap[current] = priorityOfTask;
	int parentnode =parent(current);
//(parent(current) != 0){
	while(parentnode !=0 ){
	if(heap[current] > heap[parent(current)])
	{
		swap(current,parent(current));
		
		current = parent(current);
		parentnode = parent(current);
		
	}	
	else{
		break;
	}
	heap();
}
}
	


/*
 * method to calculate parent of current node
 * @return parent
 */
	private int parent(int node)
	{
		return (node / 2);
	}
/*
 * this method to calculate left child
 */
	private int leftChild(int node)
	{
		return (2 * node);
	}
	
	/*
	 * this method to calculate right child
	 * 
	 */
	private int rightChild(int node)
	{
		return ((2 * node) + 1);
	}
	
	/*
	 * method to heapify a heap
	 * this method call isLeaf method to check leaf of not if not then check that child is  always less then parent
	 * use recursion
	 */
	private void heapify(int node)
	{
		if (!isLeaf(node))
		{ 
			if ( heap[node] < heap[leftChild(node)]  || heap[node] < heap[rightChild(node)])
			{
				if (heap[leftChild(node)] > heap[rightChild(node)])
				{
					swap(node, leftChild(node));
					heapify(leftChild(node));
				}else
				{
					swap(node, rightChild(node));
					heapify(rightChild(node));
				}
			}
		}
	}
/*
 * method to check node is leaf or internal
 * return true if leaf otherwise false
 */
	private boolean isLeaf(int node) {
		// TODO Auto-generated method stub
		if (node >=  (size / 2)  &&  node <= size)
		{
			return true;
		}
		
		return false;
	}
/*
 * this method swap two elements
 */
	private void swap(int node, int current) {
		int temp;
		temp = heap[node];
		heap[node] = heap[current];
		heap[current] = temp;
	}

		
	}

