/**
 * Class to implement MaxHeap and job scheduling
 * @author Sanjay
 */

import java.util.Scanner;

public class MaxHeap
{
	private int[] Heap;
	private int size;
	private int maxsize;

	private static final int FRONT = 1;

	/**
	 * constructor
	 * @param maxsize
	 */
	public MaxHeap(int maxsize)
	{
		this.maxsize = maxsize;
		this.size = 0;
		Heap = new int[this.maxsize + 1];
		Heap[0] = Integer.MAX_VALUE;
	}

	/**
	 * Set parent node
	 * @param position
	 * @return
	 */
	private int parent(int position)
	{
		return position / 2;
	}

	/**
	 * Return left child
	 * @param position
	 * @return
	 */
	private int leftChild(int position)
	{
		return (2 * position);
	}
	
	
	/**
	 * Return right child
	 * @param position
	 * @return
	 */
	private int rightChild(int position)
	{
		return (2 * position) + 1;
	}

	/**
	 * To check if the node is leaf node
	 * @param position
	 * @return
	 */
	private boolean isLeaf(int position)
	{
		if (position >=  (size / 2)  &&  position <= size)
		{
			return true;
		}
		return false;
	}

	/**
	 * Method to swap elements on positions
	 * @param firstPosition
	 * @param secondPosition
	 */
	private void swap(int firstPosition,int secondPosition)
	{
		int temp;
		temp = Heap[firstPosition];
		Heap[firstPosition] = Heap[secondPosition];
		Heap[secondPosition] = temp;
	}

	
	/**
	 * Method to convert heap to MaxHeap
	 * @param position
	 */
	private void maxHeapify(int position)
	{
		if (!isLeaf(position))
		{ 
			if ( Heap[position] < Heap[leftChild(position)]  || Heap[position] < Heap[rightChild(position)])
			{
				if (Heap[leftChild(position)] > Heap[rightChild(position)])
				{
					swap(position, leftChild(position));
					maxHeapify(leftChild(position));
				}else
				{
					swap(position, rightChild(position));
					maxHeapify(rightChild(position));
				}
			}
		}
	}

	
	/**
	 * Method to insert element to heap
	 * @param element
	 */
	public void insert(int element)
	{
		Heap[++size] = element;
		int current = size;

		while(Heap[current] > Heap[parent(current)])
		{
			swap(current,parent(current));
			current = parent(current);
		}	
	}


	/**
	 * create MaxHeap
	 */
	public void maxHeap()
	{
		for (int position = (size / 2); position >= 1; position--)
		{
			maxHeapify(position);
		}
	}

	
	/**
	 * Method to remove element from heap
	 * @return
	 */
	public int remove()
	{
		int popped = Heap[FRONT];
		Heap[FRONT] = Heap[size--]; 
		maxHeapify(FRONT);
		return popped;
	}

	
	/**
	 * Method to set priority of task
	 */
	public void insertPriority ()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the priority of jobs");
		System.out.println("Press 1 for under graduate");
		System.out.println("Press 2 for graduate");
		System.out.println("Press 3 for professors");
		System.out.println("Press 4 for Chairman");
		int prioritytask = scan.nextInt();
		insert(prioritytask);
		maxHeap();
	}

	public static void main(String...arg)
	{
		MaxHeap maxHeap = new MaxHeap(15);
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter 1 to add jobs");
			System.out.println("Enter 2 to process jobs in the queue");
			System.out.println("Enter 3 to view the next job in the queue");
			int userInput = scan.nextInt();
			switch(userInput)
			{
			case 1:
				maxHeap.insertPriority();
				outer: while(true){
					System.out.println("Enter 1 to add more tasks");
					System.out.println("Enter 2 to go back");
					int userInput1 = scan.nextInt();
					switch (userInput1) {
					case 1:
						maxHeap.insertPriority();
						break;
					case 2:
						break outer;
					}
				}
				break;
			case 2:
				if(maxHeap.size <=0)
				{
					System.out.println("There is no task to be processed. Please add task first.");
				}
				else
				{
					System.out.println("The task processed is " + maxHeap.remove());
				}

				break;

			case 3:
				if(maxHeap.size <= 0)
				{
					System.out.println("There is no task to be processed");
				}
				else
				{
					System.out.println("The next job in the queue is " + maxHeap.Heap[FRONT]) ;
				}

				break;
			}
		}
	}
}