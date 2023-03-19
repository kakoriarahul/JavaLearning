package day4;
import util.XUtilHelper;
public class MaxValue2D {
		public static void main(String[] args) {
			
			int arr[][] = XUtilHelper.input2DArray(2, 2);
			findMax(arr);
		}

		public static void findMax(int[][] arr) {
			       
			int maxElement = Integer.MIN_VALUE;
			int m = arr.length;
			int n= arr[0].length;
		 
		        for (int i = 0; i < m; i++) {
		            for (int j = 0; j < n; j++) {
		                if (arr[i][j] > maxElement) {
		                    maxElement = arr[i][j];
		                }
		            }
		        }
		        System.out.println(maxElement);
		}
}
