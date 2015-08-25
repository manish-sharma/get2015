import java.util.Scanner;


public class AddElement {
	int position;
	Scanner scan = new Scanner(System.in);
	public  Node<Integer> addAtStart( Node<Integer> first) {
		Node<Integer> nextNew;
		Node<Integer> pre;
		 System.out.println("Enter item:");
			Integer item =scan.nextInt();
		if(SinglyLinkedList.first == null){
			
			 nextNew = new Node<Integer>(item); 
			 pre = nextNew;
			first=pre;
			pre.next=null;
	}
		else{
			 nextNew = new Node<Integer>(item); 
			 pre = nextNew;
			pre.next = first;
			first=pre;
		}
		return first;
	}
	public  Node<Integer> addAtLast( Node<Integer> first) {
		
		Node<Integer> nextNew=null;
		Node<Integer> pre=null;
		 System.out.println("Enter item:");
		 Integer item =scan.nextInt();
		if(SinglyLinkedList.first == null){
			
			 nextNew = new Node<Integer>(item); 
			 pre = nextNew;
			first=pre;
			pre.next=null;
	}
		
		else{  
			pre=first;
			while(pre.next != null){
				pre=pre.next;	
				
			}
			
			 nextNew=new Node<Integer>(item);
             pre.next=nextNew;
             nextNew.next=null;
            
		}
		return first;
	}
	public Node<Integer> addAtPosition(Node<Integer> first) {
		  int count = 1;
		  Node<Integer> nextNew=null;
		  Node<Integer> pre=null;
		  System.out.println("Enter Position:");
		  int position = scan.nextInt();
		  System.out.println("Enter item:");
		  Integer item =scan.nextInt();
		  pre=first;
			if(pre == null){
				System.out.println("List is Empty");
				return first;
			}
			else{
				while(count < position-1){
					pre=pre.next;
					count++;
				
				}
					nextNew=new Node<Integer>(item);
					
					nextNew.next = pre.next;
					pre.next=nextNew;
					
				
				
			}
		return first;
	}
		
	}

