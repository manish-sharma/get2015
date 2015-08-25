
public class Display {

	 public void displayLinkedList(Node<Integer> first) {
		 
		   Node<Integer> pre;
		   pre=first;
		
			if(pre == null){
				System.out.println("List is Empty");
				return;
			}
			else{
		    do{
			    System.out.println(pre.nodeData);
		        pre=pre.next;

		}while(pre != null);}
			}
		 }

