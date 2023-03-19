package day4;

public class ArrayToInteger {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		getInteger(arr);
	}
	public static void getInteger(int [] arr) {
		int n = arr.length;
		int res = 0;
		for (int i = 0 ; i < n;i++) {
			res = 10*res+arr[i];
		}
		System.out.println(res);
	}
}
