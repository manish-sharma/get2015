import java.util.Scanner;


public class Queue {

	int front;
	int rear;
	Object queue[];
	Queue(){
		queue = new Object[10];
		front = -1;
		rear = 0;
	}
	
	//Method is used for insert an element on rear
	void enqueue(Object item ){
		if( rear == queue.length )
		{
			Object[] buffer = new Object[queue.length];
			int i;
			for(i=0; i<queue.length; i++){
				buffer[i] = queue[i];
			}
			queue = new Object[queue.length+10];
			for(i=0; i<buffer.length; i++){
				queue[i] = buffer[i];
			}
		}
		queue[rear++] = item;
		if( front == -1 )
		{
			front = 0;
		}
	}
	
	//Method is used for return and delete front element
	Object dequeue( ){
		if( this.isEmpty() ){
			return null;
		}
		else{
			Object output = queue[front];
			int i;
			rear--;
			if( rear == 0 ){
				front--;
			}
			else{
				for(i=0; i<rear; i++){
					queue[i] = queue[i+1];
				}
			}
			return output;
		}
		
	}
	
	//Method is used for make queue empty
	void makeEmpty( ){
		front = -1;
		rear = 0;
		queue = new Object[10];
	}
	
	//Method return front element of queue
	Object getFront( ) {
		if(this.isEmpty()){
			return queue[front];	
		}
		else{
			return queue[front];
		}
	}
	
	//Display is used to display queue element
	void display()
	{
		if( this.isEmpty()){
			System.out.print("\n Queue is Empty ");
		}
		else{
			System.out.print("\n Queue is: ");
			for(int i=0; i<rear; i++ ){
				System.out.print(queue[i]+" ");
			}
		}
	}
	
	//Method is used for checking whether queue is empty
	boolean isEmpty(){
		if(front==-1){
			return true;
			
		}
		else{
		return false;
		}
	}
	
	//Start of main method
	public static void main(String[] args) {
		
		int choice=0;
		Object item;
		Scanner scan = new Scanner(System.in);
		Queue queue = new Queue();
		while(choice!=6)
		{
			System.out.print("\n 1. Enqueue\n 2. Dequeue\n 3. Make Empty\n 4. Get Front Item\n 5. Display Queue\n 6. Exit");
			System.out.print("\n Enter your choice : ");
			choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				System.out.print("\n Enter Item value : ");
				item = scan.next();
				queue.enqueue(item); break;
			case 2:
				item = queue.dequeue();
				if( item == null )
				{
					System.out.print("\n Queue is Empty ");
				}
				else
				{
					System.out.print("\n Dequeue Item is : "+item);
				}
				break;
			case 3:
				queue.makeEmpty(); break;
			case 4:
				item = queue.getFront();
				if( item == null )
				{
					System.out.print("\n Queue is Empty ");
				}
				else
				{
					System.out.print("\n Front Item is : "+item);
				}
				break;
			case 5:
				queue.display(); break;
			case 6:
				System.exit(0);
			}
			//End of switch
		}
		//End of while
		scan.close();
	}
	//End of main

}
