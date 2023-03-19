package basics;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,4,5,6,7,8,};
		getDuplicate(arr);
	}
	public static void getDuplicate(int a[]) {
		int n= a.length;
		for (int i=0;i<n;i++) {
			int count =0;
			for (int j=0;j<n;j++) {
				if (a[i]==a[j]) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(a[i]);
			}
		}
		
	}
}
