package LinkList;

/**this class holds the node functionality of link list.
 * @author Khemanshu
 *
 */
public class Node {
    //data stores the value of item
	private int data;
	//pointer stores next node of current node
    private Node pointer;
    
    Node()
    {
	data=0;
	pointer=null;
	
    }
    Node(int data,Node pointer)
    {
    	this.data=data;
    	this.pointer=pointer;
	
    }
    
    /**
     * @return the data of current node
     */
    public int getData() {
        return data;
    }
    
    /**
     * @param data value to be set in data
     */
    public void setData(int data) {
        this.data = data;
    }
    
    /**
     * @return pointer of current node
     */
    public Node getPointer() {
        return pointer;
    }
    
    /**
     * @param pointer node that is to be set at pointer of current node
     */
    public void setPointer(Node pointer) {
        this.pointer = pointer;
    }

}
