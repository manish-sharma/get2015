package com.ds5.queue;

import java.util.LinkedList;
/** This class implements queue using Linked List 
 * 
 * @author Shishir
 * Date 31st August 2015
 */
public class Queue {

		LinkedList<Integer> linkedList = new LinkedList<Integer>();//linkedlist object

		/**function to add element in queue
		 * 
		 * @param element
		 */
		public void enqueue(int element) {
			linkedList.addLast(element);
		}
        /**function to delete element in queue
         * 
         * @return integer
         */
		public int dequeue() {
			return (linkedList.removeFirst());
		}
        /**function to display the queue
         * 
         */
		public void display() {
			for (Integer s : linkedList) {
				System.out.println(s);
			}
		}

	}


