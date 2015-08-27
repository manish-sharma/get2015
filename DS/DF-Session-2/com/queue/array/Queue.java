package com.queue.array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Queue {
	 static Scanner scan = new Scanner(System.in);
	   String [] queue = new String[50];
	   int front =-1;
	   int rear = -1;
	   int max =50;
	   /*
		 * to find last added element
		 */
		
		void getRecentlyAddedItem() {
			System.out.println("Recently added item is- "+queue[rear]);
			
		}

	/*
	 * to make queue empty
	 */
		public void makeEmptyQueue() {
			int flag = 0;
			System.out.println("You want to make Empty Queue If yes then press 1 Else press 0");
			int deleteQueue = scan.nextInt();
			if(deleteQueue  == 0) flag =1;
		       if(deleteQueue == 1) flag =1;
		       while((flag != 1))
		       {
		    	   System.out.println("choose valid option:");
		    	   deleteQueue = scan.nextInt();
		    	   if(deleteQueue == 0) flag =1;
			       if(deleteQueue == 1) flag =1;
		       }
		       if(deleteQueue == 1){
		    	   front=-1;
		    	   rear=-1;
		       }

			
		}
		/*
		 * method to delete item from queue from start
		 */
		public void deleteItem() {
			
			if(front == -1)
				System.out.println("Queue is Empty");
				else{
					System.out.println(queue[front]);
					front=front+1;
					}
				
			
		}
		
		/*
		 * method to display Queue items
		 */
		  public void display(){
			      
			  if(front == -1)
					System.out.println("Queue is Empty");
					else{
						for(int i =front; i<=rear;i++){
							System.out.println(queue[i]);
						}
					}
		  }
		
		/*
		 * method to add item in Queue
		 */
		public void enQueue(String string){
			 
			    if((rear == max-1)&& (front == 0)){                                      // when space not available
				                System.out.println("Queue Overflow");
			                  }
		    	else{
				       if(front == -1){                                     // when queue is empty
				             	front =0;
					            rear =rear+1;
					            queue[rear] = string;
				               }
				      else	if((rear == max-1)&& (front != 0)){                 // Pseudo Queue is full
				    	  		rear =0;
				    	  		queue[rear] =string;
				      			}
				      else{
				    	  rear++;                                      // normal condition
				    	  queue[rear] = string;
				        }
				
		    		}
				}
}
