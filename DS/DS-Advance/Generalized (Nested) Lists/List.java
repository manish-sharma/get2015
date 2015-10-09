package assignmentDS_Advance;

public class List 
{
	public ListNode first;
	private int index;
	private String  input;
	private char currentChar = 0 ;
	public List() {
		first = null;
	}
	public List(String input) {
		
		index = 1;
	    this.input = input;
		if(isInputValid(input)){
			first = createList();
		} else {
			System.out.println("Input is not valid ");
		}
		

	}

	public int findMax(ListNode first)
	{
		int max=0;
		ListNode temp=first;
		while(temp!=null)
		{
			if(temp.getFlag()==1)
			{
				int temp1=findMax((ListNode) temp.getData());
				if(temp1>max)
				{
					max=temp1;
				}
				
				
			}
			else
			{
				if((Integer)temp.getData()>max)
				{
					max=(Integer) temp.getData();
					
				}
			}
			temp=temp.getNext();
		}
		
		return max;
	}
	
	public int findSum(ListNode first)
	{
		int sum=0;
		ListNode temp=first;
		while(temp!=null)
		{
			if(temp.getFlag()==1)
			{
				sum+=findSum((ListNode) temp.getData());
				
			}
			else
			{
				sum+=(Integer) temp.getData();
				
			}
			temp=temp.getNext();
			
		}
		return sum;
		
	}
	public boolean find(int x,ListNode first)
	{
		boolean found=false;
		ListNode temp=first;
		while(temp!=null)
		{
			if(temp.getFlag()==1)
			{
				boolean check=find(x,(ListNode) temp.getData());
				if(check)
				{
					found=true;
				}
			}
			else
			{
				if((Integer)temp.getData()==x)
				{
					found=true;
				}
			}
			temp=temp.getNext();
			
		}
		return found;
		
	}
	
	
    public static boolean isInputValid(String input) 
    {
    	int countComma=0,countOpen=0,countClose=0,countNumber=0,countOther=0;
    	
    	boolean temp=false;;
    	int count=0;
    	for(count=0;count<input.length();count++)
    	{
    		char ch=input.charAt(count);
    		switch(ch)
    		{
    		case'(':
    			countOpen++;
    			break;
    		case')':
    			countClose++;
    			break;
    		case'0':
    		case'1':
    		case'2':
    		case'3':
    		case'4':
    		case'5':
    		case'6':
    		case'7':
    		case'8':
    		case'9':
    			count++;
    			while(count<input.length()&&input.charAt(count)>='0'&&input.charAt(count)<='9')
    			{
    				count++;
    			}
    			count--;
    			countNumber++;
    			break;
    		case',':
    			countComma++;
    			break;
    		default:
    			countOther++;
    		}
    		
    		
    	}
    	if((countOpen==countClose)&&(countComma==countNumber-1)&&countOther==0&&countOpen!=00)
    	{
    		
    		temp=true;
    		
    	}
    	
		
		return temp;
	}
    
    
	
	private ListNode createList() 
	{
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
				//	System.out.println(list);
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
					//size++;
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
				//	System.out.println(list);
					return list;
				default:
						flag = 0;
						break;
				}
				
			} while( flag != 0 || index < input.length());
		return list;
	}
	public static void printMenu(){
		System.out.println("\n\n 1. Display the  generalized list. \n 2. Maximum Number in List \n 3. Sum Of elements "
				+ "\n 4. Find the element in List \n ");
	}
	
	public static void main(String args[])
	{
		
		String input="(1,1,(4,7),4,(2,0))";
		int max=0;
		int sum=0;
		boolean found=false;
		List list=new List(input);
		boolean temp=List.isInputValid(input);
		System.out.print("temp is "+temp);
		if(temp)
		{
		 max=list.findMax(list.first);
		 sum=list.findSum(list.first);
		 found=list.find(90, list.first);
		 
		}
		System.out.print("max is "+max);
		System.out.print("sum is "+sum);
		System.out.print("found is "+found+"\n\n");
		
	//	list.print(list.first);
		System.out.println(list.first);
		

	}


}
