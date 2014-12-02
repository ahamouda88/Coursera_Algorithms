package week2.sorting;

/**
 * A class to sort an array of integers. Used selection sort as the sorting
 * algorithm. Takes O(n2) to sort an array.
 * 
 * @author ahamouda
 * 
 */
public class SelectionSort {

	public static void sort(int[] a) {
		if (a != null) {
			int n = a.length;
			for (int i = 0; i < n; i++) {
				int min = i;
				for (int j = i+1; j < n; j++) {
					if(a[min] > a[j]){
						min = j;
					}
				}
				swap(a, i, min);
			}
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
