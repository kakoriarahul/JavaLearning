package basics;

import java.util.Scanner;

public class twinPrime {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		getPrime(num);
	}
	public static void getPrime(int n) {
		int [] prime  = new int[25];
		int j=0;
		for(int i = 1;i<=n;i++) {

		boolean res = isPrime(i);
		if(res == true) {
			prime[j]=i;
			j++;
		}
		}
		getTwinPrime(prime);
//		for (int i=0;i<j;i++) {
//			System.out.print(prime[i] + " ");
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
	public static void getTwinPrime(int a[]) {
		int n = a.length;
		for(int i =0;i < n-1;i++)
		if(a[i+1]-a[i]==2) {
			System.out.println("(" + a[i]  + "," + a[i+1] + ")");
			
		}
	}
}
