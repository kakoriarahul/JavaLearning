package basics;

public class specialSum {

	public static void main(String[] args) {
		int arr[] = {10,20,10,5,15};
		int n = arr.length;
		int[] newArr = new int[n];
		
		int res = 0;
		for (int i = 0;i <n;i++) {
			 res = res + arr[i];
//			 System.out.print(res + " ");
			 newArr[i]= res;
		}
		for (int i=0;i<n;i++) {
		System.out.println(newArr[i]);
		}
	}
}

