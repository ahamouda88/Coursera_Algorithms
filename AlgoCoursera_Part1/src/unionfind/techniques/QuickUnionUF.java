package unionfind.techniques;

/**
 * Lazy approach to solve the Dynamic connectivity problem.
 * Takes O(n) to check if two numbers are connected.
 * Takes O(n) to connect two numbers. By using a tree approach, by assigning the root of one number to the other
 * Defects: the tree can get tall, and the isConnected method is expensive.
 * @author ahamouda
 *
 */
public class QuickUnionUF {
	private int[] numbers;

	public QuickUnionUF(int n) {
		numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}
	}

	public boolean isConnected(int x, int y) {
		return getRoot(x) == getRoot(y);
	}

	public void union(int x, int y) {
		int xId = getRoot(x);
		int yId = getRoot(y);
		numbers[xId] = yId;
	}
	
	private int getRoot(int x){
		while(x != numbers[x]){
			x = numbers[x];
		}
		return x;
	}
}
