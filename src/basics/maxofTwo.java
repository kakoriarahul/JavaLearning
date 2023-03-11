package basics;

import java.util.*;

public class maxofTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
	
		int res = findMax(a,b);
		if (res==a) {
			res = findMax(a,c);
		}else
		{
			res = findMax(b,c);
		}
		System.out.print(res + " ");
	}

	public static int findMax(int a, int b) {
		if(a<b) {
			return b;
		}
		return a;
	}

}
