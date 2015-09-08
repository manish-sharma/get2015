
public class StackNode<T> 
{
	private T data;
	private StackNode<T> nextNode;
	private static int size;
	
	public static int getSize() {
		return size;
	}

	public static void setSize(int size) {
		StackNode.size = size;
	}

	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public StackNode<T> getNextNode() {
		return nextNode;
	}
	
	public void setNextNode(StackNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	public StackNode(T data) {
		this.data = data;
	}

}
