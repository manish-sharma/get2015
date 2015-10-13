package com.ds4.printer;
/*This class implements the main function takes the input from user and show what the allocation of the user and 
 * job as well as prints the message
 * @author Shishir Pareek
 * Date 31st Aug 2015
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrinterMain {

	public static int counter = 0;
	/*function to add data to array for processing by removing from the priority queue and performing heapsort on that array
	 * @param Queue
	 */
	public static void addData(Queue priorityQueue) {
		int temp,i;
		if(counter<=0) {
			return;
		}
		else {
				temp= counter;	
				Node[] array = new Node[temp];	
				i=0;
				while(temp!=0){
					array[i]=(Node) priorityQueue.remove();
					i++;
					temp--;
				}
					PrinterAllotment.heapSort(array);
					//System.out.println(array.length);
					for(int j = array.length-1;j>=0;j--  ){ 
						priorityQueue.add((Node)array[j]);
					}
		}
	}
	/*main method*/
	public static void main(String args[])
	{  
		Scanner sc = new Scanner(System.in);
		//Queue<Node> priorityQueue = new Queue<Node>();
		
		Queue<Node> priorityQueue=new LinkedList<Node>();
		String priorityNo = "-1";
		String name = "";
		String department = "";
		String message = "";
		
		String choice;
		String regix="[0-9]+";
		while(true) {//loop to show the menu to user
			System.out.println("Enter 1 for send data to print ");
			System.out.println("Enter 2 for show printer allocation sequence");
			System.out.println("Enter 3 for exit");
			choice = sc.nextLine();
			switch(choice) {
				case "1" : //if user chooses 1st option
							do{
							System.out.println("Enter user type(1 for UG, 2 for PG, 3 for Prof., 4 for charirman)"); 
						    priorityNo = sc.nextLine();
							}while(!(priorityNo.matches(regix)));
						    
						    int priority=Integer.parseInt(priorityNo);
						    /*contdition to make sure that user enter correct priority*/
						    while( !(priority > 0 && priority<=4) ){
						    	System.out.println("Please enter values (1/2/3/4) as input");
						    	priority = sc.nextInt();
						    }
					 
					 if(priority==1) {
						 department = "UG";
					 }
					 else if(priority==2) {
						 department = "PG";
					 }
					 else if(priority==3) {
						 department = "Professors";
					 }
					 else{
						 department = "Chairman";
					 }
					 System.out.println("Enter Enter your name ");
					 name = sc.nextLine();
					 System.out.println("Enter Enter your message ");
					 message = sc.nextLine();
					 Node node = new Node(priority,name,department,message);
					 priorityQueue.add(node);
					 counter++;
					 addData(priorityQueue);
				break;
                 /*if user choose to print the allocation of jobs and message*/
				case "2" :System.out.println("---------------Printing data---------------");
						if(counter<=0) {
							System.out.println("\nNo current request on printer\n");
						}
						else {
								System.out.println(priorityQueue.remove());
								counter--;
						}
					
				break;
			     /*if user wishes to exit the system*/	
				case "3": return;
					
				default: System.out.println("\nPlease enter right input\n");
			
			}
		}

	}
    }

