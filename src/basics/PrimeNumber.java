package basics;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		getPrime(num);
	}
	public static void getPrime(int n) {
		for(int i = 1;i<=n;i++) {
//			int count =0;
//			for (int j=1;j<=i;j++) {
//				if(i%j==0) {
//					count++;
//				}
//				
//			}
//			if(count==2) {
//				System.out.println(i);
//			}
		boolean res = isPrime(i);
		if(res == true) {
			System.out.println(i);
		}
		}
	}
	public static boolean isPrime(int num) {
		int count=0;
		for (int j=1;j<=num;j++) {
			if(num%j==0) {
				count++;
			}
			
		}
		if(count==2) {
			
			return true ;
		}
		return false;
	}
}


