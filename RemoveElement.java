import java.util.Scanner;


public class RemoveElement {
          Scanner scan = new Scanner(System.in);
	
public Node<Integer> removeFromStart(Node<Integer> first) {
		 
	
		Node<Integer> pre=null;
		
		if(SinglyLinkedList.first == null){
			
			System.out.println("List is Empty");
	}
		
		else{  
			pre=first;
			pre=pre.next;	
			first=pre;
			}
			
			
		return first;
	}

	public Node<Integer> RemoveFromLast(Node<Integer> first) {
		
		Node<Integer> pre=null;
		Node<Integer> next = null;
		if(SinglyLinkedList.first == null){

			System.out.println("List is Empty");
		}
			
		
		else{  
			pre=first;
			while(pre.next != null){
				 next = pre;
				pre=pre.next;	
			}
		        next.next=null;
		}
		return first;
	}

	public Node<Integer> removeFromPosition(Node<Integer> first) {
		  int count = 1;
		  Node<Integer> next=null;
		  Node<Integer> pre=null;
		  System.out.println("Enter Position:");
		  int position = scan.nextInt();
		  pre=first;
			if(pre == null){
				System.out.println("List is Empty");
				
			}
			else{
				while(count < position-1){
					next = pre;
					pre=pre.next;
					count++;
					}
				if(pre.next != null){
				next.next=pre.next;
				}
				else 
					new RemoveElement().RemoveFromLast(first);
			}
		return first;
	}

	public Node<Integer> removeElement(Node<Integer> first) {
		
		  
		  Node<Integer> next=null;
		  Node<Integer> pre=null;
		  System.out.println("Enter Element:");
		  int element = scan.nextInt();
		  pre=first;
			if(pre == null){
				System.out.println("List is Empty");
				
			}
			else{
				while(pre.nodeData != element){
					next = pre;
					pre=pre.next;
					}
				
				if(pre.next != null){
					next.next=pre.next;
					}
					else 
						new RemoveElement().RemoveFromLast(first);
				}
			
		return first;
	}

	
}
