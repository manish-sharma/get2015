package generalizedList;

public class ListOperation {
	Node first;

	String list, str = "";
	int position = 0;

	public ListOperation() {
		list = null;
	}

	public ListOperation(String string) {
		list = string;
	}

	void insert(Node node) {

		if (position < list.length()) {
			if (node == null) {
				Node temp;
				if (list.charAt(position) == '(') {
					temp = new Node(1, null);
				} else {

					while (list.charAt(position) != ','
							&& list.charAt(position) != '('
							&& list.charAt(position) != ')') {
						str += list.charAt(position);
						position++;
						System.out.println(str);
					}
					position--;
					temp = new Node(0, Integer.parseInt(str));
					str = "";
				}
				first = temp;
				position++;
				insert(temp);
			} else if (list.charAt(position) == '(') {
				Node temp = new Node(1, null);
				node.setNext(temp);
				position++;
				insert(node.getNext());
				insert(node.getNext());
			} else if (list.charAt(position) == ')') {
				position++;
				return;
			} else if (list.charAt(position) == ',') {
				position++;
				insert(node);
			} else {

				while (list.charAt(position) != ','
						&& list.charAt(position) != '('
						&& list.charAt(position) != ')') {
					str += list.charAt(position);
					position++;
				}
				position--;
				Node temp = new Node(0, Integer.parseInt(str));
				str = "";
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

	int sumOfelements(Node node, int sum) {

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

	public void display(Node node) {
		if (node != null) {
			if (node.getTag() == 0) {
				System.out.print(node.getData() + ",");
				display(node.getNext());

			} else {
				System.out.print("(");
				display((Node) node.getData());
				System.out.print(")");
				display(node.getNext());

			}

		}

	}

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

	boolean search(Node node, int element, boolean search) {
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

	public static void main(String[] args) {
		ListOperation list = new ListOperation(
				"((251,3),5,((13,2),1,(1,1),(10,(0),7)))");
		System.out.println(list.list);
		list.insert(list.first);
		list.display(list.first);
		System.out.println();
		System.out.println("Element 13 is persent = "
				+ list.search(list.first, 31, false));
		System.out.println("sum of elements is ->"
				+ list.sumOfelements(list.first, 0));
		System.out.println("Maximum element is ->"
				+ list.max(list.first, -1275867));
	}
}
