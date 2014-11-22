package week2.stack;

/**
 * A stack of strings implemented using a resizing Array.
 * 
 * @author ahamouda
 * 
 */
public class ResizingArrayStack {
	private String[] values;
	private int pointer;

	public ResizingArrayStack() {
		values = new String[100];
	}

	public String pop() {
		String result = null;
		if (!isEmpty()) {
			result = values[--pointer];
			values[pointer] = null;
			if (pointer == values.length / 4) {
				resize(values.length / 2);
			}
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
		values[pointer++] = value;
		if (pointer == values.length) {
			resize(values.length * 2);
		}
	}

	private void resize(int length) {
		String[] newValues = new String[length];
		for (int i = 0; i < pointer; i++) {
			newValues[i] = values[i];
		}
		values = newValues;
	}

	public boolean isEmpty() {
		return pointer == 0;
	}
}
