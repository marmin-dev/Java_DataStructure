package selectionSort;

import java.util.Arrays;

public class HelloWorldSort {

	public static void main(String[] args) {
		String hw = "HelloWorld";
		char[] arr = new char[hw.length()];
		int[] arr1 = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr[i] = hw.charAt(i);
			arr1[i] = (int)arr[i];
		}
		System.out.println(Arrays.toString(arr));
		SelectionSort sS = new SelectionSort();
		sS.sort(arr1);
		for(int i=0;i<arr.length;i++) {
			arr[i] = (char)arr1[i];
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
