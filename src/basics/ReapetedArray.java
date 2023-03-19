package basics;

public class ReapetedArray {

	public static void main(String[] args) {
		int [] arr = {2,2,2,2,2,2,2,5,5,5,5};
		
		int res= getRes(arr);	
		System.out.println(res);
	}
	public static int getRes(int[] arr) {
		int n = arr.length;
		int f = n/2;
		
		
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
				
				return arr[i];
				
			}
			
			
		}
		return -1;
	}
}

