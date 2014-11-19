package week1.test;

import week1.sumofthree.ThreeSum;
import week1.sumofthree.ThreeSumImproved;

public class ThreeSumTest {

	public static void main(String[] args) {
		
		int[] a = new int[] { -2, 0, 3, -20, 20, 1, -4, 7, 9 };
		printInput(a);
		System.out.println("Test Brute-Force algorithm..");
		System.out.println("==============================");
		System.out.println("Number of Triples sum equal to Zero is: " + ThreeSum.count(a));
		System.out.println();
		System.out.println("Test Improved algorithm..");
		System.out.println("=========================");
		System.out.println("Number of Triples sum equal to Zero is: " + ThreeSumImproved.count(a));
		
	}
	
	private static void printInput(int[] a){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]+",");
		}
		System.out.println("Input: "+sb.substring(0, sb.length() -1));
	}
}
