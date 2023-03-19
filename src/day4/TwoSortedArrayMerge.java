package day4;

import util.XUtilHelper;

public class TwoSortedArrayMerge {
	public static void main(String[] args) {
		int arr1[] = {1,3,5,7};
		int arr2[] = {2,4,6,8};

		int []array=getArray(arr1,arr2);
		getSortedArray(array);

		
		
	}
	public static int[] getArray(int []arr1,int[] arr2) {
		int array[] = new int[arr1.length+arr2.length];
		int n = 0;
		for (int i = 0 ; i <arr1.length;i++) {
			array[n]=arr1[i];
			n++;
		}
		for (int j = 0 ; j<arr2.length;j++) {
			array[n]=arr2[j];
			n++;

		}

		return array;
	}
	public static void getSortedArray(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				int temp = 0;
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}

		}
		XUtilHelper.printIDArray(arr);
	}
}
