/****************************************************************************************
Name            : StackUsingLinkList
Revision Log    : 2015-08-27: Babalu patidar : created.
                : 
                : 
Use             : This class is used to perform all opertion of stack
                :
****************************************************************************************/
import java.util.Scanner;


public class StackUsingLinkList {
	
	 Object object;
	 StackUsingLinkList next;
	 static StackUsingLinkList top = null;	
	
	
	public StackUsingLinkList() {
		object=null;
		next=null;	
	
	}
	
	//Method is used for insert an element in stack
	void push(Object item){
		StackUsingLinkList newnode=new StackUsingLinkList();
		newnode.object = item;		
		newnode.next = top;			
		top = newnode;
	}
	
	//Method is used to perform pop operation
	void  pop(){
		if(top!=null){
			top=top.next;

		}
		else {
			System.out.print("Stack is empty");
		}
	}
	
	//Method is used for display stack
	void display(){
		StackUsingLinkList curr=top;
		System.out.print("Stack = : ");
		while(curr!=null){
			System.out.print(curr.object+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	
	//Start of main method
	public static void main(String ag[]){
		StackUsingLinkList stack = new StackUsingLinkList();
		int choice=0;
		Scanner scan=new Scanner(System.in);
		
		do{
			
			System.out.println("Enter your choice \n1. push \n2. pop \n3. exit..");
			choice=scan.nextInt();
			
			if(choice==1){
				System.out.println("Enter an item");
				stack.push(scan.next());
				stack.display();
			}
			else if(choice==2){
				stack.pop();
				stack.display();
			}
			else{
				System.out.println("Enter correct choice..");
			}
			
			
		}while(choice!=3);
		
		scan.close();
		
	}
	
	
	
	
	

}
