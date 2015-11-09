package assignmentDS_2;

/*
 * class for implementation of queue using array
 */
public class Queue <E>
{
	private E[] mainArray;
	int capacity;
	int front;
	int rear;
	
	/*
	 * default constructor which is used to initialize class level variable
	 */
	@SuppressWarnings("unchecked")
	public Queue(int capacity) {
		super();
		this.capacity = capacity;
		this.mainArray =(E[]) new Object[capacity] ;
		this.front = -1;
		this.rear = -1;
	}
	
	/*
	 * below function is use to inserting element in queue
	 */
	public void enqueue(E ab)
	{
		if (rear == -1) 
        {
            front = 0;
            rear = 0;
            mainArray[0] = ab;
        }
        else if (rear + 1 >= capacity)
            throw new IndexOutOfBoundsException("Overflow Exception");
        else 
        	mainArray[++rear] = ab;    
	}
	
	/* 
	 * below function is use to return element at front position and remove it from queue
	 */
	public E dequeue()
	{
		E element;
		if(front==-1 ||front>rear)
		{
			throw new IndexOutOfBoundsException("underflow Exception");
			
		}
		else 
		{
			element=mainArray[front];
			if(front==rear)
			{
				front = -1;
	            rear = -1;
			}
			else
				front++;
		}
		return element;
	}
	
	/*
	 * below function is to retrieve element at front position
	 */
	public E getFront()
	{
		if(rear!=-1)
			return mainArray[rear];
		return null;
		
	}
	
	/*
	 * below function is use to show all elements of queue
	 */
	public void show()
	{
		int i=front,j=rear;
		while(i<=j)
		{
			System.out.println(mainArray[i]);
			i++;
		}
	}
	
	/*
	 * below function is use to check whether there is space available in queue or not
	 */
	public boolean isSpace()
	{
		if(rear + 1 >= capacity)
			return false;
		return true;
		
	}
	
	/*
	 * below function is to check whether given queue is empty or not
	 */
	public boolean isEmpty()
	{
		if(front==-1)
			return true;
		return false;
	}
	
	

}
