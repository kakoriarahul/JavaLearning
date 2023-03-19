package basics;
import java.util.*;
import util.XUtilHelper;
public class Representate2Dto1DArray {

	public static void main(String[] args) {
		int [][] arr;
		Scanner sc = new Scanner (System.in);
		int m= sc.nextInt();
		int n = sc.nextInt();
		arr =XUtilHelper.input2DArray(m, n);
		get1DArray(arr);
	}
	public static void get1DArray(int[][] arr) {
		int m=arr.length;
		int h = 0;
		int n= arr[0].length;
		int[] k = new int[m*n];
		for (int i = 0  ; i<m;i++) {
			for (int j =0;j<n;j++) {
				h = j+(i*n);
				k[h]=arr[i][j];
			}
		}
		XUtilHelper.printIDArray(k);
	}
}
