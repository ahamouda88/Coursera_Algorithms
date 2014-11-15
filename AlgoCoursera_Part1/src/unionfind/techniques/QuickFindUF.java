package unionfind.techniques;

public class QuickFindUF {

	private int[] numbers;
	
	public QuickFindUF(int n){
		numbers = new int[n];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i;
		}
	}
	
	public boolean isConnected(int x, int y){
		return numbers[x] == numbers[y];
	}

	public void union(int x, int y){
		int xId = numbers[x];
		int yId = numbers[y];
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == xId){
				numbers[i] = yId;
			}
		}
	}
}
