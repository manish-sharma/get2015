
public class ListNode {
	int flag;
	Object data;
	ListNode next;
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "ListNode [flag=" + flag + ", data=" + data + ", next=" + next
				+ "]";
	}
	
}
