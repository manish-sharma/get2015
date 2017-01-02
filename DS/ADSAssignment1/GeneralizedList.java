import java.util.ArrayList;
import java.util.List;

public class GeneralizedList {
	Node<Object> start, first, current;
	int index;

	// Constructor to create an empty list
	public GeneralizedList() {
		start = null;
		first = null;
		current = null;
	}

	// Constructor that will take a string representing a generalized list and
	// will create the list
	public GeneralizedList(String string, GeneralizedList objList) {
		objList.index = 1;
		while (objList.index < string.length() - 1) {
			// if comma occurs than index value is incremented
			if (string.charAt(objList.index) == ',') {
				objList.index++;
			}
			if (start == null) {
				// if start is null than if '(' comes than a sublist is created
				if (string.charAt(objList.index) == '(') {
					objList.index++;
					// first holds the address of the first element of sublist
					first = createSublist(first, string, objList);
					// if a node holds a list has tag value set to 1
					first.setTag(1);
					objList.index++;
				} else {
					int data = 0;
					// multiple digit number is added in the list
					while ((string.charAt(objList.index) != ',')
							&& (string.charAt(objList.index) != ')')) {
						data = (data * 10)
								+ Character.getNumericValue(string
										.charAt(objList.index));
						objList.index++;
					}
					first = new Node<Object>(0, data);
				}
				start = first;
				continue;
			} else {
				// if start is not null
				if (string.charAt(objList.index) == '(') {
					objList.index++;
					Node<Object> ref = null;
					ref = createSublist(ref, string, objList);
					ref.setTag(1);
					current = start;
					while (current.next != null) {
						current = current.next;
					}
					current.next = ref;
					ref.next = null;
					continue;
				} else {
					// multiple digit number is added in the list
					int data = 0;
					while ((string.charAt(objList.index) != ',')
							&& (string.charAt(objList.index) != ')')) {
						data = (data * 10)
								+ Character.getNumericValue(string
										.charAt(objList.index));
						objList.index++;
					}
					first = new Node<Object>(0, data);
					current = start;
					while (current.next != null) {
						current = current.next;
					}
					current.next = first;
					continue;
				}
			}
		}
	}

	// creates sublist
	public Node<Object> createSublist(Node<Object> ref, String str,
			GeneralizedList objList) {
		while (objList.index < str.length() && str.charAt(objList.index) != ')') {
			if (str.charAt(objList.index) == ',') {
				objList.index++;
				continue;
			}
			// if the sublist starting node is null
			if (ref == null) {
				// ref contains the address of the first node of sublist
				if (str.charAt(objList.index) == '(') {
					objList.index++;
					Node<Object> first = null;
					ref.value = createSublist(first, str, objList);
					ref.setTag(1);
					objList.index++;
				} else {
					ref = new Node<Object>();
					int data = 0;
					while ((str.charAt(objList.index) != ',')
							&& (str.charAt(objList.index) != ')')) {
						data = (data * 10)
								+ Character.getNumericValue(str
										.charAt(objList.index));
						objList.index++;
					}
					Node<Object> fref = new Node<Object>(0, data);
					ref.setValue((Node<Object>) fref);
				}
				continue;
			}

			else {
				// if the sublist start node is not null
				if (str.charAt(objList.index) == '(') {
					objList.index++;
					Node<Object> ref1 = null;
					ref1 = createSublist(ref1, str, objList);
					ref1.tag = 1;
					current = (Node<Object>) ref.value;
					while (current.next != null) {
						current = current.next;
					}
					current.next = ref1;
					continue;
				} else {
					int data = 0;
					while ((str.charAt(objList.index) != ',')
							&& (str.charAt(objList.index) != ')')) {
						data = (data * 10)
								+ Character.getNumericValue(str
										.charAt(objList.index));
						objList.index++;
					}
					first = new Node<Object>(0, data);
					current = (Node<Object>) ref.value;
					while (current.next != null) {
						current = current.next;
					}
					current.next = first;
					continue;
				}
			}
		}
		objList.index++;
		return ref;
	}

	@Override
	public String toString() {
		List<Integer> listItems = displayList(this.start);
		return "GeneralizedList : " + listItems.subList(0, listItems.size());
	}

	// returns all items present in the list
	List<Integer> displayList(Node<Object> start) {
		Node<Object> current = start;
		Node<Object> curr;
		List<Integer> listItems = new ArrayList<Integer>();
		while (current != null) {
			if (current.tag != 1) {
				listItems.add(Integer.parseInt(current.value.toString()));
			} else {
				curr = (Node<Object>) current.value;
				listItems.addAll(displayList(curr));
			}
			current = current.next;
		}
		return listItems;
	}

	// returns sum of complete list
	int sumOfList() {
		int sumOfListItems = 0;
		List<Integer> listItems = displayList(this.start);
		for (int item : listItems) {
			sumOfListItems += item;
		}
		return sumOfListItems;
	}

	// returns maximum element in the list
	int maxItemInList() {
		int largestItem = 0;
		List<Integer> listItems = displayList(this.start);
		for (int item : listItems) {
			if (item > largestItem) {
				largestItem = item;
			}
		}
		return largestItem;
	}

	// returns true if the element is present in the list
	boolean findItemInList(int value) {
		List<Integer> listItems = displayList(this.start);
		for (int item : listItems) {
			if (item == value) {
				return true;
			}
		}
		return false;
	}

}
