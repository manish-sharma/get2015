/**
 * @author : Pooja Khandelwal
 * @created Date : 31/08/2015
 * @Name : Heap Class
 * @Description : this class will use heap implementation to send documents to the printer and then to print the document with higher priority
 */
package com.admin.printer;

import java.util.Arrays;

public class Heap<T> {
	private static int heapMaxSize = 1;
	private static int size = 0;
	private static int[] heap;
	private static String[] departmentList;
	private static int nodePriorityValue;

	/**
	 * @Name : default constructor of heap class
	 * @Description : it will create initial memory for heap and then initiallize the heap with max integer value
	 */
	public Heap() {
		heap = new int[this.heapMaxSize];
		departmentList= new String[this.heapMaxSize];
		heap[0] = Integer.MAX_VALUE;
		departmentList[0]=null;
	}

	/**
	 * @Name : addNewPriorityToHeap() function
	 * @param : priority(it will gives the priority of new document ,that has to be sent to the printer)
	 * @Description : it will add new document to the printer
	 * @return : nothing
	 */
	public void addNewPriorityNodeToHeap(String departmentName,int priority) {
		heapMaxSize = heapMaxSize + 1;
		heap = Arrays.copyOf(heap, heapMaxSize);
		departmentList=Arrays.copyOf(departmentList, heapMaxSize);
		size = size + 1;
		heap[size] = priority;
		departmentList[size]=departmentName;
		int currentIndex = size;
		int parentIndex = currentIndex / 2;
		while (parentIndex != 0) {
			if (heap[currentIndex] > heap[parentIndex]) {
				swap(currentIndex, parentIndex);
				currentIndex = parentIndex;
				parentIndex = currentIndex / 2;
			} else {
				break;
			}
		}
	}

	/**
	 * @Name : swap() function
	 * @Param : currentIndex(current element index in heap),swapWithIndex(index of the element with which swapping has to be performed)
	 * @Description : it will swap to elements of heap to satisfy Heap property
	 * @return : nothing
	 */
	private void swap(int currentIndex, int swapWithIndex) {
		int temp;
		String temp1;
		temp = heap[currentIndex];
		heap[currentIndex] = heap[swapWithIndex];
		heap[swapWithIndex] = temp;
		temp1 = departmentList[currentIndex];
		departmentList[currentIndex] = departmentList[swapWithIndex];
		departmentList[swapWithIndex] = temp1;
	}

	/**
	 * @Name : removeFromPrinter()
	 * @param : nothing
	 * @Description : it will print the document with highest priority and then remove that document instance from printer
	 * @return : nothing
	 */
	public void removeFromPrinter() {
		int printedDocument_s_priority = 0;
		String printedDocument=null;
		System.out.println("*-----Processing Document Is-----*");
		if (size != 0) {
			printedDocument_s_priority = heap[1];
			printedDocument=departmentList[1];
			System.out.println("Document of        Priority");
			System.out.println(" "+printedDocument+"            "+printedDocument_s_priority);
			heap[1] = heap[size];
			departmentList[1]=departmentList[size];
			size--;
			heapMaxSize = heapMaxSize - 1;
			if(size!=0){
			maxHeapify(1);
			}
		} else {
			System.out.println("there is no document for print");
		}
	}

	/**
	 * @Name : maxHeapify()
	 * @param : current(index of current element in heap) 
	 * @Description : Method to convert heap to MaxHeap and to satisfy the MaxHeap proprties
	 * @return : nothig
	 */
	private void maxHeapify(int current) {
		if (!isLeaf(current)) {
			int leftChild = current * 2;
			int rightChild = (current * 2) + 1;
			if(rightChild<=size){
			if (heap[current] < heap[leftChild]
					|| heap[current] < heap[rightChild]) {
				if (heap[leftChild] > heap[rightChild]) {
					swap(current, leftChild);
					current = leftChild;
					maxHeapify(current);
				} else {
					swap(current, rightChild);
					current = rightChild;
					maxHeapify(current);
				}
			}
		}
			else{
				if (heap[current] < heap[leftChild]) {
						swap(current, leftChild);
				}
			}
		}
	}

	/**
	 * @Name : isLeaf()
	 * @param : current(index of current element in heap
	 * @description : To check if the node is leaf node or not
	 * @return : boolean value(either true or false)
	 */
	private boolean isLeaf(int current) {
		if (current >= (size / 2) && current <= size) {
			return true;
		}
		return false;
	}

	/**
	 * @Name : showDocumentsOnHeap()
	 * @param : nothing
	 * @description : to show the documents which still on printer to process
	 * @return : nothing
	 */
	public void showDocumentsOnHeap() {
		System.out.println("*-----Documents To Be Processed-----*");
		if (size == 0) {
			System.out.println("No document on printer to process");
		} else {
			System.out.println("Document of        Priority");
			for (int i = 1; i <= size; i++) {
				System.out.println(" "+departmentList[i]+"            "+heap[i]);
			}
		}
	}
}
