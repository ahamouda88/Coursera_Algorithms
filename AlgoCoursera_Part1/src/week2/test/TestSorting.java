package week2.test;

import week2.sorting.InsertionSort;
import week2.sorting.SelectionSort;
import week2.sorting.ShellSort;
import week2.sorting.ShuffleSort;

public class TestSorting {

	public static void main(String[] args) {
		
		int[] a = new int[] { 12, 4, 15, 3, 1, 4, 22, 0, -4, 2, -1, 7, -9, 8 };
		System.out.print("Array before sorting: ");
		printArray(a);
		SelectionSort.sort(a);
		System.out.print("Array after applying selection sort: ");
		printArray(a);
		
		// Shuffle the array.
		ShuffleSort.shuffle(a);
		printArray(a);
		InsertionSort.sort(a);
		System.out.print("Array after applying insertion sort: ");
		printArray(a);
	
		// Shuffle the array.
		ShuffleSort.shuffle(a);
		ShellSort.sort(a);
		System.out.print("Array after applying shell sort: ");
		printArray(a);
	}

	private static void printArray(int[] a) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			sb.append(a[i] + ", ");
		}
		System.out.println(sb.substring(0, sb.length() - 2));
	}
}
