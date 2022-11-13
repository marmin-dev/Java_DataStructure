package insertionSort;

import java.util.Arrays;

public class BinaryStringSort {

	public static void main(String[] args) {
		String str = "0001 1000 0011 0010";
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		int [] arr1 = new int[arr.length];
		for(int i =0; i< arr.length;i++) {
			String str1 = arr[i];
			arr1[i] = Integer.parseInt(str1,2);
		}
		System.out.println(Arrays.toString(arr1));
		InsertionSort is = new InsertionSort();
		is.sort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}
