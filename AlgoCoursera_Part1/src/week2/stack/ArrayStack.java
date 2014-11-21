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
		}
		return result;
	}
	
	public void push(String value){
		if(pointer < size){
			values[pointer++] = value;
		}
	}
	
	public boolean isEmpty(){
		return pointer == 0;
	}
}
