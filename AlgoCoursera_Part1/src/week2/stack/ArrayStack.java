package week2.stack;

/**
 * A stack of strings implemented using a fixed-size Array.
 * 
 * @author ahamouda
 * 
 */
public class ArrayStack {

	private String[] values;
	private int pointer;
	private int size = 100;
	
	public ArrayStack(){
		values = new String[size];
	}
	
	public String pop(){
		String result = null;
		if(!isEmpty()){
			result = values[--pointer];
			values[pointer] = null;
		}else{
			// Exception should be thrown.
			System.out.println("Can't pop from an empty stack");
		}
		return result;
	}
	
	public void push(String value){
		if(value == null){
			// Exception should be thrown.
			System.out.println("Value shouldn't be null");
			return;
		}
		if(pointer < size){
			values[pointer++] = value;
		}else{
			// Exception should be thrown.
			System.out.println("Maximum size of the stack is "+size);
		}
	}
	
	public boolean isEmpty(){
		return pointer == 0;
	}
}
