package week2.queue;

/**
 * A queue of strings implemented using LinkedList.
 * 
 * @author ahamouda
 * 
 */
public class LinkedListQueue {
	private Node first;
	private Node last;

	public String dequeue() {
		String result = null;
		if (!isEmpty()) {
			result = first.value;
			first = first.next;
			if(isEmpty()){
				last = null;
			}
		} else {
			// Exception should be thrown.
			System.out.println("Can't pop from an empty stack");
		}
		return result;
	}

	public void enqueue(String value) {
		if (value == null) {
			// Exception should be thrown.
			System.out.println("Value shouldn't be null");
			return;
		}
		Node oldLast = last;
		last = new Node(value);
		if (isEmpty()) {
			first = last;
		} else {
			oldLast.next = last;
		}
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
