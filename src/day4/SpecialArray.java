package day4;

import java.util.Scanner;

import util.XUtilHelper;

public class SpecialArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 13245;
		
		int arr[] =storeArray(num);
		getProgressiveSquare(arr);
	}
	public static int[] storeArray(int num) {
		int arr[] = new int[5];
		int n=4;
		while(num>0) {
			
			int temp = (num % 10);
			arr[n]=temp;
			n--;
			num=num/10;
		}
		 return arr;
	}
	public static void getProgressiveSquare(int arr[]) {
		for (int i=0;i<5;i++) {
			arr[i]=arr[i]*(i+1)*(i+1);
		}
		for (int i = 0 ; i<5;i++) {
			System.out.print(arr[i] + " ");
			
		}
	}
}
