package assignmentDS_4;
/**
 * Here we are handling job on the basis of their priorities
 * @author  Neha Bansal
 * @version 1.0
 * @since   2015-09-1
 * 
**/

import java.util.Scanner;

public class JobHandling {
      public Person queue[];  
      int size;                  
      int currentposition=0;
	public JobHandling() {
		super();
		this.size=20;
		this.queue = new Person[size];
		this.currentposition = 0;
	}
	
	
	/**
	 * This method is use to add current job in Queue
	 * @param index: choice entered by user for their Department
	 * @param id:id of the person
	 * 
	 */
	public void add(int index,int id)
	{
		if(currentposition==size)
		{
			System.out.println("heap is full");
			return;
		}
		switch(index)
		{
		case 1:
		     queue[currentposition]=new Person(id,"Undergraduates",1);
		     break;
		case 2:
		     queue[currentposition]=new Person(id,"Graduates",2);
		     break;
		case 3:
		     queue[currentposition]=new Person(id,"Professor",3);
		     break;
		case 4:
		     queue[currentposition]=new Person(id,"Chair",4);
		     break;
	    default:
	    	System.out.println("You entered incorrect choice");
	    	return;
		    	 
		}
		currentposition++;
		shiftUp(currentposition-1);
	}
	
	/**
	 *below method is use to check if the priority of node at current position is  less then that of its parent
	 *if not then swap it with parent node
	 *@param index :index of the current element
	 */
	public void shiftUp(int index)
	{
	//	System.out.print("index is "+index+"\n");
		int parentIndex;
		if(index>0)
		{
			parentIndex=getparent(index);
			if(parentIndex>=0)
			{
				Person parentDepartment=queue[parentIndex];
				Person childDepartment=queue[index];
				if(childDepartment.priority > parentDepartment.priority)
				{
					//System.out.print(" yes ");
					Person temp=parentDepartment;
					queue[parentIndex]=queue[index];
					queue[index]=temp;
					shiftUp(parentIndex);

				}
			}
		}
		
	}
	
	/**
	 * below method is use to return parent index of current index
	 * @param index :current index
	 * @return parent index
	 */
	public int getparent(int index)
	{
		return (index-1)/2;
		
	}
	
	/**
	 * below method is to print element in queue
	 */
	public void show()
	{
		for(int i=0;i<currentposition;i++)
		{
			Person department=queue[i];
			System.out.print(department.name+" ");
		}
		
	}
	
	/**
	 * below method is to process element at top position and remove it and place element at last position to at first position
	 */
	public void remove()
	{
		if(currentposition==0)
		{
			System.out.println("heap is empty");
			return;
		}
		System.out.println("Job processed is:");
		System.out.println("Job id :"+queue[0].id);
		System.out.println("Job name :"+queue[0].name);
		currentposition--;
		queue[0]=queue[currentposition];
			shiftDown(0);
			
	}
	
	
	/**
	 * below method is check whether element at current position is greater then those at child index
	 * if not them replace them
	 * @param index : current index 
	 */
	public void shiftDown(int index)
	{
		int leftChildIndex, rightChildIndex, maxIndex;
		leftChildIndex=2*index+1;
		rightChildIndex=2*index+2;
		if (rightChildIndex >= currentposition) 
		{
            if (leftChildIndex >= currentposition)
                  return;
            else
                  maxIndex = leftChildIndex;
       } else 
       {
    	   if (queue[leftChildIndex].priority > queue[rightChildIndex].priority)
               maxIndex = leftChildIndex;
           else
               maxIndex = rightChildIndex;
    	  
       }
	   if (queue[index].priority < queue[maxIndex].priority)
	   {
		    Person temp=queue[maxIndex];
			queue[maxIndex]=queue[index];
			queue[index]=temp;
			shiftDown(maxIndex);

	   }
	  
		
		
	}
	/**
	 * below method is use to clear the queue
	 */
	 public void clear()
	   {
		   currentposition=0;
	   }
		
	 
	 /**
	  * main function
	  **/
	public static void main(String args[])
	{
		JobHandling jobHandling=new JobHandling();
		Scanner sc=new Scanner(System.in);
		String ans="yes";
		int choice1;
		int choice2;
		int id;
		do{
			System.out.println("\nAdmin Department Printer(Enter your choice)");
			System.out.println("1.Insert a job");
			System.out.println("2.processing  a job");
			System.out.println("3.clear");
			choice1=sc.nextInt();
			switch(choice1)
			{
			case 1:
				System.out.println("\nEnter your id");
				id=sc.nextInt();
				System.out.println("\nSelect Your Department");
				System.out.println("1.Under Graduate");
				System.out.println("2.Graduate");
				System.out.println("3.Professor");
				System.out.println("4.Chair");
				choice2=sc.nextInt();
				jobHandling.add(choice2, id);
				break;
			case 2:
				jobHandling.remove();
				break;
			case 3:
				jobHandling.clear();
				break;
			default: System.out.println("You entered wrong choice");
					
				
			}
			
			
		System.out.println("\n\nDo you want to continue(press yes for continue)");
		ans=sc.next();
		}while(ans.equalsIgnoreCase("Yes"));
		
		sc.close();
		
	}
	

}
