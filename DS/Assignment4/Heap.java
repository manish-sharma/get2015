/**
 * @author Girdhari
 * Program to implement Job Scheduling using heap data structure
 */
package heap;

import java.util.ArrayList;
import java.util.List;

/* Starting of Heap class */
public class Heap {
	private static List<Job> heap = new ArrayList<Job>();

	/* Starting of getter and setter function */
	public static List<Job> getHeap() {
		return heap;
	}
	public void setHeap(List<Job> heap) {
		this.heap = heap;
	}
	/* Ending of getter and setter function */
	
	/* Starting of addElement function */
	void addElement(Job jobObject) {
		heap.add(jobObject);
		adjustHeap();
	}
	/* Ending of addElement function */
	
	/* Starting of remove function */
	public Job remove() {
		Job job = null ;
		if(heap != null) {
			job = heap.get(0);
			heap.remove(0);
			adjustHeap();
		}
		return job;
	}
	/* Ending remove function */
	
	/* Starting of function adjustHeap */
	private void adjustHeap() {
		int sizeOfHeap = heap.size() - 1;
		int leftChildIndex;
		int rightChildIndex;
		int rootPriority;
		int leftChildPriority = 0;
		int rightChildPriority;
		
		for( int count = 0; count <= sizeOfHeap ; count++) {
			leftChildIndex = count * 2 + 1;
			rightChildIndex = count * 2 + 2;
			rootPriority = heap.get(count).getJobPriority();
			//check for left child
			if(leftChildIndex <= sizeOfHeap ) {
				leftChildPriority = heap.get(leftChildIndex).getJobPriority();
				if(rootPriority < leftChildPriority )
					swapNode(heap.get(count), heap.get(leftChildIndex));
			}
			//check for right child
			if(rightChildIndex <= sizeOfHeap) {
				rightChildPriority = heap.get(rightChildIndex).getJobPriority();
				if(heap.get(count).getJobPriority() > heap.get(rightChildIndex).getJobPriority())
					swapNode(heap.get(count), heap.get(rightChildIndex));
			}
		}
	}
	/* Ending of function adjustHeap */
	
	/* Starting of swapNode function */
	void swapNode(Job job1, Job job2) {
		// swaps the data value
		Job jobObjectTemp = new Job();
		jobObjectTemp.setJobData(job1.getJobData());
		job1.setJobData(job2.getJobData());
		job2.setJobData(jobObjectTemp.getJobData());
		
		// swaps the priority value
		jobObjectTemp.setJobPriority(job1.getJobPriority());
		job1.setJobPriority(job2.getJobPriority());
		job2.setJobPriority(jobObjectTemp.getJobPriority());
	}
	/* Ending of swapNode function */
}

/* Ending of Heap class */
