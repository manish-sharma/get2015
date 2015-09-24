import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * This class implements queue using java collection
 * @author Banwari kevat
 */
public class Queue {
	private List<Integer> queue;
	//initialization of queue
	Queue()
	{
		queue= new LinkedList<Integer>();
	}
	
	//insert item in queue
	public void enqueue(int item)
	{
		queue.add(item);
	}
	
	//remove item from queue
	public int dequeue() 
	{
		return queue.remove(0);
	}
    
	//Display queue
	public void show() {
		Iterator<Integer> iterator = queue.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next()+" <--- ");
		}
	}
	
	public static void main(String [] arg) {
		 Queue obj = new Queue();
		 obj.enqueue(23);
		 obj.enqueue(12);
		 obj.enqueue(15);
		 obj.enqueue(78);
		 obj.enqueue(90);
		 obj.enqueue(60);
		 obj.show();
		 System.out.println("\n"+ obj.dequeue() );
		 obj.show();
	}
}
