
public class ListNode {
	
	int tag;
	Object data;
	ListNode next;
	public int getTag() 
	{
		return tag;
	}
	public void setTag(int tag) 
	{
		this.tag = tag;
	}
	public Object getData()
	{
		return data;
	}
	public void setData(Object data)
	{
		this.data = data;
	}
	public ListNode getNext() 
	{
		return next;
	}
	//Method to set next of a node
	public void setNext(ListNode next) 
	{
		this.next = next;
	}
	@Override
	public String toString() {
		return "ListNode [tag=" + tag + ", data=" + data + ", next=" + next
				+ "]";
	}
	
}
