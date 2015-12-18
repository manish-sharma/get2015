package stack;

public class StackOperation {
	public Node start;
    int index=0;
	void createLinkedList(int item) {
		Node newNode = new Node(item, null);
		Node temp;
		if (start == null) {
			start = newNode;
			index++;
		} else {
			temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
			index++;
		}
	}

	public void push(int item) {
		Node newNode = new Node(item, null);
		Node temp = start;
		int count;
		if (index == 0) {
			newNode.setNext(start);
			start = newNode;
			index++;
		}
		else
		{
		for (count = 0; count < index - 1; count++) 
			temp = temp.getNext();
		
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
		index++;
		}
	}

	void traversalStack() {
		Node temp = start;
		System.out.println("Stack is.. ");
		while (temp != null) {
			System.out.println(temp.getValue());
			temp = temp.getNext();
		}
	}

	public Object pop() {
		Node temp = null, current = start;
		while(current.getNext()!=null)
		{
			temp=current;
			current=current.getNext();
		}
		
		//System.out.println("Node poped " + current.getValue());
		temp.setNext(null);
		index--;
		return current.getValue();
	}
	boolean isEmpty()
	{
		if(index==0)
		{
		return true;
		}
		else
		{
			return true;
		}
		
	}

}
