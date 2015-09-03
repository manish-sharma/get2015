public class Node<T>
{
	private Node<T> leftNode;
	private T data;
	private Node<T> rightNode;
	
	public Node(T data) {
		this.data=data;
	}
	public Node<T> getLeftNode() {
		return leftNode;
	}
	
	public void setLeftNode(Node<T> leftNode) {
		this.leftNode = leftNode;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T dataNode) {
		this.data = dataNode;
	}
	
	public Node<T> getRightNode() {
		return rightNode;
	}
	
	public void setRightNode(Node<T> rightNode) {
		this.rightNode = rightNode;
	}
	
}
