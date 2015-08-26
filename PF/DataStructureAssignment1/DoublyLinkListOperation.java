/**
 * @author Sumitra---
 * 
 *         Operations to perform doubly link list
 *
 */
public class DoublyLinkListOperation {
	protected DoublyNode start;
	protected DoublyNode end;
	public int size;

	/* Constructor */
	public DoublyLinkListOperation() {
		start = null;
		end = null;
		size = 0;
	}

	/* Function to get size of list */
	public int getSize() {
		return size;
	}

	/* Function to insert an element */
	/**
	 * @param val
	 *            ----value to add
	 */
	public void createLinkList(int val) {
		DoublyNode nptr = new DoublyNode(val, null, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {

			end.setNlink(nptr);
			nptr.setPlink(end);
			end = nptr;

		}

	}

	/**
	 * @param val
	 *            ---function to remove element by value
	 */
	public void removeElement(int val) {

		DoublyNode ptr = start;
		DoublyNode temp = start;
		int pos = 0;

		while ((pos != size) && (ptr.getData() != val)) {
			temp = ptr;
			ptr = ptr.getNlink();
			pos = pos + 1;
		}
		if (pos == 0) {
			start.nlink.plink = null;
			start = start.nlink;
			size--;
		}

		else if (pos == size) {
			System.out.println("element not found");
		} else {
			temp.setNlink(ptr.getNlink());
			ptr.getNlink().setPlink(temp);
			size--;
		}

	}

	/* Function to insert an element at position */
	/**
	 * @param val
	 *            ---value to add
	 * @param pos
	 *            ---position of insert
	 */
	public void insertAtPos(int val, int pos) {
		DoublyNode nptr = new DoublyNode(val, null, null);
		DoublyNode ptr = start;
		if (pos == 1) {
			nptr.setNlink(start);
			start = nptr;
		} else {
			pos = pos - 1;
			for (int i = 1; i < size; i++) {
				if (i == pos) {
					DoublyNode tmp = ptr.getNlink();
					ptr.setNlink(nptr);
					nptr.setPlink(ptr);

					nptr.setNlink(tmp);
					tmp.setPlink(nptr);
					break;
				}
				ptr = ptr.getNlink();
			}
		}
		size++;
	}

	/**
	 * @param position
	 *            ---index position
	 * 
	 * 
	 *            Function to retrieve element at position
	 */
	public void retrieveAtPosition(int position) {
		DoublyNode ptr = start;
		if (position > size) {
			System.out.println("Not possible");
		} else {
			for (int i = 1; i < position; i++) {
				ptr = ptr.getNlink();

			}
			System.out.println("value is" + ptr.getData());
		}

	}

	/**
	 * @param pos
	 *            ----delete at position function to delete at position
	 */
	public void deleteAtPos(int pos) {
		if (pos == 1) {
			start = start.getNlink();
			start.setPlink(null);
			size--;
			return;
		}
		if (pos == size) {
			DoublyNode s = start;
			DoublyNode t = start;
			while (s != end) {
				t = s;
				s = s.getNlink();
			}
			end = t;
			t.nlink.setPlink(null);
			end.setNlink(null);
			size--;
			return;
		}
		DoublyNode ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size - 1; i++) {
			if (i == pos) {
				DoublyNode tmp = ptr.getNlink();
				tmp = tmp.getNlink();
				ptr.setNlink(tmp);
				tmp.setPlink(ptr);
				break;
			}
			ptr = ptr.getNlink();
		}
		size--;
	}

	/**
	 * function to reverse
	 */
	public void reverse() {
		DoublyNode tempNode1 = start, tempNode2 = start;
		int temp;
		while (tempNode2.nlink != null) // apply simple sorting to sort the
		// elements
		// of Linked list
		{
			tempNode2 = tempNode2.nlink;
		}

		for (int i = 0; i < size / 2; i++) // apply simple sorting to sort the
											// elements
		// of Linked list
		{
			temp = tempNode1.getData();
			tempNode1.setdata(tempNode2.getData());
			tempNode2.setdata(temp);
			tempNode1 = tempNode1.getNlink();
			tempNode2 = tempNode2.getPlink();
		}
	}

	/**
	 * function to sort
	 */
	public void sort() {

		DoublyNode tempNode1 = start, tempNode2;
		int temp;
		while (tempNode1 != null) // apply simple sorting to sort the elements
									// of Linked list
		{
			tempNode2 = start;
			while (tempNode2.nlink != null) {
				if ((tempNode2.getData()) > (tempNode2.getNlink().getData())) {
					temp = tempNode2.getData();
					tempNode2.setdata(tempNode2.getNlink().getData());
					tempNode2.getNlink().setdata(temp);
				}
				tempNode2 = tempNode2.getNlink();
			}
			tempNode1 = tempNode1.nlink;
		}
		DoublyNode current = start;
		while (current != null) {
			System.out.println(current.getData());
			current = current.nlink;
		}

	}

	/**
	 * Function to display
	 */
	public void display() {
		System.out.print("\nDoubly Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (start.getNlink() == null) {
			System.out.println(start.getData());
			return;
		}
		DoublyNode ptr = start;
		System.out.print(start.getData() + "->");
		ptr = start.getNlink();
		while (ptr.getNlink() != null) {
			System.out.print(ptr.getData() + "->");
			ptr = ptr.getNlink();
		}
		System.out.print(ptr.getData() + "\n");
	}

}
