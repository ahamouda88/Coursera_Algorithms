package week2.stack;

/**
 * A stack of strings implemented using LinkedList.
 * 
 * @author ahamouda
 * 
 */
public class LinkedListStack {

	private Node first;

	public String pop() {
		String result = null;
		if (!isEmpty()) {
			result = first.value;
			first = first.next;
		} else {
			// Exception should be thrown.
			System.out.println("Can't pop from an empty stack");
		}
		return result;
	}

	public void push(String value) {
		if (value == null) {
			// Exception should be thrown.
			System.out.println("Value shouldn't be null");
			return;
		}
		Node oldFirst = first;
		first = new Node(value);
		first.next = oldFirst;
	}

	public boolean isEmpty() {
		return first == null;
	}

	private class Node {
		String value;
		Node next;

		public Node(String s) {
			value = s;
		}
	}

}
