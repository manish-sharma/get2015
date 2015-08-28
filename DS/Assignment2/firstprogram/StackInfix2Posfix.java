package firstprogram;


/**
 * stack implementation for a char input
 * @author Riddhi
 *
 * @param <T>
 */
public class StackInfix2Posfix<T> {
	LinkedList<Character> infix2Posfix;

	public StackInfix2Posfix(int size) {
		infix2Posfix = new LinkedList<Character>(size);
	}

	public void push(T item) {
		infix2Posfix.insertAtFirst((Character) item);
	}

	public void traverse() {
		infix2Posfix.traverse();
	}

	public Object pop() {
		return (infix2Posfix.deleteFromFirst());
	}

	public boolean isEmpty() {
		return (infix2Posfix.isEmpty());
	}

	public T peek() {

		return (T) infix2Posfix.topElement();
	}
}
