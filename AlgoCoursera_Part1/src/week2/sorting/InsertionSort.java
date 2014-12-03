package week2.sorting;

/**
 * A class to sort an array of integers. Using Insertion sort as the sorting
 * algorithm. Takes O(n2) to sort an array.
 * Insertion Sort takes about linear time to sort a partially sorted array!!.
 * 
 * @author ahamouda
 * 
 */
public class InsertionSort {

	public static void sort(int[] a){
		if(a != null){
			int n = a.length;
			for (int i = 0; i < n; i++) {
				for (int j = i; j > 0 ; j--) {
					if(a[j - 1] > a[j]){
						swap(a, j - 1, j);
					}else{
						break;
					}
				}
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
