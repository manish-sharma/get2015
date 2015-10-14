package advanceds;

/**This class use node class to implement generic list.
 * @author Khemanshu
 *
 */
public class List {

	//Root variable use to create the list.
	Node root;
	//String list holds the string entered by the user.
	String list;
	//String number is use to hold the elements of list.
	String number;
	//Position of list.
	int position;

	public List(String string) {
		list = string;
		number = "";
	}

	/**This function is use to insert 
	 * @param node
	 */
	public void insert(Node node) {
		if (position < list.length()) {
			if (node == null) {
				Node temp;
				if (list.charAt(position) == '(') {
					temp = new Node(1, null);
				} else {

					while (list.charAt(position) != ','
							&& list.charAt(position) != '('
							&& list.charAt(position) != ')') {
						number += list.charAt(position);
						position++;
					}
					temp = new Node(0, Integer.parseInt(number));
					number = "";
				}
				root = temp;
				position++;
				insert(temp);
			} 
			else if (list.charAt(position) == '(') {
				Node temp = new Node(1, null);
				node.setNext(temp);
				position++;
				insert(node.getNext());
				insert(node.getNext());
			} 
			else if (list.charAt(position) == ')') {
				position++;
				return;
			} 
			else if (list.charAt(position) == ',') {
				position++;
				insert(node);
			} 
			else {

				while (list.charAt(position) != ','
						&& list.charAt(position) != '('
						&& list.charAt(position) != ')') {
					number += list.charAt(position);
					position++;
				}
				Node temp = new Node(0, Integer.parseInt(number));
				number = "";
				if (node.getTag() == 0) {
					node.setNext(temp);
					position++;
					insert(temp);

				} else if (node.getTag() == 1 && node.getData() != null) {
					node.setNext(temp);
					position++;
					insert(temp);
				} else {

					node.setData(temp);
					position++;
					insert(temp);
				}

			}

		}
	}

	/**This function return the sum of all atomic elements of list.
	 * @param node
	 * @param sum
	 * @return
	 */
	public int sumOfelements(Node node, int sum) {

		if (node != null) {
			if (node.getTag() == 0) {
				sum = sum + (int) node.getData();
				sum = sumOfelements(node.getNext(), sum);
			} else {
				sum = sumOfelements((Node) node.getData(), sum);
				sum = sumOfelements(node.getNext(), sum);

			}

		}
		return sum;
	}

	/**This function is use to display the list.
	 * @param node
	 */
	public void display(Node node) {
		if (node != null) {
			if (node.getTag() == 0) {
				System.out.print(node.getData() + ",");
				display(node.getNext());
			} 
			else {
				display((Node) node.getData());
				display(node.getNext());
			}
			
		}
		
	}

	/**This function is use to get the maximum number in the list.
	 * @param node
	 * @param max
	 * @return
	 */
	int max(Node node, int max) {
		if (node != null) {
			if (node.getTag() == 0) {
				if (max < (int) node.getData())
					max = (int) node.getData();
				max = max(node.getNext(), max);

			} else {
				max = max((Node) node.getData(), max);
				max = max(node.getNext(), max);
			}
		}
		return max;
	}

	/**This function is use to search an atomic number.
	 * @param node
	 * @param element
	 * @param search
	 * @return
	 */
	public boolean search(Node node, int element, boolean search) {
		if (node != null) {
			if (node.getTag() == 0) {
				if ((int) node.getData() == element) {
					return true;

				}
				search = search(node.getNext(), element, search);

			} else {

				search = search((Node) node.getData(), element, search);
				search = search(node.getNext(), element, search);
			}

		}
		return search;
	}

}
