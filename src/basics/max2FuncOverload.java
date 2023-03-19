package basics;

import java.util.*;

public class max2FuncOverload {

	public static void main(String[] args) {
		
		
		
		double res = maxNum(5,3);
		double res1 = maxNum(5.5,3.9);
		System.out.println("The maximum number is "+ res);
		System.out.println("The maximum number is "+ res1);
	}
	public static double maxNum(int x, int y) {
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
