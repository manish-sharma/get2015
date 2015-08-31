package CollegeAllotment;



import java.util.NoSuchElementException;


/**
 * @author Sumitra
 *this class is to implement queue of student
 */
public class StudentQueue {
	static Student Queue[] ;
    protected int front, rear, size, len;
    public StudentQueue(int n) 
    {
        size = n;
        len = 0;
        Queue = new Student[size];
        front = -1;
        rear = -1;
    }    
    public boolean isEmpty() 
    {
        return front == -1;
    }
    public boolean isFull() 
    {
        return front==0 && rear == size -1 ;
    } 
    public int getSize()
    {
        return len ;
    }   
    /**
     * 
     * @return to return the first entry.
     */
    public Student peek() 
    {
        if (isEmpty())
           throw new NoSuchElementException("Underflow Exception");
        return Queue[front];
    }    
    /**
     * 
     * @param stu to set the entry in queue.
     */
    public void enqueue(Student stu) 
    {
        if (rear == -1) 
        {
            front = 0;
            rear = 0;
            Queue[rear] = stu;
        }
        else if (rear + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        else if ( rear + 1 < size)
            Queue[++rear] = stu;    
        len++ ;    
    }    
    /**
     * to remove the queue
     */
   public  void makeEmpty( )
    {
    	front=-1;
    	rear=-1;
    }
   /**
    * to remove the entry from queue
    * @return
    */
    public Student dequeue() 
    {
        if (isEmpty())
           throw new NoSuchElementException("Underflow Exception");
        else 
        {
            len-- ;
           Student ele = Queue[front];
            if ( front == rear) 
            {
                front = -1;
                rear = -1;
            }
            else
                front++;                
            return ele;
        }        
    }
    /**
     * to display the list of students
     */
    public void display()
    {
        System.out.print("\nQueue = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        System.out.println("-----------STUDENTS LIST-------");
        System.out.println("STUDENT NAME 		RANK");	
        for (int i = front; i <= rear; i++)
            System.out.println(Queue[i].getName()+"		 "+Queue[i].getRank());
        System.out.println();        
    }
   /**
    * to sort according to rank
    */
    public void sort()
    {
    	for(int i=0;i<Queue.length;i++)
    	{
    		for(int j=0;j<Queue.length;j++)
    		{
    			if(Queue[i].getRank()<Queue[j].getRank())
    			{
    				Student temp=Queue[i];
    				Queue[i]=Queue[j];
    				Queue[j]=temp;
    			}
    		}
    	}
    }
  
}
