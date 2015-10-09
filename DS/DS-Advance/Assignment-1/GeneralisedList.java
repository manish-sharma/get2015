/**
 * @author Girdhari
 * Program to generate generalised list 
 */
package assignment1;

/* Starting of class GeneralisedList */
public class GeneralisedList<T> {

	private boolean tag; // used for either contain it integer(if false) or
							// itself list(if true)
	private T data; // contain data either integer or itself list
	private GeneralisedList<?> nextDataLink; // point to the next node of list
	private static char[] charInput; // input array
	private static int charIndex; // input array index

	public boolean getTag() {
		return tag;
	}

	public void setTag(boolean tag) {
		this.tag = tag;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public GeneralisedList<?> getNextDataLink() {
		return nextDataLink;
	}

	public void setNextDataLink(GeneralisedList<?> nextDataLink) {
		this.nextDataLink = nextDataLink;
	}

	public static char[] getInputString() {
		return charInput;
	}

	public static void setInputString(char[] charInput) {
		GeneralisedList.charInput = charInput;
	}

	public GeneralisedList() {
	}

	/* create node of list according to boolean value */
	private static GeneralisedList<?> createListNode(boolean isList) {
		if (isList)
			return new GeneralisedList<GeneralisedList<?>>();
		return new GeneralisedList<Integer>();
	}

	/* Parameterized constructor for creating list according to given string */
	@SuppressWarnings("unchecked")
	public GeneralisedList(String inputString) {
		charIndex = 0;
		if (inputString == null || inputString.length() == 0) {
			System.out.println("Input is not correct");
			return;
		}
		inputString = inputString.substring(1, inputString.length() - 1);
		charInput = inputString.toCharArray();
		GeneralisedList<?> startNode = null;

		startNode = createList(startNode);
		this.data = (T) startNode.getData();
		this.tag = startNode.tag;
		this.nextDataLink = startNode.nextDataLink;
	}

	@SuppressWarnings("unchecked")
	private static GeneralisedList<?> createList(GeneralisedList<?> startNode) {
		boolean isList = false;
		String digitString = "";
		if (charIndex >= charInput.length)
			return startNode;
		if (charInput[charIndex] == ')') {
			charIndex++;
			return startNode;
		}
		if (charInput[charIndex] == '(') {
			isList = true;
			charIndex++;
		}
		if (!isList) {
			digitString = hasDigit();
		}
		if (!digitString.equals("") || isList == true) {
			startNode = createListNode(isList); // create node of list
			if (!isList)
				((GeneralisedList<Integer>) startNode).setData(Integer
						.parseInt(digitString));
			else {
				startNode.setTag(isList);
				((GeneralisedList<GeneralisedList<?>>) startNode)
						.setData(createList((GeneralisedList<?>) startNode
								.getData()));
			}
			startNode.setNextDataLink(createList(startNode.getNextDataLink()));
			return startNode;
		}
		if (charInput[charIndex] == ',') {
			charIndex++;
			startNode = createList(startNode);
		}
		return startNode;
	}

	public static String hasDigit() {
		char ch = 0;
		if (charIndex < charInput.length) {
			ch = charInput[charIndex];
			if (ch >= 48 && ch <= 57) {
				charIndex++;
				return ch + hasDigit();
			}
			return "";
		}
		return "";
	}

	public static void traverse(GeneralisedList<?> startNode) {
		if (startNode != null) {
			if (!startNode.getTag())
				System.out.print(startNode.getData() + " ");
			else {
				System.out.print("(");
				traverse((GeneralisedList<?>) startNode.getData());
				System.out.print(")");
			}
			traverse(startNode.getNextDataLink());
		}
	}

	public static String toString(GeneralisedList<?> startNode) {
		String expression = "";
		if (startNode != null) {
			if (!startNode.getTag())
				expression += startNode.getData();
			else {
				System.out.print("(");
				expression = "("
						+ toString((GeneralisedList<?>) startNode.getData())
						+ ")";
				System.out.print(")");
			}
			return expression + "," + toString(startNode.getNextDataLink());
		}
		return "";
	}

	public static Integer sum(GeneralisedList<?> startNode) {
		Integer data = 0;
		if (startNode != null) {
			if (!startNode.getTag())
				data = (Integer) startNode.getData();
			else
				data = sum((GeneralisedList<?>) startNode.getData());

			return data + sum(startNode.getNextDataLink());
		}
		return 0;
	}

	public static Integer max(GeneralisedList<?> startNode) {
		Integer data = 0;
		if (startNode != null) {
			if (!startNode.getTag())
				data = (Integer) startNode.getData();
			else
				data = max((GeneralisedList<?>) startNode.getData());
			return data > max(startNode.getNextDataLink()) ? data
					: max(startNode.getNextDataLink());
		}
		return 0;
	}

	/* Starting of function find */
	public static boolean find(GeneralisedList<?> startNode, Integer dataSearch) {
		Integer data = 0;
		boolean isFound = false;
		if (startNode != null) {
			if (!startNode.getTag())
				data = (Integer) startNode.getData();
			else {
				isFound = find((GeneralisedList<?>) startNode.getData(),
						dataSearch);
				if (isFound)
					return isFound;
			}
			isFound = (data.equals(dataSearch)) ? true : find(
					startNode.getNextDataLink(), dataSearch);
			if (isFound)
				return isFound;
		}
		return false;
	}
	/* Ending of function find */
}
/* End of class GeneralisedList */
