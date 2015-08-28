
/**
 * @author Sumitra
 *this is to implement stack
 */
public class StackOperator {
	 protected StackNode start;
	    protected StackNode end ;
	    public int size ;
	    public StackOperator()
	    {
	        start = null;
	        end = null;
	        size = 0;
	    }
	    public boolean isEmpty()
	    {
	        return start == null;
	    }
	    public int getSize()
	    {
	        return size;
	    }   
	    /**
	     * 
	     * @param val to enter in stack
	     */
	 public void push(char val)
	    {
	        StackNode nptr = new StackNode(val, null);    
	        size++ ;    
	        if(start == null) 
	        {
	            start = nptr;
	            end = start;
	        }
	        else 
	        {
	            nptr.setLink(start);
	            start = nptr;
	        }
	    }
	 /**
	  * to remove from stack
	  * @return will return the data to be removed
	  */
	 public char pop()
	 {
		
		 
		 char remove =start.getData();
		 start = start.getLink();
         size--; 
         return remove ;
		 

	 }
	 /**
	  * 
	  * @return top most data of stack
	  */
	 public char topData()
	 {
		 if(!isEmpty())
		 {
		 return start.getData();
		 }
		 return 0;
	 }
	 /**
	  * will display the stack
	  */
	 public void display()
	    {
	        System.out.print("\nSingly Linked List = ");
	        if (size == 0) 
	        {
	            System.out.print("empty\n");
	            return;
	        }    
	        if (start.getLink() == null) 
	        {
	            System.out.println(start.getData() );
	            return;
	        }
	        StackNode ptr = start;
	        System.out.print(start.getData()+ "->");
	        ptr = start.getLink();
	        while (ptr.getLink() != null)
	        {
	            System.out.print(ptr.getData()+ "->");
	            ptr = ptr.getLink();
	        }
	        System.out.print(ptr.getData()+ "\n");
	    }
}
