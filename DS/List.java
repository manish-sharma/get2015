import java.util.*;
/**
 * for the list
 * @author Ravika
 *@since 10/5/2015
 */
public class List {
	ListNode first;
	private int max;
	private int sum;
	private int size;
	private int index;
	private String  input;
	private char currentChar = 0 ;
	/**
	 * to create empty list
	 */
	public List() {
		first = null;
	}
	/**
	 * to create list with given input
	 * @param input
	 */
	public List(String input) {
		max = Integer.MIN_VALUE;
		sum = 0;
		index = 1;
		size = 0;
		this.input = input;
		if(isInputValid(input)){
			first = createList();
		} else {
			System.out.println("Input is not valid ");
		}
	}
	
	/**
	 * check the validity of input
	 * @param input
	 * @return true if input valid otherwise return false
	 */
	public static boolean isInputValid(String input) {
		char presentChar = 0;
		int countOpen = 0;
		int countClose = 0;
		int countNumber =0 ;
		int countComma = 0;
		int otherChar = 0;
		int count = 0;
		while( count < input.length()) {
			presentChar = input.charAt(count);
			switch(presentChar) {
			case '(':
				count++;
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				countOpen++;
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
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				while( presentChar >= '0' && presentChar <= '9' ) {					
					count++;	
					if(count < input.length()) {
						presentChar = input.charAt(count);
					} else {
						break;
					}
				}
				countNumber++;
				break;
			case ')':
				count++;
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				countClose++;
				break;
			case ',':
				count++;
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				countComma++;
				break;
			default :
				count++;
				if(count < input.length()) {
					presentChar = input.charAt(count);
				}
				otherChar++;
				break;
			}
		}
		if(countClose != countOpen || countOpen <= 0) {
			return false;
		} else if((countNumber-1) != countComma) {
			return false;
		} else if(otherChar != 0) {
			return false;
		}
		return true; 
		
	}
	
	/**
	 * check is list empty or not
	 * @return
	 */
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * creat the list of input
	 * @return first of the created list
	 */
	private ListNode createList( ) {
		ListNode list = null;
		ListNode prev = null;		
		int flag = 1;
			if(index < input.length()) {
				currentChar = input.charAt(index);
			}
			
			do{
				switch (currentChar) {
				case '(':
					index++;
					System.out.println(list);
					ListNode newNode = new ListNode();
					newNode.setFlag(1);
					newNode.setData(createList());
					newNode.setNext(null);
					
					
					if(list == null) {
						list = newNode;
						prev = newNode;
					} else {
						prev.setNext(newNode);
						prev = newNode;
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
					String number = Character.toString(currentChar);
					index++;
					
						currentChar = input.charAt(index);
					
					while( currentChar >= '0' && currentChar <= '9' ) {
					
						number += currentChar;
						index++;
				
							currentChar = input.charAt(index);
					
					}
					int data = Integer.parseInt(number);
					size++;
					ListNode newNode1 = new ListNode();
					newNode1.setFlag(0);
					newNode1.setData(data);
					newNode1.setNext(null);
					if(list == null) {
						list = newNode1;
						prev = newNode1;
					} else {
						prev.setNext(newNode1);
						prev = newNode1;
					}
					
					break;
				
				case ',':
					index++;
					
					currentChar = input.charAt(index);
					break;
				case ')' :
					flag = 0;
					index++;
					if(index < input.length()) {
						currentChar = input.charAt(index);
					}
					System.out.println(list);
					return list;
				default:
						flag = 0;
						break;
				}
				
			} while( flag != 0 || index < input.length());
		return list;
		
	}
	
	/**
	 * traverse the list
	 */
	public void traverse(){
		if(isEmpty()) {
			System.out.println("The list is empty");
			return;
		}
		traverseTemp(first);
		System.out.println();
	}
	
	/**
	 * help traverse method to traverse by recursion 
	 * @param first first node of list
	 */
	private void traverseTemp(ListNode first) {
		while(first != null ) {
			if(first.getFlag() == 0){
				System.out.print(first.getData() + ", ");
				sum += (Integer)first.getData();
				if(max<(Integer)first.getData()) {
					max =(Integer)first.getData();
				}
				first = first.getNext();
			} else {
				ListNode first1 = (ListNode)first.getData();
				traverseTemp(first1);
				first = first.getNext();
			}
		}
		
	}
	
	/**
	 * find the given element 
	 * @param searchingElement
	 * @return true if element found otherwise false
	 */
	public boolean find(int searchingElement) {
		if(size ==0 ) {
			System.out.println("There is no element in List");
			return false;
		} 
		
		return findTemp(first, searchingElement);
	}
	
	/**
	 * help find method to traverse by recursion 
	 * @param first
	 * @param searchingElement
	 *  @return true if element found otherwise false
	 */
	private boolean findTemp(ListNode first,int searchingElement) {
		boolean isFound = false;
		while(first != null ) {
			if(first.getFlag() == 0){
			
				if(searchingElement == (Integer)first.getData()) {
					isFound = true;
				}
				first = first.getNext();
			} else {
				ListNode first1 = (ListNode)first.getData();
				isFound = (findTemp(first1, searchingElement) || isFound);
				first = first.getNext();
			}
		}
		return isFound;
	}
	
	/**
	 * return the max element
	 * @return
	 */
	public int max() {
		if(size ==0 ) {
			System.out.println("There is no element in List");
		}
		return max;		
	}
	/**
	 * return the sum of all the elements in the list
	 * @return
	 */
	public int sum() {
		if(size ==0 ) {
			System.out.println("There is no element in List");
		}
		return sum;
	}
	
	/**
	 * return the size of the list
	 * @return
	 */
	
	public int size() {
		return size;
	}
	
	/**
	 * to make the user interface
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List list = null;
		Scanner scanner = new Scanner(System.in);
		String input = null;
		int choice = -1;
		do {
			List.printMenu(); 
			while(!scanner.hasNextInt()) {
				System.out.println("Please Enter only Integer!");
				scanner.next();
			}
			choice = scanner.nextInt();
			while(choice < 1 || choice >8) {
				System.out.println("Please enter valid integer!");
				choice = scanner.nextInt();
			}
			switch (choice) {
			case 1:
				System.out.println("Enter the Input ");
				input = scanner.next();
				break;
			case 2:
				if(input == null ) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println(List.isInputValid(input));
				break;
			case 3 :
				if(input == null ) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				list = new List(input);
				break;
			case 4:
				if(input == null ) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				list.traverse();
				break;
			case 5:
				if(input == null ) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println("Max = " + list.max());
				break;
				
			case 6:
				if(input == null ) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println("Sum = " + list.sum());
				break;
				
			case 7:
				if(input == null ) {
					System.out.println(" Please firstly Enter The input ");
					break;
				}
				System.out.println("Enter an element to find");
				while(!scanner.hasNextInt()) {
					System.out.println("Please Enter only Integer!");
					scanner.next();
				}
				int searchingElement = scanner.nextInt();
				System.out.println("Find = " + list.find(searchingElement));
				break;
			case 8:
				scanner.close();
				System.exit(0);
			}
		} while(choice != 8 );
		
		// list = new List("(3,4,(1,2),5,6,7,(8))");				
	}
	
	public static void printMenu(){
		System.out.println(" Enter 1for give the input \n 2 for the Check the validity of input \n 3 "
				+ "for the list Creation \n 4 for the list display \n 5 for the Maximum Number in List \n 6 for the Sum Of elements "
				+ "\n 7 to find the element in List \n 8 for Exit");
	}
}
