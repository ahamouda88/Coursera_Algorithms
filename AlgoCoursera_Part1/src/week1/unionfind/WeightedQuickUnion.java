package week1.unionfind;

public class WeightedQuickUnion {
	private int[] numbers;
	private int[] sizes;

	public WeightedQuickUnion(int n) {
		numbers = new int[n];
		sizes = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
			sizes[i] = 1;
		}
	}

	public boolean isConnected(int x, int y) {
		return getRoot(x) == getRoot(y);
	}

	public void union(int x, int y) {
		int xId = getRoot(x);
		int yId = getRoot(y);
		if(sizes[xId] >= sizes[yId]){
			numbers[yId] = xId;
			sizes[xId] += sizes[yId];
		}else{
			numbers[xId] = yId;
			sizes[yId] += sizes[xId];
		}
		System.out.println("Connect "+x+" to "+y +".");
	}

	private int getRoot(int x) {
		while (x != numbers[x]) {
			x = numbers[x];
		}
		return x;
	}
}
