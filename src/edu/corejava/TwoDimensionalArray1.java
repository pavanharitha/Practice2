package edu.corejava;

public class TwoDimensionalArray1 {
	public static void main(String[] args) {
		int[][] a = { { 1, -2, 6, 11 }, { 3, -5, 2, 9 },};
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				System.out.println(i + "," + j + ":" + a[i][j]);
			}
		}
	}
}
