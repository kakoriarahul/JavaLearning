package basics;

public class zeroBasePerm {

	public static void main(String[] args) {
		int arr[] = {0,2,4,1,3,5};
		int n= arr.length;
		int[] newArr = new int[n];
		for (int i = 0 ; i<n;i++) {
			newArr[i]= arr[arr[i]];
		}
		for(int i=0;i<n;i++) {
			System.out.println(newArr[i]);
		}
	}

}
