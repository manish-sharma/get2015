package firstprogram;

/**
 * Class that maintains array of Jobs that are to be printed by the computer
 * @author Riddhi
 *
 */
public class PrintQueueUsingHeap {
	
	Jobs[] arr;           //array of jobs
	private int heapSize; //size of total jobs

	public PrintQueueUsingHeap()
	{
		arr=new Jobs[10];     //initializing array with size 10;
		heapSize=0;
	}

	public int getHeapSize() {
		return heapSize;
	}

	public void setHeapSize(int heapSize) {
		this.heapSize = heapSize;
	}
	
	

	// function to detect if their is no jobs in the array
		public boolean isEmpty() {
			return getHeapSize() == 0;
		}

		
		
		// method to insert job according to their priority
		public void insert(Jobs newJob) {

			arr[getHeapSize()] = newJob; // assigning new job in the array of
												// job
			int position = getHeapSize(); // position of the current element
			setHeapSize(getHeapSize() + 1); // updating size of array

			while (position != 0 && newJob.getPriority() > arr[position / 2].getPriority()) {
				arr[position] = arr[position / 2];        // if position of the value to be inserted is greater than its parent than value is swapped with the parent value
				position = position / 2;
			}
			arr[position] = newJob;
		}
		
		
		
		
	   //method used to remove element from the top of a max heap or maximum priority job
		public Jobs remove() {
			if (isEmpty())
				return null;
			int parent, child;
			parent = 0;
			child = 1;
			Jobs item = arr[0];
			Jobs temp = arr[getHeapSize() - 1];
			setHeapSize(getHeapSize() - 1);
			while (child < getHeapSize()) {
				
				if (temp.getPriority() > arr[child].getPriority())
					break;                      //if the priority of last element is greater than the priority of child than parent is assigned the value

				arr[parent] = arr[child];     //otherwise swapping of values take place to store the last element at correct position
				arr[child]=temp;
				parent = child;
				child = child * 2 + 1;       
			}
			arr[parent] = temp;              //finally temp value is stored at parent position

			return item;
		}

	
}
