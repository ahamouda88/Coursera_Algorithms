package week2.sorting;

public class ShellSort {
	
	public static void sort(int[] a){
		int n = a.length;
		int h = 1;
		
		while(h < n/3){
			h = h * 3 + 1; // h-sort, which h will be 1, 4, 13, 40, 121, ...
		}
		
		while(h >= 1){
			for (int i = h; i < n; i++) {
				for(int j= 0; j + h < n ; j += h){
					if(a[j] > a[j + h]){
						swap(a, j, j + h);
					}
				}
			}
			h = h/3;
		}
	}
	
	/**
	 * A Method to swap two elements in an array.
	 * @param a
	 */
	private static void swap(int[] a, int pos1, int pos2){
		int temp = a[pos1];
		a[pos1] = a[pos2];
		a[pos2] = temp;
	}

}
