/**
 * @author Sumitra---class to show all the functions of link list
 *
 */
public class LinkListOperation {

	protected Node start;
	protected Node end;
	public int size;

	/* Constructor */
	public LinkListOperation() {
		start = null;
		end = null;
		size = 0;
	}

	/* Function to get size of list */
	public int getSize() {
		return size;
	}

	/* Function to insert an element */
	public void createLinkList(int val) {
		Node nptr = new Node(val, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {

			end.setLink(nptr);
			end = nptr;

		}

	}

	/**
	 * @param position
	 *            ---index position
	 *            Function to retrieve element at position
	 */
	public void retrieveAtPosition(int position) {
		Node ptr = start;
		if (position > size) {
			System.out.println("Not possible");
		} else {
			for (int i = 1; i < position; i++) {
				ptr = ptr.getLink();

			}
			System.out.println("value is" + ptr.getData());
		}

	}

	/**
	 * @param val
	 *            ---value to remove
	 *            Function to remove element as per value
	 */
	public void removeElement(int val) {

		Node ptr = start;
		Node temp = start;
		int pos = 0;

		while ((pos != size) && (ptr.getData() != val)) {
			temp = ptr;
			ptr = ptr.getLink();
			pos = pos + 1;
		}
		if (pos == 0) {
			start = start.link;
			size--;
		}

		else if (pos == size) {
			System.out.println("element not found");
		} else {
			temp.setLink(ptr.getLink());
			size--;
		}

	}

	/* Function to insert an element at position */
	/**
	 * @param val
	 *            ----value to insert
	 * @param pos
	 *            ----value of position
	 */
	public void insertAtPos(int val, int pos) {
		Node nptr = new Node(val, null);
		Node ptr = start;
		if (pos == 1) {
			nptr.setLink(start);
			start = nptr;
		} else {
			pos = pos - 1;
			for (int i = 1; i < size; i++) {
				if (i == pos) {
					Node tmp = ptr.getLink();
					ptr.setLink(nptr);
					nptr.setLink(tmp);
					break;
				}
				ptr = ptr.getLink();
			}
		}
		size++;
	}

	/* Function to delete an element at position */
	/**
	 * @param pos
	 *            ---position to delete
	 */
	public void deleteAtPos(int pos) {
		if (pos == 1) {
			start = start.getLink();
			size--;
			return;
		}
		if (pos == size) {
			Node s = start;
			Node t = start;
			while (s != end) {
				t = s;
				s = s.getLink();
			}
			end = t;
			end.setLink(null);
			size--;
			return;
		}
		Node ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size - 1; i++) {
			if (i == pos) {
				Node tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size--;
	}

	/**
	 * function to reverse the link list
	 */
	public void reverse() {

		if (start == null || start.link == null) {
			return;
		}
		Node first = start;
		Node Second = first.link;
		// store third node before we change
		Node Third = Second.link;
		// Second's next pointer
		Second.link = first; // second now points to head
		first.link = null; // change head pointer to NULL
		// only two nodes, which we already reversed
		if (Third == null) {
			start = Second;
			end = first;
			return;
		}
		Node CurrentNode = Third;
		Node PreviousNode = Second;
		while (CurrentNode != null) {
			Node NextNode = CurrentNode.link;
			CurrentNode.link = PreviousNode;
			PreviousNode = CurrentNode;
			CurrentNode = NextNode;
		}
		end = first;
		start = PreviousNode; // reset the head node
		Node current = start;
		while (current != null) {
			System.out.println(current.getData());
			current = current.link;

		}

	}

	/**
	 * function to sort linklist
	 * 
	 */
	public void sort() {

		Node tempNode1 = start, tempNode2;
		int temp;
		while (tempNode1 != null) // apply simple sorting to sort the elements
									// of Linked list
		{
			tempNode2 = start;
			while (tempNode2.link != null) {
				if ((tempNode2.getData()) > (tempNode2.getLink().getData())) {
					temp = tempNode2.getData();
					tempNode2.setData( tempNode2.getLink().getData());
					tempNode2.link.setData(temp);
				}
				tempNode2 = tempNode2.link;
			}
			tempNode1 = tempNode1.link;
		}
		Node current = start;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getLink();
		}

	}

	/* Function to display elements */
	public void display() {
		System.out.print("\nSingly Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (start.getLink() == null) {
			System.out.println(start.getData());
			return;
		}
		Node ptr = start;
		System.out.print(start.getData() + "->");
		ptr = start.getLink();
		while (ptr.getLink() != null) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getLink();
		}
		System.out.print(ptr.getData() + "\n");
	}

}
