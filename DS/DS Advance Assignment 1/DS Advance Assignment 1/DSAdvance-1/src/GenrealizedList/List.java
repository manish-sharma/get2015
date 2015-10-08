package GenrealizedList;
/**This class creates the list from the given string and performs functions like sum of all the elements of 
 * the list,maximum elements of the list,search for a node and displays the node
 * @author Shishir
 *Date 4th October 2015
 */
public class List {
	Node root;

	String list, str = "";
	int position = 0;

	//Default constructor
	public List() {
		list = null;
	}
    //Parameterized constructor
	public List(String string) {
		list = string;
	}
   /**This function inserts the node in the list by creating them and linking them based on whether they are 
    * single element or sub-list
    * @param node
    */
	void insert(Node node) {
        //condition to check if list is traversed or not 
		if (position < list.length()) {
			//if their is no node created then 
			if (node == null) {
				Node temp;
				//if the character is starting bracket then its the list
				if (list.charAt(position) == '(') {
					temp = new Node(1, null);//creating new node
				} else { //if character is not braces then adding the data to string to add to the node

					while (list.charAt(position) != ','
							&& list.charAt(position) != '('
							&& list.charAt(position) != ')') {
						str += list.charAt(position);//adding the data to the string
						position++;
						System.out.println(str);
					}
					temp = new Node(0, Integer.parseInt(str));//creating new node temp and andding the string data to it 
					str = "";
				}
				root = temp;
				position++;//incrementing the position
				insert(temp);//recursive call to function
			} else if (list.charAt(position) == '(') {//if list is already created then check for the cases which need not to be added in list
				Node temp = new Node(1, null);
				node.setNextNode(temp);//set current node pointer to point towards the temp node
				position++;
				insert(node.getNextNode());//recursive call 
				insert(node.getNextNode());//recursive call
			} else if (list.charAt(position) == ')') {//if the character is closing braces then the list is finished
				position++;
				return;//returns null;
			} else if (list.charAt(position) == ',') {//if the character is comma then next element can be either list of data so need to be inserted into list
				position++;
				insert(node);
			} else {//if the character is an element 
				while (list.charAt(position) != ','
						&& list.charAt(position) != '('
						&& list.charAt(position) != ')') {
					str += list.charAt(position);
					position++;
				}
				position--;
				Node temp = new Node(0, Integer.parseInt(str));//creating a new node 
				str = "";
				if (node.getTag() == 0) {//if tag is zero of current node then set new node as it linked node 
					node.setNextNode(temp);
					System.out.println("node is created  0 tag->"
							+ temp.getData() + "+" + node.getData());
					position++;
					insert(temp);//recursive call
                //if tag is 1 and data field is not null then it already contains sub list
				} else if (node.getTag() == 1 && node.getData() != null) {
					node.setNextNode(temp);//set current node next pointer to temporary node
					System.out
							.println("node is created  0 tag and store in main list->"
									+ node.getNextNode().getData());
					position++;
					insert(temp);//recursive call 
				} else {//if current node tag is 1 and contains null

					node.setData(temp);//set data pointer to new node 
					System.out
							.println("node is created 0 tag and store under sublist->"
									+ temp.getData());
					position++;
					insert(temp);//recursive call to function
				}

			}

		}
	}
    /**This function finds the sum of all the elements of genrealised list
     * 
     * @param node
     * @param sum
     * @return sum
     */
	int sumOfelements(Node node, int sum) {
        //if node is not equal to null
		if (node != null) {
			if (node.getTag() == 0) {//if tag is zero 
				sum = sum + (int) node.getData();//adding the data for calculating the sum
				sum = sumOfelements(node.getNextNode(), sum);//recursive function call
			} else {
				sum = sumOfelements((Node) node.getData(), sum);//recursive function call
				sum = sumOfelements(node.getNextNode(), sum);//recursive function call

			}

		}
		return sum;//returning the sum
	}
    /**This functions prints the display of list
     * 
     * @param node
     */
	void display(Node node) {
		if (node != null) {//list is not empty
			if (node.getTag() == 0) {//if tag of node is zero then print the data  
				System.out.println(node.getData());
				display(node.getNextNode());//recursive function call

			} else {
				display((Node) node.getData());//recursive function call
				display(node.getNextNode());

			}

		}

	}
   /**This function finds the maximum elements in the list
    * 
    * @param node
    * @param max
    * @return max
    */
	int max(Node node, int max) {
		if (node != null) {//if the list is not empty 
			if (node.getTag() == 0) {//if tag is zero 
				if (max < (int) node.getData())//if maximum element is less then the current node data 
					max = (int) node.getData();//update the maximum value 
				max = max(node.getNextNode(), max);//recursive function call

			} else {
				max = max((Node) node.getData(), max);//recursive function call
				max = max(node.getNextNode(), max);//recursive function call

			}

		}
		return max;//return maximum element 
	}
    /**This function search the particular element in the list
     * 
     * @param node
     * @param element
     * @param search
     * @return search
     */
	boolean search(Node node, int element, boolean search) {
		if (node != null) {//if the node is not null then list exists 
			if (node.getTag() == 0) {//if tag is zero then check for elements
				if ((int) node.getData() == element) {//checking the element for the required value
					return true;//return true value

				}
				search = search(node.getNextNode(), element, search);//recursive function call

			} else {

				search = search((Node) node.getData(), element, search);//recursive function call
				search = search(node.getNextNode(), element, search);//recursive function call
			}

		}
		return search;//return search
	}
}