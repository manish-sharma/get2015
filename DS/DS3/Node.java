/**
 * @author Nikhil
 *
 */
public class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    Node() {
    }

    /**
     * @param value
     * @param leftChild
     * @param rightChild
     */
    Node(int value, Node leftChild, Node rightChild) {
	this.value = value;
	this.leftChild = leftChild;
	this.rightChild = rightChild;

    }
    
    /**
     * @param set right child of current node
     */
    public Node getLeftChild() {
	return leftChild;
    }
    
    /**
     * @param set left child of current node
     */
    public void setLeftChild(Node leftChild) {
	this.leftChild = leftChild;
    }
    
    /**
     * @return rightChild of current node
     */
    public Node getRightChild() {
	return rightChild;
    }

    public void setRightChild(Node rightChild) {
	this.rightChild = rightChild;
    }
    /**
     * @return the data of current node
     */
    public int getValue() {
	return value;
    }  
    /**
     * @param data value to be set in data
     */

    public void setValue(int value) {
	this.value = value;
    }

}
