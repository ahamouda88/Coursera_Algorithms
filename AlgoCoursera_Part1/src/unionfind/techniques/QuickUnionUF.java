package unionfind.techniques;

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
