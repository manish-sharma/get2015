import java.lang.reflect.Array;


public class Queue<T> {
	
	private T queue[];
	private int front;
	private int rear;
	private final int SIZE=20;
	
	public T[] getQueue() {
		return queue;
	}
	public void setQueue(T queue[]) {
		this.queue = queue;
	}
	public int getFront() {
		return front;
	}
	public void setFront(int front) {
		this.front = front;
	}
	public int getRear() {
		return rear;
	}
	public void setRear(int rear) {
		this.rear = rear;
	}
	public int getSIZE() {
		return SIZE;
	}
	
	public Queue(Class<T[]> classObj) {
		
		queue= (T[]) classObj.cast(Array.newInstance(classObj.getComponentType(), SIZE));
		front=-1;
		rear=-1;
	}

	public boolean insertElement(T data)
	{
		if(front==-1&&rear==-1)
			front=0;
		if(front==SIZE-1)
		{
			System.out.println("Overflow occured queue is full");
			return false;
		}
		rear++;
		queue[rear]=data;
		return true;
		
	}
	
	public T deleteElement()
	{
		if(front==rear&&front==-1)
		{
			System.out.println("Under Flow occured queue is empty");
			return null;
		}
		if(front==SIZE-1)
		{
			front=rear=-1;
		}
		T data=queue[front];
		front++;
		return data;
	}
	
	public void displayQueue()
	{
		if(front==-1&&rear==-1)
		{
			System.out.println("Queue is empty");
			return ;
		}
		System.out.print("Queue is\t");
		for(int index=front;index<=rear;index++) 
		{
			System.out.print(queue[index]+"\t");
		}
		System.out.println();
	}
	public void clearAll()	//clear all the data in queue array
	{
		front=rear=-1;
		System.out.println("Queue is cleared");
	}
}
