package day4;

public class Sort0S1S {
	public static void main(String[] args) {
		int arr[] = {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1};
		getSortRes(arr);
	}
	public static void getSortRes(int [] arr) {
		int n = arr.length;
		int newArr[]= new int[n];
		int count = 0;
		for(int i=0;i<n;i++) {
			if (arr[i]==0) {
				count++;
			}
		}
		for (int i=0;i<count;i++) {
			newArr[i]=0;
		}
		for (int i=count;i<n;i++) {
			newArr[i]=1;
		}
		for (int i=0;i<n;i++) {
			System.out.print(newArr[i]+" ");
		}
	}
}
