package week1.sumofthree;

import java.util.Arrays;

/**
 * An improved technique to count the number of triples sum to exactly zero. By
 * sorting the given array, and using binary search. This algorithm takes O(n2 logn)
 * 
 * @author ahamouda
 * 
 */
public class ThreeSumImproved {

	public static int count(int[] a){
		int n = a.length;
		// First sort the array. In-order to perform binary search on it.
		Arrays.sort(a);
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int x = - (a[i] + a[j]);
				int k = checkNumber(x, a, j+1);
				if(k != -1){
					count++;
				}
			}
		}
		return count;
		
	}

	// A method to return the index of a number if exists in an array, using binary search.
	private static int checkNumber(int num, int[] array, int i){
		int start = i;
		int end = array.length - 1;

		while(start <= end){
			int mid = (start + end) / 2;
			if(array[mid] > num){
				end = mid - 1;
			}else if(array[mid] < num){
				start = mid + 1;
			} else{
				return mid;
			}
		}
		return -1;
	}
}
