
public class Node<T> {
 public T nodeData;
 public Node<T> next;
 public Node(){
	 nodeData=null;
	 next=null;
 }
 public Node(T item){
	 nodeData = item;
	 next = null;
 }
}
