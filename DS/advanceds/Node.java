package advanceds;

/**This class holds the schema of the node of the list.
 * @author Khemanshu
 *
 */
public class Node {
    
	//Data holds either atomic value or a list itself.
	private Object data;
	//Next holds the address of next node.
    private Node next;
    //Tag holds the value of tag that is 1 for list and 0 for atomic value
    private int tag;
    
    Node()
    {
		tag=0;
		data=null;
	}
    Node(int tag,Object data)
    {
    	this.data=data;
	    next=null;
	    this.tag=tag;
    }
    
    /**This function gets the next node.
     * @return
     */
    public Node getNext() {
		return next;
	}
	/**This function set the next node.
	 * @param next
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	/**This function gets the value of data.
	 * @return
	 */
	public Object getData() {
        return data;
    }
    /**This function get the value of tag.
     * @return
     */
    public int getTag() {
        return tag;
    }
    /**This function set the value of tag.
     * @param tag
     */
    public void setTag(int tag) {
        this.tag = tag;
    }
    /**This function set the value of data.
     * @param data
     */
    public void setData(Object data) {
        this.data = data;
    }
   
}