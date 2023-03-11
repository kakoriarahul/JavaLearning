package basics;

import java.util.*;

public class max2FuncOverload {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b =  sc.nextDouble();
//		int a = sc.nextInt();
//		int b = sc.nextInt();
		
		double res = maxNum(a,b);
		System.out.println("The maximum number is "+ res);
	}
	public static int maxNum(int x, int y) {
		if (x >= y) {
			return x;
		}
		return y;
	}

	public static double maxNum(double x, double y) {
		if (x >= y) {
			return x;
		}
		return y;
	}
}
