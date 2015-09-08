/**
 * class to create the node
 * @author Ankur
 * @since 03-09-2015
 * @param <T>... eneric node
 */
public class Node <T>{
	/**
	 * initializing variables
	 */
	public T nodeValue1;
	public String nodeValue2;
	public Node <T> left;
	public Node<T> right;
	public Node() {
		nodeValue1= null;
		nodeValue2= null;
		left = null;
		right =null;
	}
	/**
	 * creation of  Constructor 
	 * @param item1
	 * @param item2
	 */
	public Node( T item1,String item2) {
		nodeValue1= item1;
		nodeValue2=  item2;
		left = null;
		right =null;
	}
}
