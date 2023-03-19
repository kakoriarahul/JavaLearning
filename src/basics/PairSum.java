package basics;

public class PairSum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9,0};
		int sum = 8;
		getPair(arr,sum);
	}
	public static void getPair(int[] arr,int sum) {
		int n = arr.length;
		for (int i = 0;i<n;i++ ) {
			for (int j =0 ;j<i;j++) {
				if (arr[j]+arr[i]==8) {
					System.out.println("Pair is = " + arr[j] + "," + arr[i]);
				}	
			}
		}
	}
}
