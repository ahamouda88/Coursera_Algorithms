package week2.sorting;

import java.util.Random;

/**
 * A class to shuffle an array, using Knuth Shuffle Algorithm. 
 * It takes linear time to shuffle an array.
 * 
 * @author ahamouda
 * 
 */
public class ShuffleSort {
	
	public static void shuffle(int[] a) {
		if(a != null){
			int n = a.length;
			Random random = new Random();
			for (int i = 0; i < n; i++) {
				int r = random.nextInt(i + 1); 
				swap(a, i, r);
			}
		}
	}

	/**
	 * A Method to swap two elements in an array.
	 * 
	 * @param a
	 */
	private static void swap(int[] a, int pos1, int pos2) {
		int temp = a[pos1];
		a[pos1] = a[pos2];
		a[pos2] = temp;
	}
}
