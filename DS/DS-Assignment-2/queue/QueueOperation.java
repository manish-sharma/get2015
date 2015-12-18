package queue;

public class QueueOperation {
	Object queueArray[];
	int front=-1;
	int rear=-1;
	
	public QueueOperation() {
		// TODO Auto-generated constructor stub
		queueArray=new Object[10];
	}
	void enQueue( Object item ) 
	{
		front++;
		queueArray[front]=item;
	}

	void deQueue() {
		if(front==-1 && rear==-1)
		{
			System.out.println("Empty Queue");
			return;
		}
		if (rear == -1 && front>rear) {
			rear++;
		}
		if(front==rear)
		{
			makeEmpty();
			return;
		}
		for (int i = rear; i <= front; i++) {
			queueArray[i] = queueArray[i + 1];
		}
		front--;		
	}
	void makeEmpty( )
	{
		front=-1;
		rear=-1;
	}
	Object getFront( )
	{
		return queueArray[front];	
	}
    void displayQueue()
    {
    	
    	if(front==-1 && rear==-1)
		{
			System.out.println("Empty Queue");
			return;
		}
    	if(rear==-1 && front>rear){
    		rear++;
    	}
    	for (int i = rear; i <= front; i++) {
			System.out.println(queueArray[i]);
		}  	
    	
    }
}
