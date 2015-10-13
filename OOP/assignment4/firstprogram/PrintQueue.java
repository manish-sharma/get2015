package firstprogram;

/**
 * Class that maintains array of Jobs that are to be printed by the computer
 * @author Riddhi
 *
 */
public class PrintQueue {
	
	Jobs[] arr;           //array of jobs
	private int heapSize; //size of total jobs

	public PrintQueue()
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

	
}
