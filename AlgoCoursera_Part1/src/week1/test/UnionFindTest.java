package week1.test;

import week1.unionfind.WeightedQuickUnion;

public class UnionFindTest {

	public static void main(String[] args) {
		
		WeightedQuickUnion wqu = new WeightedQuickUnion(10);
		wqu.union(4, 3);
		wqu.union(3, 8);
		wqu.union(6, 5);
		wqu.union(9, 4);
		wqu.union(2, 1);
		wqu.union(5, 0);
		wqu.union(7, 2);
		System.out.println("Is 0 connected to 1: "+wqu.isConnected(0, 1));
		System.out.println("Is 7 connected to 3: "+wqu.isConnected(7, 3));
		System.out.println("Is 4 connected to 8: "+wqu.isConnected(4, 8));
		wqu.union(6, 1);
		System.out.println("Is 0 connected to 1: "+wqu.isConnected(0, 1));
		System.out.println("Is 7 connected to 3: "+wqu.isConnected(7, 3));
		wqu.union(7, 3);
		System.out.println("Is 7 connected to 3: "+wqu.isConnected(7, 3));
	}

}
