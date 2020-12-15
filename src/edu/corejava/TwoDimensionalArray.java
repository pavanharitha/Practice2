package edu.corejava;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] a = { { 1, -2, 3, 8 }, { -4, -5, 6, 9 }, { 7, 10, 12, 15 } };
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				System.out.println(i + "," + j + ":" + a[i][j]);
			}
		}
	}
}
