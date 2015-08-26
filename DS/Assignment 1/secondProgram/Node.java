package secondProgram;
class Node<T>
{
    protected T value;
    protected Node<T> next;
 
    /*  Constructor  */
    public Node()
    {
        next = null;
        value = null;
    }    
    /*  Constructor  */
    public Node(T d,Node<T> n)
    {
        value = d;
        next = n;
    }    
    /*  Function to set link to next Node  */
    public void setNext(Node<T> next)
    {
        this.next = next;
    }    
    /*  Function to set data to current Node  */
    public void setValue(T value)
    {
        this.value = value;
    }    
    /*  Function to get link to next node  */
    public Node<T> getNext()
    {
        return next;
    }    
    /*  Function to get data from current Node  */
    public T getValue()
    {
        return value;
    }
}