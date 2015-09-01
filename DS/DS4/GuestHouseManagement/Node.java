


public class Node {
    //data stores the value of item
	private String data;
	//pointer stores next node of current node
    private Node pointer;
    
    Node()
    {
	data=null;
	pointer=null;
	
    }
    Node(String data,Node pointer)
    {
    	this.data=data;
    	this.pointer=pointer;
	
    }
    
    /**
     * @return the data of current node
     */
    public String getData() {
        return data;
    }
    
    /**
     * @param data value to be set in data
     */
    public void setData(String data) {
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
