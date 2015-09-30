package QueueApplication;

public class Queue {
	String queueArray[];
	int front = -1;
	int rear = -1;
	int rearTemp;

	public Queue(int noOfElementInArray) {
		// TODO Auto-generated constructor stub
		queueArray = new String[20];
	}

	void enQueue(String item) {
		front++;
		queueArray[front] = item;
	}

	void deQueue() {
		if (front == -1 && rear == -1) {
			System.out.println("Empty Queue");
			return;
		}
		if (rear == -1 && front > rear) {
			rear++;
		}
		if (front == rear) {
			makeEmpty();
			return;
		}
		for (int i = rear; i <= front; i++) {
			queueArray[i] = queueArray[i + 1];
		}
		front--;
	}

	void makeEmpty() {
		front = -1;
		rear = -1;
	}

	String getRear(int rearTemp) {
		return queueArray[rearTemp];
	}

	String getFront() {
		return queueArray[front];
	}

	void displayQueue() {

		if (front == -1 && rear == -1) {
			System.out.println("Empty Queue");
			return;
		}
		if (rear == -1 && front > rear) {
			rear++;
		}
		for (int i = rear; i <= front; i++) {
			System.out.println(queueArray[i]);
		}

	}

}
