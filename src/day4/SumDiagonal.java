package day4;
import util.XUtilHelper;
import java.util.*;
public class SumDiagonal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter matric order");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int arr[][] =XUtilHelper.input2DArray(m, n);
		getDiagonalSum(arr);
	}
	public static void getDiagonalSum(int[][] arr) {
		int n=arr.length;
		int sum =0;
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if (i==j) {
					sum= sum + arr[i][j];
				}
			}
		}
		System.out.println("the Diagonla sum is =" + sum);
	}
}
