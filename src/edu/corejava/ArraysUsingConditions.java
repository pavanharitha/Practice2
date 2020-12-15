package edu.corejava;

public class ArraysUsingConditions {
	public static void main(String[] args) {
		int[][] a = { { 10, 4, 6, 18 }, { 31, 3, 25, 7 }, };
		int i = 0;
		while (i < a.length) {
			int j = 0;
			while (j < a[i].length) {
				System.out.println(i + "," + j + ":" + a[i][j]);
				j++;
			}
			i++;
		}
	}
}
