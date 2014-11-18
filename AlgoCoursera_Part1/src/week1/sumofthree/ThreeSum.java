package week1.sumofthree;

/**
 * A brute-force technique to count the number of triples sum to exactly zero.
 * This algorithm takes O(n3)
 * 
 * @author ahamouda
 * 
 */
public class ThreeSum {

	public static int count(int[] a) {
		int n = a.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (a[i] + a[j] + a[k] == 0) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
