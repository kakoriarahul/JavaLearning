package util;

import java.util.Scanner;

public class XUtilHelper {
	public static void printIDArray (int[] arr) {
		for (int i = 0 ; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void getMaxElement(int a[]) {
		int n = a.length; 
		int res = Integer.MIN_VALUE;
		for (int i=0;i<n;i++) {
			if(a[i]>=res) {
				res = a[i];
			}
		}
		System.out.println("Maximun integer is = " + res);
	}
	public static void getMinElement(int a[]) {
		int n = a.length; 
		int res = Integer.MAX_VALUE;
		for (int i=0;i<n;i++) {
			if(a[i]<=res) {
				res = a[i];
			}
		}
		System.out.println("Minimum integer is = " + res);
	}
	public static int[][] input2DArray(int m, int n) {
		int [][] arr =new int [m][n];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array values");
		for (int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
			arr[i][j] = sc.nextInt();			
			}
		}
		return arr;
	}
	public static void print2DArray(int[][] arr) {
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
}
