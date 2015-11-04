package GeneralizedList;
/**
 * This class is represent the GeneralizedList. which contain the list and value 
 * In generalizedList we perform basic opration Insertion, Searching , Maximum etc 
 */
public class List {

	Node root;
	String list;
	String number;
	int position;

	public List(String string) {
		list = string;
		number = "";
	}
	/**
	 * This function is used to insert element in list
	 * if list contain '(' braces than create new node with tag 1
	 * Otherwise node store data value with tag 0 
	 * This function recursivly insert element 
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
					//	System.out.println(number);
					}
					position--;
					temp = new Node(0, Integer.parseInt(number));
					number = "";
				}
				root = temp;
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
					number += list.charAt(position);
					position++;
				}
				position--;
				
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
	/**
	 * This function is used to caluculate sum of all element 
	 *  This function recursivly caluculate Total sum
	 *  
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
	/**
	 * This function is used to print  all the element 
	 *  
	 *  
	 */
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
	/**
	 * This function is used to caluculate maximum element
	 *  This function recursivly caluculate maximum element from the list
	 *  
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

/**
 * This function is used to search the element in list
 *  if element not found.it return false otherwise true
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
