package assignmentDS_2;


class node{
	//data held by the node
	public String nodeValue;
	//next node in the list
	public node next;
	
	
	//default constructor with no initial value
	public node() {
		super();
		this.nodeValue = null;
		this.next = null;
	}

	
	//initialize node value to the item and set next to null
	public node(String item) {
		super();
		this.nodeValue = item;
		this.next = null;
		
	}
	
}

class Stack 
{
	node top;
	
	
	//default constructor
	public Stack() {
		super();
		top=null;
	}
	
	//below function is use to push data in Satck
	public void push(String data)
	{
		node  newNode=new node(data);
		if(top==null)
		{
			top=newNode;
		}
		else
		{
			newNode.next=top;
			top=newNode;
		}
		
	}
	
	//below function is used to pop data from stack where it remove top element and return it
	public String pop()
	{
		node temp=top;
		if(temp!=null)
		{
			top=top.next;
		}
		else
			return "";
		return temp.nodeValue;
	}
	
	//below function is use to check whether given stack is empty or not
	public boolean isEmpty()
	{
		if(top==null)
			return true;
		return false;
	}
	
	//below code is use to return only top element of stack
	public String peek()
	{
		if(top==null)
			return "";
		return top.nodeValue;
	}
	
	//below element is use to print all element of stack
	public void show()
	{
		node temp=top;
		while(temp!=null)
		{
			System.out.println(temp.nodeValue);
			temp=temp.next;
			
			
		}
		
	}
	
	
}
/*
 *Below class is use to convert infix notation to postfix notation
 *
 */
class InfixToPostfix
{
	//below function is taking infix string and return postfix notation of it
	public String infix2Postfix(String infix)
	{
		int i=0;
		String postfix="";
		Stack stack=new Stack();
		while(!infix.equals(""))
		{
		   i++;
			String str=infix.substring(0, 1);
		
			infix=infix.substring(1);
			
			if(str.equals("("))
			{
				
				stack.push(str);
			}
			else if(str.equals(")"))
			{
				while(!stack.peek().equals("("))
				{
					
					postfix+=stack.pop();
					
				}
			   	stack.pop();
			}
			else if(isOperator(str))
			{
				if(stack.isEmpty())
				{	
					stack.push(str);
				}
				else
				{	
					while(precendenceOf(stack.peek())>=precendenceOf(str))
					{
						String popedString=stack.pop();
						postfix+=popedString;
						
					}
					stack.push(str);
					
				}
				
			}
			else
			{
			postfix+=str;
			
			}
			
		}
		while(!stack.peek().equals(""))
		{
			postfix+=stack.pop();
		}
		
		
		return postfix;
	}
	
	//below function is to check whether given string is operator or not
	public boolean isOperator(String str)
	{
		
		switch(str)
		{
		case "+":
		case "-":
		case "*":
		case "/":
		case "^":
			return true;
		
		}
		return false;
	}
	
	//below function is to find precedence of operator
	public int precendenceOf(String str)
	{
		switch(str)
		{
		case"^":
			return 3;
		case "*":
		case "/":
			return 2;
		case "+":
		case "-":
			return 1;
			
		}
		return 0;
	}
	
}


