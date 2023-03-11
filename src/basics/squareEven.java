package basics;

import java.util.*;

public class squareEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		getEvenSquare(num);

	}
	public static void getEvenSquare(int n) {
		int[] res = new int[n/2];
		int k = 0;
		for(int i =1;i<=n;i++) {
			if (i%2==0) {			
				int sqr= i*i;
				res[k]=sqr;
				k++;
			}
			
		}
	for (int i = 0 ; i < res.length;i++) {
		System.out.print(res[i] + " ");
	}
	}
}








//	public static void addValue(int i) {
//		int arr[] = {};
//		int n = arr.length;
//		int newArr[]= new int[n+1];
//		for(int j =0; j <= n;j++) {
//			newArr[j]=arr[j];
//		}
//		newArr[n]=i;
//		System.out.println(newArr);
//	}
	

