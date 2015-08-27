/**
 * Class to implement node
 * @author Sanjay
 *
 */

public class Node {

public int data;
public Node next;

public Node(int data) {
    this.data = data;
}

public void displayNode() {
    System.out.print(data);
    System.out.print("  ");

 }
}