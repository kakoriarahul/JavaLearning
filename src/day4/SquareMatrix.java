package day4;

import java.util.Scanner;

import util.XUtilHelper;

public class SquareMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] = XUtilHelper.input2DArray(m, n);
		getSquare(arr);
	}
	public static void getSquare(int arr[][]) {
		int m = arr.length;
		int n = arr[0].length;
//		int temp = 0;
		int newArr[][]= new int[m][n];
		for (int i =0;i<m;i++) {
			for(int j=0;j<n;j++) {
				newArr[i][j]= arr[i][j]*arr[i][j];
			}
		}
		XUtilHelper.print2DArray(newArr);
	}
}
