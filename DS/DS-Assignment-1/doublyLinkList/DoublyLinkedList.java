package doublyLinkList;

public class DoublyLinkedList {
	public Node start;
	void createDoublyLinkedList(int item) {
		Node newNode=new Node(item,null,null);
		Node temp;
		if (start == null) {
			start = newNode;
		} 
		else {
			temp = start;
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(newNode);
			newNode.setPrev(temp);
		}
	}

	public void insertAtParticularPosition(int item, int index) {
		Node newNode = new Node(item, null,null);
		Node temp = start;
		int count;
		if(index == 0){
			newNode.setNext(start);
			newNode.setPrev(null);
			start=newNode;
		}
		for (count = 0; count < index-1; count++) {
			temp = temp.getNext();
			if (temp == null) {
				System.out.println("Node in the list is at less than one");
				return;
			}
		}
		newNode.setNext(temp.getNext());
		newNode.setPrev(temp);
		temp.setNext(newNode);
		temp.setPrev(newNode.getPrev());
		
	}

	void traversalLinkedList() {
		Node temp=start;
		System.out.println("The linked list is.. ");
		while (temp != null) {
			System.out.print(temp.getValue()+"\t");
			temp = temp.getNext();
		}
	}

	void retrievalAtIndex(int index) {
		Node temp = start;
		int count;
		for (count = 1; count <= index; count++) {
			temp = temp.getNext();
		}
		System.out.println("The value at index is " + temp.getValue());
	}

	public void deleteItemOnIndex(int index) {
		Node temp = null, current=start;
		int count;
		if (index == 0) {
			start=current.getNext();
		} else {
			for (count = 1 ; count <= index; count++) {
				temp = current;
				current = current.getNext();
			}
			//System.out.println("Node deleted " + current.getValue());
			temp.setNext(current.getNext());
			temp.setPrev(current.getPrev());
		}
	}

	public void deleteItemOnValue(int item) {
		Node current = start;
		Node temp = current;
		if (start == null) {
			System.out.println("Empty List");
		} else {
			while (current != null) {
				if (current.getValue() == item) {
					if (temp == start) {
						start = temp.getNext();
						temp.setPrev(null);
						return;
					} else {
						temp.setNext(current.getNext());
						temp.setPrev(current.getPrev());
						return;
					}
				}
				temp = current;
				current = current.getNext();
			}
		}
	}

	
	  void reverse() { 
		   Node temp = null;  
		   Node current = start;
		      
		     /* swap next and previous for all nodes of 
		       doubly linked list */
		     while (current !=  null)
		     {
		       temp = current.getPrev();
		       current.setPrev(current.getNext());
		       current.setNext(temp);              
		       current = current.getPrev();
		     }      
		      
		     /* Before changing head, check for the cases like empty 
		        list and list with only one node */
		     if(temp != null )
		        start.setNext(temp.getPrev());
	}

	void sortLinkedList() {
		Node temp, current=start;
		int check;
		while( current != null )  // apply simple sorting to sort the elements of Linked list
		{
			temp = start;
			while( temp.getNext() != null )
			{
				if(temp.getValue() > temp.getNext().getValue())
				{
					check = temp.getValue();
					temp.setValue(temp.getNext().getValue()); 
					temp.getNext().setValue(check);
				}
				temp = temp.getNext();
			}
			current = current.getNext();
		}
	}


}
