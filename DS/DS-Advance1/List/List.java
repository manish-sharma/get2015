
public class List {
	//first is the reference of list
	ListNode first;
	private int max;
	private int sum;
	//number of atomic element in the list
	private int size; 
	//index hold the track for input list  string
	private int index; 
	private String  input;
	private char currentChar = 0;
	public List() 
	{
		first = null;
	}
	
	// constructor to hold list in form of string
	public List(String input) 
	{
	   //Initially max value of list is minimum integer value
		max = Integer.MIN_VALUE;
		sum = 0;
		index = 1;
		size = 0;
		this.input = input;
		first = createList();

	}

	/* Method to create generalized list
	 * @return head reference to head node of list
	 */
	private ListNode createList() 
	{ 
		ListNode head = null;
		ListNode prev = null;
		// flag is initially set to 1 
		int flag = 1;
		if(index < input.length()) 
		{
			currentChar = input.charAt(index);
		}
		// do while loop to to create the list until the input string is fully traversed
		 do{
			switch (currentChar)
			{
			
				// if currentChar is '(' then this case will be executed 
				case '(':
					
					// increase index value
					index++;
					// creating a new node
					ListNode newNode = new ListNode();
					//setting the tag value to 1 of the newly created node 
					newNode.setTag(1);
					// recursively call the method to create list
					newNode.setData(createList());
					// next of the node is null
					newNode.setNext(null);
					
					// if head node contains null then the new node will become the head node and prev node.
					if(head == null) 
					{
						head = newNode;
						prev = newNode;
					} 
					
					//If head is not null then new node will be next node to the prev node 
					//and now new node will be the prev node.

					else
					{
						prev.setNext(newNode);
						prev = newNode;
					}
					break;
					
				// If current character is a digit then this case will be executed
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
					
					// number contains the current character in string format
					String number = Character.toString(currentChar);
					index++; 
					currentChar = input.charAt(index);
					
					// iterating until the currentChar is a digit
					while( currentChar >= '0' && currentChar <= '9' ) 
					{						
						number += currentChar;
						index++;
						currentChar = input.charAt(index);
					}
					
					// data will hold the integer representation of the string number 
					int data = Integer.parseInt(number);
					sum = sum + data;
					if(data > max)
					{
						max = data;
					}
					size++;					
					// creating a new node
					ListNode newNode1 = new ListNode();
					newNode1.setTag(0);
					newNode1.setData(data);
					newNode1.setNext(null);
					if(head == null)
					{
						head = newNode1;
						prev = newNode1;
					} 
					else 
					{
						prev.setNext(newNode1);
						prev = newNode1;
					}
					
					break;
				
				// if currentChar is ',' then this case will be executed */
				case ',':
					index++;
					currentChar = input.charAt(index);
					break;
					
				/* if currentChar is ')' then this case will be executed */
				case ')' :
					flag = 0;
					index++;
					if(index < input.length()) {
						currentChar = input.charAt(index);
					}
					return head;
				// If none of the case value matches then this part will be executed 
				default:
						flag = 0;
						break;
				}
			
			} while( flag != 0 || index < input.length());
		return head;
	}
	
	//  Method to traverse the list
	public void traverse(ListNode first) 
	{
		
		if(size == 0) 
		{
			System.out.println("List is empty");
			return;
		}
		// iterating over the list until the list becomes null 
		while(first != null ) 
		{
			
			// if tag value is zero then the node has some integer data otherwise it has reference to another list
			if(first.getTag() == 0)
			{
				System.out.print(first.getData() + ", ");
				first = first.getNext();
			} 
			else 
			{
				// recursive calling of traverse()
				ListNode first1 = (ListNode)first.getData();
				traverse(first1);
				first = first.getNext();
			}
		}
		
	}
	
	//method for return max value
	public int max() 
	{
		if(size == 0) 
		{
			System.out.println("List is empty");
		}
		return max;		
	}
	
	//method return sum of all element
	public int sum() 
	{
		if(size ==0 )
		{
			System.out.println("There is no element in List");
		}
		return sum;
	}

	//method return size
	public int size()
	{
		return size;
	}
	//method for finding an element recursively
	private boolean findTemp(ListNode first,int searchingElement) 
	{
		boolean isFound = false;
		// iterating over the list 
		while(first != null ) 
		{
			if(first.getTag() == 0)
			{
			
				if(searchingElement == (Integer)first.getData())
				{
					isFound = true;
				}
				first = first.getNext();
			}
			else 
			{
				ListNode first1 = (ListNode)first.getData();
				isFound = (findTemp(first1, searchingElement) || isFound);
				first = first.getNext();
			}
		}
		return isFound;
	}
	//method for finding an element
	public boolean find(int searchingElement) 
	{
		if(size == 0 )
		{
			System.out.println("List is Empty");
			return false;
		} 
		return findTemp(first, searchingElement);
	}
	
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		} else {
			return false;
		}
	}
}
