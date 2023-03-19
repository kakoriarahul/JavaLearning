package day4;

import java.util.Scanner;

import util.XUtilHelper;

public class EqualMatrix {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter 1st Matrix order");
			int m1= sc.nextInt();
			int n1= sc.nextInt();
			System.out.println("Enter 2nd Matrix Order");
			int m2= sc.nextInt();
			int n2= sc.nextInt();
			int arr1[][] = XUtilHelper.input2DArray(m1, n1);
			int arr2[][] = XUtilHelper.input2DArray(m2, n2);
			boolean res = isEqual(arr1,arr2);
			if(res==true) {
				System.out.println("Matrix is Equal");
			}else
				System.out.println("Matrix is not Equal");
		}
		public static boolean isEqual(int arr1[][],int arr2[][]) {
			int m1 = arr1.length;
			int n1 = arr1[0].length;
			int m2 = arr1.length;
			int n2 = arr1[0].length;
			if((m1!=m2)&&(n1!=n2)){
				return false;
			}
			for (int i = 0; i < m1; i++) {
	            for (int j = 0; j < n1; j++) {
	                if (arr1[i][j] != arr2[i][j]) {
	                    return false;
	                }
	            }
	        }
			return true;
		}
}
