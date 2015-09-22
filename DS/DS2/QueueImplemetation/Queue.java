package QueueImplemetation;

public class Queue {
	private Object[] array;
	private int size;

	public Queue() {
		array = new Object[5];
		size = 0;
	}

	/**this function return size
	 * @return size
	 */
	public int size() {
		return size;
	}

	/**enqueue function which is return the object
	 *
	 */
	public void enqueue(Object object) {
		if (size < array.length) {
			array[size] = object;
			size++;
		} else {
			Object[] newArray = new Object[array.length + 5];
			for (int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			newArray[size] = object;
			size++;
			array = newArray;
		}
	}
	/**enqueue function store the element in queue
	 * 
	 */

	public Object dequeue() {
		Object val = array[0];
		
		for (int i = 0; i < size - 1; i++) {
			array[i] = array[i + 1];
		}
		size--;

		return val;
	}

	public void makeEmpty() {
		size = 0;
	}

	/**enqueue function return least element enter in queue 
	 * 
	 */
	public Object getFront() {
		if (size > 0)
			return array[0];
		else
			return null;
	}
	/**this  function is used to display the element in queue
	 * 
	 */

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(array[i]);
		}
	}

}
