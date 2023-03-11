package basics;

import java.util.Arrays;

public class SortingSquare {

	public static void main(String[] args) {
		int[] arr = {90,23,5,34,2,8,1};
		sortedSquare(arr);
	}
	public static void sortedSquare(int[] n) {
		
		Arrays.sort(n);
		
		for(int i = 0 ; i< n.length; i++) {
			getSquare(n[i]);	
		}
	}
	public static void getSquare(int i) {
		i = i*i;
		System.out.print(i + " ");
	}
}



