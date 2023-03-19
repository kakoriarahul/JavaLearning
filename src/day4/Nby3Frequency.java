package day4;

public class Nby3Frequency {
	public static void main(String[] args) {
		int [] arr = {1,1,1,1,2,2,2,2,3,4};

		getRes(arr);	

	}
	public static void getRes(int[] arr) {
		int n = arr.length;
		int k=0;
		int f = n/3;
		int[] newArr= {-1,-1};

		for (int i = 0;i<n;i++) {
			int count =0 ;
			for(int j = i+1 ; j <n;j++) {
				int ii=arr[i];
				int jj= arr[j];
				if (ii==jj) {
					count++;
				}

			}
			
			if (count>=f) {
				newArr[k] = arr[i];
				k++;
			}
		}
		for (int i = 0; i <newArr.length;i++) {
			System.out.print(newArr[i]+ " ");
		}
	}
}
