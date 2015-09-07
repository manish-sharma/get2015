
public class Queue {
	private int front, rear;
	private Object array[];
	private Object arrayNew[];

	public Queue(int numberOfElements)
	{
		front = -1;
		rear = 0;
		array = new Object[numberOfElements];
	}
	
	public Queue()
	{
		front = -1;
		rear = 0;
		array = new Object[10];
	}
	
	/** Method to add an item to list
	 * @param object : object to add to the list
	 * @return true if item is added successfully, false otherwise
	 */
	public boolean enqueue(Object object)
	{
		try
		{
			int length = array.length;
			if(rear < length) {
				array[rear] = object;
				rear++;
			}
			else 
			{
				arrayNew = new Object[length*2+2];
				for(int i = 0; i < length; i++)
					arrayNew[i] = array[i];
				array = arrayNew;
				array[rear] = object;
				rear++;
			}
			front = 0;
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	/** Method to remove front element from queue
	 * 
	 * @return front element
	 */
	public Object dequeue()
	{
		if(front == -1) 
			return null;
		Object temp = array[front];
		front++;
		return temp;
	}
	
	/** Method to get the front element of the queue
	 * 
	 * @return front element
	 */
	public Object getFront()
	{
		if(front == -1) 
			return null;
		return array[front];
	}
	
	/** Method to make the queue empty */
	public boolean makeEmpty()
	{
		if(front == -1) {
			return false;
		}
		front = -1;
		rear = 0;
		array = new Object[10];
		return true;
	}
	
	/** Method to Show the queue */
	public void show()
	{
		if(front == -1) {
			System.out.println("Queue is Empty");
			return;
		}
		for(int i = front; i < rear; i++)
		{
			System.out.print(array[i]+"\t");
		}
	}
}
