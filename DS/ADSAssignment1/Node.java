public class Node<T> {

	int tag;
	T value;
	Node<T> next;

	public Node() {

	}

	public Node(int tag, T value) {
		this.tag = tag;
		this.value = value;
		this.next = null;
	}

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T i) {
		this.value = i;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

}
