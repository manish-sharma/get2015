package Heap_jobSorting;

public class Queue {
	String queueArray[];
	int front = -1;
	int rear = -1;
	int rearTemp;

	public Queue(int noOfElementInArray) {
		// TODO Auto-generated constructor stub
		queueArray = new String[noOfElementInArray];
	}

	void enQueue(String item, int priority) {
		//Logic for inserting elements in priority queue

		front++;
		if (front == 0) {
			queueArray[front] = item;
			return;
		}
		if (priority == 4) {
			//Inserting chairman printing request in priority key
			int i = 0;
			int j = front;
			while (queueArray[i].equalsIgnoreCase("chairman")) {
				i++;
				if (queueArray[i] == null) {
					break;
				}
			}
			while (j > i) {
				queueArray[j] = queueArray[j - 1];
				j--;
			}
			queueArray[i] = "chairman";
		} else if (priority == 3) {
			//Inserting professor printing request in priority key
			int i = 0;
			int j = front;
			while (queueArray[i].equalsIgnoreCase("chairman")
					|| queueArray[i].equalsIgnoreCase("professor")) {
				i++;
				if (queueArray[i] == null) {
					break;
				}
			}
			while (j > i) {
				queueArray[j] = queueArray[j - 1];
				j--;
			}
			queueArray[i] = "professor";
		} else if (priority == 2) {
			//Inserting graduate printing request in priority key
			int i = 0;
			int j = front;
			while (queueArray[i].equalsIgnoreCase("chairman")
					|| queueArray[i].equalsIgnoreCase("professor")
					|| queueArray[i].equalsIgnoreCase("graduate")) {
				i++;
				if (queueArray[i] == null) {
					break;
				}
			}
			while (j > i) {
				queueArray[j] = queueArray[j - 1];
				j--;
			}
			queueArray[i] = "graduate";
		} else if (priority == 1) {
			//Inserting underGraduate printing request in priority key
			int j = front;
			queueArray[j] = "underGraduate";
		}

	}

	String deQueue() {
		//Deleting items from queue
		if (front == -1 && rear == -1) {
			System.out.println("Empty Queue");
			return "";
		}
		if (rear == -1 && front > rear) {
			rear++;
		}
		if (front == rear) {
			makeEmpty();
			return queueArray[front];
		}
		String deleted = queueArray[rear];
		for (int i = rear; i <= front; i++) {
			queueArray[i] = queueArray[i + 1];
		}
		front--;
		return deleted;
	}

	void makeEmpty() {
		//Deleting all elements of queue
		front = -1;
		rear = -1;
	}

	String getRear(int rearTemp) {
		//Get front of rear
		return queueArray[rearTemp];
	}

	String getFront() {
		//Get front of queue
		return queueArray[front];
	}

	void displayQueue() {
		//Display queue elements

		if (front == -1 && rear == -1) {
			System.out.println("printed all documents");
			return;
		}
		if (rear == -1 && front > rear) {
			rear++;
		}
		for (int i = rear; i <= front; i++) {
			System.out.println("\nPrinted Document of " + queueArray[i]);
		}
		System.out.println();

	}

}
