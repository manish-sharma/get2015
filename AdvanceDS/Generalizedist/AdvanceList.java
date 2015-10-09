//class to create a general list and its operation
public class AdvanceList {
	Node start;
	Node node;
	int index;
	int max;
	int sum =0;
	boolean isFound = false;
	char currentChar; 
	//constructor to create a empty list
	public AdvanceList() {
		start=null;
	}
	//constructor to implements list
	public AdvanceList(String input) throws MyException {
			Exception e = null;
			if(isValid(input)) {//to check entered list is is valid or not
				index = 1;
				start=createList(input);
			}
			else
				throw new MyException(e);
		}
	//method to check validation
	private boolean isValid(String input) throws MyException {
		Exception e = null;
		if(input.charAt(0)!='(')
			input = '('+input;
		else if(input.charAt(input.length()-1)!=')')
			input = input+')';
		else if (input.contains("()") || input.contains(",,")
				|| input.contains(")("))
			throw new MyException(e);
		else if(input.charAt(1) == ')' || input.charAt(1) == ',')
			throw new MyException(e);
		char currentChar;
		int count=0;
		int openBrac=0;
		int closeBrac=0;
		int comma=0;
		int countElement=0;
		currentChar=input.charAt(count);
		while(count < input.length()) {
			switch (currentChar) {
			case '(':
				openBrac++;
				count++;
				if(count < input.length()) {
					currentChar=input.charAt(count);
				}
				break;
			case ')':
				closeBrac++;
				count++;
				if(count < input.length()) {
					currentChar=input.charAt(count);
				}
				break;
			case ',':
				comma++;
				count++;
				if(count < input.length()) {
					currentChar=input.charAt(count);
				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				count++;
				currentChar=input.charAt(count);
				while(currentChar > '0' && currentChar < '9') {
					count++;
					currentChar=input.charAt(count);
				}
				countElement++;
				break;
			default:
				throw new MyException(e);
			}
		}
		if(countElement-1 != comma) {
			return false;
		}
		if(closeBrac != openBrac) {
			return false;
		}
		else {
			return true;
		}
	}
	//method to create a list if list is valid
	private Node createList(String input) {
		currentChar = input.charAt(index);
		Node head = null;
		Node previous = null;
		while(index < input.length()-1) {
			switch (currentChar) {
			case '(':
				index++;
				if(index < input.length()) {
					currentChar=input.charAt(index);
				}
				Node newNode = new Node();
				newNode.setNestedList(true);
				newNode.setNext(null);
				newNode.setData(createList(input));
				if(head == null) {
					head = newNode;
					previous = newNode;
				}
				else {
					previous.setNext(newNode);
					previous = newNode;
				}
				break;
			case ',':
				index++;
				currentChar = input.charAt(index);
				break;
				//case for take integer values from list
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				String number = Character.toString(currentChar);
				index++;
				currentChar=input.charAt(index);
				while(currentChar > '0' && currentChar < '9') {
					number += currentChar;
					index++;
					currentChar=input.charAt(index);
				}
				//to convert number string in integer
				int data = Integer.parseInt(number);
				//create a new node with tag false
				Node newNode1 = new Node();
				newNode1.setNestedList(false);
				newNode1.setData(data);
				newNode1.setNext(null);
				if(head == null) {
					head = newNode1;
					previous = newNode1;
				}
				else {
					previous.setNext(newNode1);
					previous = newNode1;
				}
				break;
			case ')': 
				index++;
				currentChar = input.charAt(index);
				break;
			default :
				break;
			}
		}
		return head;
	}
	//method to get maximum value from entered list
	private int maxHelper(Node start) {
		if(start == null) {
			return max;
		}
		else {
			if(start.isNestedList() == false) {
				if(max < (int) start.getData())
					max = (int) start.getData();
				start = start.next;
				maxHelper(start);
			}
			else {
				Node start1 = (Node) start.getData();
				maxHelper(start1);
				start = start.getNext();
				maxHelper(start);
			}
		}
		return max;
	}
	//method to get sum of integers value from entered list
	private int sumHelper(Node start) {
		if(start == null) {
			return sum;
		}
		else {
			if(start.isNestedList() == false) {
				sum += (int) start.getData();
				start = start.next;
				sumHelper(start);
			}
			else {
				Node start1 = (Node) start.getData();
				sumHelper(start1);
				start = start.getNext();
				sumHelper(start);
			}
		}
		return sum;
	}
	//method for max
	public int getMax() throws MyException {
		MyException e = null;
		if(start == null) {
			throw new MyException(e);
		}
		else
		return maxHelper(start);
	}
	//method for sum
	public int getSum() throws MyException {
		MyException e = null;
		if(start == null) {
			throw new MyException(e);
		}
		else
		return sumHelper(start);
	}
	//method to find a specific number
	private boolean findHelper(int number,Node start) {
		if(start == null) {
			return isFound;
		}
		else {
			if(start.isNestedList() == false) {
					if((int)start.getData() == number)
						return (isFound = true);
				start = start.next;
				findHelper(number,start);
			}
			else {
				Node start1 = (Node) start.getData();
				findHelper(number,start1);
				start = start.getNext();
				findHelper(number,start);
			}
		}
		return isFound;
	}
	//method for search
	public boolean find(int number) throws MyException {
		MyException e = null;
		if(start == null) {
			throw new MyException(e);
		}
		else
		return findHelper(number,start);
	}
}
