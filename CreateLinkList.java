import java.util.Scanner;


public class CreateLinkedList {
      Node<Integer> nextNew;
      Scanner scan = new Scanner(System.in);
      Node<Integer> pre;
public Node<Integer> createLinkedList(){
	          Integer item = null;
	          Node<Integer> first;
	          first =null;
	          int count=0;
	          System.out.println("Enter no of items:");  
	         
			int n=scan.nextInt();
	          System.out.println("Enter items:");
	      
			
			if(first == null){
	        	 
	        	  item =scan.nextInt();
	        	  nextNew=new Node<Integer>(item); 
	        	  pre=nextNew;
	        	  first=pre;
	        	  pre.next=null;
	        	  count++;
	          }
	          
	        	  while(count < n){
	          item =scan.nextInt();
		      nextNew=new Node<Integer>(item);
              pre.next=nextNew;
              pre=nextNew;
              count++;
          
	          }
	 return first;                
	}
}
